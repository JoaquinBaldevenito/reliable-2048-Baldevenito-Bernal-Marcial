#!/usr/bin/env python3
"""
OASIs: Oracle Assessment and Improvement System.

Refines test oracles and postconditions/contracts using an LLM through OpenRouter.

Requires Python 3.8+, requests, and LLM_API_KEY.

Usage:
  python3 oasis.py [--case 1|2|3] [--model MODEL_NAME] [--max-iterations N]
"""

import os
import sys
import json
import argparse
import requests


class OASIsEngine:
    """Main OASIs engine that interacts with the LLM API."""

    PROMPTS = {
        "fp": {
            "system": (
                "You are OASIs, an oracle refinement tool. "
                "Your feedback is concrete tests, not explanations. "
                "Respond only with valid JSON, without markdown or extra text."
            ),
            "task": """{language} program:
```
{code}
```

Assertion: `{assertion}`

Is the assertion a FALSE POSITIVE (too strong), i.e. does it fail on some correct execution of the program?
If it is, write up to 3 JUnit tests that call the program with a concrete input and check the assertion
with assertTrue. Each test must compile and must fail on the program exactly as given.
Do not invent behavior: compute the real output of the program for each input.

Respond with this JSON object:
{{
  "is_false_positive": <true or false>,
  "tests": [
    {{
      "code": "@Test void name() {{ ... }}",
      "reason": "input -> real output, and the part of the assertion that fails (one line)"
    }}
  ],
  "suggested_assertion": "weaker assertion that accepts these executions, or empty"
}}
""",
        },
        "fn": {
            "system": (
                "You are OASIs, an oracle refinement tool. "
                "Your feedback is concrete mutants, not explanations. "
                "Respond only with valid JSON, without markdown or extra text."
            ),
            "task": """{language} program:
```
{code}
```

Assertion: `{assertion}`

Is the assertion a FALSE NEGATIVE (too weak), i.e. is there a faulty version of the program that it cannot detect?
If it is, write up to 3 mutants: the complete method with one small logic change.
Each mutant must compile and must satisfy the assertion on every input while returning a wrong result on at least one.
Check the mutant against the assertion on edge cases before including it.

Respond with this JSON object:
{{
  "is_false_negative": <true or false>,
  "mutants": [
    {{
      "code": "complete mutated method",
      "reason": "input -> wrong output that the assertion still accepts (one line)"
    }}
  ],
  "suggested_assertion": "stronger assertion that kills these mutants, or empty"
}}
""",
        },
    }

    def __init__(self, api_key, base_url="https://openrouter.ai/api/v1", model="nvidia/nemotron-3-ultra-550b-a55b:free"):
        self.api_key = api_key
        self.base_url = base_url.rstrip("/")
        self.model = model

    def _call_llm(self, system_prompt, user_prompt):
        url = f"{self.base_url}/chat/completions"
        headers = {
            "Content-Type": "application/json",
            "Authorization": f"Bearer {self.api_key}",
        }
        payload = {
            "model": self.model,
            "messages": [
                {"role": "system", "content": system_prompt},
                {"role": "user", "content": user_prompt},
            ],
            "reasoning": {"enabled": True},
        }
        if self.model.startswith("stealth/"):
            payload["provider"] = {"only": ["stealth"], "allow_fallbacks": False}

        try:
            response = requests.post(url, headers=headers, data=json.dumps(payload), timeout=120)
            response.raise_for_status()
            res_data = response.json()
            content = res_data["choices"][0]["message"].get("content") or ""
            if not content.strip():
                raise RuntimeError("EMPTY RESPONSE: the model returned no content. Try again or use another --model.")
            return content
        except requests.exceptions.Timeout:
            raise RuntimeError(
                "TIMEOUT: the LLM API did not respond within 120 seconds. "
                "The request may be too large or the provider may be overloaded."
            )
        except requests.exceptions.HTTPError as e:
            status = e.response.status_code if e.response is not None else "?"
            error_body = e.response.text if e.response is not None else ""
            if status == 402:
                reason = "OUT OF CREDITS/TOKENS (HTTP 402): your OpenRouter account has insufficient balance."
            elif status == 429:
                reason = "RATE LIMIT OR TOKEN QUOTA EXHAUSTED (HTTP 429): slow down or check your limits."
            elif status == 401:
                reason = "INVALID API KEY (HTTP 401): check LLM_API_KEY."
            elif status == 404:
                reason = f"MODEL NOT FOUND (HTTP 404): '{self.model}' is unavailable or no longer offered. Try another --model."
            elif status == 400 and "context" in error_body.lower():
                reason = "CONTEXT LENGTH EXCEEDED (HTTP 400): the prompt is too large for the model."
            else:
                reason = f"HTTP error {status}."
            raise RuntimeError(f"{reason} Details: {error_body}")
        except requests.exceptions.ConnectionError as e:
            raise RuntimeError(f"CONNECTION ERROR: could not reach the LLM API. Details: {str(e)}")
        except RuntimeError:
            raise
        except Exception as e:
            raise RuntimeError(f"UNEXPECTED API ERROR: {str(e)}")

    @staticmethod
    def _parse_json(text):
        """Extracts the JSON object from the answer, even if the model wraps it in markdown."""
        start, end = text.find("{"), text.rfind("}")
        if start == -1 or end < start:
            raise RuntimeError(f"INVALID RESPONSE: the model did not return JSON. Answer: {text[:300]}")
        try:
            return json.loads(text[start : end + 1])
        except json.JSONDecodeError as e:
            raise RuntimeError(f"INVALID RESPONSE: malformed JSON ({e}). Answer: {text[:300]}")

    def analyze(self, kind, code, assertion, language="Java"):
        cfg = self.PROMPTS[kind]
        prompt = cfg["task"].format(language=language, code=code, assertion=assertion)
        return self._parse_json(self._call_llm(cfg["system"], prompt))


def print_feedback(label, items):
    """Prints each generated test or mutant as code followed by a one-line reason."""
    for idx, item in enumerate(items, 1):
        print(f"[{label} #{idx}] {item.get('reason', '')}")
        for line in str(item.get("code", "")).splitlines():
            print(f"    {line}")
        print()


def ask_refinement(current_assertion, suggestion):
    print(f"\nLLM refinement suggestion:\n   `{suggestion}`")
    print("\n[User Feedback - Make a decision]")
    print("  1. Accept the LLM suggestion")
    print("  2. Modify the assertion manually")
    print("  3. Reject and keep the current assertion")
    choice = input("Select option (1/2/3): ").strip()

    if choice == "1" and suggestion:
        print(f"Assertion updated to: `{suggestion}`")
        return suggestion
    if choice == "2":
        value = input("Enter your refined assertion: ").strip()
        if value:
            print(f"Assertion manually updated to: `{value}`")
            return value
    print("The current assertion is kept.")
    return current_assertion


# Each phase: (title, result key for the feedback, label, header shown when there is feedback, message when there is none)
PHASES = {
    "fp": (
        "False Positive Assessment (Is the assertion too strong?)",
        "is_false_positive", "tests", "Test",
        "FALSE POSITIVE: these tests fail on the correct program.",
        "No test was found that breaks the assertion on a correct execution.",
    ),
    "fn": (
        "False Negative Assessment (Is the assertion too weak?)",
        "is_false_negative", "mutants", "Mutant",
        "FALSE NEGATIVE: these mutants survive the assertion.",
        "No mutant was found that survives the assertion.",
    ),
}


def run_phase(engine, kind, number, code, assertion):
    """Runs one phase and returns the assertion the user keeps after seeing the feedback."""
    title, flag, key, label, found, not_found = PHASES[kind]
    print("\n" + "-" * 50)
    print(f"PHASE {number}: {title}")
    print("-" * 50)

    try:
        res = engine.analyze(kind, code, assertion)
    except Exception as e:
        print(f"Error during the analysis: {e}")
        return assertion

    items = res.get(key, [])
    if not (res.get(flag, False) and items):
        print(not_found)
        return assertion

    print(f"\n{found}\n")
    print_feedback(label, items)
    return ask_refinement(assertion, res.get("suggested_assertion", ""))


def run_interactive_session(code, initial_assertion, api_key, base_url, model, max_iterations=3):
    engine = OASIsEngine(api_key=api_key, base_url=base_url, model=model)
    history = [initial_assertion]

    print("\n" + "=" * 80)
    print("                      OASIS TOOL - ORACLE REFINEMENT")
    print("=" * 80)
    print(f"\n[+] Code to analyze:\n{code}\n")
    print(f"[+] Initial assertion:\n    `{initial_assertion}`\n")

    # A refinement can make the assertion too strong or too weak again,
    # so both phases are repeated on the new assertion until it stops changing.
    for iteration in range(1, max_iterations + 1):
        print("\n" + "=" * 80)
        print(f"ITERATION {iteration}  -  assertion: `{history[-1]}`")
        print("=" * 80)

        start = history[-1]
        assertion = run_phase(engine, "fp", 1, code, start)
        assertion = run_phase(engine, "fn", 2, code, assertion)
        if assertion == start:
            print("\nThe assertion did not change in this iteration: refinement finished.")
            break
        history.append(assertion)

        if iteration == max_iterations:
            print(f"\nReached the maximum of {max_iterations} iterations.")
        elif input("\nCheck the new assertion again? (y/n): ").strip().lower() != "y":
            break

    print("\n" + "=" * 80)
    print("FINAL ORACLE REFINEMENT RESULT")
    print("=" * 80)
    for idx, assertion in enumerate(history):
        print(f"  {'Initial' if idx == 0 else f'After iteration {idx}'}: `{assertion}`")
    print(f"\nFinal Assertion Approved by the User:\n`{history[-1]}`\n")


CASE_STUDY_1 = {
    "title": "Case Study 1: Math.abs",
    "code": """public static int abs(int x) {
    if (x < 0) {
        return -x;
    }
    return x;
}""",
    "assertion": "@ensures \\result >= 0 && \\result >= x;"
}

CASE_STUDY_2 = {
    "title": "Case Study 2: Array Sort - Weak Daikon Contract (False Negative)",
    "code": """public static int[] sort(int[] arr) {
    if (arr == null) return null;
    int[] result = arr.clone();
    java.util.Arrays.sort(result);
    return result;
}""",
    "assertion": r"@ensures \result != null && \result.length == arr.length;",
}

CASE_STUDY_3 = {
    "title": "Case Study 3: Cell.mergeWith - Daikon adaptation (Game 2048)",
    "code": """public Cell mergeWith(Cell other) {
    if (!canMergeWith(other)) {
        throw new IllegalArgumentException(
            "Cannot merge cells: " + this + " and " + other
        );
    }
    return new Cell(this.value * 2);
}""",
    "assertion": r"@ensures \result != null && \result.value > this.value && (\result.value == 4 || \result.value == 8);"
}


CASES = {"1": CASE_STUDY_1, "2": CASE_STUDY_2, "3": CASE_STUDY_3}




def main():
    parser = argparse.ArgumentParser(description="OASIs: Oracle Assessment and Improvement System")
    parser.add_argument("--case", choices=["1", "2", "3"], help="Run one of the predefined case studies (1, 2 or 3)")
    parser.add_argument("--model", default="nvidia/nemotron-3-ultra-550b-a55b:free", help="LLM model to use")
    parser.add_argument("--base-url", default="https://openrouter.ai/api/v1", help="LLM API base URL")
    parser.add_argument("--max-iterations", type=int, default=3, help="Maximum refinement iterations")
    args = parser.parse_args()

    api_key = os.getenv("LLM_API_KEY")
    if not api_key:
        print("WARNING: No environment variable with the API Key was found.")
        api_key = input("Please enter your API Key: ").strip()
        if not api_key:
            print("Error: API Key required.")
            sys.exit(1)

    if args.case:
        case = CASES[args.case]
        print(f"\nRunning {case['title']}...")
        run_interactive_session(case["code"], case["assertion"], api_key, args.base_url, args.model, args.max_iterations)
        return

    print("\nSelect execution mode:")
    print("  1. Case Study 1: Absolute Value (False Positive)")
    print("  2. Case Study 2: Array Sort / Daikon Contract (False Negative)")
    print("  3. Case Study 3: Cell.mergeWith / Game 2048 (Daikon Contract)")
    print("  4. Custom code and assertion")
    opt = input("Enter option (1/2/3/4): ").strip()

    if opt in CASES:
        case = CASES[opt]
        run_interactive_session(case["code"], case["assertion"], api_key, args.base_url, args.model, args.max_iterations)
    elif opt == "4":
        print("\nEnter the program code (press Ctrl+D or type END on a line to finish):")
        lines = []
        while True:
            try:
                line = input()
                if line.strip() == "END":
                    break
                lines.append(line)
            except EOFError:
                break
        user_code = "\n".join(lines)
        user_assertion = input("Enter the current assertion: ").strip()
        run_interactive_session(user_code, user_assertion, api_key, args.base_url, args.model, args.max_iterations)
    else:
        print("Invalid option.")


if __name__ == "__main__":
    main()
