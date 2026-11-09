#!/usr/bin/env python3
"""
OASIs: Oracle Assessment and Improvement System.

Refines test oracles and postconditions/contracts using an LLM through OpenRouter.

Requires Python 3.8+, requests, and LLM_API_KEY.

Usage:
  python3 oasis.py [--case 1|2|3] [--model MODEL_NAME]
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
                "You are OASIs, an expert system in formal software verification and oracle refinement. "
                "Your task is to analyze whether an assertion/contract is a FALSE POSITIVE (too strong or restrictive). "
                "You MUST respond strictly in valid JSON format."
            ),
            "task": """Analyze the following {language} code and its associated assertion:

Code:
```
{code}
```

Current assertion:
`{assertion}`

Instructions:
1. Determine whether the assertion is a FALSE POSITIVE (too strong / restrictive).
2. If it is too strong, generate concrete test cases (program inputs and expected valid outputs) that make the assertion fail incorrectly.
3. Propose a refined assertion (relaxed/adequate) that does not fail on legitimate cases.

Respond ONLY with a valid JSON object using this exact format:
{{
  "is_false_positive": true,
  "explanation": "Detailed explanation of why the assertion is a false positive",
  "violating_test_cases": [
     {{
       "test_inputs": "Description or code of the input values",
       "expected_valid_output": "Correct result returned by the code",
       "assertion_failure_reason": "Reason why the assertion fails spuriously"
     }}
  ],
  "suggested_assertion": "Suggested refined assertion"
}}
""",
        },
        "fn": {
            "system": (
                "You are OASIs, an expert system in mutation testing and oracle refinement. "
                "Your task is to analyze whether an assertion/contract is a FALSE NEGATIVE (too weak or incomplete). "
                "You MUST respond strictly in valid JSON format."
            ),
            "task": """Analyze the following {language} code and its associated assertion:

Code:
```
{code}
```

Current assertion:
`{assertion}`

Instructions:
1. Determine whether the assertion is a FALSE NEGATIVE (too weak / incomplete).
2. If it is too weak, generate MUTANTS of the code (logic-error modifications) that STILL SATISFY the assertion (surviving mutants).
3. Propose a refined assertion (strengthened) that is able to kill these mutants.

Respond ONLY with a valid JSON object using this exact format:
{{
  "is_false_negative": true,
  "explanation": "Detailed explanation of why the assertion is incomplete",
  "surviving_mutants": [
     {{
       "mutant_id": "M1",
       "description": "Description of the introduced fault or mutation",
       "mutated_code": "Code or fragment of the mutant",
       "why_it_survives": "Explanation of why the current assertion does not detect this fault"
     }}
  ],
  "suggested_assertion": "Suggested strengthened assertion"
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
            return res_data["choices"][0]["message"].get("content", "")
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
                reason = "INVALID API KEY (HTTP 401): check OPENROUTER_API_KEY."
            elif status == 404:
                reason = f"MODEL NOT FOUND (HTTP 404): '{self.model}' is unavailable or no longer offered. Try another --model."
            elif status == 400 and "context" in error_body.lower():
                reason = "CONTEXT LENGTH EXCEEDED (HTTP 400): the prompt is too large for the model."
            else:
                reason = f"HTTP error {status}."
            raise RuntimeError(f"{reason} Details: {error_body}")
        except requests.exceptions.ConnectionError as e:
            raise RuntimeError(f"CONNECTION ERROR: could not reach the LLM API. Details: {str(e)}")
        except Exception as e:
            raise RuntimeError(f"UNEXPECTED API ERROR: {str(e)}")

    def analyze(self, kind, code, assertion, language="Java"):
        cfg = self.PROMPTS[kind]
        prompt = cfg["task"].format(language=language, code=code, assertion=assertion)
        return json.loads(self._call_llm(cfg["system"], prompt))

    def analyze_false_positive(self, code, assertion, language="Java"):
        return self.analyze("fp", code, assertion, language)

    def analyze_false_negative(self, code, assertion, language="Java"):
        return self.analyze("fn", code, assertion, language)


def ask_refinement(current_assertion, suggestion, final=False):
    print(f"\nLLM refinement suggestion:\n   `{suggestion}`")
    print("\n[User Feedback - Make a decision]")
    print("  1. Accept the LLM suggestion")
    print("  2. Modify the assertion manually")
    print("  3. Reject and keep the current assertion")
    choice = input("Select option (1/2/3): ").strip()

    if choice == "1" and suggestion:
        print(f"Final assertion updated to: `{suggestion}`" if final else f"Assertion updated to: `{suggestion}`")
        return suggestion
    if choice == "2":
        value = input("Enter your refined assertion: ").strip()
        print(f"Final assertion updated to: `{value}`" if final else f"Assertion manually updated to: `{value}`")
        return value
    print("The current assertion is kept.")
    return current_assertion


def run_interactive_session(code, initial_assertion, api_key, base_url, model):
    engine = OASIsEngine(api_key=api_key, base_url=base_url, model=model)
    current_assertion = initial_assertion

    print("\n" + "=" * 80)
    print("                      OASIS TOOL - ORACLE REFINEMENT")
    print("=" * 80)
    print(f"\n[+] Code to analyze:\n{code}\n")
    print(f"[+] Initial assertion:\n    `{current_assertion}`\n")

    print("\n" + "-" * 50)
    print("PHASE 1: False Positive Assessment (Is the assertion too strong?)")
    print("-" * 50)

    try:
        fp_res = engine.analyze_false_positive(code, current_assertion)
        if fp_res.get("is_false_positive", False):
            print("\nDIAGNOSIS: The assertion is a FALSE POSITIVE (too restrictive).")
            print(f"Explanation: {fp_res.get('explanation')}\n")

            test_cases = fp_res.get("violating_test_cases", [])
            if test_cases:
                print("Generated test cases that violate the assertion on valid executions:")
                for idx, tc in enumerate(test_cases, 1):
                    print(f"   Test #{idx}:")
                    print(f"     - Inputs: {tc.get('test_inputs')}")
                    print(f"     - Expected valid output: {tc.get('expected_valid_output')}")
                    print(f"     - Spurious failure reason: {tc.get('assertion_failure_reason')}")

            current_assertion = ask_refinement(current_assertion, fp_res.get("suggested_assertion", ""))
        else:
            print("The assertion does not appear to be a false positive (it is not excessively restrictive).")
    except Exception as e:
        print(f"Error during the False Positive analysis: {e}")

    print("\n" + "-" * 50)
    print("PHASE 2: False Negative Assessment (Is the assertion too weak?)")
    print("-" * 50)

    try:
        fn_res = engine.analyze_false_negative(code, current_assertion)
        if fn_res.get("is_false_negative", False):
            print("\nDIAGNOSIS: The assertion is a FALSE NEGATIVE (too weak).")
            print(f"Explanation: {fn_res.get('explanation')}\n")

            mutants = fn_res.get("surviving_mutants", [])
            if mutants:
                print("Generated mutants that SURVIVE the current assertion:")
                for m in mutants:
                    print(f"   - [{m.get('mutant_id')}] {m.get('description')}")
                    print(f"     Mutated code:\n       {m.get('mutated_code')}")
                    print(f"     Why it survives: {m.get('why_it_survives')}\n")

            current_assertion = ask_refinement(current_assertion, fn_res.get("suggested_assertion", ""), final=True)
        else:
            print("The assertion does not appear to be a false negative (it is sufficiently restrictive).")
    except Exception as e:
        print(f"Error during the False Negative analysis: {e}")

    print("\n" + "=" * 80)
    print("FINAL ORACLE REFINEMENT RESULT")
    print("=" * 80)
    print(f"Final Assertion Approved by the User:\n`{current_assertion}`\n")


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
        run_interactive_session(case["code"], case["assertion"], api_key, args.base_url, args.model)
        return

    print("\nSelect execution mode:")
    print("  1. Case Study 1: Absolute Value (False Positive)")
    print("  2. Case Study 2: Array Sort / Daikon Contract (False Negative)")
    print("  3. Case Study 3: Cell.mergeWith / Game 2048 (Daikon Contract)")
    print("  4. Custom code and assertion")
    opt = input("Enter option (1/2/3/4): ").strip()

    if opt in CASES:
        case = CASES[opt]
        run_interactive_session(case["code"], case["assertion"], api_key, args.base_url, args.model)
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
        run_interactive_session(user_code, user_assertion, api_key, args.base_url, args.model)
    else:
        print("Invalid option.")


if __name__ == "__main__":
    main()
