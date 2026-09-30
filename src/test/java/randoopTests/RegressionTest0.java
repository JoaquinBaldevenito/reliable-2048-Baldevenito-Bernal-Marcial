package randoopTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        ar.edu.unrc.game2048.Board board0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        ar.edu.unrc.game2048.Board board0 = null;
        ar.edu.unrc.game2048.Board.Direction direction1 = null;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Movement.MoveResult moveResult2 = ar.edu.unrc.game2048.Movement.move(board0, direction1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        ar.edu.unrc.game2048.AddTileStrategy addTileStrategy1 = null;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(0, addTileStrategy1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int3 = cell2.getValue();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell4 = cell0.mergeWith(cell2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value cannot be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        ar.edu.unrc.game2048.AddTileStrategy addTileStrategy1 = null;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) -1, addTileStrategy1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        int int0 = ar.edu.unrc.game2048.Board.WINNING_VALUE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2048 + "'", int0 == 2048);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        int int0 = ar.edu.unrc.game2048.Board.DEFAULT_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int3 = position2.col;
        java.lang.Class<?> wildcardClass4 = position2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Position position8 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.Object obj9 = null;
        boolean boolean10 = position8.equals(obj9);
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean12 = position8.equals((java.lang.Object) cell11);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (short) 100, (int) (short) 1, cell11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(100, 100)" + "'", str4, "(100, 100)");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        ar.edu.unrc.game2048.AddTileStrategy addTileStrategy1 = null;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) -1, addTileStrategy1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        boolean boolean3 = cell0.isEmpty();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int5 = cell4.getValue();
        java.lang.String str6 = cell4.toString();
        boolean boolean7 = cell4.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell8 = cell0.mergeWith(cell4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        boolean boolean2 = board0.moveDown();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Direction direction4 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult5 = ar.edu.unrc.game2048.Movement.move(board3, direction4);
        java.lang.Class<?> wildcardClass6 = board3.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction4.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        java.lang.Class<?> wildcardClass3 = board0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        ar.edu.unrc.game2048.AddTileStrategy addTileStrategy1 = null;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) ' ', addTileStrategy1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        boolean boolean2 = board0.moveDown();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Direction direction4 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult5 = ar.edu.unrc.game2048.Movement.move(board3, direction4);
        ar.edu.unrc.game2048.Board board6 = moveResult5.board;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell9 = board6.getCell((int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction4.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult5);
        org.junit.Assert.assertNotNull(board6);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell must be a power of two: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        ar.edu.unrc.game2048.AddTileStrategy addTileStrategy1 = null;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 100, addTileStrategy1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isFull();
        boolean boolean4 = board0.moveRight();
        boolean boolean5 = board0.isWinningBoard();
        boolean boolean6 = board0.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell1 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int2 = cell1.getValue();
        java.lang.String str3 = cell1.toString();
        boolean boolean4 = cell1.isEmpty();
        boolean boolean6 = cell1.equals((java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell7 = cell0.mergeWith(cell1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(cell1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveDown();
        ar.edu.unrc.game2048.Cell cell7 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int9 = cell8.getValue();
        int int10 = cell8.getValue();
        boolean boolean11 = cell8.isEmpty();
        boolean boolean12 = cell7.canMergeWith(cell8);
        board0.setCell((int) (short) 0, (int) (byte) 1, cell8);
        ar.edu.unrc.game2048.Cell cell14 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int15 = cell14.getValue();
        java.lang.String str16 = cell14.toString();
        java.lang.String str17 = cell14.toString();
        ar.edu.unrc.game2048.Cell cell18 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int19 = cell18.getValue();
        ar.edu.unrc.game2048.Cell cell20 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int21 = cell20.getValue();
        java.lang.String str22 = cell20.toString();
        java.lang.String str23 = cell20.toString();
        boolean boolean24 = cell18.canMergeWith(cell20);
        boolean boolean25 = cell14.canMergeWith(cell18);
        boolean boolean26 = cell8.canMergeWith(cell18);
        ar.edu.unrc.game2048.Cell cell27 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int28 = cell27.getValue();
        java.lang.String str29 = cell27.toString();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell30 = cell18.mergeWith(cell27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "." + "'", str16, ".");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "." + "'", str17, ".");
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "." + "'", str22, ".");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "." + "'", str23, ".");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "." + "'", str29, ".");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        boolean boolean2 = board0.moveDown();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Direction direction4 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult5 = ar.edu.unrc.game2048.Movement.move(board3, direction4);
        ar.edu.unrc.game2048.Board board6 = moveResult5.board;
        boolean boolean7 = board6.moveRight();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction4.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult5);
        org.junit.Assert.assertNotNull(board6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell must be a power of two: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveUp();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int8 = cell7.getValue();
        java.lang.String str9 = cell7.toString();
        boolean boolean10 = cell7.isEmpty();
        boolean boolean12 = cell7.equals((java.lang.Object) 100.0d);
        int int13 = cell7.getValue();
        // The following exception was thrown during execution in test generation
        try {
            board4.setCell((int) (byte) -1, (int) (short) 100, cell7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveRight();
        ar.edu.unrc.game2048.Cell cell5 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int7 = cell6.getValue();
        int int8 = cell6.getValue();
        boolean boolean9 = cell6.isEmpty();
        boolean boolean10 = cell5.canMergeWith(cell6);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (short) 10, 10, cell5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.String str3 = position2.toString();
        int int4 = position2.col;
        java.lang.String str5 = position2.toString();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board6.isWinningBoard();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board6);
        int int10 = board6.getScore();
        boolean boolean11 = position2.equals((java.lang.Object) board6);
        java.lang.String str12 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 100)" + "'", str3, "(100, 100)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(100, 100)" + "'", str5, "(100, 100)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(100, 100)" + "'", str12, "(100, 100)");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value cannot be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        boolean boolean2 = board0.isFull();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.Object obj3 = null;
        boolean boolean4 = position2.equals(obj3);
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = position2.equals((java.lang.Object) cell5);
        ar.edu.unrc.game2048.Cell cell8 = new ar.edu.unrc.game2048.Cell(2048);
        java.lang.Object obj9 = null;
        boolean boolean10 = cell8.equals(obj9);
        ar.edu.unrc.game2048.Cell cell12 = new ar.edu.unrc.game2048.Cell(2048);
        boolean boolean13 = cell8.canMergeWith(cell12);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell14 = cell5.mergeWith(cell8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and 2048");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        ar.edu.unrc.game2048.AddTileStrategy addTileStrategy1 = null;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, addTileStrategy1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Position position4 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int5 = position4.row;
        boolean boolean6 = board1.equals((java.lang.Object) int5);
        java.lang.String str7 = board1.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board1.getEmptyPositions();
        boolean boolean9 = board1.isFull();
        ar.edu.unrc.game2048.Cell cell13 = new ar.edu.unrc.game2048.Cell(0);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell((int) 'a', (int) (byte) -1, cell13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        boolean boolean5 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        ar.edu.unrc.game2048.Board.Position position13 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int14 = position13.row;
        boolean boolean15 = board10.equals((java.lang.Object) int14);
        boolean boolean16 = cell8.equals((java.lang.Object) int14);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (short) 0, (int) (short) -1, cell8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.Object obj3 = null;
        boolean boolean4 = position2.equals(obj3);
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = position2.equals((java.lang.Object) cell5);
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int8 = cell7.getValue();
        java.lang.String str9 = cell7.toString();
        boolean boolean10 = cell7.isEmpty();
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int12 = cell11.getValue();
        java.lang.String str13 = cell11.toString();
        boolean boolean14 = cell7.canMergeWith(cell11);
        boolean boolean15 = cell11.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell16 = cell5.mergeWith(cell11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "." + "'", str13, ".");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        ar.edu.unrc.game2048.AddTileStrategy addTileStrategy1 = null;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 10, addTileStrategy1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isFull();
        ar.edu.unrc.game2048.Cell cell6 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int8 = cell7.getValue();
        int int9 = cell7.getValue();
        boolean boolean10 = cell7.isEmpty();
        boolean boolean11 = cell6.canMergeWith(cell7);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) '4', (int) (byte) 10, cell7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (52, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.isWinningBoard();
        boolean boolean4 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell8 = new ar.edu.unrc.game2048.Cell(0);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (short) 10, 10, cell8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.isWinningBoard();
        boolean boolean4 = board0.moveRight();
        int int5 = board0.getSize();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell8 = board0.getCell((int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isFull();
        boolean boolean4 = board0.moveUp();
        int int5 = board0.getSize();
        java.lang.String str6 = board0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str6, "Score: 0\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        ar.edu.unrc.game2048.AddTileStrategy addTileStrategy1 = null;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, addTileStrategy1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean3 = board1.isWinningBoard();
        boolean boolean4 = board1.moveDown();
        ar.edu.unrc.game2048.Cell cell8 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int10 = cell9.getValue();
        int int11 = cell9.getValue();
        boolean boolean12 = cell9.isEmpty();
        boolean boolean13 = cell8.canMergeWith(cell9);
        board1.setCell((int) (short) 0, (int) (byte) 1, cell9);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell15 = cell0.mergeWith(cell9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.Object obj3 = null;
        boolean boolean4 = position2.equals(obj3);
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = position2.equals((java.lang.Object) cell5);
        java.lang.String str7 = position2.toString();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board8.isWinningBoard();
        int int11 = board8.getScore();
        boolean boolean12 = position2.equals((java.lang.Object) board8);
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board16);
        ar.edu.unrc.game2048.Board.Position position20 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int21 = position20.row;
        boolean boolean22 = board17.equals((java.lang.Object) int21);
        boolean boolean23 = cell15.equals((java.lang.Object) int21);
        ar.edu.unrc.game2048.Cell cell24 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int25 = cell24.getValue();
        int int26 = cell24.getValue();
        boolean boolean27 = cell24.isEmpty();
        boolean boolean28 = cell15.canMergeWith(cell24);
        int int29 = cell15.getValue();
        // The following exception was thrown during execution in test generation
        try {
            board8.setCell(4, (int) (byte) 0, cell15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (4, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(100, 100)" + "'", str7, "(100, 100)");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell must be a power of two greater than 1: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int6 = position5.row;
        boolean boolean7 = board2.equals((java.lang.Object) int6);
        boolean boolean8 = cell0.equals((java.lang.Object) int6);
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int10 = cell9.getValue();
        int int11 = cell9.getValue();
        boolean boolean12 = cell9.isEmpty();
        boolean boolean13 = cell0.canMergeWith(cell9);
        int int14 = cell0.getValue();
        ar.edu.unrc.game2048.Cell cell16 = new ar.edu.unrc.game2048.Cell(0);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell17 = cell0.mergeWith(cell16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int3 = cell2.getValue();
        java.lang.String str4 = cell2.toString();
        java.lang.String str5 = cell2.toString();
        boolean boolean6 = cell0.canMergeWith(cell2);
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int8 = cell7.getValue();
        java.lang.String str9 = cell7.toString();
        boolean boolean10 = cell7.isEmpty();
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int12 = cell11.getValue();
        java.lang.String str13 = cell11.toString();
        boolean boolean14 = cell7.canMergeWith(cell11);
        boolean boolean15 = cell0.canMergeWith(cell11);
        ar.edu.unrc.game2048.Cell cell16 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int17 = cell16.getValue();
        ar.edu.unrc.game2048.Cell cell18 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int19 = cell18.getValue();
        java.lang.String str20 = cell18.toString();
        java.lang.String str21 = cell18.toString();
        boolean boolean22 = cell16.canMergeWith(cell18);
        boolean boolean23 = cell18.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell24 = cell11.mergeWith(cell18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "." + "'", str4, ".");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "." + "'", str13, ".");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "." + "'", str20, ".");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "." + "'", str21, ".");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell must be a power of two greater than 1: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.isWinningBoard();
        boolean boolean4 = board0.moveRight();
        boolean boolean5 = board0.isFull();
        boolean boolean6 = board0.isFull();
        int int7 = board0.getScore();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        ar.edu.unrc.game2048.AddTileStrategy addTileStrategy1 = null;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 0, addTileStrategy1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        java.lang.Class<?> wildcardClass1 = board0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(2048, (int) '#');
        java.lang.String str3 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(2048, 35)" + "'", str3, "(2048, 35)");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        boolean boolean3 = cell0.isEmpty();
        boolean boolean5 = cell0.equals((java.lang.Object) 100.0d);
        int int6 = cell0.getValue();
        java.lang.String str7 = cell0.toString();
        java.lang.String str8 = cell0.toString();
        ar.edu.unrc.game2048.Board.Position position11 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int12 = position11.row;
        boolean boolean13 = cell0.equals((java.lang.Object) position11);
        ar.edu.unrc.game2048.Cell cell15 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell16 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int17 = cell16.getValue();
        int int18 = cell16.getValue();
        boolean boolean19 = cell16.isEmpty();
        boolean boolean20 = cell15.canMergeWith(cell16);
        boolean boolean21 = cell16.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell22 = cell0.mergeWith(cell16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        boolean boolean3 = cell0.isEmpty();
        boolean boolean5 = cell0.equals((java.lang.Object) 100.0d);
        int int6 = cell0.getValue();
        java.lang.String str7 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int11 = cell10.getValue();
        int int12 = cell10.getValue();
        boolean boolean13 = cell10.isEmpty();
        boolean boolean14 = cell9.canMergeWith(cell10);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell15 = cell0.mergeWith(cell9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        boolean boolean3 = cell0.isEmpty();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int5 = cell4.getValue();
        java.lang.String str6 = cell4.toString();
        boolean boolean7 = cell4.isEmpty();
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int9 = cell8.getValue();
        java.lang.String str10 = cell8.toString();
        boolean boolean11 = cell4.canMergeWith(cell8);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell12 = cell0.mergeWith(cell8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.isWinningBoard();
        boolean boolean4 = board0.moveRight();
        boolean boolean5 = board0.isFull();
        boolean boolean6 = board0.isWinningBoard();
        boolean boolean7 = board0.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, (int) (short) 100);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveUp();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell6 = board0.getCell((int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 32) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isFull();
        boolean boolean4 = board0.moveRight();
        boolean boolean5 = board0.isWinningBoard();
        int int6 = board0.getScore();
        boolean boolean7 = board0.hasEmptyCells();
        boolean boolean8 = board0.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        boolean boolean3 = cell0.isEmpty();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int5 = cell4.getValue();
        java.lang.String str6 = cell4.toString();
        boolean boolean7 = cell0.canMergeWith(cell4);
        boolean boolean8 = cell4.isEmpty();
        boolean boolean9 = cell4.isEmpty();
        java.lang.String str10 = cell4.toString();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.hasEmptyCells();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell7 = board0.getCell((int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        ar.edu.unrc.game2048.Board.Direction direction0 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        java.lang.Class<?> wildcardClass1 = direction0.getClass();
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction0.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        java.lang.String str3 = cell0.toString();
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int7 = position6.col;
        int int8 = position6.col;
        boolean boolean9 = cell0.equals((java.lang.Object) position6);
        java.lang.Class<?> wildcardClass10 = position6.getClass();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(100);
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        ar.edu.unrc.game2048.Board.Position position9 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int10 = position9.row;
        boolean boolean11 = board6.equals((java.lang.Object) int10);
        boolean boolean12 = cell4.equals((java.lang.Object) int10);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell(100, 1, cell4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 1) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isFull();
        boolean boolean4 = board0.moveUp();
        int int5 = board0.getScore();
        boolean boolean6 = board0.isFull();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean9 = board7.isWinningBoard();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean11 = board10.moveRight();
        boolean boolean12 = board0.equals((java.lang.Object) board10);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell15 = board0.getCell((int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (52, 97) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        int int4 = board0.getScore();
        boolean boolean5 = board0.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board.Direction direction7 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult8 = ar.edu.unrc.game2048.Movement.move(board0, direction7);
        boolean boolean9 = board0.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board0.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + direction7 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction7.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertNotNull(moveResult8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(positionSet10);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isFull();
        boolean boolean4 = board0.moveRight();
        boolean boolean5 = board0.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board0.getEmptyPositions();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell9 = board0.getCell((int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 32) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet6);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(2048, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = position2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.isWinningBoard();
        boolean boolean4 = board0.moveRight();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board0);
        int int6 = board0.getSize();
        boolean boolean7 = board0.moveUp();
        boolean boolean8 = board0.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getSize();
        boolean boolean2 = board0.moveRight();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isFull();
        boolean boolean3 = board0.moveRight();
        boolean boolean4 = board0.moveUp();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isFull();
        boolean boolean4 = board0.moveRight();
        boolean boolean5 = board0.isWinningBoard();
        int int6 = board0.getScore();
        boolean boolean7 = board0.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board0.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(positionSet8);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Position position4 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int5 = position4.row;
        boolean boolean6 = board1.equals((java.lang.Object) int5);
        java.lang.String str7 = board1.toString();
        boolean boolean8 = board1.hasEmptyCells();
        boolean boolean9 = board1.moveDown();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board1.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(positionSet10);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        boolean boolean5 = board0.moveDown();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isWinningBoard();
        boolean boolean3 = board1.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board0.getEmptyPositions();
        org.junit.Assert.assertNotNull(positionSet2);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Position position4 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int5 = position4.row;
        boolean boolean6 = board1.equals((java.lang.Object) int5);
        java.lang.String str7 = board1.toString();
        boolean boolean8 = board1.hasEmptyCells();
        boolean boolean9 = board1.moveDown();
        int int10 = board1.getScore();
        ar.edu.unrc.game2048.Board.Position position15 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.Object obj16 = null;
        boolean boolean17 = position15.equals(obj16);
        ar.edu.unrc.game2048.Cell cell18 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean19 = position15.equals((java.lang.Object) cell18);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell((int) (byte) 10, (int) (short) -1, cell18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Position position4 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int5 = position4.row;
        boolean boolean6 = board1.equals((java.lang.Object) int5);
        java.lang.String str7 = board1.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board1.getEmptyPositions();
        boolean boolean9 = board1.moveDown();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Position position4 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int5 = position4.row;
        boolean boolean6 = board1.equals((java.lang.Object) int5);
        java.lang.String str7 = board1.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board1.getEmptyPositions();
        boolean boolean9 = board1.isFull();
        boolean boolean10 = board1.moveLeft();
        java.lang.String str11 = board1.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str11, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board3.moveRight();
        int int5 = board3.getScore();
        boolean boolean6 = board3.moveDown();
        java.lang.Class<?> wildcardClass7 = board3.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(2048);
        java.lang.Object obj2 = null;
        boolean boolean3 = cell1.equals(obj2);
        int int4 = cell1.getValue();
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int6 = cell5.getValue();
        int int7 = cell5.getValue();
        boolean boolean8 = cell5.isEmpty();
        java.lang.String str9 = cell5.toString();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell10 = cell1.mergeWith(cell5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 2048 and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2048 + "'", int4 == 2048);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        java.lang.String str3 = board0.toString();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell6 = board0.getCell((int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int6 = position5.row;
        boolean boolean7 = board2.equals((java.lang.Object) int6);
        boolean boolean8 = cell0.equals((java.lang.Object) int6);
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int10 = cell9.getValue();
        int int11 = cell9.getValue();
        boolean boolean12 = cell9.isEmpty();
        boolean boolean13 = cell0.canMergeWith(cell9);
        java.lang.String str14 = cell9.toString();
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int16 = cell15.getValue();
        java.lang.String str17 = cell15.toString();
        java.lang.String str18 = cell15.toString();
        ar.edu.unrc.game2048.Cell cell19 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int20 = cell19.getValue();
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int22 = cell21.getValue();
        java.lang.String str23 = cell21.toString();
        java.lang.String str24 = cell21.toString();
        boolean boolean25 = cell19.canMergeWith(cell21);
        boolean boolean26 = cell15.canMergeWith(cell19);
        boolean boolean27 = cell9.canMergeWith(cell15);
        ar.edu.unrc.game2048.Cell cell28 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int29 = cell28.getValue();
        java.lang.String str30 = cell28.toString();
        boolean boolean31 = cell28.isEmpty();
        boolean boolean32 = cell28.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell33 = cell15.mergeWith(cell28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "." + "'", str17, ".");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "." + "'", str18, ".");
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "." + "'", str23, ".");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "." + "'", str24, ".");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "." + "'", str30, ".");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.isWinningBoard();
        boolean boolean4 = board0.moveRight();
        boolean boolean5 = board0.isFull();
        boolean boolean6 = board0.isFull();
        ar.edu.unrc.game2048.Board.Direction direction7 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult8 = ar.edu.unrc.game2048.Movement.move(board0, direction7);
        boolean boolean9 = board0.moveUp();
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int13 = cell12.getValue();
        java.lang.String str14 = cell12.toString();
        boolean boolean15 = cell12.isEmpty();
        boolean boolean17 = cell12.equals((java.lang.Object) 100.0d);
        int int18 = cell12.getValue();
        java.lang.String str19 = cell12.toString();
        java.lang.String str20 = cell12.toString();
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(100, 4, cell12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 4) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + direction7 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction7.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "." + "'", str19, ".");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "." + "'", str20, ".");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell must be a power of two: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell must be a power of two greater than 1: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        int int2 = cell0.getValue();
        boolean boolean3 = cell0.isEmpty();
        java.lang.String str4 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int6 = cell5.getValue();
        java.lang.String str7 = cell5.toString();
        java.lang.String str8 = cell5.toString();
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int10 = cell9.getValue();
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int12 = cell11.getValue();
        java.lang.String str13 = cell11.toString();
        java.lang.String str14 = cell11.toString();
        boolean boolean15 = cell9.canMergeWith(cell11);
        boolean boolean16 = cell5.canMergeWith(cell9);
        int int17 = cell9.getValue();
        boolean boolean18 = cell9.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell19 = cell0.mergeWith(cell9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "." + "'", str4, ".");
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "." + "'", str13, ".");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.Object obj3 = null;
        boolean boolean4 = position2.equals(obj3);
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = position2.equals((java.lang.Object) cell5);
        java.lang.String str7 = position2.toString();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board8.isWinningBoard();
        int int11 = board8.getScore();
        boolean boolean12 = position2.equals((java.lang.Object) board8);
        java.lang.String str13 = board8.toString();
        boolean boolean14 = board8.moveUp();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell17 = board8.getCell(0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 52) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(100, 100)" + "'", str7, "(100, 100)");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int3 = cell2.getValue();
        int int4 = cell2.getValue();
        boolean boolean5 = cell2.isEmpty();
        boolean boolean6 = cell1.canMergeWith(cell2);
        boolean boolean7 = cell2.isEmpty();
        ar.edu.unrc.game2048.Board.Position position10 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.Object obj11 = null;
        boolean boolean12 = position10.equals(obj11);
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean14 = position10.equals((java.lang.Object) cell13);
        java.lang.String str15 = cell13.toString();
        int int16 = cell13.getValue();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell17 = cell2.mergeWith(cell13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isFull();
        boolean boolean4 = board0.moveUp();
        int int5 = board0.getScore();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board8.isWinningBoard();
        boolean boolean11 = board8.moveDown();
        ar.edu.unrc.game2048.Cell cell15 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell16 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int17 = cell16.getValue();
        int int18 = cell16.getValue();
        boolean boolean19 = cell16.isEmpty();
        boolean boolean20 = cell15.canMergeWith(cell16);
        board8.setCell((int) (short) 0, (int) (byte) 1, cell16);
        ar.edu.unrc.game2048.Cell cell23 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell24 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int25 = cell24.getValue();
        int int26 = cell24.getValue();
        boolean boolean27 = cell24.isEmpty();
        boolean boolean28 = cell23.canMergeWith(cell24);
        boolean boolean29 = cell16.canMergeWith(cell24);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) ' ', (int) (byte) -1, cell16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (32, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        java.lang.String str3 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int5 = cell4.getValue();
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int7 = cell6.getValue();
        java.lang.String str8 = cell6.toString();
        java.lang.String str9 = cell6.toString();
        boolean boolean10 = cell4.canMergeWith(cell6);
        boolean boolean11 = cell0.canMergeWith(cell4);
        int int12 = cell4.getValue();
        boolean boolean13 = cell4.isEmpty();
        ar.edu.unrc.game2048.Cell cell14 = null;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell15 = cell4.mergeWith(cell14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Position position4 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int5 = position4.row;
        boolean boolean6 = board1.equals((java.lang.Object) int5);
        boolean boolean7 = board1.moveRight();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int3 = position2.col;
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        boolean boolean7 = board6.isFull();
        boolean boolean8 = board6.moveDown();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board6);
        ar.edu.unrc.game2048.Board.Direction direction10 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult11 = ar.edu.unrc.game2048.Movement.move(board9, direction10);
        boolean boolean12 = position2.equals((java.lang.Object) board9);
        boolean boolean13 = board9.moveUp();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(100, 100)" + "'", str4, "(100, 100)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + direction10 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction10.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.hasEmptyCells();
        boolean boolean5 = board0.hasEmptyCells();
        java.lang.String str6 = board0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str6, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.Object obj3 = null;
        boolean boolean4 = position2.equals(obj3);
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = position2.equals((java.lang.Object) cell5);
        java.lang.String str7 = position2.toString();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board8.isWinningBoard();
        int int11 = board8.getScore();
        boolean boolean12 = position2.equals((java.lang.Object) board8);
        java.lang.String str13 = board8.toString();
        boolean boolean14 = board8.isFull();
        java.lang.Class<?> wildcardClass15 = board8.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(100, 100)" + "'", str7, "(100, 100)");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.isWinningBoard();
        boolean boolean4 = board0.moveRight();
        boolean boolean5 = board0.isFull();
        boolean boolean6 = board0.isFull();
        ar.edu.unrc.game2048.Board.Direction direction7 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult8 = ar.edu.unrc.game2048.Movement.move(board0, direction7);
        ar.edu.unrc.game2048.Board board9 = moveResult8.board;
        ar.edu.unrc.game2048.Board board10 = moveResult8.board;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + direction7 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction7.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult8);
        org.junit.Assert.assertNotNull(board9);
        org.junit.Assert.assertNotNull(board10);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int6 = position5.col;
        int int7 = position5.row;
        boolean boolean8 = board1.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.Board.Direction direction9 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult10 = ar.edu.unrc.game2048.Movement.move(board1, direction9);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Cell cell14 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int15 = cell14.getValue();
        java.lang.String str16 = cell14.toString();
        boolean boolean17 = cell14.isEmpty();
        boolean boolean19 = cell14.equals((java.lang.Object) 100.0d);
        int int20 = cell14.getValue();
        java.lang.String str21 = cell14.toString();
        java.lang.String str22 = cell14.toString();
        ar.edu.unrc.game2048.Board.Position position25 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int26 = position25.row;
        boolean boolean27 = cell14.equals((java.lang.Object) position25);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell((int) (byte) -1, 0, cell14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + direction9 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction9.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertNotNull(moveResult10);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "." + "'", str16, ".");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "." + "'", str21, ".");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "." + "'", str22, ".");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        boolean boolean2 = board0.moveDown();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int5 = cell4.getValue();
        java.lang.String str6 = cell4.toString();
        boolean boolean7 = cell4.isEmpty();
        boolean boolean9 = cell4.equals((java.lang.Object) 100.0d);
        boolean boolean10 = board3.equals((java.lang.Object) 100.0d);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean13 = board11.isWinningBoard();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board11);
        int int15 = board11.getScore();
        boolean boolean16 = board11.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet17 = board11.getEmptyPositions();
        ar.edu.unrc.game2048.Board.Direction direction18 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult19 = ar.edu.unrc.game2048.Movement.move(board11, direction18);
        ar.edu.unrc.game2048.Movement.MoveResult moveResult20 = ar.edu.unrc.game2048.Movement.move(board3, direction18);
        int int21 = moveResult20.scoreDelta;
        java.lang.Class<?> wildcardClass22 = moveResult20.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertTrue("'" + direction18 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction18.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertNotNull(moveResult19);
        org.junit.Assert.assertNotNull(moveResult20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        boolean boolean3 = cell0.isEmpty();
        boolean boolean5 = cell0.equals((java.lang.Object) 100.0d);
        int int6 = cell0.getValue();
        java.lang.String str7 = cell0.toString();
        java.lang.String str8 = cell0.toString();
        ar.edu.unrc.game2048.Board.Position position11 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int12 = position11.row;
        boolean boolean13 = cell0.equals((java.lang.Object) position11);
        ar.edu.unrc.game2048.Cell cell15 = new ar.edu.unrc.game2048.Cell(2048);
        java.lang.Object obj16 = null;
        boolean boolean17 = cell15.equals(obj16);
        ar.edu.unrc.game2048.Cell cell19 = new ar.edu.unrc.game2048.Cell(2048);
        boolean boolean20 = cell15.canMergeWith(cell19);
        boolean boolean21 = cell15.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell22 = cell0.mergeWith(cell15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and 2048");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board3);
        ar.edu.unrc.game2048.Board.Position position7 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int8 = position7.row;
        boolean boolean9 = board4.equals((java.lang.Object) int8);
        java.lang.String str10 = board4.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet11 = board4.getEmptyPositions();
        boolean boolean12 = board2.equals((java.lang.Object) positionSet11);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell15 = board2.getCell(4, 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (4, 2048) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str10, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int3 = cell2.getValue();
        java.lang.String str4 = cell2.toString();
        java.lang.String str5 = cell2.toString();
        boolean boolean6 = cell0.canMergeWith(cell2);
        java.lang.String str7 = cell2.toString();
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int9 = cell8.getValue();
        java.lang.String str10 = cell8.toString();
        boolean boolean11 = cell8.isEmpty();
        boolean boolean13 = cell8.equals((java.lang.Object) 100.0d);
        int int14 = cell8.getValue();
        java.lang.String str15 = cell8.toString();
        java.lang.String str16 = cell8.toString();
        boolean boolean18 = cell8.equals((java.lang.Object) (byte) 0);
        ar.edu.unrc.game2048.Cell cell19 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int20 = cell19.getValue();
        java.lang.String str21 = cell19.toString();
        boolean boolean22 = cell19.isEmpty();
        boolean boolean24 = cell19.equals((java.lang.Object) 100.0d);
        int int25 = cell19.getValue();
        java.lang.String str26 = cell19.toString();
        java.lang.String str27 = cell19.toString();
        boolean boolean28 = cell8.canMergeWith(cell19);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell29 = cell2.mergeWith(cell8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "." + "'", str4, ".");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "." + "'", str16, ".");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "." + "'", str21, ".");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "." + "'", str26, ".");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "." + "'", str27, ".");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(2048);
        java.lang.Object obj2 = null;
        boolean boolean3 = cell1.equals(obj2);
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int5 = cell4.getValue();
        java.lang.String str6 = cell4.toString();
        boolean boolean7 = cell4.isEmpty();
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int9 = cell8.getValue();
        java.lang.String str10 = cell8.toString();
        boolean boolean11 = cell4.canMergeWith(cell8);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell12 = cell1.mergeWith(cell8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 2048 and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        ar.edu.unrc.game2048.AddTileStrategy addTileStrategy1 = null;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(4, addTileStrategy1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.isWinningBoard();
        boolean boolean4 = board0.moveRight();
        boolean boolean5 = board0.isFull();
        boolean boolean6 = board0.isFull();
        ar.edu.unrc.game2048.Board.Direction direction7 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult8 = ar.edu.unrc.game2048.Movement.move(board0, direction7);
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int12 = cell11.getValue();
        java.lang.String str13 = cell11.toString();
        java.lang.String str14 = cell11.toString();
        ar.edu.unrc.game2048.Board.Position position17 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int18 = position17.col;
        int int19 = position17.col;
        boolean boolean20 = cell11.equals((java.lang.Object) position17);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (short) 10, 100, cell11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + direction7 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction7.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult8);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "." + "'", str13, ".");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        int int4 = board0.getScore();
        boolean boolean5 = board0.hasEmptyCells();
        boolean boolean6 = board0.isFull();
        boolean boolean7 = board0.moveDown();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        boolean boolean2 = board0.moveDown();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Direction direction4 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult5 = ar.edu.unrc.game2048.Movement.move(board3, direction4);
        ar.edu.unrc.game2048.Board board6 = moveResult5.board;
        int int7 = board6.getScore();
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int11 = cell10.getValue();
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int13 = cell12.getValue();
        java.lang.String str14 = cell12.toString();
        java.lang.String str15 = cell12.toString();
        boolean boolean16 = cell10.canMergeWith(cell12);
        // The following exception was thrown during execution in test generation
        try {
            board6.setCell((-1), (int) 'a', cell12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 97) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction4.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult5);
        org.junit.Assert.assertNotNull(board6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.isWinningBoard();
        boolean boolean4 = board0.isLosingBoard();
        boolean boolean5 = board0.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int3 = position2.col;
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        boolean boolean7 = board6.isFull();
        boolean boolean8 = board6.moveDown();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board6);
        ar.edu.unrc.game2048.Board.Direction direction10 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult11 = ar.edu.unrc.game2048.Movement.move(board9, direction10);
        boolean boolean12 = position2.equals((java.lang.Object) board9);
        boolean boolean13 = board9.isLosingBoard();
        boolean boolean14 = board9.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell18 = new ar.edu.unrc.game2048.Cell(2048);
        boolean boolean19 = cell18.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            board9.setCell((int) (byte) 10, 1, cell18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(100, 100)" + "'", str4, "(100, 100)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + direction10 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction10.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int3 = position2.col;
        int int4 = position2.row;
        int int5 = position2.col;
        ar.edu.unrc.game2048.Board.Position position8 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        boolean boolean9 = position2.equals((java.lang.Object) 100);
        int int10 = position2.row;
        int int11 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        int int4 = board0.getScore();
        boolean boolean5 = board0.hasEmptyCells();
        boolean boolean6 = board0.isFull();
        java.lang.String str7 = board0.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board0.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet8);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.Object obj3 = null;
        boolean boolean4 = position2.equals(obj3);
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = position2.equals((java.lang.Object) cell5);
        java.lang.String str7 = position2.toString();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board8.isWinningBoard();
        int int11 = board8.getScore();
        boolean boolean12 = position2.equals((java.lang.Object) board8);
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int16 = cell15.getValue();
        java.lang.String str17 = cell15.toString();
        boolean boolean18 = cell15.isEmpty();
        boolean boolean20 = cell15.equals((java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            board8.setCell(0, 100, cell15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(100, 100)" + "'", str7, "(100, 100)");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "." + "'", str17, ".");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        boolean boolean2 = board0.moveDown();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Direction direction4 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult5 = ar.edu.unrc.game2048.Movement.move(board3, direction4);
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(2048);
        java.lang.Object obj10 = null;
        boolean boolean11 = cell9.equals(obj10);
        ar.edu.unrc.game2048.Cell cell13 = new ar.edu.unrc.game2048.Cell(2048);
        boolean boolean14 = cell9.canMergeWith(cell13);
        // The following exception was thrown during execution in test generation
        try {
            board3.setCell(2048, (int) ' ', cell9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (2048, 32) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction4.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveDown();
        ar.edu.unrc.game2048.Cell cell7 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int9 = cell8.getValue();
        int int10 = cell8.getValue();
        boolean boolean11 = cell8.isEmpty();
        boolean boolean12 = cell7.canMergeWith(cell8);
        board0.setCell((int) (short) 0, (int) (byte) 1, cell8);
        ar.edu.unrc.game2048.Cell cell14 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int15 = cell14.getValue();
        java.lang.String str16 = cell14.toString();
        java.lang.String str17 = cell14.toString();
        ar.edu.unrc.game2048.Cell cell18 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int19 = cell18.getValue();
        ar.edu.unrc.game2048.Cell cell20 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int21 = cell20.getValue();
        java.lang.String str22 = cell20.toString();
        java.lang.String str23 = cell20.toString();
        boolean boolean24 = cell18.canMergeWith(cell20);
        boolean boolean25 = cell14.canMergeWith(cell18);
        boolean boolean26 = cell8.canMergeWith(cell18);
        boolean boolean27 = cell8.isEmpty();
        ar.edu.unrc.game2048.Cell cell29 = new ar.edu.unrc.game2048.Cell(2048);
        java.lang.Object obj30 = null;
        boolean boolean31 = cell29.equals(obj30);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell32 = cell8.mergeWith(cell29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and 2048");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "." + "'", str16, ".");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "." + "'", str17, ".");
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "." + "'", str22, ".");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "." + "'", str23, ".");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        ar.edu.unrc.game2048.AddTileStrategy addTileStrategy1 = null;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 10, addTileStrategy1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(10, (int) (byte) 10);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        java.lang.String str3 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int5 = cell4.getValue();
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int7 = cell6.getValue();
        java.lang.String str8 = cell6.toString();
        java.lang.String str9 = cell6.toString();
        boolean boolean10 = cell4.canMergeWith(cell6);
        boolean boolean11 = cell0.canMergeWith(cell4);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean15 = board12.isWinningBoard();
        boolean boolean16 = board12.isLosingBoard();
        boolean boolean17 = cell4.equals((java.lang.Object) board12);
        ar.edu.unrc.game2048.Cell cell19 = new ar.edu.unrc.game2048.Cell(2048);
        java.lang.Object obj20 = null;
        boolean boolean21 = cell19.equals(obj20);
        int int22 = cell19.getValue();
        ar.edu.unrc.game2048.Board.Position position25 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.Object obj26 = null;
        boolean boolean27 = position25.equals(obj26);
        ar.edu.unrc.game2048.Cell cell28 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean29 = position25.equals((java.lang.Object) cell28);
        java.lang.String str30 = position25.toString();
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(board31);
        boolean boolean33 = board31.isWinningBoard();
        int int34 = board31.getScore();
        boolean boolean35 = position25.equals((java.lang.Object) board31);
        java.lang.String str36 = board31.toString();
        boolean boolean37 = board31.moveUp();
        boolean boolean38 = cell19.equals((java.lang.Object) boolean37);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell39 = cell4.mergeWith(cell19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and 2048");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2048 + "'", int22 == 2048);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(100, 100)" + "'", str30, "(100, 100)");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str36, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, 1);
        ar.edu.unrc.game2048.Cell cell4 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int6 = cell5.getValue();
        int int7 = cell5.getValue();
        boolean boolean8 = cell5.isEmpty();
        boolean boolean9 = cell4.canMergeWith(cell5);
        boolean boolean10 = position2.equals((java.lang.Object) cell4);
        int int11 = position2.row;
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board12.isWinningBoard();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board12);
        int int16 = board12.getScore();
        int int17 = board12.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet18 = board12.getEmptyPositions();
        boolean boolean19 = position2.equals((java.lang.Object) board12);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(positionSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        ar.edu.unrc.game2048.AddTileStrategy addTileStrategy1 = null;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) '#', addTileStrategy1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.isWinningBoard();
        boolean boolean4 = board0.moveRight();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board0);
        int int6 = board0.getSize();
        boolean boolean7 = board0.isFull();
        boolean boolean8 = board0.isFull();
        boolean boolean9 = board0.moveRight();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean11 = board10.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        java.lang.String str3 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int5 = cell4.getValue();
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int7 = cell6.getValue();
        java.lang.String str8 = cell6.toString();
        java.lang.String str9 = cell6.toString();
        boolean boolean10 = cell4.canMergeWith(cell6);
        boolean boolean11 = cell0.canMergeWith(cell4);
        int int12 = cell4.getValue();
        java.lang.String str13 = cell4.toString();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean16 = board14.isWinningBoard();
        boolean boolean17 = board14.isFull();
        boolean boolean18 = board14.moveUp();
        int int19 = board14.getSize();
        boolean boolean20 = board14.isWinningBoard();
        boolean boolean21 = cell4.equals((java.lang.Object) board14);
        java.lang.String str22 = board14.toString();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "." + "'", str13, ".");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str22, "Score: 0\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell must be a power of two: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) 'a');
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        boolean boolean2 = board0.isWinningBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell5 = board0.getCell(2048, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (2048, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        boolean boolean3 = cell0.isEmpty();
        boolean boolean5 = cell0.equals((java.lang.Object) 100.0d);
        int int6 = cell0.getValue();
        java.lang.String str7 = cell0.toString();
        java.lang.String str8 = cell0.toString();
        ar.edu.unrc.game2048.Board.Position position11 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int12 = position11.row;
        boolean boolean13 = cell0.equals((java.lang.Object) position11);
        int int14 = position11.row;
        java.lang.String str15 = position11.toString();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(100, 100)" + "'", str15, "(100, 100)");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int3 = position2.col;
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        boolean boolean7 = board6.isFull();
        boolean boolean8 = board6.moveDown();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board6);
        ar.edu.unrc.game2048.Board.Direction direction10 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult11 = ar.edu.unrc.game2048.Movement.move(board9, direction10);
        boolean boolean12 = position2.equals((java.lang.Object) board9);
        java.lang.Class<?> wildcardClass13 = board9.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(100, 100)" + "'", str4, "(100, 100)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + direction10 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction10.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, 1);
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.String str6 = position5.toString();
        int int7 = position5.col;
        java.lang.String str8 = position5.toString();
        int int9 = position5.col;
        java.lang.Object obj10 = null;
        boolean boolean11 = position5.equals(obj10);
        boolean boolean12 = position2.equals(obj10);
        int int13 = position2.row;
        int int14 = position2.col;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(100, 100)" + "'", str6, "(100, 100)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(100, 100)" + "'", str8, "(100, 100)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isFull();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board3);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean6 = board3.isWinningBoard();
        boolean boolean7 = board3.moveRight();
        boolean boolean8 = board3.isFull();
        boolean boolean9 = board3.isFull();
        ar.edu.unrc.game2048.Board.Direction direction10 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult11 = ar.edu.unrc.game2048.Movement.move(board3, direction10);
        ar.edu.unrc.game2048.Board board12 = moveResult11.board;
        boolean boolean13 = board0.equals((java.lang.Object) board12);
        java.lang.String str14 = board0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + direction10 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction10.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult11);
        org.junit.Assert.assertNotNull(board12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str14, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Position position4 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int5 = position4.row;
        boolean boolean6 = board1.equals((java.lang.Object) int5);
        java.lang.String str7 = board1.toString();
        boolean boolean8 = board1.hasEmptyCells();
        boolean boolean9 = board1.moveDown();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell12 = board1.getCell(10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveUp();
        boolean boolean5 = board0.equals((java.lang.Object) '#');
        boolean boolean6 = board0.moveRight();
        boolean boolean7 = board0.isWinningBoard();
        boolean boolean8 = board0.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        int int4 = board3.getSize();
        boolean boolean5 = board3.hasEmptyCells();
        boolean boolean6 = board3.moveDown();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int6 = position5.row;
        boolean boolean7 = board2.equals((java.lang.Object) int6);
        boolean boolean8 = cell0.equals((java.lang.Object) int6);
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int10 = cell9.getValue();
        int int11 = cell9.getValue();
        boolean boolean12 = cell9.isEmpty();
        boolean boolean13 = cell0.canMergeWith(cell9);
        java.lang.String str14 = cell9.toString();
        ar.edu.unrc.game2048.Cell cell16 = new ar.edu.unrc.game2048.Cell((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell17 = cell9.mergeWith(cell16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.isWinningBoard();
        boolean boolean4 = board0.moveRight();
        boolean boolean5 = board0.isFull();
        boolean boolean6 = board0.isFull();
        ar.edu.unrc.game2048.Board.Direction direction7 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult8 = ar.edu.unrc.game2048.Movement.move(board0, direction7);
        int int9 = moveResult8.scoreDelta;
        int int10 = moveResult8.scoreDelta;
        ar.edu.unrc.game2048.Board board11 = moveResult8.board;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + direction7 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction7.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(board11);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        int int2 = cell0.getValue();
        boolean boolean3 = cell0.isEmpty();
        java.lang.String str4 = cell0.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean7 = board5.isWinningBoard();
        boolean boolean8 = board5.moveUp();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean10 = cell0.equals((java.lang.Object) board5);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell13 = board5.getCell(0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "." + "'", str4, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.Class<?> wildcardClass2 = cell1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(100, (int) (short) -1);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveDown();
        ar.edu.unrc.game2048.Cell cell7 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int9 = cell8.getValue();
        int int10 = cell8.getValue();
        boolean boolean11 = cell8.isEmpty();
        boolean boolean12 = cell7.canMergeWith(cell8);
        board0.setCell((int) (short) 0, (int) (byte) 1, cell8);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board0.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(positionSet14);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell must be a power of two: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        java.lang.String str3 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int5 = cell4.getValue();
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int7 = cell6.getValue();
        java.lang.String str8 = cell6.toString();
        java.lang.String str9 = cell6.toString();
        boolean boolean10 = cell4.canMergeWith(cell6);
        boolean boolean11 = cell0.canMergeWith(cell4);
        boolean boolean12 = cell0.isEmpty();
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int14 = cell13.getValue();
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int16 = cell15.getValue();
        java.lang.String str17 = cell15.toString();
        java.lang.String str18 = cell15.toString();
        boolean boolean19 = cell13.canMergeWith(cell15);
        int int20 = cell13.getValue();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell21 = cell0.mergeWith(cell13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "." + "'", str17, ".");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "." + "'", str18, ".");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Position position4 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int5 = position4.row;
        boolean boolean6 = board1.equals((java.lang.Object) int5);
        java.lang.String str7 = board1.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board1.getEmptyPositions();
        boolean boolean9 = board1.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell13 = board1.getCell(1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell16 = board1.getCell(10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertNotNull(cell13);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int3 = position2.col;
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        boolean boolean7 = position2.equals((java.lang.Object) 0.0d);
        int int8 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(100, 100)" + "'", str4, "(100, 100)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board3.moveRight();
        int int5 = board3.getScore();
        boolean boolean6 = board3.moveDown();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean8 = board3.moveUp();
        boolean boolean9 = board3.isFull();
        ar.edu.unrc.game2048.Board.Position position14 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.Object obj15 = null;
        boolean boolean16 = position14.equals(obj15);
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean18 = position14.equals((java.lang.Object) cell17);
        java.lang.String str19 = cell17.toString();
        int int20 = cell17.getValue();
        // The following exception was thrown during execution in test generation
        try {
            board3.setCell((int) (byte) 100, 0, cell17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "." + "'", str19, ".");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board3);
        ar.edu.unrc.game2048.Board.Position position7 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int8 = position7.row;
        boolean boolean9 = board4.equals((java.lang.Object) int8);
        java.lang.String str10 = board4.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet11 = board4.getEmptyPositions();
        boolean boolean12 = board2.equals((java.lang.Object) positionSet11);
        boolean boolean13 = board2.isWinningBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell16 = board2.getCell((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (35, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str10, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.Object obj3 = null;
        boolean boolean4 = position2.equals(obj3);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean8 = board5.isWinningBoard();
        boolean boolean9 = board5.moveRight();
        boolean boolean10 = board5.isFull();
        boolean boolean11 = board5.isFull();
        ar.edu.unrc.game2048.Board.Direction direction12 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult13 = ar.edu.unrc.game2048.Movement.move(board5, direction12);
        int int14 = moveResult13.scoreDelta;
        int int15 = moveResult13.scoreDelta;
        int int16 = moveResult13.scoreDelta;
        boolean boolean17 = position2.equals((java.lang.Object) int16);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + direction12 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction12.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int6 = position5.row;
        boolean boolean7 = board2.equals((java.lang.Object) int6);
        boolean boolean8 = cell0.equals((java.lang.Object) int6);
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int10 = cell9.getValue();
        int int11 = cell9.getValue();
        boolean boolean12 = cell9.isEmpty();
        boolean boolean13 = cell0.canMergeWith(cell9);
        java.lang.String str14 = cell9.toString();
        ar.edu.unrc.game2048.Cell cell16 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board17);
        boolean boolean19 = board17.isWinningBoard();
        boolean boolean20 = board17.moveDown();
        ar.edu.unrc.game2048.Cell cell24 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell25 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int26 = cell25.getValue();
        int int27 = cell25.getValue();
        boolean boolean28 = cell25.isEmpty();
        boolean boolean29 = cell24.canMergeWith(cell25);
        board17.setCell((int) (short) 0, (int) (byte) 1, cell25);
        ar.edu.unrc.game2048.Board.Position position33 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.Object obj34 = null;
        boolean boolean35 = position33.equals(obj34);
        ar.edu.unrc.game2048.Cell cell36 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean37 = position33.equals((java.lang.Object) cell36);
        boolean boolean38 = cell36.isEmpty();
        boolean boolean39 = cell25.canMergeWith(cell36);
        boolean boolean40 = cell25.isEmpty();
        boolean boolean41 = cell16.canMergeWith(cell25);
        boolean boolean42 = cell9.canMergeWith(cell25);
        java.lang.String str43 = cell9.toString();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "." + "'", str43, ".");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        int int4 = board0.getScore();
        boolean boolean5 = board0.hasEmptyCells();
        boolean boolean6 = board0.isFull();
        boolean boolean7 = board0.hasEmptyCells();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean9 = board0.moveRight();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board1);
        java.lang.Class<?> wildcardClass4 = board1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.isWinningBoard();
        boolean boolean4 = board0.moveRight();
        int int5 = board0.getSize();
        boolean boolean6 = board0.hasEmptyCells();
        boolean boolean7 = board0.hasEmptyCells();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        boolean boolean9 = board8.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board8.getEmptyPositions();
        boolean boolean11 = board0.equals((java.lang.Object) positionSet10);
        java.lang.Class<?> wildcardClass12 = positionSet10.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        ar.edu.unrc.game2048.AddTileStrategy addTileStrategy1 = null;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 0, addTileStrategy1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.isWinningBoard();
        boolean boolean4 = board0.moveRight();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board0);
        int int6 = board0.getSize();
        boolean boolean7 = board0.isFull();
        boolean boolean8 = board0.moveRight();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        ar.edu.unrc.game2048.AddTileStrategy addTileStrategy1 = null;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) '4', addTileStrategy1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean4 = board2.isWinningBoard();
        boolean boolean5 = board2.moveDown();
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int11 = cell10.getValue();
        int int12 = cell10.getValue();
        boolean boolean13 = cell10.isEmpty();
        boolean boolean14 = cell9.canMergeWith(cell10);
        board2.setCell((int) (short) 0, (int) (byte) 1, cell10);
        ar.edu.unrc.game2048.Board.Position position18 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.Object obj19 = null;
        boolean boolean20 = position18.equals(obj19);
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean22 = position18.equals((java.lang.Object) cell21);
        boolean boolean23 = cell21.isEmpty();
        boolean boolean24 = cell10.canMergeWith(cell21);
        boolean boolean25 = cell10.isEmpty();
        boolean boolean26 = cell1.canMergeWith(cell10);
        int int27 = cell1.getValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int6 = position5.col;
        int int7 = position5.row;
        boolean boolean8 = board1.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.Board.Direction direction9 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult10 = ar.edu.unrc.game2048.Movement.move(board1, direction9);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean12 = board1.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board1.getEmptyPositions();
        int int14 = board1.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + direction9 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction9.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertNotNull(moveResult10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        boolean boolean3 = cell0.isEmpty();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int5 = cell4.getValue();
        java.lang.String str6 = cell4.toString();
        boolean boolean7 = cell0.canMergeWith(cell4);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board8.isWinningBoard();
        boolean boolean11 = board8.moveUp();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean13 = board8.moveDown();
        boolean boolean14 = cell4.equals((java.lang.Object) board8);
        boolean boolean15 = board8.moveRight();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (52, 100) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveDown();
        ar.edu.unrc.game2048.Cell cell7 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int9 = cell8.getValue();
        int int10 = cell8.getValue();
        boolean boolean11 = cell8.isEmpty();
        boolean boolean12 = cell7.canMergeWith(cell8);
        board0.setCell((int) (short) 0, (int) (byte) 1, cell8);
        boolean boolean14 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board0.getEmptyPositions();
        boolean boolean17 = board0.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        java.lang.String str3 = board0.toString();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int5 = cell4.getValue();
        java.lang.String str6 = cell4.toString();
        boolean boolean7 = cell4.isEmpty();
        boolean boolean9 = cell4.equals((java.lang.Object) 100.0d);
        int int10 = cell4.getValue();
        java.lang.String str11 = cell4.toString();
        java.lang.String str12 = cell4.toString();
        ar.edu.unrc.game2048.Board.Position position15 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int16 = position15.row;
        boolean boolean17 = cell4.equals((java.lang.Object) position15);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board18);
        boolean boolean20 = board19.isWinningBoard();
        boolean boolean21 = position15.equals((java.lang.Object) boolean20);
        boolean boolean22 = board0.equals((java.lang.Object) boolean20);
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(board0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean4 = board0.equals((java.lang.Object) (-1.0d));
        boolean boolean5 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int9 = cell8.getValue();
        java.lang.String str10 = cell8.toString();
        boolean boolean11 = cell8.isEmpty();
        boolean boolean13 = cell8.equals((java.lang.Object) 100.0d);
        int int14 = cell8.getValue();
        java.lang.String str15 = cell8.toString();
        java.lang.String str16 = cell8.toString();
        boolean boolean18 = cell8.equals((java.lang.Object) (byte) 0);
        ar.edu.unrc.game2048.Cell cell19 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int20 = cell19.getValue();
        java.lang.String str21 = cell19.toString();
        boolean boolean22 = cell19.isEmpty();
        boolean boolean24 = cell19.equals((java.lang.Object) 100.0d);
        int int25 = cell19.getValue();
        java.lang.String str26 = cell19.toString();
        java.lang.String str27 = cell19.toString();
        boolean boolean28 = cell8.canMergeWith(cell19);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) 'a', 0, cell19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "." + "'", str16, ".");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "." + "'", str21, ".");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "." + "'", str26, ".");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "." + "'", str27, ".");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isFull();
        boolean boolean4 = board0.moveRight();
        java.lang.Class<?> wildcardClass5 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        int int4 = board3.getSize();
        int int5 = board3.getSize();
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int9 = cell8.getValue();
        java.lang.String str10 = cell8.toString();
        boolean boolean11 = cell8.isEmpty();
        boolean boolean12 = cell8.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            board3.setCell(2, (int) '4', cell8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (2, 52) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.String str3 = position2.toString();
        int int4 = position2.col;
        java.lang.String str5 = position2.toString();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board6.isWinningBoard();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board6);
        int int10 = board6.getScore();
        boolean boolean11 = position2.equals((java.lang.Object) board6);
        boolean boolean12 = board6.isWinningBoard();
        boolean boolean13 = board6.moveLeft();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 100)" + "'", str3, "(100, 100)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(100, 100)" + "'", str5, "(100, 100)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.hasEmptyCells();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean9 = board7.isWinningBoard();
        boolean boolean10 = board7.moveDown();
        ar.edu.unrc.game2048.Cell cell14 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int16 = cell15.getValue();
        int int17 = cell15.getValue();
        boolean boolean18 = cell15.isEmpty();
        boolean boolean19 = cell14.canMergeWith(cell15);
        board7.setCell((int) (short) 0, (int) (byte) 1, cell15);
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int22 = cell21.getValue();
        java.lang.String str23 = cell21.toString();
        java.lang.String str24 = cell21.toString();
        ar.edu.unrc.game2048.Cell cell25 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int26 = cell25.getValue();
        ar.edu.unrc.game2048.Cell cell27 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int28 = cell27.getValue();
        java.lang.String str29 = cell27.toString();
        java.lang.String str30 = cell27.toString();
        boolean boolean31 = cell25.canMergeWith(cell27);
        boolean boolean32 = cell21.canMergeWith(cell25);
        boolean boolean33 = cell15.canMergeWith(cell25);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(10, (int) (short) -1, cell25);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "." + "'", str23, ".");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "." + "'", str24, ".");
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "." + "'", str29, ".");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "." + "'", str30, ".");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        ar.edu.unrc.game2048.AddTileStrategy addTileStrategy1 = null;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 100, addTileStrategy1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int6 = position5.row;
        boolean boolean7 = board2.equals((java.lang.Object) int6);
        boolean boolean8 = cell0.equals((java.lang.Object) int6);
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int10 = cell9.getValue();
        int int11 = cell9.getValue();
        boolean boolean12 = cell9.isEmpty();
        boolean boolean13 = cell0.canMergeWith(cell9);
        int int14 = cell0.getValue();
        ar.edu.unrc.game2048.Board.Position position17 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.Object obj18 = null;
        boolean boolean19 = position17.equals(obj18);
        ar.edu.unrc.game2048.Cell cell20 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean21 = position17.equals((java.lang.Object) cell20);
        boolean boolean22 = cell20.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell23 = cell0.mergeWith(cell20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Position position4 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int5 = position4.row;
        boolean boolean6 = board1.equals((java.lang.Object) int5);
        java.lang.String str7 = board1.toString();
        boolean boolean8 = board1.hasEmptyCells();
        boolean boolean9 = board1.moveDown();
        boolean boolean10 = board1.moveDown();
        boolean boolean11 = board1.moveRight();
        boolean boolean12 = board1.isWinningBoard();
        int int13 = board1.getSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveLeft();
        boolean boolean4 = board0.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.String str3 = position2.toString();
        int int4 = position2.col;
        java.lang.String str5 = position2.toString();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board6.isWinningBoard();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board6);
        int int10 = board6.getScore();
        boolean boolean11 = position2.equals((java.lang.Object) board6);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = board6.getEmptyPositions();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 100)" + "'", str3, "(100, 100)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(100, 100)" + "'", str5, "(100, 100)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(positionSet12);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveDown();
        ar.edu.unrc.game2048.Cell cell7 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int9 = cell8.getValue();
        int int10 = cell8.getValue();
        boolean boolean11 = cell8.isEmpty();
        boolean boolean12 = cell7.canMergeWith(cell8);
        board0.setCell((int) (short) 0, (int) (byte) 1, cell8);
        ar.edu.unrc.game2048.Board.Direction direction14 = ar.edu.unrc.game2048.Board.Direction.UP;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult15 = ar.edu.unrc.game2048.Movement.move(board0, direction14);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell18 = board0.getCell((int) (short) 10, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 4) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + direction14 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction14.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertNotNull(moveResult15);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isFull();
        boolean boolean4 = board0.moveRight();
        boolean boolean5 = board0.isWinningBoard();
        int int6 = board0.getScore();
        boolean boolean7 = board0.isFull();
        boolean boolean8 = board0.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        boolean boolean2 = board0.moveDown();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Direction direction4 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult5 = ar.edu.unrc.game2048.Movement.move(board3, direction4);
        int int6 = moveResult5.scoreDelta;
        ar.edu.unrc.game2048.Board board7 = moveResult5.board;
        boolean boolean8 = board7.isFull();
        java.lang.String str9 = board7.toString();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell12 = board7.getCell(10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction4.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(board7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    4|    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    4|    2|     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        ar.edu.unrc.game2048.AddTileStrategy addTileStrategy1 = null;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 1, addTileStrategy1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean4 = board3.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isFull();
        boolean boolean4 = board0.moveRight();
        boolean boolean5 = board0.isWinningBoard();
        int int6 = board0.getScore();
        boolean boolean7 = board0.hasEmptyCells();
        int int8 = board0.getSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int6 = position5.row;
        boolean boolean7 = board2.equals((java.lang.Object) int6);
        boolean boolean8 = cell0.equals((java.lang.Object) int6);
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int10 = cell9.getValue();
        int int11 = cell9.getValue();
        boolean boolean12 = cell9.isEmpty();
        boolean boolean13 = cell0.canMergeWith(cell9);
        java.lang.String str14 = cell9.toString();
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int16 = cell15.getValue();
        java.lang.String str17 = cell15.toString();
        java.lang.String str18 = cell15.toString();
        ar.edu.unrc.game2048.Cell cell19 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int20 = cell19.getValue();
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int22 = cell21.getValue();
        java.lang.String str23 = cell21.toString();
        java.lang.String str24 = cell21.toString();
        boolean boolean25 = cell19.canMergeWith(cell21);
        boolean boolean26 = cell15.canMergeWith(cell19);
        boolean boolean27 = cell9.canMergeWith(cell15);
        ar.edu.unrc.game2048.Cell cell28 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int29 = cell28.getValue();
        java.lang.String str30 = cell28.toString();
        boolean boolean31 = cell28.isEmpty();
        boolean boolean33 = cell28.equals((java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell34 = cell15.mergeWith(cell28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "." + "'", str17, ".");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "." + "'", str18, ".");
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "." + "'", str23, ".");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "." + "'", str24, ".");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "." + "'", str30, ".");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Position position4 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int5 = position4.row;
        boolean boolean6 = board1.equals((java.lang.Object) int5);
        java.lang.String str7 = board1.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board1.getEmptyPositions();
        boolean boolean9 = board1.isWinningBoard();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isWinningBoard();
        java.lang.Class<?> wildcardClass2 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isFull();
        boolean boolean4 = board0.moveRight();
        boolean boolean5 = board0.isWinningBoard();
        boolean boolean7 = board0.equals((java.lang.Object) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        int int4 = board0.getScore();
        boolean boolean5 = board0.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board0.getEmptyPositions();
        boolean boolean7 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int11 = cell10.getValue();
        java.lang.String str12 = cell10.toString();
        java.lang.String str13 = cell10.toString();
        ar.edu.unrc.game2048.Cell cell14 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int15 = cell14.getValue();
        ar.edu.unrc.game2048.Cell cell16 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int17 = cell16.getValue();
        java.lang.String str18 = cell16.toString();
        java.lang.String str19 = cell16.toString();
        boolean boolean20 = cell14.canMergeWith(cell16);
        boolean boolean21 = cell10.canMergeWith(cell14);
        ar.edu.unrc.game2048.Cell cell22 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int23 = cell22.getValue();
        java.lang.String str24 = cell22.toString();
        boolean boolean25 = cell14.canMergeWith(cell22);
        boolean boolean26 = cell14.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) '#', (int) (short) 100, cell14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (35, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "." + "'", str13, ".");
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "." + "'", str18, ".");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "." + "'", str19, ".");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "." + "'", str24, ".");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isFull();
        boolean boolean3 = board0.hasEmptyCells();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        boolean boolean5 = board4.isFull();
        boolean boolean6 = board4.moveDown();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board4);
        ar.edu.unrc.game2048.Board.Direction direction8 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult9 = ar.edu.unrc.game2048.Movement.move(board7, direction8);
        ar.edu.unrc.game2048.Board board10 = moveResult9.board;
        ar.edu.unrc.game2048.Board board11 = moveResult9.board;
        boolean boolean12 = board11.hasEmptyCells();
        ar.edu.unrc.game2048.Board.Direction direction13 = ar.edu.unrc.game2048.Board.Direction.UP;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult14 = ar.edu.unrc.game2048.Movement.move(board11, direction13);
        ar.edu.unrc.game2048.Movement.MoveResult moveResult15 = ar.edu.unrc.game2048.Movement.move(board0, direction13);
        int int16 = moveResult15.scoreDelta;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + direction8 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction8.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult9);
        org.junit.Assert.assertNotNull(board10);
        org.junit.Assert.assertNotNull(board11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + direction13 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction13.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertNotNull(moveResult14);
        org.junit.Assert.assertNotNull(moveResult15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) -1, (int) (byte) 10);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board3.moveRight();
        int int5 = board3.getScore();
        boolean boolean6 = board3.moveDown();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean8 = board3.moveUp();
        boolean boolean9 = board3.isFull();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell12 = board3.getCell((int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 10, (int) (byte) -1);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        boolean boolean3 = cell0.isEmpty();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int5 = cell4.getValue();
        java.lang.String str6 = cell4.toString();
        java.lang.String str7 = cell4.toString();
        ar.edu.unrc.game2048.Board.Position position10 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int11 = position10.col;
        int int12 = position10.col;
        boolean boolean13 = cell4.equals((java.lang.Object) position10);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell14 = cell0.mergeWith(cell4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.String str3 = position2.toString();
        int int4 = position2.col;
        java.lang.String str5 = position2.toString();
        int int6 = position2.row;
        java.lang.String str7 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 100)" + "'", str3, "(100, 100)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(100, 100)" + "'", str5, "(100, 100)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(100, 100)" + "'", str7, "(100, 100)");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        int int3 = board0.getScore();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean5 = board4.moveUp();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int6 = position5.col;
        int int7 = position5.row;
        boolean boolean8 = board1.equals((java.lang.Object) position5);
        boolean boolean9 = board1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, 0);
        int int3 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int6 = position5.col;
        int int7 = position5.row;
        boolean boolean8 = board1.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean10 = board1.moveUp();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.isWinningBoard();
        boolean boolean4 = board0.moveRight();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board0);
        int int6 = board0.getSize();
        boolean boolean7 = board0.isFull();
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell(0);
        boolean boolean12 = cell11.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (byte) 10, 100, cell11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.Object obj3 = null;
        boolean boolean4 = position2.equals(obj3);
        int int5 = position2.col;
        int int6 = position2.row;
        java.lang.String str7 = position2.toString();
        int int8 = position2.col;
        int int9 = position2.col;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(100, 100)" + "'", str7, "(100, 100)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        boolean boolean2 = board0.moveDown();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Direction direction4 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult5 = ar.edu.unrc.game2048.Movement.move(board3, direction4);
        ar.edu.unrc.game2048.Board board6 = moveResult5.board;
        ar.edu.unrc.game2048.Board board7 = moveResult5.board;
        boolean boolean8 = board7.hasEmptyCells();
        ar.edu.unrc.game2048.Board.Direction direction9 = ar.edu.unrc.game2048.Board.Direction.UP;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult10 = ar.edu.unrc.game2048.Movement.move(board7, direction9);
        boolean boolean11 = board7.moveDown();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = board7.getEmptyPositions();
        int int13 = board7.getScore();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction4.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult5);
        org.junit.Assert.assertNotNull(board6);
        org.junit.Assert.assertNotNull(board7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + direction9 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction9.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertNotNull(moveResult10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(positionSet12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Position position4 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int5 = position4.row;
        boolean boolean6 = board1.equals((java.lang.Object) int5);
        java.lang.String str7 = board1.toString();
        int int8 = board1.getSize();
        boolean boolean9 = board1.moveUp();
        int int10 = board1.getSize();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell13 = board1.getCell((int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, (int) (byte) 0);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        boolean boolean3 = cell0.isEmpty();
        boolean boolean5 = cell0.equals((java.lang.Object) 100.0d);
        int int6 = cell0.getValue();
        java.lang.String str7 = cell0.toString();
        java.lang.String str8 = cell0.toString();
        ar.edu.unrc.game2048.Board.Position position11 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int12 = position11.row;
        boolean boolean13 = cell0.equals((java.lang.Object) position11);
        int int14 = position11.col;
        java.lang.String str15 = position11.toString();
        int int16 = position11.row;
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(100, 100)" + "'", str15, "(100, 100)");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveDown();
        ar.edu.unrc.game2048.Cell cell7 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int9 = cell8.getValue();
        int int10 = cell8.getValue();
        boolean boolean11 = cell8.isEmpty();
        boolean boolean12 = cell7.canMergeWith(cell8);
        board0.setCell((int) (short) 0, (int) (byte) 1, cell8);
        boolean boolean14 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean16 = board0.moveUp();
        boolean boolean17 = board0.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveDown();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board4);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean7 = board4.isWinningBoard();
        boolean boolean8 = board4.moveRight();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board4);
        int int10 = board4.getSize();
        boolean boolean11 = board4.moveUp();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board12.isWinningBoard();
        boolean boolean15 = board12.moveDown();
        ar.edu.unrc.game2048.Cell cell19 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell20 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int21 = cell20.getValue();
        int int22 = cell20.getValue();
        boolean boolean23 = cell20.isEmpty();
        boolean boolean24 = cell19.canMergeWith(cell20);
        board12.setCell((int) (short) 0, (int) (byte) 1, cell20);
        ar.edu.unrc.game2048.Board.Direction direction26 = ar.edu.unrc.game2048.Board.Direction.UP;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult27 = ar.edu.unrc.game2048.Movement.move(board12, direction26);
        ar.edu.unrc.game2048.Movement.MoveResult moveResult28 = ar.edu.unrc.game2048.Movement.move(board4, direction26);
        boolean boolean29 = board0.equals((java.lang.Object) moveResult28);
        java.lang.Class<?> wildcardClass30 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + direction26 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction26.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertNotNull(moveResult27);
        org.junit.Assert.assertNotNull(moveResult28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, (int) ' ');
        java.lang.String str3 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 32)" + "'", str3, "(100, 32)");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isFull();
        boolean boolean4 = board0.moveRight();
        boolean boolean5 = board0.isWinningBoard();
        int int6 = board0.getScore();
        boolean boolean7 = board0.isLosingBoard();
        java.lang.Class<?> wildcardClass8 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        boolean boolean2 = board0.moveDown();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Direction direction4 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult5 = ar.edu.unrc.game2048.Movement.move(board3, direction4);
        ar.edu.unrc.game2048.Board board6 = moveResult5.board;
        int int7 = board6.getSize();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board6);
        java.lang.Object obj9 = null;
        boolean boolean10 = board6.equals(obj9);
        boolean boolean11 = board6.moveUp();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction4.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult5);
        org.junit.Assert.assertNotNull(board6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.isWinningBoard();
        boolean boolean4 = board0.moveRight();
        boolean boolean5 = board0.isFull();
        boolean boolean6 = board0.isFull();
        ar.edu.unrc.game2048.Board.Direction direction7 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult8 = ar.edu.unrc.game2048.Movement.move(board0, direction7);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board0.getEmptyPositions();
        int int10 = board0.getSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + direction7 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction7.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult8);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        ar.edu.unrc.game2048.AddTileStrategy addTileStrategy1 = null;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(10, addTileStrategy1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        java.lang.String str3 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int5 = cell4.getValue();
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int7 = cell6.getValue();
        java.lang.String str8 = cell6.toString();
        java.lang.String str9 = cell6.toString();
        boolean boolean10 = cell4.canMergeWith(cell6);
        boolean boolean11 = cell0.canMergeWith(cell4);
        java.lang.String str12 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell14 = new ar.edu.unrc.game2048.Cell((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell15 = cell0.mergeWith(cell14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.String str3 = position2.toString();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board4);
        ar.edu.unrc.game2048.Board.Position position8 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int9 = position8.row;
        boolean boolean10 = board5.equals((java.lang.Object) int9);
        java.lang.String str11 = board5.toString();
        int int12 = board5.getSize();
        boolean boolean13 = board5.moveUp();
        boolean boolean14 = position2.equals((java.lang.Object) boolean13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 100)" + "'", str3, "(100, 100)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str11, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        int int5 = board0.getSize();
        boolean boolean6 = board0.moveRight();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(1, (int) (short) 10);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Position position4 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int5 = position4.row;
        boolean boolean6 = board1.equals((java.lang.Object) int5);
        java.lang.String str7 = board1.toString();
        int int8 = board1.getSize();
        boolean boolean9 = board1.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board1.getEmptyPositions();
        int int11 = board1.getScore();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int6 = position5.col;
        int int7 = position5.row;
        boolean boolean8 = board1.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.Board.Direction direction9 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult10 = ar.edu.unrc.game2048.Movement.move(board1, direction9);
        int int11 = moveResult10.scoreDelta;
        ar.edu.unrc.game2048.Board board12 = moveResult10.board;
        boolean boolean13 = board12.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + direction9 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction9.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertNotNull(moveResult10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(board12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isFull();
        boolean boolean3 = board0.hasEmptyCells();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        boolean boolean5 = board4.isFull();
        boolean boolean6 = board4.moveDown();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board4);
        ar.edu.unrc.game2048.Board.Direction direction8 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult9 = ar.edu.unrc.game2048.Movement.move(board7, direction8);
        ar.edu.unrc.game2048.Board board10 = moveResult9.board;
        ar.edu.unrc.game2048.Board board11 = moveResult9.board;
        boolean boolean12 = board11.hasEmptyCells();
        ar.edu.unrc.game2048.Board.Direction direction13 = ar.edu.unrc.game2048.Board.Direction.UP;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult14 = ar.edu.unrc.game2048.Movement.move(board11, direction13);
        ar.edu.unrc.game2048.Movement.MoveResult moveResult15 = ar.edu.unrc.game2048.Movement.move(board0, direction13);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board0.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + direction8 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction8.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult9);
        org.junit.Assert.assertNotNull(board10);
        org.junit.Assert.assertNotNull(board11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + direction13 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction13.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertNotNull(moveResult14);
        org.junit.Assert.assertNotNull(moveResult15);
        org.junit.Assert.assertNotNull(positionSet16);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.isWinningBoard();
        boolean boolean4 = board0.moveRight();
        int int5 = board0.getSize();
        boolean boolean6 = board0.hasEmptyCells();
        boolean boolean7 = board0.hasEmptyCells();
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int9 = cell8.getValue();
        java.lang.String str10 = cell8.toString();
        boolean boolean11 = cell8.isEmpty();
        boolean boolean13 = cell8.equals((java.lang.Object) 100.0d);
        int int14 = cell8.getValue();
        boolean boolean15 = board0.equals((java.lang.Object) int14);
        boolean boolean16 = board0.moveDown();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board19);
        boolean boolean21 = board19.isWinningBoard();
        boolean boolean22 = board19.moveDown();
        ar.edu.unrc.game2048.Cell cell26 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell27 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int28 = cell27.getValue();
        int int29 = cell27.getValue();
        boolean boolean30 = cell27.isEmpty();
        boolean boolean31 = cell26.canMergeWith(cell27);
        board19.setCell((int) (short) 0, (int) (byte) 1, cell27);
        ar.edu.unrc.game2048.Cell cell33 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int34 = cell33.getValue();
        java.lang.String str35 = cell33.toString();
        java.lang.String str36 = cell33.toString();
        ar.edu.unrc.game2048.Cell cell37 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int38 = cell37.getValue();
        ar.edu.unrc.game2048.Cell cell39 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int40 = cell39.getValue();
        java.lang.String str41 = cell39.toString();
        java.lang.String str42 = cell39.toString();
        boolean boolean43 = cell37.canMergeWith(cell39);
        boolean boolean44 = cell33.canMergeWith(cell37);
        boolean boolean45 = cell27.canMergeWith(cell37);
        boolean boolean46 = cell27.isEmpty();
        java.lang.String str47 = cell27.toString();
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(4, (int) (short) -1, cell27);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (4, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cell33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "." + "'", str35, ".");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "." + "'", str36, ".");
        org.junit.Assert.assertNotNull(cell37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(cell39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "." + "'", str41, ".");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "." + "'", str42, ".");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "." + "'", str47, ".");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.Object obj3 = null;
        boolean boolean4 = position2.equals(obj3);
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = position2.equals((java.lang.Object) cell5);
        java.lang.String str7 = cell5.toString();
        int int8 = cell5.getValue();
        int int9 = cell5.getValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isFull();
        boolean boolean4 = board0.moveUp();
        int int5 = board0.getScore();
        boolean boolean6 = board0.isFull();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board11);
        ar.edu.unrc.game2048.Board.Position position15 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int16 = position15.row;
        boolean boolean17 = board12.equals((java.lang.Object) int16);
        boolean boolean18 = cell10.equals((java.lang.Object) int16);
        ar.edu.unrc.game2048.Cell cell19 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int20 = cell19.getValue();
        int int21 = cell19.getValue();
        boolean boolean22 = cell19.isEmpty();
        boolean boolean23 = cell10.canMergeWith(cell19);
        java.lang.String str24 = cell19.toString();
        ar.edu.unrc.game2048.Cell cell26 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board(board27);
        boolean boolean29 = board27.isWinningBoard();
        boolean boolean30 = board27.moveDown();
        ar.edu.unrc.game2048.Cell cell34 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell35 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int36 = cell35.getValue();
        int int37 = cell35.getValue();
        boolean boolean38 = cell35.isEmpty();
        boolean boolean39 = cell34.canMergeWith(cell35);
        board27.setCell((int) (short) 0, (int) (byte) 1, cell35);
        ar.edu.unrc.game2048.Board.Position position43 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.Object obj44 = null;
        boolean boolean45 = position43.equals(obj44);
        ar.edu.unrc.game2048.Cell cell46 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean47 = position43.equals((java.lang.Object) cell46);
        boolean boolean48 = cell46.isEmpty();
        boolean boolean49 = cell35.canMergeWith(cell46);
        boolean boolean50 = cell35.isEmpty();
        boolean boolean51 = cell26.canMergeWith(cell35);
        boolean boolean52 = cell19.canMergeWith(cell35);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(10, 100, cell35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "." + "'", str24, ".");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(cell35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(cell46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isFull();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board3);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean6 = board3.isWinningBoard();
        boolean boolean7 = board3.moveRight();
        boolean boolean8 = board3.isFull();
        boolean boolean9 = board3.isFull();
        ar.edu.unrc.game2048.Board.Direction direction10 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult11 = ar.edu.unrc.game2048.Movement.move(board3, direction10);
        ar.edu.unrc.game2048.Board board12 = moveResult11.board;
        boolean boolean13 = board0.equals((java.lang.Object) board12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board14);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean17 = board14.isWinningBoard();
        boolean boolean18 = board14.moveRight();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board14);
        int int20 = board14.getSize();
        boolean boolean21 = board14.moveUp();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(board22);
        boolean boolean24 = board22.isWinningBoard();
        boolean boolean25 = board22.moveDown();
        ar.edu.unrc.game2048.Cell cell29 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell30 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int31 = cell30.getValue();
        int int32 = cell30.getValue();
        boolean boolean33 = cell30.isEmpty();
        boolean boolean34 = cell29.canMergeWith(cell30);
        board22.setCell((int) (short) 0, (int) (byte) 1, cell30);
        ar.edu.unrc.game2048.Board.Direction direction36 = ar.edu.unrc.game2048.Board.Direction.UP;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult37 = ar.edu.unrc.game2048.Movement.move(board22, direction36);
        ar.edu.unrc.game2048.Movement.MoveResult moveResult38 = ar.edu.unrc.game2048.Movement.move(board14, direction36);
        ar.edu.unrc.game2048.Movement.MoveResult moveResult39 = ar.edu.unrc.game2048.Movement.move(board0, direction36);
        int int40 = moveResult39.scoreDelta;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + direction10 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction10.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult11);
        org.junit.Assert.assertNotNull(board12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + direction36 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction36.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertNotNull(moveResult37);
        org.junit.Assert.assertNotNull(moveResult38);
        org.junit.Assert.assertNotNull(moveResult39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.hasEmptyCells();
        boolean boolean5 = board0.hasEmptyCells();
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int11 = cell10.getValue();
        int int12 = cell10.getValue();
        boolean boolean13 = cell10.isEmpty();
        boolean boolean14 = cell9.canMergeWith(cell10);
        java.lang.String str15 = cell10.toString();
        boolean boolean16 = cell10.isEmpty();
        java.lang.String str17 = cell10.toString();
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(4, 0, cell10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (4, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "." + "'", str17, ".");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        ar.edu.unrc.game2048.AddTileStrategy addTileStrategy1 = null;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) 'a', addTileStrategy1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.String str3 = position2.toString();
        int int4 = position2.row;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 100)" + "'", str3, "(100, 100)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean4 = board2.isWinningBoard();
        boolean boolean5 = board2.moveDown();
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int11 = cell10.getValue();
        int int12 = cell10.getValue();
        boolean boolean13 = cell10.isEmpty();
        boolean boolean14 = cell9.canMergeWith(cell10);
        board2.setCell((int) (short) 0, (int) (byte) 1, cell10);
        ar.edu.unrc.game2048.Board.Position position18 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.Object obj19 = null;
        boolean boolean20 = position18.equals(obj19);
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean22 = position18.equals((java.lang.Object) cell21);
        boolean boolean23 = cell21.isEmpty();
        boolean boolean24 = cell10.canMergeWith(cell21);
        boolean boolean25 = cell10.isEmpty();
        boolean boolean26 = cell1.canMergeWith(cell10);
        ar.edu.unrc.game2048.Cell cell27 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int28 = cell27.getValue();
        java.lang.String str29 = cell27.toString();
        boolean boolean30 = cell27.isEmpty();
        boolean boolean32 = cell27.equals((java.lang.Object) 100.0d);
        int int33 = cell27.getValue();
        java.lang.String str34 = cell27.toString();
        java.lang.String str35 = cell27.toString();
        ar.edu.unrc.game2048.Board.Position position38 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int39 = position38.row;
        boolean boolean40 = cell27.equals((java.lang.Object) position38);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell41 = cell10.mergeWith(cell27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "." + "'", str29, ".");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "." + "'", str34, ".");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "." + "'", str35, ".");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isFull();
        boolean boolean4 = board0.moveRight();
        boolean boolean5 = board0.isWinningBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell8 = board0.getCell((int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean4 = board1.isWinningBoard();
        boolean boolean5 = board1.moveRight();
        boolean boolean6 = board1.isFull();
        boolean boolean7 = cell0.equals((java.lang.Object) boolean6);
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        ar.edu.unrc.game2048.Board.Position position13 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int14 = position13.row;
        boolean boolean15 = board10.equals((java.lang.Object) int14);
        boolean boolean16 = cell8.equals((java.lang.Object) int14);
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int18 = cell17.getValue();
        int int19 = cell17.getValue();
        boolean boolean20 = cell17.isEmpty();
        boolean boolean21 = cell8.canMergeWith(cell17);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell22 = cell0.mergeWith(cell8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(4);
        java.lang.Class<?> wildcardClass2 = board1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.Object obj3 = null;
        boolean boolean4 = position2.equals(obj3);
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = position2.equals((java.lang.Object) cell5);
        java.lang.String str7 = cell5.toString();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(4);
        int int10 = board9.getSize();
        boolean boolean11 = cell5.equals((java.lang.Object) board9);
        java.lang.String str12 = cell5.toString();
        java.lang.Object obj13 = null;
        boolean boolean14 = cell5.equals(obj13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(2048);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board3.moveRight();
        int int5 = board3.getScore();
        boolean boolean6 = board3.moveDown();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean8 = board3.moveUp();
        boolean boolean9 = board3.isFull();
        boolean boolean10 = board3.isLosingBoard();
        boolean boolean11 = board3.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        boolean boolean2 = board0.moveDown();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Direction direction4 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult5 = ar.edu.unrc.game2048.Movement.move(board3, direction4);
        int int6 = moveResult5.scoreDelta;
        ar.edu.unrc.game2048.Board board7 = moveResult5.board;
        boolean boolean8 = board7.isFull();
        java.lang.String str9 = board7.toString();
        int int10 = board7.getSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction4.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(board7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    4|    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    4|    2|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        java.lang.String str3 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int5 = cell4.getValue();
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int7 = cell6.getValue();
        java.lang.String str8 = cell6.toString();
        java.lang.String str9 = cell6.toString();
        boolean boolean10 = cell4.canMergeWith(cell6);
        boolean boolean11 = cell0.canMergeWith(cell4);
        boolean boolean12 = cell0.isEmpty();
        ar.edu.unrc.game2048.Cell cell14 = new ar.edu.unrc.game2048.Cell(2048);
        java.lang.Object obj15 = null;
        boolean boolean16 = cell14.equals(obj15);
        int int17 = cell14.getValue();
        int int18 = cell14.getValue();
        int int19 = cell14.getValue();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell20 = cell0.mergeWith(cell14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and 2048");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2048 + "'", int17 == 2048);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2048 + "'", int18 == 2048);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2048 + "'", int19 == 2048);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.isWinningBoard();
        boolean boolean4 = board0.moveRight();
        boolean boolean5 = board0.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((-1), (int) 'a');
        int int3 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        ar.edu.unrc.game2048.AddTileStrategy addTileStrategy1 = null;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(2048, addTileStrategy1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Position position4 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int5 = position4.row;
        boolean boolean6 = board1.equals((java.lang.Object) int5);
        java.lang.String str7 = board1.toString();
        boolean boolean8 = board1.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board1.getEmptyPositions();
        boolean boolean10 = board1.isLosingBoard();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        boolean boolean2 = board0.moveDown();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board0);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell8 = board5.getCell(0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(positionSet4);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveUp();
        boolean boolean4 = board0.moveRight();
        boolean boolean5 = board0.moveDown();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int3 = cell2.getValue();
        java.lang.String str4 = cell2.toString();
        java.lang.String str5 = cell2.toString();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell6 = cell1.mergeWith(cell2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "." + "'", str4, ".");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.isWinningBoard();
        java.lang.String str4 = board0.toString();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell7 = board0.getCell((int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(4);
        java.lang.String str2 = board1.toString();
        boolean boolean3 = board1.isFull();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) '#');
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, 1);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int6 = position5.col;
        int int7 = position5.row;
        boolean boolean8 = board1.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.Board.Direction direction9 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult10 = ar.edu.unrc.game2048.Movement.move(board1, direction9);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board12.isFull();
        boolean boolean15 = board12.moveRight();
        boolean boolean16 = board12.isLosingBoard();
        boolean boolean17 = board12.moveUp();
        boolean boolean18 = board1.equals((java.lang.Object) boolean17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + direction9 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction9.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertNotNull(moveResult10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        int int3 = board0.getScore();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean5 = board4.hasEmptyCells();
        boolean boolean6 = board4.moveLeft();
        boolean boolean7 = board4.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveDown();
        ar.edu.unrc.game2048.Cell cell7 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int9 = cell8.getValue();
        int int10 = cell8.getValue();
        boolean boolean11 = cell8.isEmpty();
        boolean boolean12 = cell7.canMergeWith(cell8);
        board0.setCell((int) (short) 0, (int) (byte) 1, cell8);
        java.lang.Class<?> wildcardClass14 = cell8.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell3 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int4 = cell3.getValue();
        java.lang.String str5 = cell3.toString();
        java.lang.String str6 = cell3.toString();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell7 = cell0.mergeWith(cell3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertNotNull(cell3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int6 = position5.row;
        boolean boolean7 = board2.equals((java.lang.Object) int6);
        boolean boolean8 = cell0.equals((java.lang.Object) int6);
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int10 = cell9.getValue();
        int int11 = cell9.getValue();
        boolean boolean12 = cell9.isEmpty();
        boolean boolean13 = cell0.canMergeWith(cell9);
        java.lang.String str14 = cell9.toString();
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int16 = cell15.getValue();
        java.lang.String str17 = cell15.toString();
        java.lang.String str18 = cell15.toString();
        ar.edu.unrc.game2048.Cell cell19 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int20 = cell19.getValue();
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int22 = cell21.getValue();
        java.lang.String str23 = cell21.toString();
        java.lang.String str24 = cell21.toString();
        boolean boolean25 = cell19.canMergeWith(cell21);
        boolean boolean26 = cell15.canMergeWith(cell19);
        boolean boolean27 = cell9.canMergeWith(cell15);
        ar.edu.unrc.game2048.Cell cell28 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int29 = cell28.getValue();
        java.lang.String str30 = cell28.toString();
        java.lang.String str31 = cell28.toString();
        boolean boolean32 = cell9.canMergeWith(cell28);
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(board33);
        boolean boolean35 = board33.isWinningBoard();
        boolean boolean36 = board33.moveDown();
        ar.edu.unrc.game2048.Cell cell40 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell41 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int42 = cell41.getValue();
        int int43 = cell41.getValue();
        boolean boolean44 = cell41.isEmpty();
        boolean boolean45 = cell40.canMergeWith(cell41);
        board33.setCell((int) (short) 0, (int) (byte) 1, cell41);
        ar.edu.unrc.game2048.Board.Position position49 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.Object obj50 = null;
        boolean boolean51 = position49.equals(obj50);
        ar.edu.unrc.game2048.Cell cell52 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean53 = position49.equals((java.lang.Object) cell52);
        boolean boolean54 = cell52.isEmpty();
        boolean boolean55 = cell41.canMergeWith(cell52);
        java.lang.String str56 = cell41.toString();
        ar.edu.unrc.game2048.Cell cell57 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board58 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board59 = new ar.edu.unrc.game2048.Board(board58);
        ar.edu.unrc.game2048.Board.Position position62 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int63 = position62.row;
        boolean boolean64 = board59.equals((java.lang.Object) int63);
        boolean boolean65 = cell57.equals((java.lang.Object) int63);
        ar.edu.unrc.game2048.Cell cell66 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int67 = cell66.getValue();
        int int68 = cell66.getValue();
        boolean boolean69 = cell66.isEmpty();
        boolean boolean70 = cell57.canMergeWith(cell66);
        java.lang.String str71 = cell66.toString();
        boolean boolean72 = cell41.canMergeWith(cell66);
        boolean boolean73 = cell41.isEmpty();
        java.lang.String str74 = cell41.toString();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell75 = cell28.mergeWith(cell41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "." + "'", str17, ".");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "." + "'", str18, ".");
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "." + "'", str23, ".");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "." + "'", str24, ".");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "." + "'", str30, ".");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "." + "'", str31, ".");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(cell41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(cell52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "." + "'", str56, ".");
        org.junit.Assert.assertNotNull(cell57);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 100 + "'", int63 == 100);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(cell66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "." + "'", str71, ".");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "." + "'", str74, ".");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        int int3 = board0.getScore();
        ar.edu.unrc.game2048.Board.Position position8 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, 1);
        ar.edu.unrc.game2048.Cell cell10 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int12 = cell11.getValue();
        int int13 = cell11.getValue();
        boolean boolean14 = cell11.isEmpty();
        boolean boolean15 = cell10.canMergeWith(cell11);
        boolean boolean16 = position8.equals((java.lang.Object) cell10);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(10, (int) (byte) -1, cell10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.Object obj3 = null;
        boolean boolean4 = position2.equals(obj3);
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = position2.equals((java.lang.Object) cell5);
        java.lang.String str7 = position2.toString();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board8.isWinningBoard();
        int int11 = board8.getScore();
        boolean boolean12 = position2.equals((java.lang.Object) board8);
        java.lang.String str13 = position2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(100, 100)" + "'", str7, "(100, 100)");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(100, 100)" + "'", str13, "(100, 100)");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.isWinningBoard();
        boolean boolean4 = board0.moveRight();
        int int5 = board0.getSize();
        boolean boolean6 = board0.hasEmptyCells();
        boolean boolean7 = board0.hasEmptyCells();
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int9 = cell8.getValue();
        java.lang.String str10 = cell8.toString();
        boolean boolean11 = cell8.isEmpty();
        boolean boolean13 = cell8.equals((java.lang.Object) 100.0d);
        int int14 = cell8.getValue();
        boolean boolean15 = board0.equals((java.lang.Object) int14);
        boolean boolean16 = board0.moveDown();
        java.lang.Class<?> wildcardClass17 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int6 = position5.col;
        int int7 = position5.row;
        boolean boolean8 = board1.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.Board.Direction direction9 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult10 = ar.edu.unrc.game2048.Movement.move(board1, direction9);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean12 = board1.moveRight();
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int16 = cell15.getValue();
        java.lang.String str17 = cell15.toString();
        boolean boolean18 = cell15.isEmpty();
        boolean boolean20 = cell15.equals((java.lang.Object) 100.0d);
        int int21 = cell15.getValue();
        java.lang.String str22 = cell15.toString();
        java.lang.String str23 = cell15.toString();
        ar.edu.unrc.game2048.Cell cell24 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int25 = cell24.getValue();
        java.lang.String str26 = cell24.toString();
        java.lang.String str27 = cell24.toString();
        ar.edu.unrc.game2048.Cell cell28 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int29 = cell28.getValue();
        ar.edu.unrc.game2048.Cell cell30 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int31 = cell30.getValue();
        java.lang.String str32 = cell30.toString();
        java.lang.String str33 = cell30.toString();
        boolean boolean34 = cell28.canMergeWith(cell30);
        boolean boolean35 = cell24.canMergeWith(cell28);
        ar.edu.unrc.game2048.Cell cell36 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int37 = cell36.getValue();
        java.lang.String str38 = cell36.toString();
        boolean boolean39 = cell28.canMergeWith(cell36);
        boolean boolean40 = cell28.isEmpty();
        boolean boolean41 = cell15.canMergeWith(cell28);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell((int) (byte) 0, (int) (short) 100, cell28);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + direction9 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction9.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertNotNull(moveResult10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "." + "'", str17, ".");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "." + "'", str22, ".");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "." + "'", str23, ".");
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "." + "'", str26, ".");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "." + "'", str27, ".");
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "." + "'", str32, ".");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "." + "'", str33, ".");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "." + "'", str38, ".");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        int int4 = board3.getSize();
        java.lang.Class<?> wildcardClass5 = board3.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board3.moveRight();
        boolean boolean5 = board3.moveDown();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell8 = board3.getCell((int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(2048);
        java.lang.Object obj2 = null;
        boolean boolean3 = cell1.equals(obj2);
        ar.edu.unrc.game2048.Cell cell5 = new ar.edu.unrc.game2048.Cell(2048);
        boolean boolean6 = cell1.canMergeWith(cell5);
        boolean boolean7 = cell5.isEmpty();
        java.lang.String str8 = cell5.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2048" + "'", str8, "2048");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        int int4 = board0.getScore();
        boolean boolean5 = board0.hasEmptyCells();
        boolean boolean6 = board0.isFull();
        boolean boolean7 = board0.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) -1, (int) (byte) -1);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.isWinningBoard();
        boolean boolean4 = board0.moveRight();
        boolean boolean5 = board0.isFull();
        boolean boolean6 = board0.isFull();
        ar.edu.unrc.game2048.Board.Direction direction7 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult8 = ar.edu.unrc.game2048.Movement.move(board0, direction7);
        boolean boolean9 = board0.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + direction7 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction7.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int3 = position2.col;
        int int4 = position2.col;
        java.lang.String str5 = position2.toString();
        int int6 = position2.row;
        int int7 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(100, 100)" + "'", str5, "(100, 100)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Position position4 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int5 = position4.row;
        boolean boolean6 = board1.equals((java.lang.Object) int5);
        java.lang.String str7 = board1.toString();
        int int8 = board1.getSize();
        boolean boolean9 = board1.moveRight();
        int int10 = board1.getSize();
        boolean boolean11 = board1.isWinningBoard();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 10, (int) (short) 1);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.hasEmptyCells();
        boolean boolean5 = board0.moveUp();
        int int6 = board0.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, (int) 'a');
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.isWinningBoard();
        boolean boolean4 = board0.moveRight();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board0);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell8 = board5.getCell((int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isFull();
        boolean boolean3 = board0.moveRight();
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Board.Position position9 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.Object obj10 = null;
        boolean boolean11 = position9.equals(obj10);
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean13 = position9.equals((java.lang.Object) cell12);
        java.lang.String str14 = cell12.toString();
        int int15 = cell12.getValue();
        board0.setCell(0, (int) (short) 1, cell12);
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board18);
        ar.edu.unrc.game2048.Board.Position position22 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int23 = position22.row;
        boolean boolean24 = board19.equals((java.lang.Object) int23);
        boolean boolean25 = cell17.equals((java.lang.Object) int23);
        ar.edu.unrc.game2048.Cell cell26 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int27 = cell26.getValue();
        int int28 = cell26.getValue();
        boolean boolean29 = cell26.isEmpty();
        boolean boolean30 = cell17.canMergeWith(cell26);
        int int31 = cell17.getValue();
        java.lang.String str32 = cell17.toString();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell33 = cell12.mergeWith(cell17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "." + "'", str32, ".");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        boolean boolean2 = board0.moveDown();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        boolean boolean5 = board0.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.isWinningBoard();
        boolean boolean4 = board0.moveRight();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board0);
        int int6 = board0.getSize();
        boolean boolean7 = board0.isFull();
        boolean boolean8 = board0.isFull();
        boolean boolean9 = board0.moveRight();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean11 = board0.moveLeft();
        boolean boolean12 = board0.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        boolean boolean3 = cell0.isEmpty();
        boolean boolean5 = cell0.equals((java.lang.Object) 100.0d);
        int int6 = cell0.getValue();
        java.lang.String str7 = cell0.toString();
        java.lang.String str8 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int10 = cell9.getValue();
        java.lang.String str11 = cell9.toString();
        java.lang.String str12 = cell9.toString();
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int14 = cell13.getValue();
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int16 = cell15.getValue();
        java.lang.String str17 = cell15.toString();
        java.lang.String str18 = cell15.toString();
        boolean boolean19 = cell13.canMergeWith(cell15);
        boolean boolean20 = cell9.canMergeWith(cell13);
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int22 = cell21.getValue();
        java.lang.String str23 = cell21.toString();
        boolean boolean24 = cell13.canMergeWith(cell21);
        boolean boolean25 = cell13.isEmpty();
        boolean boolean26 = cell0.canMergeWith(cell13);
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board(board27);
        boolean boolean29 = board27.isWinningBoard();
        boolean boolean30 = board27.moveDown();
        ar.edu.unrc.game2048.Cell cell34 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell35 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int36 = cell35.getValue();
        int int37 = cell35.getValue();
        boolean boolean38 = cell35.isEmpty();
        boolean boolean39 = cell34.canMergeWith(cell35);
        board27.setCell((int) (short) 0, (int) (byte) 1, cell35);
        ar.edu.unrc.game2048.Cell cell41 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int42 = cell41.getValue();
        java.lang.String str43 = cell41.toString();
        java.lang.String str44 = cell41.toString();
        ar.edu.unrc.game2048.Cell cell45 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int46 = cell45.getValue();
        ar.edu.unrc.game2048.Cell cell47 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int48 = cell47.getValue();
        java.lang.String str49 = cell47.toString();
        java.lang.String str50 = cell47.toString();
        boolean boolean51 = cell45.canMergeWith(cell47);
        boolean boolean52 = cell41.canMergeWith(cell45);
        boolean boolean53 = cell35.canMergeWith(cell45);
        boolean boolean54 = cell35.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell55 = cell0.mergeWith(cell35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "." + "'", str17, ".");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "." + "'", str18, ".");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "." + "'", str23, ".");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(cell35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(cell41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "." + "'", str43, ".");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "." + "'", str44, ".");
        org.junit.Assert.assertNotNull(cell45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(cell47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "." + "'", str49, ".");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "." + "'", str50, ".");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(positionSet4);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int3 = position2.col;
        int int4 = position2.row;
        int int5 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (byte) -1);
        java.lang.String str3 = position2.toString();
        java.lang.String str4 = position2.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean7 = board5.isWinningBoard();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean9 = board8.moveRight();
        int int10 = board8.getScore();
        boolean boolean11 = board8.moveDown();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean13 = board12.moveUp();
        boolean boolean14 = position2.equals((java.lang.Object) boolean13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(35, -1)" + "'", str3, "(35, -1)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(35, -1)" + "'", str4, "(35, -1)");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveLeft();
        boolean boolean4 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board0);
        int int6 = board5.getSize();
        java.lang.String str7 = board5.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.String str3 = position2.toString();
        int int4 = position2.col;
        java.lang.String str5 = position2.toString();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board6.isWinningBoard();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board6);
        int int10 = board6.getScore();
        boolean boolean11 = position2.equals((java.lang.Object) board6);
        java.lang.Object obj12 = null;
        boolean boolean13 = position2.equals(obj12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean16 = board14.isWinningBoard();
        boolean boolean17 = board14.moveDown();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board18);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board18);
        boolean boolean21 = board18.isWinningBoard();
        boolean boolean22 = board18.moveRight();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(board18);
        int int24 = board18.getSize();
        boolean boolean25 = board18.moveUp();
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board(board26);
        boolean boolean28 = board26.isWinningBoard();
        boolean boolean29 = board26.moveDown();
        ar.edu.unrc.game2048.Cell cell33 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell34 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int35 = cell34.getValue();
        int int36 = cell34.getValue();
        boolean boolean37 = cell34.isEmpty();
        boolean boolean38 = cell33.canMergeWith(cell34);
        board26.setCell((int) (short) 0, (int) (byte) 1, cell34);
        ar.edu.unrc.game2048.Board.Direction direction40 = ar.edu.unrc.game2048.Board.Direction.UP;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult41 = ar.edu.unrc.game2048.Movement.move(board26, direction40);
        ar.edu.unrc.game2048.Movement.MoveResult moveResult42 = ar.edu.unrc.game2048.Movement.move(board18, direction40);
        boolean boolean43 = board14.equals((java.lang.Object) moveResult42);
        boolean boolean44 = position2.equals((java.lang.Object) board14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 100)" + "'", str3, "(100, 100)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(100, 100)" + "'", str5, "(100, 100)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + direction40 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction40.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertNotNull(moveResult41);
        org.junit.Assert.assertNotNull(moveResult42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.isWinningBoard();
        boolean boolean4 = board0.moveRight();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board0);
        int int6 = board0.getSize();
        boolean boolean7 = board0.moveUp();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board8.isWinningBoard();
        boolean boolean11 = board8.moveDown();
        ar.edu.unrc.game2048.Cell cell15 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell16 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int17 = cell16.getValue();
        int int18 = cell16.getValue();
        boolean boolean19 = cell16.isEmpty();
        boolean boolean20 = cell15.canMergeWith(cell16);
        board8.setCell((int) (short) 0, (int) (byte) 1, cell16);
        ar.edu.unrc.game2048.Board.Direction direction22 = ar.edu.unrc.game2048.Board.Direction.UP;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult23 = ar.edu.unrc.game2048.Movement.move(board8, direction22);
        ar.edu.unrc.game2048.Movement.MoveResult moveResult24 = ar.edu.unrc.game2048.Movement.move(board0, direction22);
        java.lang.Class<?> wildcardClass25 = direction22.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + direction22 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction22.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertNotNull(moveResult23);
        org.junit.Assert.assertNotNull(moveResult24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveDown();
        ar.edu.unrc.game2048.Cell cell7 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int9 = cell8.getValue();
        int int10 = cell8.getValue();
        boolean boolean11 = cell8.isEmpty();
        boolean boolean12 = cell7.canMergeWith(cell8);
        board0.setCell((int) (short) 0, (int) (byte) 1, cell8);
        ar.edu.unrc.game2048.Cell cell14 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int15 = cell14.getValue();
        java.lang.String str16 = cell14.toString();
        java.lang.String str17 = cell14.toString();
        ar.edu.unrc.game2048.Cell cell18 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int19 = cell18.getValue();
        ar.edu.unrc.game2048.Cell cell20 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int21 = cell20.getValue();
        java.lang.String str22 = cell20.toString();
        java.lang.String str23 = cell20.toString();
        boolean boolean24 = cell18.canMergeWith(cell20);
        boolean boolean25 = cell14.canMergeWith(cell18);
        boolean boolean26 = cell8.canMergeWith(cell18);
        boolean boolean27 = cell8.isEmpty();
        ar.edu.unrc.game2048.Board.Position position30 = new ar.edu.unrc.game2048.Board.Position((-1), 1);
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board();
        boolean boolean32 = board31.isFull();
        boolean boolean33 = board31.moveDown();
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(board31);
        ar.edu.unrc.game2048.Board.Direction direction35 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult36 = ar.edu.unrc.game2048.Movement.move(board34, direction35);
        int int37 = moveResult36.scoreDelta;
        ar.edu.unrc.game2048.Board board38 = moveResult36.board;
        boolean boolean39 = position30.equals((java.lang.Object) moveResult36);
        boolean boolean40 = cell8.equals((java.lang.Object) moveResult36);
        int int41 = moveResult36.scoreDelta;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "." + "'", str16, ".");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "." + "'", str17, ".");
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "." + "'", str22, ".");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "." + "'", str23, ".");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + direction35 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction35.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertNotNull(board38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Position position4 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int5 = position4.row;
        boolean boolean6 = board1.equals((java.lang.Object) int5);
        java.lang.String str7 = board1.toString();
        boolean boolean8 = board1.hasEmptyCells();
        ar.edu.unrc.game2048.Cell cell12 = new ar.edu.unrc.game2048.Cell((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            board1.setCell((int) (byte) 10, 4, cell12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 4) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        int int4 = board0.getScore();
        int int5 = board0.getScore();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board6.isWinningBoard();
        boolean boolean9 = board6.moveUp();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean11 = board0.equals((java.lang.Object) board6);
        boolean boolean12 = board6.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board6.getEmptyPositions();
        java.lang.Class<?> wildcardClass14 = positionSet13.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        boolean boolean3 = cell0.isEmpty();
        boolean boolean5 = cell0.equals((java.lang.Object) 100.0d);
        int int6 = cell0.getValue();
        java.lang.String str7 = cell0.toString();
        java.lang.String str8 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int10 = cell9.getValue();
        java.lang.String str11 = cell9.toString();
        java.lang.String str12 = cell9.toString();
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int14 = cell13.getValue();
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int16 = cell15.getValue();
        java.lang.String str17 = cell15.toString();
        java.lang.String str18 = cell15.toString();
        boolean boolean19 = cell13.canMergeWith(cell15);
        boolean boolean20 = cell9.canMergeWith(cell13);
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int22 = cell21.getValue();
        java.lang.String str23 = cell21.toString();
        boolean boolean24 = cell13.canMergeWith(cell21);
        boolean boolean25 = cell13.isEmpty();
        boolean boolean26 = cell0.canMergeWith(cell13);
        java.lang.String str27 = cell0.toString();
        java.lang.Class<?> wildcardClass28 = cell0.getClass();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "." + "'", str17, ".");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "." + "'", str18, ".");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "." + "'", str23, ".");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "." + "'", str27, ".");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Position position4 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int5 = position4.row;
        boolean boolean6 = board1.equals((java.lang.Object) int5);
        java.lang.String str7 = board1.toString();
        boolean boolean8 = board1.hasEmptyCells();
        boolean boolean9 = board1.moveDown();
        int int10 = board1.getScore();
        boolean boolean11 = board1.moveUp();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        int int4 = board0.getScore();
        boolean boolean5 = board0.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board.Direction direction7 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult8 = ar.edu.unrc.game2048.Movement.move(board0, direction7);
        int int9 = board0.getSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + direction7 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction7.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertNotNull(moveResult8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isFull();
        boolean boolean4 = board0.moveUp();
        int int5 = board0.getScore();
        boolean boolean6 = board0.isLosingBoard();
        java.lang.Class<?> wildcardClass7 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isFull();
        boolean boolean4 = board0.moveUp();
        int int5 = board0.getScore();
        boolean boolean6 = board0.isFull();
        boolean boolean7 = board0.moveRight();
        boolean boolean8 = board0.moveRight();
        boolean boolean9 = board0.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board0.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(positionSet10);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(2048);
        java.lang.Object obj2 = null;
        boolean boolean3 = cell1.equals(obj2);
        ar.edu.unrc.game2048.Cell cell5 = new ar.edu.unrc.game2048.Cell(2048);
        boolean boolean6 = cell1.canMergeWith(cell5);
        boolean boolean7 = cell5.isEmpty();
        boolean boolean8 = cell5.isEmpty();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean11 = board9.isWinningBoard();
        boolean boolean12 = board9.moveDown();
        ar.edu.unrc.game2048.Cell cell16 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int18 = cell17.getValue();
        int int19 = cell17.getValue();
        boolean boolean20 = cell17.isEmpty();
        boolean boolean21 = cell16.canMergeWith(cell17);
        board9.setCell((int) (short) 0, (int) (byte) 1, cell17);
        ar.edu.unrc.game2048.Cell cell23 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int24 = cell23.getValue();
        java.lang.String str25 = cell23.toString();
        java.lang.String str26 = cell23.toString();
        ar.edu.unrc.game2048.Cell cell27 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int28 = cell27.getValue();
        ar.edu.unrc.game2048.Cell cell29 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int30 = cell29.getValue();
        java.lang.String str31 = cell29.toString();
        java.lang.String str32 = cell29.toString();
        boolean boolean33 = cell27.canMergeWith(cell29);
        boolean boolean34 = cell23.canMergeWith(cell27);
        boolean boolean35 = cell17.canMergeWith(cell27);
        int int36 = cell27.getValue();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell37 = cell5.mergeWith(cell27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 2048 and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "." + "'", str25, ".");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "." + "'", str26, ".");
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "." + "'", str31, ".");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "." + "'", str32, ".");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        boolean boolean3 = cell0.isEmpty();
        boolean boolean5 = cell0.equals((java.lang.Object) 100.0d);
        int int6 = cell0.getValue();
        int int7 = cell0.getValue();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isWinningBoard();
        java.lang.String str2 = board0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str2, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int3 = cell2.getValue();
        java.lang.String str4 = cell2.toString();
        java.lang.String str5 = cell2.toString();
        boolean boolean6 = cell0.canMergeWith(cell2);
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int8 = cell7.getValue();
        java.lang.String str9 = cell7.toString();
        boolean boolean10 = cell7.isEmpty();
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int12 = cell11.getValue();
        java.lang.String str13 = cell11.toString();
        boolean boolean14 = cell7.canMergeWith(cell11);
        boolean boolean15 = cell0.canMergeWith(cell11);
        ar.edu.unrc.game2048.Cell cell16 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int17 = cell16.getValue();
        java.lang.String str18 = cell16.toString();
        java.lang.String str19 = cell16.toString();
        ar.edu.unrc.game2048.Cell cell20 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int21 = cell20.getValue();
        ar.edu.unrc.game2048.Cell cell22 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int23 = cell22.getValue();
        java.lang.String str24 = cell22.toString();
        java.lang.String str25 = cell22.toString();
        boolean boolean26 = cell20.canMergeWith(cell22);
        boolean boolean27 = cell16.canMergeWith(cell20);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell28 = cell0.mergeWith(cell16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "." + "'", str4, ".");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "." + "'", str13, ".");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "." + "'", str18, ".");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "." + "'", str19, ".");
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "." + "'", str24, ".");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "." + "'", str25, ".");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, 97);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isFull();
        boolean boolean3 = board0.moveRight();
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Board.Position position9 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.Object obj10 = null;
        boolean boolean11 = position9.equals(obj10);
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean13 = position9.equals((java.lang.Object) cell12);
        java.lang.String str14 = cell12.toString();
        int int15 = cell12.getValue();
        board0.setCell(0, (int) (short) 1, cell12);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board17);
        ar.edu.unrc.game2048.Board.Position position21 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int22 = position21.row;
        boolean boolean23 = board18.equals((java.lang.Object) int22);
        java.lang.String str24 = board18.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet25 = board18.getEmptyPositions();
        boolean boolean26 = board18.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet27 = board18.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell30 = board18.getCell(1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell31 = cell12.mergeWith(cell30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str24, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(positionSet27);
        org.junit.Assert.assertNotNull(cell30);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveLeft();
        boolean boolean4 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board0);
        int int6 = board5.getSize();
        boolean boolean7 = board5.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        int int4 = board0.getScore();
        boolean boolean5 = board0.hasEmptyCells();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean7 = board0.moveUp();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveLeft();
        boolean boolean4 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board0);
        int int6 = board5.getSize();
        boolean boolean7 = board5.moveRight();
        boolean boolean8 = board5.moveUp();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) ' ', 10);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board3.moveRight();
        int int5 = board3.getScore();
        boolean boolean6 = board3.moveDown();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean8 = board3.moveUp();
        boolean boolean9 = board3.isFull();
        boolean boolean10 = board3.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isFull();
        boolean boolean4 = board0.moveRight();
        boolean boolean5 = board0.isWinningBoard();
        int int6 = board0.getScore();
        boolean boolean7 = board0.isLosingBoard();
        int int8 = board0.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        java.lang.String str3 = cell0.toString();
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int7 = position6.col;
        int int8 = position6.col;
        boolean boolean9 = cell0.equals((java.lang.Object) position6);
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell(2048);
        java.lang.Object obj12 = null;
        boolean boolean13 = cell11.equals(obj12);
        int int14 = cell11.getValue();
        int int15 = cell11.getValue();
        int int16 = cell11.getValue();
        boolean boolean17 = cell0.canMergeWith(cell11);
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board((int) (byte) 10);
        boolean boolean20 = cell11.equals((java.lang.Object) (byte) 10);
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int22 = cell21.getValue();
        java.lang.String str23 = cell21.toString();
        boolean boolean24 = cell21.isEmpty();
        ar.edu.unrc.game2048.Cell cell25 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int26 = cell25.getValue();
        java.lang.String str27 = cell25.toString();
        boolean boolean28 = cell21.canMergeWith(cell25);
        boolean boolean29 = cell25.isEmpty();
        boolean boolean30 = cell25.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell31 = cell11.mergeWith(cell25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 2048 and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2048 + "'", int14 == 2048);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2048 + "'", int15 == 2048);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2048 + "'", int16 == 2048);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "." + "'", str23, ".");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "." + "'", str27, ".");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int3 = cell2.getValue();
        int int4 = cell2.getValue();
        boolean boolean5 = cell2.isEmpty();
        boolean boolean6 = cell1.canMergeWith(cell2);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board7);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board7);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board10);
        ar.edu.unrc.game2048.Board.Position position14 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int15 = position14.row;
        boolean boolean16 = board11.equals((java.lang.Object) int15);
        java.lang.String str17 = board11.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet18 = board11.getEmptyPositions();
        boolean boolean19 = board9.equals((java.lang.Object) positionSet18);
        boolean boolean20 = cell1.equals((java.lang.Object) boolean19);
        boolean boolean22 = cell1.equals((java.lang.Object) 0.0f);
        ar.edu.unrc.game2048.Cell cell23 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int24 = cell23.getValue();
        int int25 = cell23.getValue();
        boolean boolean26 = cell23.isEmpty();
        java.lang.String str27 = cell23.toString();
        java.lang.String str28 = cell23.toString();
        int int29 = cell23.getValue();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell30 = cell1.mergeWith(cell23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str17, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "." + "'", str27, ".");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "." + "'", str28, ".");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (short) 0);
        java.lang.Class<?> wildcardClass2 = cell1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isFull();
        boolean boolean4 = board0.moveUp();
        int int5 = board0.getScore();
        boolean boolean6 = board0.isFull();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean9 = board7.isWinningBoard();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean11 = board10.moveRight();
        boolean boolean12 = board0.equals((java.lang.Object) board10);
        boolean boolean13 = board0.isLosingBoard();
        boolean boolean14 = board0.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        int int1 = board0.getScore();
        boolean boolean2 = board0.isLosingBoard();
        java.lang.Class<?> wildcardClass3 = board0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isFull();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board3);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean6 = board3.isWinningBoard();
        boolean boolean7 = board3.moveRight();
        boolean boolean8 = board3.isFull();
        boolean boolean9 = board3.isFull();
        ar.edu.unrc.game2048.Board.Direction direction10 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult11 = ar.edu.unrc.game2048.Movement.move(board3, direction10);
        ar.edu.unrc.game2048.Board board12 = moveResult11.board;
        boolean boolean13 = board0.equals((java.lang.Object) board12);
        boolean boolean14 = board0.moveUp();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + direction10 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction10.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult11);
        org.junit.Assert.assertNotNull(board12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, (int) ' ');
        int int3 = position2.row;
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean6 = board4.isWinningBoard();
        boolean boolean7 = board4.isFull();
        boolean boolean8 = board4.moveUp();
        int int9 = board4.getSize();
        boolean boolean10 = board4.moveDown();
        boolean boolean11 = position2.equals((java.lang.Object) boolean10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.Object obj3 = null;
        boolean boolean4 = position2.equals(obj3);
        int int5 = position2.col;
        int int6 = position2.row;
        java.lang.String str7 = position2.toString();
        int int8 = position2.col;
        int int9 = position2.row;
        java.lang.String str10 = position2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(100, 100)" + "'", str7, "(100, 100)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(100, 100)" + "'", str10, "(100, 100)");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveDown();
        ar.edu.unrc.game2048.Cell cell7 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int9 = cell8.getValue();
        int int10 = cell8.getValue();
        boolean boolean11 = cell8.isEmpty();
        boolean boolean12 = cell7.canMergeWith(cell8);
        board0.setCell((int) (short) 0, (int) (byte) 1, cell8);
        boolean boolean14 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board0.getEmptyPositions();
        int int17 = board0.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet18 = board0.getEmptyPositions();
        int int19 = board0.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(positionSet18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (byte) 0);
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int3 = cell2.getValue();
        int int4 = cell2.getValue();
        boolean boolean5 = cell2.isEmpty();
        java.lang.String str6 = cell2.toString();
        java.lang.String str7 = cell2.toString();
        boolean boolean8 = cell1.equals((java.lang.Object) str7);
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        boolean boolean3 = cell0.isEmpty();
        boolean boolean5 = cell0.equals((java.lang.Object) 100.0d);
        int int6 = cell0.getValue();
        boolean boolean8 = cell0.equals((java.lang.Object) 10.0d);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean11 = board9.isFull();
        boolean boolean12 = board9.moveRight();
        java.lang.String str13 = board9.toString();
        ar.edu.unrc.game2048.Board.Position position18 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.Object obj19 = null;
        boolean boolean20 = position18.equals(obj19);
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean22 = position18.equals((java.lang.Object) cell21);
        java.lang.String str23 = cell21.toString();
        int int24 = cell21.getValue();
        board9.setCell(0, (int) (short) 1, cell21);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell26 = cell0.mergeWith(cell21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "." + "'", str23, ".");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        boolean boolean2 = board0.moveDown();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Direction direction4 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult5 = ar.edu.unrc.game2048.Movement.move(board3, direction4);
        int int6 = moveResult5.scoreDelta;
        ar.edu.unrc.game2048.Board board7 = moveResult5.board;
        boolean boolean8 = board7.isFull();
        boolean boolean9 = board7.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction4.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(board7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int3 = position2.col;
        int int4 = position2.row;
        int int5 = position2.col;
        int int6 = position2.col;
        int int7 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell4 = board1.getCell((int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (52, 100) is out of bounds for board size 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(2048, (int) (short) -1);
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.String str6 = position5.toString();
        boolean boolean7 = position2.equals((java.lang.Object) str6);
        java.lang.Object obj8 = null;
        boolean boolean9 = position2.equals(obj8);
        java.lang.Class<?> wildcardClass10 = position2.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(100, 100)" + "'", str6, "(100, 100)");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        java.lang.String str3 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int5 = cell4.getValue();
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int7 = cell6.getValue();
        java.lang.String str8 = cell6.toString();
        java.lang.String str9 = cell6.toString();
        boolean boolean10 = cell4.canMergeWith(cell6);
        boolean boolean11 = cell0.canMergeWith(cell4);
        int int12 = cell4.getValue();
        boolean boolean13 = cell4.isEmpty();
        boolean boolean14 = cell4.isEmpty();
        int int15 = cell4.getValue();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveDown();
        ar.edu.unrc.game2048.Cell cell7 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int9 = cell8.getValue();
        int int10 = cell8.getValue();
        boolean boolean11 = cell8.isEmpty();
        boolean boolean12 = cell7.canMergeWith(cell8);
        board0.setCell((int) (short) 0, (int) (byte) 1, cell8);
        ar.edu.unrc.game2048.Board.Position position16 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.Object obj17 = null;
        boolean boolean18 = position16.equals(obj17);
        ar.edu.unrc.game2048.Cell cell19 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean20 = position16.equals((java.lang.Object) cell19);
        boolean boolean21 = cell19.isEmpty();
        boolean boolean22 = cell8.canMergeWith(cell19);
        java.lang.String str23 = cell8.toString();
        ar.edu.unrc.game2048.Cell cell24 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(board25);
        ar.edu.unrc.game2048.Board.Position position29 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int30 = position29.row;
        boolean boolean31 = board26.equals((java.lang.Object) int30);
        boolean boolean32 = cell24.equals((java.lang.Object) int30);
        ar.edu.unrc.game2048.Cell cell33 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int34 = cell33.getValue();
        int int35 = cell33.getValue();
        boolean boolean36 = cell33.isEmpty();
        boolean boolean37 = cell24.canMergeWith(cell33);
        java.lang.String str38 = cell33.toString();
        boolean boolean39 = cell8.canMergeWith(cell33);
        ar.edu.unrc.game2048.Cell cell40 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board41 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board42 = new ar.edu.unrc.game2048.Board(board41);
        ar.edu.unrc.game2048.Board.Position position45 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int46 = position45.row;
        boolean boolean47 = board42.equals((java.lang.Object) int46);
        boolean boolean48 = cell40.equals((java.lang.Object) int46);
        ar.edu.unrc.game2048.Cell cell49 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int50 = cell49.getValue();
        int int51 = cell49.getValue();
        boolean boolean52 = cell49.isEmpty();
        boolean boolean53 = cell40.canMergeWith(cell49);
        java.lang.String str54 = cell49.toString();
        ar.edu.unrc.game2048.Cell cell56 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Board board57 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board58 = new ar.edu.unrc.game2048.Board(board57);
        boolean boolean59 = board57.isWinningBoard();
        boolean boolean60 = board57.moveDown();
        ar.edu.unrc.game2048.Cell cell64 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell65 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int66 = cell65.getValue();
        int int67 = cell65.getValue();
        boolean boolean68 = cell65.isEmpty();
        boolean boolean69 = cell64.canMergeWith(cell65);
        board57.setCell((int) (short) 0, (int) (byte) 1, cell65);
        ar.edu.unrc.game2048.Board.Position position73 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.Object obj74 = null;
        boolean boolean75 = position73.equals(obj74);
        ar.edu.unrc.game2048.Cell cell76 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean77 = position73.equals((java.lang.Object) cell76);
        boolean boolean78 = cell76.isEmpty();
        boolean boolean79 = cell65.canMergeWith(cell76);
        boolean boolean80 = cell65.isEmpty();
        boolean boolean81 = cell56.canMergeWith(cell65);
        boolean boolean82 = cell49.canMergeWith(cell65);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell83 = cell33.mergeWith(cell49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "." + "'", str23, ".");
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(cell33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "." + "'", str38, ".");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(cell40);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(cell49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "." + "'", str54, ".");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(cell65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(cell76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.String str3 = position2.toString();
        int int4 = position2.col;
        java.lang.String str5 = position2.toString();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board6.isWinningBoard();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board6);
        int int10 = board6.getScore();
        boolean boolean11 = position2.equals((java.lang.Object) board6);
        java.lang.Object obj12 = null;
        boolean boolean13 = position2.equals(obj12);
        java.lang.String str14 = position2.toString();
        int int15 = position2.col;
        java.lang.String str16 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 100)" + "'", str3, "(100, 100)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(100, 100)" + "'", str5, "(100, 100)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(100, 100)" + "'", str14, "(100, 100)");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(100, 100)" + "'", str16, "(100, 100)");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, (int) (byte) 100);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        java.lang.String str3 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int5 = cell4.getValue();
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int7 = cell6.getValue();
        java.lang.String str8 = cell6.toString();
        java.lang.String str9 = cell6.toString();
        boolean boolean10 = cell4.canMergeWith(cell6);
        boolean boolean11 = cell0.canMergeWith(cell4);
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int13 = cell12.getValue();
        java.lang.String str14 = cell12.toString();
        boolean boolean15 = cell4.canMergeWith(cell12);
        ar.edu.unrc.game2048.Board.Direction direction16 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        boolean boolean17 = cell4.equals((java.lang.Object) direction16);
        ar.edu.unrc.game2048.Cell cell18 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean19 = cell18.isEmpty();
        boolean boolean20 = cell4.canMergeWith(cell18);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + direction16 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction16.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveUp();
        boolean boolean5 = board0.equals((java.lang.Object) '#');
        boolean boolean6 = board0.moveRight();
        boolean boolean7 = board0.isLosingBoard();
        boolean boolean8 = board0.moveDown();
        boolean boolean9 = board0.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board3.moveRight();
        int int5 = board3.getScore();
        boolean boolean6 = board3.moveDown();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean8 = board3.moveUp();
        boolean boolean9 = board3.isFull();
        boolean boolean10 = board3.isLosingBoard();
        boolean boolean11 = board3.moveDown();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = board3.getEmptyPositions();
        boolean boolean13 = board3.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(positionSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.isWinningBoard();
        boolean boolean4 = board0.moveRight();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board0);
        int int6 = board0.getSize();
        boolean boolean7 = board0.isFull();
        boolean boolean8 = board0.isFull();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        ar.edu.unrc.game2048.Board.Position position13 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int14 = position13.row;
        boolean boolean15 = board10.equals((java.lang.Object) int14);
        int int16 = board10.getScore();
        ar.edu.unrc.game2048.Board.Position position19 = new ar.edu.unrc.game2048.Board.Position((int) 'a', 4);
        boolean boolean20 = board10.equals((java.lang.Object) position19);
        boolean boolean21 = board0.equals((java.lang.Object) boolean20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int6 = position5.col;
        int int7 = position5.row;
        boolean boolean8 = board1.equals((java.lang.Object) position5);
        int int9 = position5.col;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (short) 1);
        ar.edu.unrc.game2048.Board.Direction direction2 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult3 = ar.edu.unrc.game2048.Movement.move(board1, direction2);
        ar.edu.unrc.game2048.Board board4 = moveResult3.board;
        boolean boolean5 = board4.moveUp();
        boolean boolean6 = board4.moveLeft();
        org.junit.Assert.assertTrue("'" + direction2 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction2.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertNotNull(moveResult3);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int3 = cell2.getValue();
        int int4 = cell2.getValue();
        boolean boolean5 = cell2.isEmpty();
        boolean boolean6 = cell1.canMergeWith(cell2);
        boolean boolean7 = cell2.isEmpty();
        java.lang.String str8 = cell2.toString();
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int10 = cell9.getValue();
        java.lang.String str11 = cell9.toString();
        java.lang.String str12 = cell9.toString();
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int14 = cell13.getValue();
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int16 = cell15.getValue();
        java.lang.String str17 = cell15.toString();
        java.lang.String str18 = cell15.toString();
        boolean boolean19 = cell13.canMergeWith(cell15);
        boolean boolean20 = cell9.canMergeWith(cell13);
        int int21 = cell13.getValue();
        ar.edu.unrc.game2048.Cell cell22 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int23 = cell22.getValue();
        java.lang.String str24 = cell22.toString();
        boolean boolean25 = cell22.isEmpty();
        ar.edu.unrc.game2048.Cell cell26 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int27 = cell26.getValue();
        java.lang.String str28 = cell26.toString();
        boolean boolean29 = cell22.canMergeWith(cell26);
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board(board30);
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(board30);
        boolean boolean33 = board30.isWinningBoard();
        boolean boolean34 = board30.moveRight();
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board(board30);
        int int36 = board30.getSize();
        boolean boolean37 = board30.isFull();
        boolean boolean38 = board30.isFull();
        boolean boolean39 = board30.moveRight();
        ar.edu.unrc.game2048.Board board40 = new ar.edu.unrc.game2048.Board(board30);
        boolean boolean41 = cell26.equals((java.lang.Object) board40);
        boolean boolean43 = cell26.equals((java.lang.Object) 10L);
        boolean boolean44 = cell13.canMergeWith(cell26);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell45 = cell2.mergeWith(cell26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "." + "'", str17, ".");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "." + "'", str18, ".");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "." + "'", str24, ".");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "." + "'", str28, ".");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        boolean boolean3 = cell0.isEmpty();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int5 = cell4.getValue();
        java.lang.String str6 = cell4.toString();
        boolean boolean7 = cell0.canMergeWith(cell4);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board8.isWinningBoard();
        boolean boolean11 = board8.moveUp();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean13 = board8.moveDown();
        boolean boolean14 = cell4.equals((java.lang.Object) board8);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board15);
        boolean boolean17 = board15.isWinningBoard();
        boolean boolean18 = board15.moveDown();
        ar.edu.unrc.game2048.Cell cell22 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell23 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int24 = cell23.getValue();
        int int25 = cell23.getValue();
        boolean boolean26 = cell23.isEmpty();
        boolean boolean27 = cell22.canMergeWith(cell23);
        board15.setCell((int) (short) 0, (int) (byte) 1, cell23);
        ar.edu.unrc.game2048.Cell cell29 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int30 = cell29.getValue();
        java.lang.String str31 = cell29.toString();
        java.lang.String str32 = cell29.toString();
        ar.edu.unrc.game2048.Cell cell33 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int34 = cell33.getValue();
        ar.edu.unrc.game2048.Cell cell35 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int36 = cell35.getValue();
        java.lang.String str37 = cell35.toString();
        java.lang.String str38 = cell35.toString();
        boolean boolean39 = cell33.canMergeWith(cell35);
        boolean boolean40 = cell29.canMergeWith(cell33);
        boolean boolean41 = cell23.canMergeWith(cell33);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell42 = cell4.mergeWith(cell33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "." + "'", str31, ".");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "." + "'", str32, ".");
        org.junit.Assert.assertNotNull(cell33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(cell35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "." + "'", str37, ".");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "." + "'", str38, ".");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board3.moveUp();
        boolean boolean5 = board3.moveUp();
        int int6 = board3.getSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        java.lang.String str3 = board0.toString();
        boolean boolean4 = board0.moveDown();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str3, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        boolean boolean2 = board0.moveDown();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int5 = cell4.getValue();
        java.lang.String str6 = cell4.toString();
        boolean boolean7 = cell4.isEmpty();
        boolean boolean9 = cell4.equals((java.lang.Object) 100.0d);
        boolean boolean10 = board3.equals((java.lang.Object) 100.0d);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean13 = board11.isWinningBoard();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board11);
        int int15 = board11.getScore();
        boolean boolean16 = board11.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet17 = board11.getEmptyPositions();
        ar.edu.unrc.game2048.Board.Direction direction18 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult19 = ar.edu.unrc.game2048.Movement.move(board11, direction18);
        ar.edu.unrc.game2048.Movement.MoveResult moveResult20 = ar.edu.unrc.game2048.Movement.move(board3, direction18);
        ar.edu.unrc.game2048.Board board21 = moveResult20.board;
        ar.edu.unrc.game2048.Board board22 = moveResult20.board;
        java.lang.Class<?> wildcardClass23 = board22.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertTrue("'" + direction18 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction18.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertNotNull(moveResult19);
        org.junit.Assert.assertNotNull(moveResult20);
        org.junit.Assert.assertNotNull(board21);
        org.junit.Assert.assertNotNull(board22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.hasEmptyCells();
        boolean boolean5 = board0.moveUp();
        int int6 = board0.getSize();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean9 = board7.isWinningBoard();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board7);
        int int11 = board7.getScore();
        ar.edu.unrc.game2048.Board.Direction direction12 = ar.edu.unrc.game2048.Board.Direction.UP;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult13 = ar.edu.unrc.game2048.Movement.move(board7, direction12);
        ar.edu.unrc.game2048.Movement.MoveResult moveResult14 = ar.edu.unrc.game2048.Movement.move(board0, direction12);
        ar.edu.unrc.game2048.Board board15 = moveResult14.board;
        boolean boolean16 = board15.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + direction12 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction12.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertNotNull(moveResult13);
        org.junit.Assert.assertNotNull(moveResult14);
        org.junit.Assert.assertNotNull(board15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (short) 100);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet2 = board1.getEmptyPositions();
        org.junit.Assert.assertNotNull(positionSet2);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, 100);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell must be a power of two: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        boolean boolean2 = board0.moveDown();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int5 = cell4.getValue();
        java.lang.String str6 = cell4.toString();
        boolean boolean7 = cell4.isEmpty();
        boolean boolean9 = cell4.equals((java.lang.Object) 100.0d);
        boolean boolean10 = board3.equals((java.lang.Object) 100.0d);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean13 = board11.isWinningBoard();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board11);
        int int15 = board11.getScore();
        boolean boolean16 = board11.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet17 = board11.getEmptyPositions();
        ar.edu.unrc.game2048.Board.Direction direction18 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult19 = ar.edu.unrc.game2048.Movement.move(board11, direction18);
        ar.edu.unrc.game2048.Movement.MoveResult moveResult20 = ar.edu.unrc.game2048.Movement.move(board3, direction18);
        ar.edu.unrc.game2048.Board board21 = moveResult20.board;
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(board21);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell25 = board21.getCell((int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertTrue("'" + direction18 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction18.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertNotNull(moveResult19);
        org.junit.Assert.assertNotNull(moveResult20);
        org.junit.Assert.assertNotNull(board21);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board3.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        int int2 = cell0.getValue();
        boolean boolean3 = cell0.isEmpty();
        java.lang.String str4 = cell0.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean7 = board5.isWinningBoard();
        boolean boolean8 = board5.moveUp();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean10 = cell0.equals((java.lang.Object) board5);
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int14 = cell13.getValue();
        java.lang.String str15 = cell13.toString();
        java.lang.String str16 = cell13.toString();
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int18 = cell17.getValue();
        ar.edu.unrc.game2048.Cell cell19 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int20 = cell19.getValue();
        java.lang.String str21 = cell19.toString();
        java.lang.String str22 = cell19.toString();
        boolean boolean23 = cell17.canMergeWith(cell19);
        boolean boolean24 = cell13.canMergeWith(cell17);
        java.lang.String str25 = cell13.toString();
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board(board26);
        boolean boolean28 = board27.isLosingBoard();
        ar.edu.unrc.game2048.Board.Position position31 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int32 = position31.col;
        int int33 = position31.row;
        boolean boolean34 = board27.equals((java.lang.Object) position31);
        ar.edu.unrc.game2048.Board.Direction direction35 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult36 = ar.edu.unrc.game2048.Movement.move(board27, direction35);
        boolean boolean37 = cell13.equals((java.lang.Object) direction35);
        ar.edu.unrc.game2048.Cell cell39 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Board board40 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board41 = new ar.edu.unrc.game2048.Board(board40);
        boolean boolean42 = board40.isWinningBoard();
        boolean boolean43 = board40.moveDown();
        ar.edu.unrc.game2048.Cell cell47 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell48 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int49 = cell48.getValue();
        int int50 = cell48.getValue();
        boolean boolean51 = cell48.isEmpty();
        boolean boolean52 = cell47.canMergeWith(cell48);
        board40.setCell((int) (short) 0, (int) (byte) 1, cell48);
        ar.edu.unrc.game2048.Board.Position position56 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.Object obj57 = null;
        boolean boolean58 = position56.equals(obj57);
        ar.edu.unrc.game2048.Cell cell59 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean60 = position56.equals((java.lang.Object) cell59);
        boolean boolean61 = cell59.isEmpty();
        boolean boolean62 = cell48.canMergeWith(cell59);
        boolean boolean63 = cell48.isEmpty();
        boolean boolean64 = cell39.canMergeWith(cell48);
        boolean boolean65 = cell13.equals((java.lang.Object) cell39);
        // The following exception was thrown during execution in test generation
        try {
            board5.setCell(4, (int) (byte) 1, cell13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (4, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "." + "'", str4, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "." + "'", str16, ".");
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "." + "'", str21, ".");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "." + "'", str22, ".");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "." + "'", str25, ".");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + direction35 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction35.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertNotNull(moveResult36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(cell48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(cell59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell1 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int2 = cell1.getValue();
        java.lang.String str3 = cell1.toString();
        java.lang.String str4 = cell1.toString();
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int6 = cell5.getValue();
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int8 = cell7.getValue();
        java.lang.String str9 = cell7.toString();
        java.lang.String str10 = cell7.toString();
        boolean boolean11 = cell5.canMergeWith(cell7);
        boolean boolean12 = cell1.canMergeWith(cell5);
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int14 = cell13.getValue();
        java.lang.String str15 = cell13.toString();
        boolean boolean16 = cell5.canMergeWith(cell13);
        boolean boolean17 = cell5.isEmpty();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board18);
        boolean boolean20 = board18.isWinningBoard();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board18);
        int int22 = board18.getScore();
        boolean boolean23 = board18.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet24 = board18.getEmptyPositions();
        ar.edu.unrc.game2048.Board.Direction direction25 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult26 = ar.edu.unrc.game2048.Movement.move(board18, direction25);
        boolean boolean27 = cell5.equals((java.lang.Object) moveResult26);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell28 = cell0.mergeWith(cell5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(cell1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "." + "'", str4, ".");
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(positionSet24);
        org.junit.Assert.assertTrue("'" + direction25 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction25.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertNotNull(moveResult26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        boolean boolean2 = board0.moveDown();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Direction direction4 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult5 = ar.edu.unrc.game2048.Movement.move(board3, direction4);
        ar.edu.unrc.game2048.Board board6 = moveResult5.board;
        ar.edu.unrc.game2048.Board board7 = moveResult5.board;
        boolean boolean8 = board7.moveUp();
        boolean boolean9 = board7.moveLeft();
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int13 = cell12.getValue();
        java.lang.String str14 = cell12.toString();
        java.lang.String str15 = cell12.toString();
        ar.edu.unrc.game2048.Cell cell16 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int17 = cell16.getValue();
        ar.edu.unrc.game2048.Cell cell18 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int19 = cell18.getValue();
        java.lang.String str20 = cell18.toString();
        java.lang.String str21 = cell18.toString();
        boolean boolean22 = cell16.canMergeWith(cell18);
        boolean boolean23 = cell12.canMergeWith(cell16);
        ar.edu.unrc.game2048.Cell cell24 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int25 = cell24.getValue();
        java.lang.String str26 = cell24.toString();
        boolean boolean27 = cell16.canMergeWith(cell24);
        boolean boolean28 = cell16.isEmpty();
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(board29);
        boolean boolean31 = board29.isWinningBoard();
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(board29);
        int int33 = board29.getScore();
        boolean boolean34 = board29.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet35 = board29.getEmptyPositions();
        ar.edu.unrc.game2048.Board.Direction direction36 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult37 = ar.edu.unrc.game2048.Movement.move(board29, direction36);
        boolean boolean38 = cell16.equals((java.lang.Object) moveResult37);
        ar.edu.unrc.game2048.Board board39 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board40 = new ar.edu.unrc.game2048.Board(board39);
        ar.edu.unrc.game2048.Board.Position position43 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int44 = position43.row;
        boolean boolean45 = board40.equals((java.lang.Object) int44);
        java.lang.String str46 = board40.toString();
        int int47 = board40.getSize();
        boolean boolean48 = board40.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet49 = board40.getEmptyPositions();
        boolean boolean50 = cell16.equals((java.lang.Object) positionSet49);
        // The following exception was thrown during execution in test generation
        try {
            board7.setCell(0, (int) ' ', cell16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 32) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction4.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult5);
        org.junit.Assert.assertNotNull(board6);
        org.junit.Assert.assertNotNull(board7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "." + "'", str20, ".");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "." + "'", str21, ".");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "." + "'", str26, ".");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(positionSet35);
        org.junit.Assert.assertTrue("'" + direction36 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction36.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertNotNull(moveResult37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str46, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 4 + "'", int47 == 4);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(positionSet49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        int int4 = board0.getScore();
        boolean boolean5 = board0.hasEmptyCells();
        boolean boolean6 = board0.isFull();
        boolean boolean7 = board0.hasEmptyCells();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean9 = board8.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int3 = position2.col;
        int int4 = position2.row;
        int int5 = position2.col;
        int int6 = position2.col;
        java.lang.Class<?> wildcardClass7 = position2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 1, (int) '#');
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, 1);
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.String str6 = position5.toString();
        int int7 = position5.col;
        java.lang.String str8 = position5.toString();
        int int9 = position5.col;
        java.lang.Object obj10 = null;
        boolean boolean11 = position5.equals(obj10);
        boolean boolean12 = position2.equals(obj10);
        int int13 = position2.col;
        java.lang.String str14 = position2.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(100, 100)" + "'", str6, "(100, 100)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(100, 100)" + "'", str8, "(100, 100)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(0, 1)" + "'", str14, "(0, 1)");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        int int2 = cell0.getValue();
        boolean boolean3 = cell0.isEmpty();
        java.lang.String str4 = cell0.toString();
        java.lang.String str5 = cell0.toString();
        ar.edu.unrc.game2048.Board.Position position8 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.Object obj9 = null;
        boolean boolean10 = position8.equals(obj9);
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean12 = position8.equals((java.lang.Object) cell11);
        java.lang.String str13 = cell11.toString();
        java.lang.Object obj14 = null;
        boolean boolean15 = cell11.equals(obj14);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell16 = cell0.mergeWith(cell11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "." + "'", str4, ".");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "." + "'", str13, ".");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int6 = position5.col;
        int int7 = position5.row;
        boolean boolean8 = board1.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.Board.Direction direction9 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult10 = ar.edu.unrc.game2048.Movement.move(board1, direction9);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board1);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = board11.getEmptyPositions();
        boolean boolean13 = board11.moveUp();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + direction9 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction9.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertNotNull(moveResult10);
        org.junit.Assert.assertNotNull(positionSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        boolean boolean3 = cell0.isEmpty();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int5 = cell4.getValue();
        java.lang.String str6 = cell4.toString();
        boolean boolean7 = cell0.canMergeWith(cell4);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean11 = board8.isWinningBoard();
        boolean boolean12 = board8.moveRight();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board8);
        int int14 = board8.getSize();
        boolean boolean15 = board8.isFull();
        boolean boolean16 = board8.isFull();
        boolean boolean17 = board8.moveRight();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean19 = cell4.equals((java.lang.Object) board18);
        boolean boolean20 = cell4.isEmpty();
        ar.edu.unrc.game2048.Cell cell22 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell23 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int24 = cell23.getValue();
        int int25 = cell23.getValue();
        boolean boolean26 = cell23.isEmpty();
        boolean boolean27 = cell22.canMergeWith(cell23);
        boolean boolean28 = cell4.canMergeWith(cell23);
        int int29 = cell4.getValue();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        boolean boolean2 = board0.moveDown();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Direction direction4 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult5 = ar.edu.unrc.game2048.Movement.move(board3, direction4);
        ar.edu.unrc.game2048.Board board6 = moveResult5.board;
        ar.edu.unrc.game2048.Board board7 = moveResult5.board;
        boolean boolean8 = board7.hasEmptyCells();
        ar.edu.unrc.game2048.Board.Direction direction9 = ar.edu.unrc.game2048.Board.Direction.UP;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult10 = ar.edu.unrc.game2048.Movement.move(board7, direction9);
        boolean boolean11 = board7.moveDown();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = board7.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int16 = cell15.getValue();
        java.lang.String str17 = cell15.toString();
        java.lang.String str18 = cell15.toString();
        ar.edu.unrc.game2048.Cell cell19 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int20 = cell19.getValue();
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int22 = cell21.getValue();
        java.lang.String str23 = cell21.toString();
        java.lang.String str24 = cell21.toString();
        boolean boolean25 = cell19.canMergeWith(cell21);
        boolean boolean26 = cell15.canMergeWith(cell19);
        ar.edu.unrc.game2048.Cell cell27 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int28 = cell27.getValue();
        java.lang.String str29 = cell27.toString();
        boolean boolean30 = cell19.canMergeWith(cell27);
        // The following exception was thrown during execution in test generation
        try {
            board7.setCell(0, (int) (short) -1, cell19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction4.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult5);
        org.junit.Assert.assertNotNull(board6);
        org.junit.Assert.assertNotNull(board7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + direction9 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction9.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertNotNull(moveResult10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(positionSet12);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "." + "'", str17, ".");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "." + "'", str18, ".");
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "." + "'", str23, ".");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "." + "'", str24, ".");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "." + "'", str29, ".");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int6 = position5.row;
        boolean boolean7 = board2.equals((java.lang.Object) int6);
        boolean boolean8 = cell0.equals((java.lang.Object) int6);
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int10 = cell9.getValue();
        int int11 = cell9.getValue();
        boolean boolean12 = cell9.isEmpty();
        boolean boolean13 = cell0.canMergeWith(cell9);
        java.lang.String str14 = cell9.toString();
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int16 = cell15.getValue();
        java.lang.String str17 = cell15.toString();
        java.lang.String str18 = cell15.toString();
        ar.edu.unrc.game2048.Cell cell19 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int20 = cell19.getValue();
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int22 = cell21.getValue();
        java.lang.String str23 = cell21.toString();
        java.lang.String str24 = cell21.toString();
        boolean boolean25 = cell19.canMergeWith(cell21);
        boolean boolean26 = cell15.canMergeWith(cell19);
        boolean boolean27 = cell9.canMergeWith(cell15);
        java.lang.String str28 = cell15.toString();
        ar.edu.unrc.game2048.Cell cell30 = new ar.edu.unrc.game2048.Cell(2048);
        java.lang.Object obj31 = null;
        boolean boolean32 = cell30.equals(obj31);
        int int33 = cell30.getValue();
        ar.edu.unrc.game2048.Board.Position position36 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.Object obj37 = null;
        boolean boolean38 = position36.equals(obj37);
        ar.edu.unrc.game2048.Cell cell39 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean40 = position36.equals((java.lang.Object) cell39);
        java.lang.String str41 = position36.toString();
        ar.edu.unrc.game2048.Board board42 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board43 = new ar.edu.unrc.game2048.Board(board42);
        boolean boolean44 = board42.isWinningBoard();
        int int45 = board42.getScore();
        boolean boolean46 = position36.equals((java.lang.Object) board42);
        java.lang.String str47 = board42.toString();
        boolean boolean48 = board42.moveUp();
        boolean boolean49 = cell30.equals((java.lang.Object) boolean48);
        int int50 = cell30.getValue();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell51 = cell15.mergeWith(cell30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and 2048");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "." + "'", str17, ".");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "." + "'", str18, ".");
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "." + "'", str23, ".");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "." + "'", str24, ".");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "." + "'", str28, ".");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2048 + "'", int33 == 2048);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cell39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "(100, 100)" + "'", str41, "(100, 100)");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str47, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2048 + "'", int50 == 2048);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Position position4 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int5 = position4.row;
        boolean boolean6 = board1.equals((java.lang.Object) int5);
        java.lang.String str7 = board1.toString();
        boolean boolean8 = board1.hasEmptyCells();
        boolean boolean9 = board1.moveDown();
        boolean boolean10 = board1.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isFull();
        boolean boolean4 = board0.moveRight();
        boolean boolean5 = board0.isWinningBoard();
        int int6 = board0.getScore();
        boolean boolean7 = board0.isFull();
        java.lang.String str8 = board0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str8, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        boolean boolean2 = board0.moveDown();
        int int3 = board0.getScore();
        int int4 = board0.getScore();
        boolean boolean5 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        boolean boolean3 = cell0.isEmpty();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int5 = cell4.getValue();
        java.lang.String str6 = cell4.toString();
        boolean boolean7 = cell0.canMergeWith(cell4);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean11 = board8.isWinningBoard();
        boolean boolean12 = board8.moveRight();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board8);
        int int14 = board8.getSize();
        boolean boolean15 = board8.isFull();
        boolean boolean16 = board8.isFull();
        boolean boolean17 = board8.moveRight();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean19 = cell4.equals((java.lang.Object) board18);
        boolean boolean20 = cell4.isEmpty();
        java.lang.String str21 = cell4.toString();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "." + "'", str21, ".");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 4);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(10);
        int int2 = board1.getScore();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int6 = position5.row;
        boolean boolean7 = board2.equals((java.lang.Object) int6);
        boolean boolean8 = cell0.equals((java.lang.Object) int6);
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int10 = cell9.getValue();
        int int11 = cell9.getValue();
        boolean boolean12 = cell9.isEmpty();
        boolean boolean13 = cell0.canMergeWith(cell9);
        java.lang.String str14 = cell9.toString();
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int16 = cell15.getValue();
        java.lang.String str17 = cell15.toString();
        java.lang.String str18 = cell15.toString();
        ar.edu.unrc.game2048.Cell cell19 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int20 = cell19.getValue();
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int22 = cell21.getValue();
        java.lang.String str23 = cell21.toString();
        java.lang.String str24 = cell21.toString();
        boolean boolean25 = cell19.canMergeWith(cell21);
        boolean boolean26 = cell15.canMergeWith(cell19);
        boolean boolean27 = cell9.canMergeWith(cell15);
        ar.edu.unrc.game2048.Cell cell28 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int29 = cell28.getValue();
        java.lang.String str30 = cell28.toString();
        java.lang.String str31 = cell28.toString();
        boolean boolean32 = cell9.canMergeWith(cell28);
        java.lang.String str33 = cell28.toString();
        ar.edu.unrc.game2048.Board.Position position36 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.Object obj37 = null;
        boolean boolean38 = position36.equals(obj37);
        ar.edu.unrc.game2048.Cell cell39 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean40 = position36.equals((java.lang.Object) cell39);
        boolean boolean41 = cell28.canMergeWith(cell39);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "." + "'", str17, ".");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "." + "'", str18, ".");
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "." + "'", str23, ".");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "." + "'", str24, ".");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "." + "'", str30, ".");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "." + "'", str31, ".");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "." + "'", str33, ".");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cell39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.Object obj3 = null;
        boolean boolean4 = position2.equals(obj3);
        int int5 = position2.col;
        int int6 = position2.col;
        int int7 = position2.col;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (short) 10);
        boolean boolean2 = board1.moveLeft();
        boolean boolean4 = board1.equals((java.lang.Object) (byte) 1);
        boolean boolean5 = board1.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.isWinningBoard();
        boolean boolean4 = board0.moveRight();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board7.isWinningBoard();
        int int9 = board7.getSize();
        boolean boolean10 = board0.equals((java.lang.Object) board7);
        boolean boolean11 = board7.moveUp();
        boolean boolean12 = board7.moveRight();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board3.moveRight();
        int int5 = board3.getScore();
        boolean boolean6 = board3.moveDown();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean8 = board7.isLosingBoard();
        boolean boolean9 = board7.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isFull();
        boolean boolean3 = board0.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        boolean boolean5 = board0.moveRight();
        boolean boolean6 = board0.moveRight();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.String str3 = position2.toString();
        int int4 = position2.col;
        java.lang.String str5 = position2.toString();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board6.isWinningBoard();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board6);
        int int10 = board6.getScore();
        boolean boolean11 = position2.equals((java.lang.Object) board6);
        boolean boolean12 = board6.isWinningBoard();
        boolean boolean13 = board6.moveDown();
        boolean boolean14 = board6.isLosingBoard();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 100)" + "'", str3, "(100, 100)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(100, 100)" + "'", str5, "(100, 100)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isFull();
        boolean boolean4 = board0.moveUp();
        int int5 = board0.getScore();
        boolean boolean6 = board0.isFull();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean9 = board7.isWinningBoard();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean11 = board10.moveRight();
        boolean boolean12 = board0.equals((java.lang.Object) board10);
        int int13 = board0.getScore();
        boolean boolean14 = board0.moveUp();
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int18 = cell17.getValue();
        java.lang.String str19 = cell17.toString();
        boolean boolean20 = cell17.isEmpty();
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int22 = cell21.getValue();
        java.lang.String str23 = cell21.toString();
        boolean boolean24 = cell17.canMergeWith(cell21);
        boolean boolean25 = cell21.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (byte) 1, (int) '4', cell21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 52) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "." + "'", str19, ".");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "." + "'", str23, ".");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.isWinningBoard();
        boolean boolean4 = board0.moveRight();
        boolean boolean5 = board0.isFull();
        boolean boolean6 = board0.isFull();
        ar.edu.unrc.game2048.Board.Direction direction7 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult8 = ar.edu.unrc.game2048.Movement.move(board0, direction7);
        int int9 = moveResult8.scoreDelta;
        int int10 = moveResult8.scoreDelta;
        int int11 = moveResult8.scoreDelta;
        ar.edu.unrc.game2048.Board board12 = moveResult8.board;
        boolean boolean13 = board12.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + direction7 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction7.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(board12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int3 = position2.col;
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        boolean boolean7 = position2.equals((java.lang.Object) 0.0d);
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int9 = cell8.getValue();
        java.lang.String str10 = cell8.toString();
        boolean boolean11 = cell8.isEmpty();
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int13 = cell12.getValue();
        java.lang.String str14 = cell12.toString();
        boolean boolean15 = cell8.canMergeWith(cell12);
        boolean boolean16 = cell12.isEmpty();
        boolean boolean17 = cell12.isEmpty();
        boolean boolean18 = position2.equals((java.lang.Object) boolean17);
        java.lang.String str19 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(100, 100)" + "'", str4, "(100, 100)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(100, 100)" + "'", str19, "(100, 100)");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        boolean boolean3 = cell0.isEmpty();
        boolean boolean5 = cell0.equals((java.lang.Object) 100.0d);
        int int6 = cell0.getValue();
        java.lang.String str7 = cell0.toString();
        int int8 = cell0.getValue();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int3 = position2.col;
        int int4 = position2.row;
        int int5 = position2.col;
        java.lang.String str6 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(100, 100)" + "'", str6, "(100, 100)");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.isWinningBoard();
        boolean boolean4 = board0.moveRight();
        boolean boolean5 = board0.isFull();
        int int6 = board0.getScore();
        boolean boolean7 = board0.isWinningBoard();
        boolean boolean8 = board0.isFull();
        java.lang.String str9 = board0.toString();
        boolean boolean10 = board0.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int3 = cell2.getValue();
        java.lang.String str4 = cell2.toString();
        java.lang.String str5 = cell2.toString();
        boolean boolean6 = cell0.canMergeWith(cell2);
        boolean boolean7 = cell2.isEmpty();
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(2048);
        java.lang.Object obj10 = null;
        boolean boolean11 = cell9.equals(obj10);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board12.isWinningBoard();
        boolean boolean15 = board12.moveDown();
        ar.edu.unrc.game2048.Cell cell19 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell20 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int21 = cell20.getValue();
        int int22 = cell20.getValue();
        boolean boolean23 = cell20.isEmpty();
        boolean boolean24 = cell19.canMergeWith(cell20);
        board12.setCell((int) (short) 0, (int) (byte) 1, cell20);
        ar.edu.unrc.game2048.Cell cell26 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int27 = cell26.getValue();
        java.lang.String str28 = cell26.toString();
        java.lang.String str29 = cell26.toString();
        ar.edu.unrc.game2048.Cell cell30 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int31 = cell30.getValue();
        ar.edu.unrc.game2048.Cell cell32 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int33 = cell32.getValue();
        java.lang.String str34 = cell32.toString();
        java.lang.String str35 = cell32.toString();
        boolean boolean36 = cell30.canMergeWith(cell32);
        boolean boolean37 = cell26.canMergeWith(cell30);
        boolean boolean38 = cell20.canMergeWith(cell30);
        boolean boolean39 = cell20.isEmpty();
        ar.edu.unrc.game2048.Board.Position position42 = new ar.edu.unrc.game2048.Board.Position((-1), 1);
        ar.edu.unrc.game2048.Board board43 = new ar.edu.unrc.game2048.Board();
        boolean boolean44 = board43.isFull();
        boolean boolean45 = board43.moveDown();
        ar.edu.unrc.game2048.Board board46 = new ar.edu.unrc.game2048.Board(board43);
        ar.edu.unrc.game2048.Board.Direction direction47 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult48 = ar.edu.unrc.game2048.Movement.move(board46, direction47);
        int int49 = moveResult48.scoreDelta;
        ar.edu.unrc.game2048.Board board50 = moveResult48.board;
        boolean boolean51 = position42.equals((java.lang.Object) moveResult48);
        boolean boolean52 = cell20.equals((java.lang.Object) moveResult48);
        boolean boolean53 = cell9.canMergeWith(cell20);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell54 = cell2.mergeWith(cell20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "." + "'", str4, ".");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "." + "'", str28, ".");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "." + "'", str29, ".");
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "." + "'", str34, ".");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "." + "'", str35, ".");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + direction47 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction47.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 4 + "'", int49 == 4);
        org.junit.Assert.assertNotNull(board50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.String str3 = position2.toString();
        int int4 = position2.col;
        java.lang.String str5 = position2.toString();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board6.isWinningBoard();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board6);
        int int10 = board6.getScore();
        boolean boolean11 = position2.equals((java.lang.Object) board6);
        boolean boolean12 = board6.isWinningBoard();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board13);
        boolean boolean15 = board13.isWinningBoard();
        boolean boolean16 = board13.moveDown();
        ar.edu.unrc.game2048.Cell cell20 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int22 = cell21.getValue();
        int int23 = cell21.getValue();
        boolean boolean24 = cell21.isEmpty();
        boolean boolean25 = cell20.canMergeWith(cell21);
        board13.setCell((int) (short) 0, (int) (byte) 1, cell21);
        ar.edu.unrc.game2048.Cell cell28 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell29 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int30 = cell29.getValue();
        int int31 = cell29.getValue();
        boolean boolean32 = cell29.isEmpty();
        boolean boolean33 = cell28.canMergeWith(cell29);
        boolean boolean34 = cell21.canMergeWith(cell29);
        boolean boolean35 = board6.equals((java.lang.Object) boolean34);
        boolean boolean36 = board6.moveLeft();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 100)" + "'", str3, "(100, 100)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(100, 100)" + "'", str5, "(100, 100)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Position position4 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int5 = position4.row;
        boolean boolean6 = board1.equals((java.lang.Object) int5);
        java.lang.String str7 = board1.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board1.getEmptyPositions();
        boolean boolean9 = board1.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board1.getEmptyPositions();
        java.lang.String str11 = board1.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = board1.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str11, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet12);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell must be a power of two: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        ar.edu.unrc.game2048.AddTileStrategy addTileStrategy1 = null;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((-1), addTileStrategy1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int6 = position5.col;
        int int7 = position5.row;
        boolean boolean8 = board1.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.Board.Direction direction9 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult10 = ar.edu.unrc.game2048.Movement.move(board1, direction9);
        boolean boolean11 = board1.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + direction9 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction9.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertNotNull(moveResult10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        boolean boolean2 = board0.moveDown();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Direction direction4 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult5 = ar.edu.unrc.game2048.Movement.move(board3, direction4);
        ar.edu.unrc.game2048.Board board6 = moveResult5.board;
        ar.edu.unrc.game2048.Board board7 = moveResult5.board;
        int int8 = moveResult5.scoreDelta;
        int int9 = moveResult5.scoreDelta;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction4.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult5);
        org.junit.Assert.assertNotNull(board6);
        org.junit.Assert.assertNotNull(board7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        boolean boolean2 = board0.moveDown();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean6 = board5.moveLeft();
        boolean boolean7 = board5.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        boolean boolean2 = board0.moveDown();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean6 = board5.isFull();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isFull();
        boolean boolean3 = board0.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        int int4 = board0.getScore();
        boolean boolean5 = board0.hasEmptyCells();
        boolean boolean6 = board0.isFull();
        boolean boolean7 = board0.hasEmptyCells();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board0);
        java.lang.String str9 = board8.toString();
        int int10 = board8.getSize();
        int int11 = board8.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveDown();
        boolean boolean4 = board0.isWinningBoard();
        int int5 = board0.getSize();
        int int6 = board0.getSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int6 = position5.col;
        int int7 = position5.row;
        boolean boolean8 = board1.equals((java.lang.Object) position5);
        java.lang.String str9 = position5.toString();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board10);
        boolean boolean12 = board10.isWinningBoard();
        boolean boolean13 = board10.moveUp();
        ar.edu.unrc.game2048.Cell cell16 = board10.getCell(1, (int) (byte) 0);
        boolean boolean17 = position5.equals((java.lang.Object) cell16);
        int int18 = position5.col;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(100, 100)" + "'", str9, "(100, 100)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) ' ', 0);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        boolean boolean2 = board0.moveDown();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Direction direction4 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult5 = ar.edu.unrc.game2048.Movement.move(board3, direction4);
        ar.edu.unrc.game2048.Board board6 = moveResult5.board;
        ar.edu.unrc.game2048.Board board7 = moveResult5.board;
        boolean boolean8 = board7.moveUp();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board7);
        ar.edu.unrc.game2048.Cell cell13 = new ar.edu.unrc.game2048.Cell(2048);
        java.lang.Object obj14 = null;
        boolean boolean15 = cell13.equals(obj14);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board16);
        boolean boolean18 = board16.isWinningBoard();
        boolean boolean19 = board16.moveDown();
        ar.edu.unrc.game2048.Cell cell23 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell24 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int25 = cell24.getValue();
        int int26 = cell24.getValue();
        boolean boolean27 = cell24.isEmpty();
        boolean boolean28 = cell23.canMergeWith(cell24);
        board16.setCell((int) (short) 0, (int) (byte) 1, cell24);
        ar.edu.unrc.game2048.Cell cell30 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int31 = cell30.getValue();
        java.lang.String str32 = cell30.toString();
        java.lang.String str33 = cell30.toString();
        ar.edu.unrc.game2048.Cell cell34 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int35 = cell34.getValue();
        ar.edu.unrc.game2048.Cell cell36 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int37 = cell36.getValue();
        java.lang.String str38 = cell36.toString();
        java.lang.String str39 = cell36.toString();
        boolean boolean40 = cell34.canMergeWith(cell36);
        boolean boolean41 = cell30.canMergeWith(cell34);
        boolean boolean42 = cell24.canMergeWith(cell34);
        boolean boolean43 = cell24.isEmpty();
        ar.edu.unrc.game2048.Board.Position position46 = new ar.edu.unrc.game2048.Board.Position((-1), 1);
        ar.edu.unrc.game2048.Board board47 = new ar.edu.unrc.game2048.Board();
        boolean boolean48 = board47.isFull();
        boolean boolean49 = board47.moveDown();
        ar.edu.unrc.game2048.Board board50 = new ar.edu.unrc.game2048.Board(board47);
        ar.edu.unrc.game2048.Board.Direction direction51 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult52 = ar.edu.unrc.game2048.Movement.move(board50, direction51);
        int int53 = moveResult52.scoreDelta;
        ar.edu.unrc.game2048.Board board54 = moveResult52.board;
        boolean boolean55 = position46.equals((java.lang.Object) moveResult52);
        boolean boolean56 = cell24.equals((java.lang.Object) moveResult52);
        boolean boolean57 = cell13.canMergeWith(cell24);
        // The following exception was thrown during execution in test generation
        try {
            board9.setCell((int) (byte) -1, (int) (byte) 10, cell24);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction4.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult5);
        org.junit.Assert.assertNotNull(board6);
        org.junit.Assert.assertNotNull(board7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "." + "'", str32, ".");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "." + "'", str33, ".");
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "." + "'", str38, ".");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "." + "'", str39, ".");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + direction51 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction51.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 4 + "'", int53 == 4);
        org.junit.Assert.assertNotNull(board54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Position position4 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int5 = position4.row;
        boolean boolean6 = board1.equals((java.lang.Object) int5);
        java.lang.String str7 = board1.toString();
        boolean boolean8 = board1.hasEmptyCells();
        boolean boolean9 = board1.moveDown();
        boolean boolean10 = board1.moveDown();
        boolean boolean11 = board1.moveRight();
        boolean boolean12 = board1.isFull();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveDown();
        ar.edu.unrc.game2048.Cell cell7 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int9 = cell8.getValue();
        int int10 = cell8.getValue();
        boolean boolean11 = cell8.isEmpty();
        boolean boolean12 = cell7.canMergeWith(cell8);
        board0.setCell((int) (short) 0, (int) (byte) 1, cell8);
        boolean boolean14 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean16 = board0.moveUp();
        boolean boolean17 = board0.moveRight();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (short) 1);
        ar.edu.unrc.game2048.Board.Direction direction2 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult3 = ar.edu.unrc.game2048.Movement.move(board1, direction2);
        ar.edu.unrc.game2048.Board board4 = moveResult3.board;
        boolean boolean5 = board4.moveUp();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell8 = board4.getCell(2048, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (2048, -1) is out of bounds for board size 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + direction2 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction2.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertNotNull(moveResult3);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Position position4 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int5 = position4.row;
        boolean boolean6 = board1.equals((java.lang.Object) int5);
        java.lang.String str7 = board1.toString();
        boolean boolean8 = board1.hasEmptyCells();
        boolean boolean9 = board1.moveDown();
        boolean boolean10 = board1.moveDown();
        boolean boolean11 = board1.moveRight();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean13 = board1.isFull();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        int int3 = board0.getScore();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int8 = cell7.getValue();
        java.lang.String str9 = cell7.toString();
        java.lang.String str10 = cell7.toString();
        ar.edu.unrc.game2048.Board.Position position13 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int14 = position13.col;
        int int15 = position13.col;
        boolean boolean16 = cell7.equals((java.lang.Object) position13);
        ar.edu.unrc.game2048.Cell cell18 = new ar.edu.unrc.game2048.Cell(2048);
        java.lang.Object obj19 = null;
        boolean boolean20 = cell18.equals(obj19);
        int int21 = cell18.getValue();
        int int22 = cell18.getValue();
        int int23 = cell18.getValue();
        boolean boolean24 = cell7.canMergeWith(cell18);
        ar.edu.unrc.game2048.Cell cell25 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int26 = cell25.getValue();
        java.lang.String str27 = cell25.toString();
        boolean boolean28 = cell25.isEmpty();
        boolean boolean30 = cell25.equals((java.lang.Object) 100.0d);
        int int31 = cell25.getValue();
        java.lang.String str32 = cell25.toString();
        java.lang.String str33 = cell25.toString();
        boolean boolean35 = cell25.equals((java.lang.Object) (byte) 0);
        ar.edu.unrc.game2048.Cell cell36 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int37 = cell36.getValue();
        java.lang.String str38 = cell36.toString();
        boolean boolean39 = cell36.isEmpty();
        boolean boolean41 = cell36.equals((java.lang.Object) 100.0d);
        int int42 = cell36.getValue();
        java.lang.String str43 = cell36.toString();
        java.lang.String str44 = cell36.toString();
        boolean boolean45 = cell25.canMergeWith(cell36);
        boolean boolean46 = cell18.canMergeWith(cell25);
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell((int) (byte) -1, 2, cell18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 2) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2048 + "'", int21 == 2048);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2048 + "'", int22 == 2048);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2048 + "'", int23 == 2048);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "." + "'", str27, ".");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "." + "'", str32, ".");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "." + "'", str33, ".");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "." + "'", str38, ".");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "." + "'", str43, ".");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "." + "'", str44, ".");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        int int4 = board0.getScore();
        boolean boolean5 = board0.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board.Direction direction7 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult8 = ar.edu.unrc.game2048.Movement.move(board0, direction7);
        ar.edu.unrc.game2048.Board board9 = moveResult8.board;
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board13);
        ar.edu.unrc.game2048.Board.Position position17 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int18 = position17.row;
        boolean boolean19 = board14.equals((java.lang.Object) int18);
        boolean boolean20 = cell12.equals((java.lang.Object) int18);
        board9.setCell(0, (int) (short) 0, cell12);
        boolean boolean22 = board9.isLosingBoard();
        boolean boolean23 = board9.hasEmptyCells();
        java.lang.String str24 = board9.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + direction7 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction7.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertNotNull(moveResult8);
        org.junit.Assert.assertNotNull(board9);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str24, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        int int2 = cell0.getValue();
        boolean boolean3 = cell0.isEmpty();
        java.lang.String str4 = cell0.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean7 = board5.isWinningBoard();
        boolean boolean8 = board5.moveUp();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean10 = cell0.equals((java.lang.Object) board5);
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        ar.edu.unrc.game2048.Board.Position position16 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int17 = position16.row;
        boolean boolean18 = board13.equals((java.lang.Object) int17);
        boolean boolean19 = cell11.equals((java.lang.Object) int17);
        ar.edu.unrc.game2048.Cell cell20 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int21 = cell20.getValue();
        int int22 = cell20.getValue();
        boolean boolean23 = cell20.isEmpty();
        boolean boolean24 = cell11.canMergeWith(cell20);
        java.lang.String str25 = cell20.toString();
        ar.edu.unrc.game2048.Cell cell26 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int27 = cell26.getValue();
        java.lang.String str28 = cell26.toString();
        java.lang.String str29 = cell26.toString();
        ar.edu.unrc.game2048.Cell cell30 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int31 = cell30.getValue();
        ar.edu.unrc.game2048.Cell cell32 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int33 = cell32.getValue();
        java.lang.String str34 = cell32.toString();
        java.lang.String str35 = cell32.toString();
        boolean boolean36 = cell30.canMergeWith(cell32);
        boolean boolean37 = cell26.canMergeWith(cell30);
        boolean boolean38 = cell20.canMergeWith(cell26);
        ar.edu.unrc.game2048.Cell cell39 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int40 = cell39.getValue();
        java.lang.String str41 = cell39.toString();
        java.lang.String str42 = cell39.toString();
        boolean boolean43 = cell20.canMergeWith(cell39);
        java.lang.String str44 = cell39.toString();
        ar.edu.unrc.game2048.Cell cell46 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell47 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int48 = cell47.getValue();
        int int49 = cell47.getValue();
        boolean boolean50 = cell47.isEmpty();
        boolean boolean51 = cell46.canMergeWith(cell47);
        java.lang.String str52 = cell47.toString();
        boolean boolean53 = cell47.isEmpty();
        java.lang.String str54 = cell47.toString();
        boolean boolean55 = cell39.canMergeWith(cell47);
        boolean boolean56 = cell0.canMergeWith(cell39);
        ar.edu.unrc.game2048.Cell cell57 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int58 = cell57.getValue();
        java.lang.String str59 = cell57.toString();
        boolean boolean60 = cell57.isEmpty();
        boolean boolean61 = cell57.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell62 = cell0.mergeWith(cell57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "." + "'", str4, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "." + "'", str25, ".");
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "." + "'", str28, ".");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "." + "'", str29, ".");
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "." + "'", str34, ".");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "." + "'", str35, ".");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cell39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "." + "'", str41, ".");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "." + "'", str42, ".");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "." + "'", str44, ".");
        org.junit.Assert.assertNotNull(cell47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "." + "'", str52, ".");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "." + "'", str54, ".");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(cell57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "." + "'", str59, ".");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.isLosingBoard();
        int int4 = board0.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board0.getEmptyPositions();
        boolean boolean6 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int3 = position2.col;
        int int4 = position2.col;
        java.lang.String str5 = position2.toString();
        int int6 = position2.row;
        int int7 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(100, 100)" + "'", str5, "(100, 100)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isFull();
        boolean boolean4 = board0.moveUp();
        int int5 = board0.getScore();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean7 = board0.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        boolean boolean2 = board0.moveDown();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Direction direction4 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult5 = ar.edu.unrc.game2048.Movement.move(board3, direction4);
        int int6 = moveResult5.scoreDelta;
        ar.edu.unrc.game2048.Board board7 = moveResult5.board;
        boolean boolean8 = board7.isFull();
        boolean boolean9 = board7.moveLeft();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board10);
        boolean boolean12 = board10.isWinningBoard();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board10);
        int int14 = board10.getScore();
        boolean boolean15 = board10.hasEmptyCells();
        boolean boolean16 = board10.isFull();
        java.lang.String str17 = board10.toString();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board18);
        boolean boolean20 = board18.isFull();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(board21);
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(board21);
        boolean boolean24 = board21.isWinningBoard();
        boolean boolean25 = board21.moveRight();
        boolean boolean26 = board21.isFull();
        boolean boolean27 = board21.isFull();
        ar.edu.unrc.game2048.Board.Direction direction28 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult29 = ar.edu.unrc.game2048.Movement.move(board21, direction28);
        ar.edu.unrc.game2048.Board board30 = moveResult29.board;
        boolean boolean31 = board18.equals((java.lang.Object) board30);
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board(board32);
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(board32);
        boolean boolean35 = board32.isWinningBoard();
        boolean boolean36 = board32.moveRight();
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board(board32);
        int int38 = board32.getSize();
        boolean boolean39 = board32.moveUp();
        ar.edu.unrc.game2048.Board board40 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board41 = new ar.edu.unrc.game2048.Board(board40);
        boolean boolean42 = board40.isWinningBoard();
        boolean boolean43 = board40.moveDown();
        ar.edu.unrc.game2048.Cell cell47 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell48 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int49 = cell48.getValue();
        int int50 = cell48.getValue();
        boolean boolean51 = cell48.isEmpty();
        boolean boolean52 = cell47.canMergeWith(cell48);
        board40.setCell((int) (short) 0, (int) (byte) 1, cell48);
        ar.edu.unrc.game2048.Board.Direction direction54 = ar.edu.unrc.game2048.Board.Direction.UP;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult55 = ar.edu.unrc.game2048.Movement.move(board40, direction54);
        ar.edu.unrc.game2048.Movement.MoveResult moveResult56 = ar.edu.unrc.game2048.Movement.move(board32, direction54);
        ar.edu.unrc.game2048.Movement.MoveResult moveResult57 = ar.edu.unrc.game2048.Movement.move(board18, direction54);
        ar.edu.unrc.game2048.Movement.MoveResult moveResult58 = ar.edu.unrc.game2048.Movement.move(board10, direction54);
        ar.edu.unrc.game2048.Movement.MoveResult moveResult59 = ar.edu.unrc.game2048.Movement.move(board7, direction54);
        ar.edu.unrc.game2048.Board board60 = new ar.edu.unrc.game2048.Board(board7);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell63 = board60.getCell((-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 97) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction4.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(board7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str17, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + direction28 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction28.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult29);
        org.junit.Assert.assertNotNull(board30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 4 + "'", int38 == 4);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(cell48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + direction54 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction54.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertNotNull(moveResult55);
        org.junit.Assert.assertNotNull(moveResult56);
        org.junit.Assert.assertNotNull(moveResult57);
        org.junit.Assert.assertNotNull(moveResult58);
        org.junit.Assert.assertNotNull(moveResult59);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, (int) '4');
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        java.lang.String str3 = cell0.toString();
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int7 = position6.col;
        int int8 = position6.col;
        boolean boolean9 = cell0.equals((java.lang.Object) position6);
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell(2048);
        java.lang.Object obj12 = null;
        boolean boolean13 = cell11.equals(obj12);
        int int14 = cell11.getValue();
        int int15 = cell11.getValue();
        int int16 = cell11.getValue();
        boolean boolean17 = cell0.canMergeWith(cell11);
        ar.edu.unrc.game2048.Cell cell18 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int19 = cell18.getValue();
        ar.edu.unrc.game2048.Cell cell20 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int21 = cell20.getValue();
        java.lang.String str22 = cell20.toString();
        java.lang.String str23 = cell20.toString();
        boolean boolean24 = cell18.canMergeWith(cell20);
        ar.edu.unrc.game2048.Cell cell25 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int26 = cell25.getValue();
        java.lang.String str27 = cell25.toString();
        boolean boolean28 = cell25.isEmpty();
        ar.edu.unrc.game2048.Cell cell29 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int30 = cell29.getValue();
        java.lang.String str31 = cell29.toString();
        boolean boolean32 = cell25.canMergeWith(cell29);
        boolean boolean33 = cell18.canMergeWith(cell29);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell34 = cell0.mergeWith(cell18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2048 + "'", int14 == 2048);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2048 + "'", int15 == 2048);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2048 + "'", int16 == 2048);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "." + "'", str22, ".");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "." + "'", str23, ".");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "." + "'", str27, ".");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "." + "'", str31, ".");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board3.moveRight();
        boolean boolean5 = board3.moveDown();
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int9 = cell8.getValue();
        java.lang.String str10 = cell8.toString();
        java.lang.String str11 = cell8.toString();
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int13 = cell12.getValue();
        ar.edu.unrc.game2048.Cell cell14 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int15 = cell14.getValue();
        java.lang.String str16 = cell14.toString();
        java.lang.String str17 = cell14.toString();
        boolean boolean18 = cell12.canMergeWith(cell14);
        boolean boolean19 = cell8.canMergeWith(cell12);
        ar.edu.unrc.game2048.Cell cell20 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int21 = cell20.getValue();
        java.lang.String str22 = cell20.toString();
        boolean boolean23 = cell12.canMergeWith(cell20);
        boolean boolean24 = cell12.isEmpty();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(board25);
        boolean boolean27 = board25.isWinningBoard();
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board(board25);
        int int29 = board25.getScore();
        boolean boolean30 = board25.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet31 = board25.getEmptyPositions();
        ar.edu.unrc.game2048.Board.Direction direction32 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult33 = ar.edu.unrc.game2048.Movement.move(board25, direction32);
        boolean boolean34 = cell12.equals((java.lang.Object) moveResult33);
        // The following exception was thrown during execution in test generation
        try {
            board3.setCell((int) (byte) 0, (int) ' ', cell12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 32) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "." + "'", str16, ".");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "." + "'", str17, ".");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "." + "'", str22, ".");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(positionSet31);
        org.junit.Assert.assertTrue("'" + direction32 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction32.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertNotNull(moveResult33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        boolean boolean2 = board0.moveDown();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board3.moveRight();
        int int5 = board3.getScore();
        boolean boolean6 = board3.moveDown();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean8 = board7.moveUp();
        boolean boolean9 = board7.moveLeft();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell12 = board7.getCell((int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (35, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(2048);
        boolean boolean2 = cell1.isEmpty();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board3);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean6 = board3.isWinningBoard();
        boolean boolean7 = board3.moveRight();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean9 = cell1.equals((java.lang.Object) board8);
        int int10 = cell1.getValue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2048 + "'", int10 == 2048);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int3 = position2.col;
        int int4 = position2.col;
        java.lang.String str5 = position2.toString();
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int7 = cell6.getValue();
        java.lang.String str8 = cell6.toString();
        java.lang.String str9 = cell6.toString();
        ar.edu.unrc.game2048.Board.Position position12 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int13 = position12.col;
        int int14 = position12.col;
        boolean boolean15 = cell6.equals((java.lang.Object) position12);
        boolean boolean16 = position2.equals((java.lang.Object) position12);
        int int17 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(100, 100)" + "'", str5, "(100, 100)");
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        int int4 = board3.getSize();
        int int5 = board3.getSize();
        boolean boolean6 = board3.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.String str3 = position2.toString();
        int int4 = position2.col;
        java.lang.String str5 = position2.toString();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board6.isWinningBoard();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board6);
        int int10 = board6.getScore();
        boolean boolean11 = position2.equals((java.lang.Object) board6);
        java.lang.Object obj12 = null;
        boolean boolean13 = position2.equals(obj12);
        java.lang.String str14 = position2.toString();
        int int15 = position2.col;
        int int16 = position2.row;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 100)" + "'", str3, "(100, 100)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(100, 100)" + "'", str5, "(100, 100)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(100, 100)" + "'", str14, "(100, 100)");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.Object obj3 = null;
        boolean boolean4 = position2.equals(obj3);
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean6 = position2.equals((java.lang.Object) cell5);
        java.lang.String str7 = position2.toString();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board8.isWinningBoard();
        int int11 = board8.getScore();
        boolean boolean12 = position2.equals((java.lang.Object) board8);
        java.lang.String str13 = board8.toString();
        boolean boolean14 = board8.moveUp();
        boolean boolean15 = board8.moveUp();
        boolean boolean16 = board8.moveRight();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(100, 100)" + "'", str7, "(100, 100)");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int3 = position2.col;
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        boolean boolean7 = board6.isFull();
        boolean boolean8 = board6.moveDown();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board6);
        ar.edu.unrc.game2048.Board.Direction direction10 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult11 = ar.edu.unrc.game2048.Movement.move(board9, direction10);
        boolean boolean12 = position2.equals((java.lang.Object) board9);
        java.lang.String str13 = board9.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(100, 100)" + "'", str4, "(100, 100)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + direction10 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction10.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        boolean boolean3 = cell0.isEmpty();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int5 = cell4.getValue();
        java.lang.String str6 = cell4.toString();
        boolean boolean7 = cell0.canMergeWith(cell4);
        boolean boolean8 = cell4.isEmpty();
        boolean boolean9 = cell4.isEmpty();
        boolean boolean10 = cell4.isEmpty();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        int int2 = cell0.getValue();
        int int3 = cell0.getValue();
        boolean boolean4 = cell0.isEmpty();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        boolean boolean2 = board0.moveDown();
        int int3 = board0.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(positionSet4);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Position position4 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int5 = position4.row;
        boolean boolean6 = board1.equals((java.lang.Object) int5);
        java.lang.String str7 = board1.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board1.getEmptyPositions();
        boolean boolean9 = board1.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board1.getEmptyPositions();
        boolean boolean11 = board1.isLosingBoard();
        int int12 = board1.getSize();
        boolean boolean13 = board1.isWinningBoard();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        boolean boolean2 = board0.moveDown();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Direction direction4 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult5 = ar.edu.unrc.game2048.Movement.move(board3, direction4);
        ar.edu.unrc.game2048.Board board6 = moveResult5.board;
        int int7 = board6.getSize();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board6);
        java.lang.Class<?> wildcardClass9 = board8.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction4.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult5);
        org.junit.Assert.assertNotNull(board6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        int int2 = cell0.getValue();
        boolean boolean3 = cell0.isEmpty();
        java.lang.String str4 = cell0.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean7 = board5.isWinningBoard();
        boolean boolean8 = board5.moveUp();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean10 = cell0.equals((java.lang.Object) board5);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board5);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "." + "'", str4, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board3);
        ar.edu.unrc.game2048.Board.Position position7 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int8 = position7.row;
        boolean boolean9 = board4.equals((java.lang.Object) int8);
        java.lang.String str10 = board4.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet11 = board4.getEmptyPositions();
        boolean boolean12 = board2.equals((java.lang.Object) positionSet11);
        ar.edu.unrc.game2048.Cell cell15 = board2.getCell(0, (int) (short) 1);
        boolean boolean16 = board2.moveRight();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str10, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) '4');
        boolean boolean2 = board1.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isFull();
        boolean boolean4 = board0.moveRight();
        boolean boolean5 = board0.isWinningBoard();
        boolean boolean6 = board0.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board0.getEmptyPositions();
        boolean boolean8 = board0.moveUp();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        java.lang.String str3 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int5 = cell4.getValue();
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int7 = cell6.getValue();
        java.lang.String str8 = cell6.toString();
        java.lang.String str9 = cell6.toString();
        boolean boolean10 = cell4.canMergeWith(cell6);
        boolean boolean11 = cell0.canMergeWith(cell4);
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int13 = cell12.getValue();
        java.lang.String str14 = cell12.toString();
        boolean boolean15 = cell4.canMergeWith(cell12);
        boolean boolean16 = cell4.isEmpty();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board17);
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board17);
        boolean boolean20 = board17.isWinningBoard();
        boolean boolean21 = board17.moveRight();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(board17);
        int int23 = board17.getSize();
        boolean boolean24 = board17.isFull();
        boolean boolean25 = board17.isFull();
        boolean boolean26 = board17.moveRight();
        ar.edu.unrc.game2048.Cell cell29 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int30 = cell29.getValue();
        java.lang.String str31 = cell29.toString();
        boolean boolean32 = cell29.isEmpty();
        boolean boolean34 = cell29.equals((java.lang.Object) 100.0d);
        int int35 = cell29.getValue();
        java.lang.String str36 = cell29.toString();
        board17.setCell(0, 1, cell29);
        ar.edu.unrc.game2048.Board board38 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board39 = new ar.edu.unrc.game2048.Board(board38);
        ar.edu.unrc.game2048.Board board40 = new ar.edu.unrc.game2048.Board(board38);
        boolean boolean41 = board38.isWinningBoard();
        boolean boolean42 = board38.moveRight();
        boolean boolean43 = board38.isFull();
        int int44 = board38.getScore();
        boolean boolean45 = board38.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell48 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int49 = cell48.getValue();
        int int50 = cell48.getValue();
        board38.setCell(2, 0, cell48);
        boolean boolean52 = cell29.canMergeWith(cell48);
        int int53 = cell48.getValue();
        boolean boolean54 = cell4.equals((java.lang.Object) cell48);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "." + "'", str31, ".");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "." + "'", str36, ".");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(cell48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean4 = board0.equals((java.lang.Object) (-1.0d));
        boolean boolean5 = board0.isLosingBoard();
        boolean boolean6 = board0.moveDown();
        boolean boolean7 = board0.moveUp();
        boolean boolean8 = board0.moveUp();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        int int4 = board0.getScore();
        boolean boolean5 = board0.hasEmptyCells();
        boolean boolean6 = board0.isFull();
        java.lang.String str7 = board0.toString();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board8.isFull();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board11);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean14 = board11.isWinningBoard();
        boolean boolean15 = board11.moveRight();
        boolean boolean16 = board11.isFull();
        boolean boolean17 = board11.isFull();
        ar.edu.unrc.game2048.Board.Direction direction18 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult19 = ar.edu.unrc.game2048.Movement.move(board11, direction18);
        ar.edu.unrc.game2048.Board board20 = moveResult19.board;
        boolean boolean21 = board8.equals((java.lang.Object) board20);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(board22);
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(board22);
        boolean boolean25 = board22.isWinningBoard();
        boolean boolean26 = board22.moveRight();
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board(board22);
        int int28 = board22.getSize();
        boolean boolean29 = board22.moveUp();
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board(board30);
        boolean boolean32 = board30.isWinningBoard();
        boolean boolean33 = board30.moveDown();
        ar.edu.unrc.game2048.Cell cell37 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell38 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int39 = cell38.getValue();
        int int40 = cell38.getValue();
        boolean boolean41 = cell38.isEmpty();
        boolean boolean42 = cell37.canMergeWith(cell38);
        board30.setCell((int) (short) 0, (int) (byte) 1, cell38);
        ar.edu.unrc.game2048.Board.Direction direction44 = ar.edu.unrc.game2048.Board.Direction.UP;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult45 = ar.edu.unrc.game2048.Movement.move(board30, direction44);
        ar.edu.unrc.game2048.Movement.MoveResult moveResult46 = ar.edu.unrc.game2048.Movement.move(board22, direction44);
        ar.edu.unrc.game2048.Movement.MoveResult moveResult47 = ar.edu.unrc.game2048.Movement.move(board8, direction44);
        ar.edu.unrc.game2048.Movement.MoveResult moveResult48 = ar.edu.unrc.game2048.Movement.move(board0, direction44);
        java.lang.Class<?> wildcardClass49 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + direction18 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction18.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult19);
        org.junit.Assert.assertNotNull(board20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(cell38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + direction44 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction44.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertNotNull(moveResult45);
        org.junit.Assert.assertNotNull(moveResult46);
        org.junit.Assert.assertNotNull(moveResult47);
        org.junit.Assert.assertNotNull(moveResult48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean3 = board1.isWinningBoard();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board1);
        int int5 = board1.getScore();
        int int6 = board1.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board1.getEmptyPositions();
        boolean boolean8 = board0.equals((java.lang.Object) board1);
        boolean boolean9 = board0.moveRight();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(2048);
        java.lang.Object obj2 = null;
        boolean boolean3 = cell1.equals(obj2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean6 = board4.isWinningBoard();
        boolean boolean7 = board4.moveDown();
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int13 = cell12.getValue();
        int int14 = cell12.getValue();
        boolean boolean15 = cell12.isEmpty();
        boolean boolean16 = cell11.canMergeWith(cell12);
        board4.setCell((int) (short) 0, (int) (byte) 1, cell12);
        ar.edu.unrc.game2048.Cell cell18 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int19 = cell18.getValue();
        java.lang.String str20 = cell18.toString();
        java.lang.String str21 = cell18.toString();
        ar.edu.unrc.game2048.Cell cell22 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int23 = cell22.getValue();
        ar.edu.unrc.game2048.Cell cell24 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int25 = cell24.getValue();
        java.lang.String str26 = cell24.toString();
        java.lang.String str27 = cell24.toString();
        boolean boolean28 = cell22.canMergeWith(cell24);
        boolean boolean29 = cell18.canMergeWith(cell22);
        boolean boolean30 = cell12.canMergeWith(cell22);
        boolean boolean31 = cell12.isEmpty();
        ar.edu.unrc.game2048.Board.Position position34 = new ar.edu.unrc.game2048.Board.Position((-1), 1);
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board();
        boolean boolean36 = board35.isFull();
        boolean boolean37 = board35.moveDown();
        ar.edu.unrc.game2048.Board board38 = new ar.edu.unrc.game2048.Board(board35);
        ar.edu.unrc.game2048.Board.Direction direction39 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult40 = ar.edu.unrc.game2048.Movement.move(board38, direction39);
        int int41 = moveResult40.scoreDelta;
        ar.edu.unrc.game2048.Board board42 = moveResult40.board;
        boolean boolean43 = position34.equals((java.lang.Object) moveResult40);
        boolean boolean44 = cell12.equals((java.lang.Object) moveResult40);
        boolean boolean45 = cell1.canMergeWith(cell12);
        ar.edu.unrc.game2048.Cell cell46 = ar.edu.unrc.game2048.Cell.EMPTY;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell47 = cell12.mergeWith(cell46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "." + "'", str20, ".");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "." + "'", str21, ".");
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "." + "'", str26, ".");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "." + "'", str27, ".");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + direction39 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction39.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
        org.junit.Assert.assertNotNull(board42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(cell46);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.String str3 = position2.toString();
        int int4 = position2.col;
        java.lang.String str5 = position2.toString();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board6.isWinningBoard();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board6);
        int int10 = board6.getScore();
        boolean boolean11 = position2.equals((java.lang.Object) board6);
        java.lang.Object obj12 = null;
        boolean boolean13 = position2.equals(obj12);
        int int14 = position2.row;
        int int15 = position2.col;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 100)" + "'", str3, "(100, 100)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(100, 100)" + "'", str5, "(100, 100)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (short) 10);
        boolean boolean2 = board1.moveDown();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isFull();
        boolean boolean4 = board0.moveRight();
        boolean boolean5 = board0.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board0.getEmptyPositions();
        boolean boolean7 = board0.moveDown();
        int int8 = board0.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isFull();
        boolean boolean4 = board0.moveUp();
        int int5 = board0.getScore();
        boolean boolean6 = board0.isFull();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean9 = board7.isWinningBoard();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean11 = board10.moveRight();
        boolean boolean12 = board0.equals((java.lang.Object) board10);
        boolean boolean13 = board0.moveRight();
        boolean boolean14 = board0.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        int int4 = board0.getScore();
        boolean boolean5 = board0.hasEmptyCells();
        boolean boolean6 = board0.isFull();
        boolean boolean7 = board0.hasEmptyCells();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean9 = board0.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int3 = cell2.getValue();
        java.lang.String str4 = cell2.toString();
        java.lang.String str5 = cell2.toString();
        boolean boolean6 = cell0.canMergeWith(cell2);
        ar.edu.unrc.game2048.Cell cell7 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int8 = cell7.getValue();
        java.lang.String str9 = cell7.toString();
        boolean boolean10 = cell7.isEmpty();
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int12 = cell11.getValue();
        java.lang.String str13 = cell11.toString();
        boolean boolean14 = cell7.canMergeWith(cell11);
        boolean boolean15 = cell0.canMergeWith(cell11);
        int int16 = cell11.getValue();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board17);
        boolean boolean19 = board17.isWinningBoard();
        boolean boolean20 = board17.moveUp();
        ar.edu.unrc.game2048.Cell cell23 = board17.getCell(1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell24 = cell11.mergeWith(cell23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "." + "'", str4, ".");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "." + "'", str13, ".");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cell23);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isFull();
        boolean boolean3 = board0.moveRight();
        java.lang.String str4 = board0.toString();
        ar.edu.unrc.game2048.Board.Position position9 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.Object obj10 = null;
        boolean boolean11 = position9.equals(obj10);
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean13 = position9.equals((java.lang.Object) cell12);
        java.lang.String str14 = cell12.toString();
        int int15 = cell12.getValue();
        board0.setCell(0, (int) (short) 1, cell12);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet17 = board0.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(positionSet17);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isFull();
        boolean boolean3 = board0.moveRight();
        boolean boolean4 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean6 = board5.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (short) 1);
        ar.edu.unrc.game2048.Board.Direction direction2 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult3 = ar.edu.unrc.game2048.Movement.move(board1, direction2);
        ar.edu.unrc.game2048.Board board4 = moveResult3.board;
        boolean boolean5 = board4.moveUp();
        java.lang.Class<?> wildcardClass6 = board4.getClass();
        org.junit.Assert.assertTrue("'" + direction2 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction2.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertNotNull(moveResult3);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(2048);
        java.lang.Object obj2 = null;
        boolean boolean3 = cell1.equals(obj2);
        ar.edu.unrc.game2048.Cell cell5 = new ar.edu.unrc.game2048.Cell(2048);
        boolean boolean6 = cell1.canMergeWith(cell5);
        boolean boolean7 = cell5.isEmpty();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        boolean boolean9 = board8.isFull();
        boolean boolean10 = board8.moveDown();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board8);
        ar.edu.unrc.game2048.Board.Direction direction12 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult13 = ar.edu.unrc.game2048.Movement.move(board11, direction12);
        int int14 = moveResult13.scoreDelta;
        ar.edu.unrc.game2048.Board board15 = moveResult13.board;
        boolean boolean16 = board15.isFull();
        int int17 = board15.getScore();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board((int) (short) 10);
        boolean boolean20 = board15.equals((java.lang.Object) (short) 10);
        boolean boolean21 = cell5.equals((java.lang.Object) boolean20);
        ar.edu.unrc.game2048.Cell cell22 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int23 = cell22.getValue();
        java.lang.String str24 = cell22.toString();
        boolean boolean25 = cell22.isEmpty();
        boolean boolean27 = cell22.equals((java.lang.Object) 100.0d);
        int int28 = cell22.getValue();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell29 = cell5.mergeWith(cell22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 2048 and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + direction12 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction12.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(board15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "." + "'", str24, ".");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isFull();
        boolean boolean4 = board0.moveUp();
        boolean boolean5 = board0.isWinningBoard();
        java.lang.Class<?> wildcardClass6 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board3);
        ar.edu.unrc.game2048.Board.Position position7 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int8 = position7.row;
        boolean boolean9 = board4.equals((java.lang.Object) int8);
        java.lang.String str10 = board4.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet11 = board4.getEmptyPositions();
        boolean boolean12 = board4.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board4.getEmptyPositions();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board4);
        boolean boolean15 = position2.equals((java.lang.Object) board4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str10, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int6 = position5.row;
        boolean boolean7 = board2.equals((java.lang.Object) int6);
        boolean boolean8 = cell0.equals((java.lang.Object) int6);
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int10 = cell9.getValue();
        int int11 = cell9.getValue();
        boolean boolean12 = cell9.isEmpty();
        boolean boolean13 = cell0.canMergeWith(cell9);
        java.lang.String str14 = cell9.toString();
        java.lang.String str15 = cell9.toString();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isFull();
        boolean boolean4 = board0.isLosingBoard();
        boolean boolean5 = board0.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        int int4 = board0.getScore();
        boolean boolean5 = board0.hasEmptyCells();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board7);
        java.lang.String str9 = board7.toString();
        boolean boolean10 = board6.equals((java.lang.Object) board7);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board();
        boolean boolean12 = board11.isFull();
        boolean boolean13 = board11.moveDown();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board11);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board11.getEmptyPositions();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board16);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board16);
        boolean boolean19 = board16.isWinningBoard();
        boolean boolean20 = board16.moveRight();
        boolean boolean21 = board16.isFull();
        boolean boolean22 = board16.isFull();
        ar.edu.unrc.game2048.Board.Direction direction23 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult24 = ar.edu.unrc.game2048.Movement.move(board16, direction23);
        ar.edu.unrc.game2048.Movement.MoveResult moveResult25 = ar.edu.unrc.game2048.Movement.move(board11, direction23);
        ar.edu.unrc.game2048.Movement.MoveResult moveResult26 = ar.edu.unrc.game2048.Movement.move(board7, direction23);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell29 = board7.getCell((int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(positionSet15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + direction23 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction23.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult24);
        org.junit.Assert.assertNotNull(moveResult25);
        org.junit.Assert.assertNotNull(moveResult26);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.isWinningBoard();
        boolean boolean4 = board0.moveRight();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board0);
        int int6 = board0.getSize();
        boolean boolean7 = board0.isFull();
        boolean boolean8 = board0.isFull();
        boolean boolean9 = board0.moveRight();
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int13 = cell12.getValue();
        java.lang.String str14 = cell12.toString();
        boolean boolean15 = cell12.isEmpty();
        boolean boolean17 = cell12.equals((java.lang.Object) 100.0d);
        int int18 = cell12.getValue();
        java.lang.String str19 = cell12.toString();
        board0.setCell(0, 1, cell12);
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(board21);
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(board21);
        boolean boolean24 = board21.isWinningBoard();
        boolean boolean25 = board21.moveRight();
        boolean boolean26 = board21.isFull();
        int int27 = board21.getScore();
        boolean boolean28 = board21.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell31 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int32 = cell31.getValue();
        int int33 = cell31.getValue();
        board21.setCell(2, 0, cell31);
        boolean boolean35 = cell12.canMergeWith(cell31);
        int int36 = cell31.getValue();
        ar.edu.unrc.game2048.Cell cell37 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int38 = cell37.getValue();
        java.lang.String str39 = cell37.toString();
        java.lang.String str40 = cell37.toString();
        ar.edu.unrc.game2048.Cell cell41 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int42 = cell41.getValue();
        ar.edu.unrc.game2048.Cell cell43 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int44 = cell43.getValue();
        java.lang.String str45 = cell43.toString();
        java.lang.String str46 = cell43.toString();
        boolean boolean47 = cell41.canMergeWith(cell43);
        boolean boolean48 = cell37.canMergeWith(cell41);
        int int49 = cell41.getValue();
        ar.edu.unrc.game2048.Cell cell50 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int51 = cell50.getValue();
        java.lang.String str52 = cell50.toString();
        boolean boolean53 = cell50.isEmpty();
        ar.edu.unrc.game2048.Cell cell54 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int55 = cell54.getValue();
        java.lang.String str56 = cell54.toString();
        boolean boolean57 = cell50.canMergeWith(cell54);
        ar.edu.unrc.game2048.Board board58 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board59 = new ar.edu.unrc.game2048.Board(board58);
        ar.edu.unrc.game2048.Board board60 = new ar.edu.unrc.game2048.Board(board58);
        boolean boolean61 = board58.isWinningBoard();
        boolean boolean62 = board58.moveRight();
        ar.edu.unrc.game2048.Board board63 = new ar.edu.unrc.game2048.Board(board58);
        int int64 = board58.getSize();
        boolean boolean65 = board58.isFull();
        boolean boolean66 = board58.isFull();
        boolean boolean67 = board58.moveRight();
        ar.edu.unrc.game2048.Board board68 = new ar.edu.unrc.game2048.Board(board58);
        boolean boolean69 = cell54.equals((java.lang.Object) board68);
        boolean boolean71 = cell54.equals((java.lang.Object) 10L);
        boolean boolean72 = cell41.canMergeWith(cell54);
        boolean boolean73 = cell31.canMergeWith(cell54);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "." + "'", str19, ".");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(cell31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(cell37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "." + "'", str39, ".");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "." + "'", str40, ".");
        org.junit.Assert.assertNotNull(cell41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(cell43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "." + "'", str45, ".");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "." + "'", str46, ".");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(cell50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "." + "'", str52, ".");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(cell54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "." + "'", str56, ".");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 4 + "'", int64 == 4);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.isWinningBoard();
        boolean boolean4 = board0.moveRight();
        boolean boolean5 = board0.isFull();
        int int6 = board0.getScore();
        boolean boolean7 = board0.isWinningBoard();
        boolean boolean8 = board0.moveUp();
        java.lang.String str9 = board0.toString();
        java.lang.Class<?> wildcardClass10 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Score: 4\n+-----+-----+-----+-----+\n|    2|     |     |    4|\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str9, "Score: 4\n+-----+-----+-----+-----+\n|    2|     |     |    4|\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int6 = position5.col;
        int int7 = position5.row;
        boolean boolean8 = board1.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean10 = board1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveUp();
        boolean boolean4 = board0.moveRight();
        java.lang.String str5 = board0.toString();
        boolean boolean6 = board0.moveRight();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Score: 4\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n|    2|     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str5, "Score: 4\n+-----+-----+-----+-----+\n|     |     |     |    4|\n+-----+-----+-----+-----+\n|    2|     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveDown();
        java.lang.String str4 = board0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n" + "'", str4, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|    2|     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board3.moveUp();
        boolean boolean5 = board3.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board3.getEmptyPositions();
        int int7 = board3.getScore();
        boolean boolean8 = board3.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean4 = board2.isWinningBoard();
        boolean boolean5 = board2.moveDown();
        ar.edu.unrc.game2048.Cell cell9 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int11 = cell10.getValue();
        int int12 = cell10.getValue();
        boolean boolean13 = cell10.isEmpty();
        boolean boolean14 = cell9.canMergeWith(cell10);
        board2.setCell((int) (short) 0, (int) (byte) 1, cell10);
        ar.edu.unrc.game2048.Board.Position position18 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.Object obj19 = null;
        boolean boolean20 = position18.equals(obj19);
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean22 = position18.equals((java.lang.Object) cell21);
        boolean boolean23 = cell21.isEmpty();
        boolean boolean24 = cell10.canMergeWith(cell21);
        boolean boolean25 = cell10.isEmpty();
        boolean boolean26 = cell1.canMergeWith(cell10);
        ar.edu.unrc.game2048.Cell cell27 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int28 = cell27.getValue();
        int int29 = cell27.getValue();
        boolean boolean30 = cell27.isEmpty();
        java.lang.String str31 = cell27.toString();
        ar.edu.unrc.game2048.Cell cell32 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int33 = cell32.getValue();
        java.lang.String str34 = cell32.toString();
        boolean boolean35 = cell32.isEmpty();
        boolean boolean37 = cell32.equals((java.lang.Object) 100.0d);
        int int38 = cell32.getValue();
        boolean boolean40 = cell32.equals((java.lang.Object) 10.0d);
        java.lang.String str41 = cell32.toString();
        boolean boolean42 = cell27.canMergeWith(cell32);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell43 = cell10.mergeWith(cell27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "." + "'", str31, ".");
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "." + "'", str34, ".");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "." + "'", str41, ".");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isFull();
        boolean boolean4 = board0.moveUp();
        int int5 = board0.getScore();
        boolean boolean6 = board0.isFull();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean9 = board7.isWinningBoard();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean11 = board10.moveUp();
        int int12 = board10.getSize();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board13);
        boolean boolean15 = board13.isWinningBoard();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board13);
        boolean boolean17 = board13.hasEmptyCells();
        boolean boolean18 = board13.moveUp();
        int int19 = board13.getSize();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board20);
        boolean boolean22 = board20.isWinningBoard();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(board20);
        int int24 = board20.getScore();
        ar.edu.unrc.game2048.Board.Direction direction25 = ar.edu.unrc.game2048.Board.Direction.UP;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult26 = ar.edu.unrc.game2048.Movement.move(board20, direction25);
        ar.edu.unrc.game2048.Movement.MoveResult moveResult27 = ar.edu.unrc.game2048.Movement.move(board13, direction25);
        ar.edu.unrc.game2048.Movement.MoveResult moveResult28 = ar.edu.unrc.game2048.Movement.move(board10, direction25);
        ar.edu.unrc.game2048.Movement.MoveResult moveResult29 = ar.edu.unrc.game2048.Movement.move(board0, direction25);
        int int30 = moveResult29.scoreDelta;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + direction25 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction25.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertNotNull(moveResult26);
        org.junit.Assert.assertNotNull(moveResult27);
        org.junit.Assert.assertNotNull(moveResult28);
        org.junit.Assert.assertNotNull(moveResult29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        int int4 = board0.getScore();
        int int5 = board0.getScore();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board6.isWinningBoard();
        boolean boolean9 = board6.moveUp();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean11 = board0.equals((java.lang.Object) board6);
        int int12 = board6.getScore();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board3.moveRight();
        int int5 = board3.getScore();
        boolean boolean6 = board3.moveDown();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean8 = board3.moveUp();
        boolean boolean9 = board3.isFull();
        boolean boolean10 = board3.isLosingBoard();
        boolean boolean11 = board3.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isFull();
        boolean boolean3 = board0.moveRight();
        boolean boolean4 = board0.isLosingBoard();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board0);
        java.lang.Class<?> wildcardClass6 = board5.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        int int3 = board0.getScore();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell7 = board4.getCell(0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 52) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board1);
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int6 = position5.row;
        boolean boolean7 = board2.equals((java.lang.Object) int6);
        boolean boolean8 = cell0.equals((java.lang.Object) int6);
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int10 = cell9.getValue();
        int int11 = cell9.getValue();
        boolean boolean12 = cell9.isEmpty();
        boolean boolean13 = cell0.canMergeWith(cell9);
        ar.edu.unrc.game2048.Cell cell14 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board15);
        ar.edu.unrc.game2048.Board.Position position19 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int20 = position19.row;
        boolean boolean21 = board16.equals((java.lang.Object) int20);
        boolean boolean22 = cell14.equals((java.lang.Object) int20);
        ar.edu.unrc.game2048.Cell cell23 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int24 = cell23.getValue();
        int int25 = cell23.getValue();
        boolean boolean26 = cell23.isEmpty();
        boolean boolean27 = cell14.canMergeWith(cell23);
        int int28 = cell23.getValue();
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(board29);
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board(board29);
        java.lang.String str32 = board29.toString();
        ar.edu.unrc.game2048.Cell cell33 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int34 = cell33.getValue();
        java.lang.String str35 = cell33.toString();
        boolean boolean36 = cell33.isEmpty();
        boolean boolean38 = cell33.equals((java.lang.Object) 100.0d);
        int int39 = cell33.getValue();
        java.lang.String str40 = cell33.toString();
        java.lang.String str41 = cell33.toString();
        ar.edu.unrc.game2048.Board.Position position44 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int45 = position44.row;
        boolean boolean46 = cell33.equals((java.lang.Object) position44);
        ar.edu.unrc.game2048.Board board47 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board48 = new ar.edu.unrc.game2048.Board(board47);
        boolean boolean49 = board48.isWinningBoard();
        boolean boolean50 = position44.equals((java.lang.Object) boolean49);
        boolean boolean51 = board29.equals((java.lang.Object) boolean49);
        boolean boolean52 = cell23.equals((java.lang.Object) boolean51);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell53 = cell9.mergeWith(cell23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str32, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(cell33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "." + "'", str35, ".");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "." + "'", str40, ".");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "." + "'", str41, ".");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell must be a power of two: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.moveUp();
        boolean boolean3 = board0.isFull();
        boolean boolean4 = board0.isFull();
        int int5 = board0.getSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int3 = cell2.getValue();
        int int4 = cell2.getValue();
        boolean boolean5 = cell2.isEmpty();
        boolean boolean6 = cell1.canMergeWith(cell2);
        boolean boolean7 = cell2.isEmpty();
        java.lang.String str8 = cell2.toString();
        boolean boolean9 = cell2.isEmpty();
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.isWinningBoard();
        boolean boolean4 = board0.moveRight();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board0);
        int int6 = board0.getSize();
        boolean boolean7 = board0.moveUp();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board8.isWinningBoard();
        boolean boolean11 = board8.moveDown();
        ar.edu.unrc.game2048.Cell cell15 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell16 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int17 = cell16.getValue();
        int int18 = cell16.getValue();
        boolean boolean19 = cell16.isEmpty();
        boolean boolean20 = cell15.canMergeWith(cell16);
        board8.setCell((int) (short) 0, (int) (byte) 1, cell16);
        ar.edu.unrc.game2048.Board.Direction direction22 = ar.edu.unrc.game2048.Board.Direction.UP;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult23 = ar.edu.unrc.game2048.Movement.move(board8, direction22);
        ar.edu.unrc.game2048.Movement.MoveResult moveResult24 = ar.edu.unrc.game2048.Movement.move(board0, direction22);
        int int25 = moveResult24.scoreDelta;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + direction22 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction22.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertNotNull(moveResult23);
        org.junit.Assert.assertNotNull(moveResult24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int3 = position2.col;
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        boolean boolean7 = board6.isFull();
        boolean boolean8 = board6.moveDown();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board6);
        ar.edu.unrc.game2048.Board.Direction direction10 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult11 = ar.edu.unrc.game2048.Movement.move(board9, direction10);
        boolean boolean12 = position2.equals((java.lang.Object) board9);
        boolean boolean13 = board9.isLosingBoard();
        boolean boolean14 = board9.moveLeft();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(100, 100)" + "'", str4, "(100, 100)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + direction10 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction10.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isFull();
        boolean boolean4 = board0.moveUp();
        int int5 = board0.getSize();
        boolean boolean6 = board0.moveUp();
        boolean boolean7 = board0.moveUp();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean11 = board9.isWinningBoard();
        boolean boolean12 = board0.equals((java.lang.Object) boolean11);
        int int13 = board0.getSize();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell16 = board0.getCell(2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (2, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.moveLeft();
        java.lang.Class<?> wildcardClass2 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        boolean boolean3 = cell0.isEmpty();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int5 = cell4.getValue();
        java.lang.String str6 = cell4.toString();
        boolean boolean7 = cell0.canMergeWith(cell4);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean10 = board8.isWinningBoard();
        boolean boolean11 = board8.moveUp();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board8);
        boolean boolean13 = board8.moveDown();
        boolean boolean14 = cell4.equals((java.lang.Object) board8);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board();
        boolean boolean16 = board15.isFull();
        boolean boolean17 = board15.moveDown();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board15);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet19 = board15.getEmptyPositions();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board15);
        boolean boolean21 = cell4.equals((java.lang.Object) board15);
        boolean boolean22 = board15.moveRight();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(positionSet19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        boolean boolean3 = cell0.isEmpty();
        boolean boolean5 = cell0.equals((java.lang.Object) 100.0d);
        int int6 = cell0.getValue();
        boolean boolean7 = cell0.isEmpty();
        java.lang.String str8 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board10);
        ar.edu.unrc.game2048.Board.Position position14 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int15 = position14.row;
        boolean boolean16 = board11.equals((java.lang.Object) int15);
        boolean boolean17 = cell9.equals((java.lang.Object) int15);
        ar.edu.unrc.game2048.Cell cell18 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int19 = cell18.getValue();
        int int20 = cell18.getValue();
        boolean boolean21 = cell18.isEmpty();
        boolean boolean22 = cell9.canMergeWith(cell18);
        java.lang.String str23 = cell18.toString();
        ar.edu.unrc.game2048.Cell cell24 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int25 = cell24.getValue();
        java.lang.String str26 = cell24.toString();
        java.lang.String str27 = cell24.toString();
        ar.edu.unrc.game2048.Cell cell28 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int29 = cell28.getValue();
        ar.edu.unrc.game2048.Cell cell30 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int31 = cell30.getValue();
        java.lang.String str32 = cell30.toString();
        java.lang.String str33 = cell30.toString();
        boolean boolean34 = cell28.canMergeWith(cell30);
        boolean boolean35 = cell24.canMergeWith(cell28);
        boolean boolean36 = cell18.canMergeWith(cell24);
        ar.edu.unrc.game2048.Cell cell37 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int38 = cell37.getValue();
        java.lang.String str39 = cell37.toString();
        java.lang.String str40 = cell37.toString();
        boolean boolean41 = cell18.canMergeWith(cell37);
        boolean boolean42 = cell0.canMergeWith(cell18);
        java.lang.String str43 = cell18.toString();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "." + "'", str23, ".");
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "." + "'", str26, ".");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "." + "'", str27, ".");
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "." + "'", str32, ".");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "." + "'", str33, ".");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(cell37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "." + "'", str39, ".");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "." + "'", str40, ".");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "." + "'", str43, ".");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int3 = position2.col;
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        boolean boolean7 = position2.equals((java.lang.Object) 0.0d);
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int9 = cell8.getValue();
        java.lang.String str10 = cell8.toString();
        boolean boolean11 = cell8.isEmpty();
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int13 = cell12.getValue();
        java.lang.String str14 = cell12.toString();
        boolean boolean15 = cell8.canMergeWith(cell12);
        boolean boolean16 = cell12.isEmpty();
        boolean boolean17 = cell12.isEmpty();
        boolean boolean18 = position2.equals((java.lang.Object) boolean17);
        int int19 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(100, 100)" + "'", str4, "(100, 100)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Position position4 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int5 = position4.row;
        boolean boolean6 = board1.equals((java.lang.Object) int5);
        java.lang.String str7 = board1.toString();
        boolean boolean8 = board1.hasEmptyCells();
        boolean boolean9 = board1.moveDown();
        boolean boolean10 = board1.isWinningBoard();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        int int4 = board0.getScore();
        boolean boolean5 = board0.hasEmptyCells();
        boolean boolean6 = board0.isFull();
        ar.edu.unrc.game2048.Board.Position position9 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.String str10 = position9.toString();
        int int11 = position9.col;
        java.lang.String str12 = position9.toString();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board13);
        boolean boolean15 = board13.isWinningBoard();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board13);
        int int17 = board13.getScore();
        boolean boolean18 = position9.equals((java.lang.Object) board13);
        boolean boolean19 = board0.equals((java.lang.Object) position9);
        int int20 = position9.col;
        int int21 = position9.col;
        java.lang.String str22 = position9.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(100, 100)" + "'", str10, "(100, 100)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(100, 100)" + "'", str12, "(100, 100)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(100, 100)" + "'", str22, "(100, 100)");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        boolean boolean3 = cell0.isEmpty();
        boolean boolean5 = cell0.equals((java.lang.Object) 100.0d);
        int int6 = cell0.getValue();
        java.lang.String str7 = cell0.toString();
        java.lang.String str8 = cell0.toString();
        boolean boolean10 = cell0.equals((java.lang.Object) (byte) 0);
        boolean boolean11 = cell0.isEmpty();
        java.lang.String str12 = cell0.toString();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (short) 0);
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int3 = cell2.getValue();
        int int4 = cell2.getValue();
        boolean boolean5 = cell2.isEmpty();
        java.lang.String str6 = cell2.toString();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean9 = board7.isWinningBoard();
        boolean boolean10 = board7.moveUp();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean12 = cell2.equals((java.lang.Object) board7);
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board14);
        ar.edu.unrc.game2048.Board.Position position18 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int19 = position18.row;
        boolean boolean20 = board15.equals((java.lang.Object) int19);
        boolean boolean21 = cell13.equals((java.lang.Object) int19);
        ar.edu.unrc.game2048.Cell cell22 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int23 = cell22.getValue();
        int int24 = cell22.getValue();
        boolean boolean25 = cell22.isEmpty();
        boolean boolean26 = cell13.canMergeWith(cell22);
        java.lang.String str27 = cell22.toString();
        ar.edu.unrc.game2048.Cell cell28 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int29 = cell28.getValue();
        java.lang.String str30 = cell28.toString();
        java.lang.String str31 = cell28.toString();
        ar.edu.unrc.game2048.Cell cell32 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int33 = cell32.getValue();
        ar.edu.unrc.game2048.Cell cell34 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int35 = cell34.getValue();
        java.lang.String str36 = cell34.toString();
        java.lang.String str37 = cell34.toString();
        boolean boolean38 = cell32.canMergeWith(cell34);
        boolean boolean39 = cell28.canMergeWith(cell32);
        boolean boolean40 = cell22.canMergeWith(cell28);
        ar.edu.unrc.game2048.Cell cell41 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int42 = cell41.getValue();
        java.lang.String str43 = cell41.toString();
        java.lang.String str44 = cell41.toString();
        boolean boolean45 = cell22.canMergeWith(cell41);
        java.lang.String str46 = cell41.toString();
        ar.edu.unrc.game2048.Cell cell48 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell49 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int50 = cell49.getValue();
        int int51 = cell49.getValue();
        boolean boolean52 = cell49.isEmpty();
        boolean boolean53 = cell48.canMergeWith(cell49);
        java.lang.String str54 = cell49.toString();
        boolean boolean55 = cell49.isEmpty();
        java.lang.String str56 = cell49.toString();
        boolean boolean57 = cell41.canMergeWith(cell49);
        boolean boolean58 = cell2.canMergeWith(cell41);
        boolean boolean59 = cell1.canMergeWith(cell41);
        java.lang.String str60 = cell41.toString();
        boolean boolean61 = cell41.isEmpty();
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "." + "'", str6, ".");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "." + "'", str27, ".");
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "." + "'", str30, ".");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "." + "'", str31, ".");
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "." + "'", str36, ".");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "." + "'", str37, ".");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(cell41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "." + "'", str43, ".");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "." + "'", str44, ".");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "." + "'", str46, ".");
        org.junit.Assert.assertNotNull(cell49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "." + "'", str54, ".");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "." + "'", str56, ".");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "." + "'", str60, ".");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int6 = position5.col;
        int int7 = position5.row;
        boolean boolean8 = board1.equals((java.lang.Object) position5);
        java.lang.String str9 = position5.toString();
        int int10 = position5.col;
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean13 = board12.isWinningBoard();
        int int14 = board12.getSize();
        boolean boolean15 = position5.equals((java.lang.Object) int14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(100, 100)" + "'", str9, "(100, 100)");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board3.moveRight();
        boolean boolean5 = board3.moveDown();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board3.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board3.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertNotNull(positionSet7);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isFull();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board3);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean6 = board3.isWinningBoard();
        boolean boolean7 = board3.moveRight();
        boolean boolean8 = board3.isFull();
        boolean boolean9 = board3.isFull();
        ar.edu.unrc.game2048.Board.Direction direction10 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult11 = ar.edu.unrc.game2048.Movement.move(board3, direction10);
        ar.edu.unrc.game2048.Board board12 = moveResult11.board;
        boolean boolean13 = board0.equals((java.lang.Object) board12);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean16 = board14.isWinningBoard();
        boolean boolean17 = board14.moveDown();
        ar.edu.unrc.game2048.Cell cell21 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell22 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int23 = cell22.getValue();
        int int24 = cell22.getValue();
        boolean boolean25 = cell22.isEmpty();
        boolean boolean26 = cell21.canMergeWith(cell22);
        board14.setCell((int) (short) 0, (int) (byte) 1, cell22);
        ar.edu.unrc.game2048.Board.Position position30 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.Object obj31 = null;
        boolean boolean32 = position30.equals(obj31);
        ar.edu.unrc.game2048.Cell cell33 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean34 = position30.equals((java.lang.Object) cell33);
        boolean boolean35 = cell33.isEmpty();
        boolean boolean36 = cell22.canMergeWith(cell33);
        java.lang.String str37 = cell22.toString();
        ar.edu.unrc.game2048.Cell cell38 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board39 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board40 = new ar.edu.unrc.game2048.Board(board39);
        ar.edu.unrc.game2048.Board.Position position43 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int44 = position43.row;
        boolean boolean45 = board40.equals((java.lang.Object) int44);
        boolean boolean46 = cell38.equals((java.lang.Object) int44);
        ar.edu.unrc.game2048.Cell cell47 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int48 = cell47.getValue();
        int int49 = cell47.getValue();
        boolean boolean50 = cell47.isEmpty();
        boolean boolean51 = cell38.canMergeWith(cell47);
        java.lang.String str52 = cell47.toString();
        boolean boolean53 = cell22.canMergeWith(cell47);
        boolean boolean54 = board12.equals((java.lang.Object) cell47);
        boolean boolean55 = board12.isLosingBoard();
        boolean boolean56 = board12.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + direction10 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction10.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult11);
        org.junit.Assert.assertNotNull(board12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(cell33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "." + "'", str37, ".");
        org.junit.Assert.assertNotNull(cell38);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(cell47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "." + "'", str52, ".");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Position position4 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int5 = position4.row;
        boolean boolean6 = board1.equals((java.lang.Object) int5);
        int int7 = board1.getScore();
        ar.edu.unrc.game2048.Board.Position position10 = new ar.edu.unrc.game2048.Board.Position((int) 'a', 4);
        boolean boolean11 = board1.equals((java.lang.Object) position10);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean4 = board3.moveRight();
        java.lang.Class<?> wildcardClass5 = board3.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(97, (int) (short) 100);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isFull();
        boolean boolean3 = board0.moveRight();
        boolean boolean4 = board0.isWinningBoard();
        boolean boolean5 = board0.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isFull();
        boolean boolean3 = board0.moveRight();
        boolean boolean4 = board0.isLosingBoard();
        boolean boolean5 = board0.moveUp();
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int9 = cell8.getValue();
        // The following exception was thrown during execution in test generation
        try {
            board0.setCell(2048, (int) (short) -1, cell8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (2048, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board0.hasEmptyCells();
        boolean boolean5 = board0.moveUp();
        int int6 = board0.getSize();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean9 = board7.isWinningBoard();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board7);
        int int11 = board7.getScore();
        ar.edu.unrc.game2048.Board.Direction direction12 = ar.edu.unrc.game2048.Board.Direction.UP;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult13 = ar.edu.unrc.game2048.Movement.move(board7, direction12);
        ar.edu.unrc.game2048.Movement.MoveResult moveResult14 = ar.edu.unrc.game2048.Movement.move(board0, direction12);
        ar.edu.unrc.game2048.Board board15 = moveResult14.board;
        int int16 = moveResult14.scoreDelta;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + direction12 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction12.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertNotNull(moveResult13);
        org.junit.Assert.assertNotNull(moveResult14);
        org.junit.Assert.assertNotNull(board15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        boolean boolean2 = board0.moveDown();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Direction direction4 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult5 = ar.edu.unrc.game2048.Movement.move(board3, direction4);
        ar.edu.unrc.game2048.Board board6 = moveResult5.board;
        ar.edu.unrc.game2048.Board board7 = moveResult5.board;
        ar.edu.unrc.game2048.Board board8 = moveResult5.board;
        int int9 = board8.getSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction4.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult5);
        org.junit.Assert.assertNotNull(board6);
        org.junit.Assert.assertNotNull(board7);
        org.junit.Assert.assertNotNull(board8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        boolean boolean2 = board0.moveDown();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Direction direction4 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult5 = ar.edu.unrc.game2048.Movement.move(board3, direction4);
        ar.edu.unrc.game2048.Board board6 = moveResult5.board;
        ar.edu.unrc.game2048.Board board7 = moveResult5.board;
        boolean boolean8 = board7.hasEmptyCells();
        ar.edu.unrc.game2048.Board.Direction direction9 = ar.edu.unrc.game2048.Board.Direction.UP;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult10 = ar.edu.unrc.game2048.Movement.move(board7, direction9);
        boolean boolean11 = board7.moveDown();
        boolean boolean12 = board7.isWinningBoard();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board7);
        int int14 = board13.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board13.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction4.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult5);
        org.junit.Assert.assertNotNull(board6);
        org.junit.Assert.assertNotNull(board7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + direction9 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction9.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertNotNull(moveResult10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(positionSet15);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int6 = position5.col;
        int int7 = position5.row;
        boolean boolean8 = board1.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.Board.Direction direction9 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult10 = ar.edu.unrc.game2048.Movement.move(board1, direction9);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean12 = board1.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + direction9 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction9.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertNotNull(moveResult10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell must be a power of two: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (short) 100);
        boolean boolean2 = board1.moveRight();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.isLosingBoard();
        boolean boolean4 = board0.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell8 = board0.getCell(0, 1);
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int10 = cell9.getValue();
        java.lang.String str11 = cell9.toString();
        java.lang.String str12 = cell9.toString();
        ar.edu.unrc.game2048.Board.Position position15 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int16 = position15.col;
        int int17 = position15.col;
        boolean boolean18 = cell9.equals((java.lang.Object) position15);
        ar.edu.unrc.game2048.Cell cell20 = new ar.edu.unrc.game2048.Cell(2048);
        java.lang.Object obj21 = null;
        boolean boolean22 = cell20.equals(obj21);
        int int23 = cell20.getValue();
        int int24 = cell20.getValue();
        int int25 = cell20.getValue();
        boolean boolean26 = cell9.canMergeWith(cell20);
        boolean boolean27 = cell8.equals((java.lang.Object) cell20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2048 + "'", int23 == 2048);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2048 + "'", int24 == 2048);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2048 + "'", int25 == 2048);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean4 = board1.isLosingBoard();
        int int5 = board1.getScore();
        boolean boolean6 = board1.hasEmptyCells();
        java.lang.String str7 = board1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        int int4 = board0.getScore();
        boolean boolean5 = board0.hasEmptyCells();
        boolean boolean6 = board0.isFull();
        ar.edu.unrc.game2048.Board.Position position9 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.String str10 = position9.toString();
        int int11 = position9.col;
        java.lang.String str12 = position9.toString();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board13);
        boolean boolean15 = board13.isWinningBoard();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board13);
        int int17 = board13.getScore();
        boolean boolean18 = position9.equals((java.lang.Object) board13);
        boolean boolean19 = board0.equals((java.lang.Object) position9);
        int int20 = position9.col;
        int int21 = position9.col;
        boolean boolean23 = position9.equals((java.lang.Object) 0);
        int int24 = position9.row;
        int int25 = position9.row;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(100, 100)" + "'", str10, "(100, 100)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(100, 100)" + "'", str12, "(100, 100)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        boolean boolean2 = board0.moveDown();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Direction direction4 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult5 = ar.edu.unrc.game2048.Movement.move(board3, direction4);
        int int6 = moveResult5.scoreDelta;
        ar.edu.unrc.game2048.Board board7 = moveResult5.board;
        int int8 = moveResult5.scoreDelta;
        ar.edu.unrc.game2048.Board board9 = moveResult5.board;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction4.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(board7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(board9);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.String str3 = position2.toString();
        int int4 = position2.col;
        java.lang.String str5 = position2.toString();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board6.isWinningBoard();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board6);
        int int10 = board6.getScore();
        boolean boolean11 = position2.equals((java.lang.Object) board6);
        java.lang.Object obj12 = null;
        boolean boolean13 = position2.equals(obj12);
        int int14 = position2.col;
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board15);
        boolean boolean17 = board15.isFull();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board18);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board18);
        boolean boolean21 = board18.isWinningBoard();
        boolean boolean22 = board18.moveRight();
        boolean boolean23 = board18.isFull();
        boolean boolean24 = board18.isFull();
        ar.edu.unrc.game2048.Board.Direction direction25 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult26 = ar.edu.unrc.game2048.Movement.move(board18, direction25);
        ar.edu.unrc.game2048.Board board27 = moveResult26.board;
        boolean boolean28 = board15.equals((java.lang.Object) board27);
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(board29);
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board(board29);
        boolean boolean32 = board29.isWinningBoard();
        boolean boolean33 = board29.moveRight();
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(board29);
        int int35 = board29.getSize();
        boolean boolean36 = board29.moveUp();
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board38 = new ar.edu.unrc.game2048.Board(board37);
        boolean boolean39 = board37.isWinningBoard();
        boolean boolean40 = board37.moveDown();
        ar.edu.unrc.game2048.Cell cell44 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell45 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int46 = cell45.getValue();
        int int47 = cell45.getValue();
        boolean boolean48 = cell45.isEmpty();
        boolean boolean49 = cell44.canMergeWith(cell45);
        board37.setCell((int) (short) 0, (int) (byte) 1, cell45);
        ar.edu.unrc.game2048.Board.Direction direction51 = ar.edu.unrc.game2048.Board.Direction.UP;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult52 = ar.edu.unrc.game2048.Movement.move(board37, direction51);
        ar.edu.unrc.game2048.Movement.MoveResult moveResult53 = ar.edu.unrc.game2048.Movement.move(board29, direction51);
        ar.edu.unrc.game2048.Movement.MoveResult moveResult54 = ar.edu.unrc.game2048.Movement.move(board15, direction51);
        boolean boolean55 = position2.equals((java.lang.Object) direction51);
        int int56 = position2.row;
        int int57 = position2.col;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 100)" + "'", str3, "(100, 100)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(100, 100)" + "'", str5, "(100, 100)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + direction25 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction25.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult26);
        org.junit.Assert.assertNotNull(board27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(cell45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + direction51 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction51.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertNotNull(moveResult52);
        org.junit.Assert.assertNotNull(moveResult53);
        org.junit.Assert.assertNotNull(moveResult54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 100 + "'", int57 == 100);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveUp();
        boolean boolean5 = board0.equals((java.lang.Object) '#');
        boolean boolean6 = board0.moveRight();
        boolean boolean7 = board0.isLosingBoard();
        boolean boolean8 = board0.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        boolean boolean2 = board0.moveDown();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Direction direction4 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult5 = ar.edu.unrc.game2048.Movement.move(board3, direction4);
        int int6 = moveResult5.scoreDelta;
        ar.edu.unrc.game2048.Board board7 = moveResult5.board;
        int int8 = moveResult5.scoreDelta;
        int int9 = moveResult5.scoreDelta;
        ar.edu.unrc.game2048.Board board10 = moveResult5.board;
        boolean boolean11 = board10.moveLeft();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean14 = board12.isWinningBoard();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board12);
        int int16 = board12.getScore();
        boolean boolean17 = board12.hasEmptyCells();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet18 = board12.getEmptyPositions();
        ar.edu.unrc.game2048.Board.Direction direction19 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult20 = ar.edu.unrc.game2048.Movement.move(board12, direction19);
        ar.edu.unrc.game2048.Movement.MoveResult moveResult21 = ar.edu.unrc.game2048.Movement.move(board10, direction19);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction4.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(board7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(board10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(positionSet18);
        org.junit.Assert.assertTrue("'" + direction19 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction19.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertNotNull(moveResult20);
        org.junit.Assert.assertNotNull(moveResult21);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveDown();
        ar.edu.unrc.game2048.Cell cell7 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int9 = cell8.getValue();
        int int10 = cell8.getValue();
        boolean boolean11 = cell8.isEmpty();
        boolean boolean12 = cell7.canMergeWith(cell8);
        board0.setCell((int) (short) 0, (int) (byte) 1, cell8);
        ar.edu.unrc.game2048.Cell cell14 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int15 = cell14.getValue();
        java.lang.String str16 = cell14.toString();
        java.lang.String str17 = cell14.toString();
        ar.edu.unrc.game2048.Cell cell18 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int19 = cell18.getValue();
        ar.edu.unrc.game2048.Cell cell20 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int21 = cell20.getValue();
        java.lang.String str22 = cell20.toString();
        java.lang.String str23 = cell20.toString();
        boolean boolean24 = cell18.canMergeWith(cell20);
        boolean boolean25 = cell14.canMergeWith(cell18);
        boolean boolean26 = cell8.canMergeWith(cell18);
        boolean boolean27 = cell8.isEmpty();
        ar.edu.unrc.game2048.Board.Position position30 = new ar.edu.unrc.game2048.Board.Position((-1), 1);
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board();
        boolean boolean32 = board31.isFull();
        boolean boolean33 = board31.moveDown();
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(board31);
        ar.edu.unrc.game2048.Board.Direction direction35 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult36 = ar.edu.unrc.game2048.Movement.move(board34, direction35);
        int int37 = moveResult36.scoreDelta;
        ar.edu.unrc.game2048.Board board38 = moveResult36.board;
        boolean boolean39 = position30.equals((java.lang.Object) moveResult36);
        boolean boolean40 = cell8.equals((java.lang.Object) moveResult36);
        ar.edu.unrc.game2048.Board board41 = moveResult36.board;
        boolean boolean42 = board41.moveLeft();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell45 = board41.getCell((int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (52, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "." + "'", str16, ".");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "." + "'", str17, ".");
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "." + "'", str22, ".");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "." + "'", str23, ".");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + direction35 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction35.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertNotNull(board38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(board41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.isWinningBoard();
        boolean boolean4 = board0.moveRight();
        boolean boolean5 = board0.isFull();
        boolean boolean6 = board0.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board0.getEmptyPositions();
        boolean boolean8 = board0.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board((int) (short) 1);
        ar.edu.unrc.game2048.Board.Direction direction2 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult3 = ar.edu.unrc.game2048.Movement.move(board1, direction2);
        ar.edu.unrc.game2048.Board board4 = moveResult3.board;
        boolean boolean5 = board4.moveUp();
        boolean boolean6 = board4.moveRight();
        org.junit.Assert.assertTrue("'" + direction2 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction2.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertNotNull(moveResult3);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.String str3 = position2.toString();
        int int4 = position2.col;
        java.lang.String str5 = position2.toString();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board6);
        boolean boolean8 = board6.isWinningBoard();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board6);
        int int10 = board6.getScore();
        boolean boolean11 = position2.equals((java.lang.Object) board6);
        java.lang.Object obj12 = null;
        boolean boolean13 = position2.equals(obj12);
        int int14 = position2.col;
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board15);
        boolean boolean17 = board15.isFull();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board18);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board18);
        boolean boolean21 = board18.isWinningBoard();
        boolean boolean22 = board18.moveRight();
        boolean boolean23 = board18.isFull();
        boolean boolean24 = board18.isFull();
        ar.edu.unrc.game2048.Board.Direction direction25 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult26 = ar.edu.unrc.game2048.Movement.move(board18, direction25);
        ar.edu.unrc.game2048.Board board27 = moveResult26.board;
        boolean boolean28 = board15.equals((java.lang.Object) board27);
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(board29);
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board(board29);
        boolean boolean32 = board29.isWinningBoard();
        boolean boolean33 = board29.moveRight();
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(board29);
        int int35 = board29.getSize();
        boolean boolean36 = board29.moveUp();
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board38 = new ar.edu.unrc.game2048.Board(board37);
        boolean boolean39 = board37.isWinningBoard();
        boolean boolean40 = board37.moveDown();
        ar.edu.unrc.game2048.Cell cell44 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell45 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int46 = cell45.getValue();
        int int47 = cell45.getValue();
        boolean boolean48 = cell45.isEmpty();
        boolean boolean49 = cell44.canMergeWith(cell45);
        board37.setCell((int) (short) 0, (int) (byte) 1, cell45);
        ar.edu.unrc.game2048.Board.Direction direction51 = ar.edu.unrc.game2048.Board.Direction.UP;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult52 = ar.edu.unrc.game2048.Movement.move(board37, direction51);
        ar.edu.unrc.game2048.Movement.MoveResult moveResult53 = ar.edu.unrc.game2048.Movement.move(board29, direction51);
        ar.edu.unrc.game2048.Movement.MoveResult moveResult54 = ar.edu.unrc.game2048.Movement.move(board15, direction51);
        boolean boolean55 = position2.equals((java.lang.Object) direction51);
        java.lang.String str56 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 100)" + "'", str3, "(100, 100)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(100, 100)" + "'", str5, "(100, 100)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + direction25 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction25.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult26);
        org.junit.Assert.assertNotNull(board27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(cell45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + direction51 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction51.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertNotNull(moveResult52);
        org.junit.Assert.assertNotNull(moveResult53);
        org.junit.Assert.assertNotNull(moveResult54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "(100, 100)" + "'", str56, "(100, 100)");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) -1, (int) (short) 100);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        java.lang.String str3 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int5 = cell4.getValue();
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int7 = cell6.getValue();
        java.lang.String str8 = cell6.toString();
        java.lang.String str9 = cell6.toString();
        boolean boolean10 = cell4.canMergeWith(cell6);
        boolean boolean11 = cell0.canMergeWith(cell4);
        int int12 = cell4.getValue();
        java.lang.String str13 = cell4.toString();
        int int14 = cell4.getValue();
        int int15 = cell4.getValue();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "." + "'", str13, ".");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isFull();
        boolean boolean4 = board0.moveRight();
        boolean boolean5 = board0.isWinningBoard();
        boolean boolean6 = board0.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board0.getEmptyPositions();
        boolean boolean8 = board0.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean4 = board3.moveRight();
        int int5 = board3.getScore();
        boolean boolean6 = board3.moveDown();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board3);
        boolean boolean8 = board7.isLosingBoard();
        boolean boolean9 = board7.hasEmptyCells();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board7);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell13 = board7.getCell(10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.isLosingBoard();
        int int4 = board0.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board0.getEmptyPositions();
        int int6 = board0.getSize();
        int int7 = board0.getSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.isWinningBoard();
        boolean boolean4 = board0.moveRight();
        boolean boolean5 = board0.isFull();
        boolean boolean6 = board0.moveUp();
        int int7 = board0.getScore();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.moveUp();
        boolean boolean3 = board0.isFull();
        boolean boolean4 = board0.isLosingBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell7 = board0.getCell(100, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 4) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 1, (int) (short) -1);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        boolean boolean2 = board0.moveDown();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Direction direction4 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult5 = ar.edu.unrc.game2048.Movement.move(board3, direction4);
        int int6 = moveResult5.scoreDelta;
        ar.edu.unrc.game2048.Board board7 = moveResult5.board;
        boolean boolean8 = board7.isFull();
        boolean boolean9 = board7.moveLeft();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board10);
        boolean boolean12 = board10.isWinningBoard();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board10);
        int int14 = board10.getScore();
        boolean boolean15 = board10.hasEmptyCells();
        boolean boolean16 = board10.isFull();
        java.lang.String str17 = board10.toString();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board18);
        boolean boolean20 = board18.isFull();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(board21);
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(board21);
        boolean boolean24 = board21.isWinningBoard();
        boolean boolean25 = board21.moveRight();
        boolean boolean26 = board21.isFull();
        boolean boolean27 = board21.isFull();
        ar.edu.unrc.game2048.Board.Direction direction28 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult29 = ar.edu.unrc.game2048.Movement.move(board21, direction28);
        ar.edu.unrc.game2048.Board board30 = moveResult29.board;
        boolean boolean31 = board18.equals((java.lang.Object) board30);
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board(board32);
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(board32);
        boolean boolean35 = board32.isWinningBoard();
        boolean boolean36 = board32.moveRight();
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board(board32);
        int int38 = board32.getSize();
        boolean boolean39 = board32.moveUp();
        ar.edu.unrc.game2048.Board board40 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board41 = new ar.edu.unrc.game2048.Board(board40);
        boolean boolean42 = board40.isWinningBoard();
        boolean boolean43 = board40.moveDown();
        ar.edu.unrc.game2048.Cell cell47 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell48 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int49 = cell48.getValue();
        int int50 = cell48.getValue();
        boolean boolean51 = cell48.isEmpty();
        boolean boolean52 = cell47.canMergeWith(cell48);
        board40.setCell((int) (short) 0, (int) (byte) 1, cell48);
        ar.edu.unrc.game2048.Board.Direction direction54 = ar.edu.unrc.game2048.Board.Direction.UP;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult55 = ar.edu.unrc.game2048.Movement.move(board40, direction54);
        ar.edu.unrc.game2048.Movement.MoveResult moveResult56 = ar.edu.unrc.game2048.Movement.move(board32, direction54);
        ar.edu.unrc.game2048.Movement.MoveResult moveResult57 = ar.edu.unrc.game2048.Movement.move(board18, direction54);
        ar.edu.unrc.game2048.Movement.MoveResult moveResult58 = ar.edu.unrc.game2048.Movement.move(board10, direction54);
        ar.edu.unrc.game2048.Movement.MoveResult moveResult59 = ar.edu.unrc.game2048.Movement.move(board7, direction54);
        ar.edu.unrc.game2048.Board board60 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean61 = board60.moveDown();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction4.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(board7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str17, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + direction28 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction28.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult29);
        org.junit.Assert.assertNotNull(board30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 4 + "'", int38 == 4);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(cell48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + direction54 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction54.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertNotNull(moveResult55);
        org.junit.Assert.assertNotNull(moveResult56);
        org.junit.Assert.assertNotNull(moveResult57);
        org.junit.Assert.assertNotNull(moveResult58);
        org.junit.Assert.assertNotNull(moveResult59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int3 = position2.col;
        int int4 = position2.row;
        int int5 = position2.col;
        ar.edu.unrc.game2048.Board.Position position8 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        boolean boolean9 = position2.equals((java.lang.Object) 100);
        java.lang.Class<?> wildcardClass10 = position2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, (int) ' ');
        int int3 = position2.row;
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board4);
        ar.edu.unrc.game2048.Board.Position position8 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int9 = position8.row;
        boolean boolean10 = board5.equals((java.lang.Object) int9);
        java.lang.String str11 = board5.toString();
        int int12 = board5.getSize();
        boolean boolean13 = board5.moveRight();
        int int14 = board5.getSize();
        boolean boolean15 = position2.equals((java.lang.Object) int14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str11, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.isLosingBoard();
        int int4 = board0.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board0.getEmptyPositions();
        java.lang.String str6 = board0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str6, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int3 = position2.col;
        java.lang.String str4 = position2.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        ar.edu.unrc.game2048.Board.Position position9 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int10 = position9.row;
        boolean boolean11 = board6.equals((java.lang.Object) int10);
        java.lang.String str12 = board6.toString();
        int int13 = board6.getSize();
        boolean boolean14 = board6.moveUp();
        int int15 = board6.getSize();
        boolean boolean16 = position2.equals((java.lang.Object) board6);
        int int17 = position2.row;
        int int18 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(100, 100)" + "'", str4, "(100, 100)");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str12, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        java.lang.String str2 = cell0.toString();
        java.lang.String str3 = cell0.toString();
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int7 = position6.col;
        int int8 = position6.col;
        boolean boolean9 = cell0.equals((java.lang.Object) position6);
        java.lang.String str10 = position6.toString();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(100, 100)" + "'", str10, "(100, 100)");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        boolean boolean1 = board0.isFull();
        boolean boolean2 = board0.moveDown();
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board0.getEmptyPositions();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board5);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean8 = board5.isWinningBoard();
        boolean boolean9 = board5.moveRight();
        boolean boolean10 = board5.isFull();
        boolean boolean11 = board5.isFull();
        ar.edu.unrc.game2048.Board.Direction direction12 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult13 = ar.edu.unrc.game2048.Movement.move(board5, direction12);
        ar.edu.unrc.game2048.Movement.MoveResult moveResult14 = ar.edu.unrc.game2048.Movement.move(board0, direction12);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + direction12 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction12.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(moveResult13);
        org.junit.Assert.assertNotNull(moveResult14);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.isFull();
        boolean boolean4 = board0.moveUp();
        int int5 = board0.getScore();
        boolean boolean6 = board0.isFull();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean9 = board7.isWinningBoard();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean11 = board10.moveRight();
        boolean boolean12 = board0.equals((java.lang.Object) board10);
        ar.edu.unrc.game2048.Board.Direction direction13 = ar.edu.unrc.game2048.Board.Direction.UP;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult14 = ar.edu.unrc.game2048.Movement.move(board0, direction13);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean16 = board15.moveDown();
        ar.edu.unrc.game2048.Cell cell19 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int20 = cell19.getValue();
        java.lang.String str21 = cell19.toString();
        boolean boolean22 = cell19.isEmpty();
        boolean boolean24 = cell19.equals((java.lang.Object) 100.0d);
        int int25 = cell19.getValue();
        java.lang.String str26 = cell19.toString();
        java.lang.String str27 = cell19.toString();
        ar.edu.unrc.game2048.Board.Position position30 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int31 = position30.row;
        boolean boolean32 = cell19.equals((java.lang.Object) position30);
        // The following exception was thrown during execution in test generation
        try {
            board15.setCell((int) (byte) -1, (int) ' ', cell19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 32) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + direction13 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction13.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertNotNull(moveResult14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "." + "'", str21, ".");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "." + "'", str26, ".");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "." + "'", str27, ".");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board1.isLosingBoard();
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int6 = position5.col;
        int int7 = position5.row;
        boolean boolean8 = board1.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.Board.Direction direction9 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult10 = ar.edu.unrc.game2048.Movement.move(board1, direction9);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board1);
        boolean boolean12 = board1.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board1.getEmptyPositions();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board((int) (short) 1);
        ar.edu.unrc.game2048.Board.Direction direction16 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        ar.edu.unrc.game2048.Movement.MoveResult moveResult17 = ar.edu.unrc.game2048.Movement.move(board15, direction16);
        ar.edu.unrc.game2048.Movement.MoveResult moveResult18 = ar.edu.unrc.game2048.Movement.move(board1, direction16);
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board1);
        java.lang.String str20 = board19.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + direction9 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction9.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertNotNull(moveResult10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + direction16 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction16.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertNotNull(moveResult17);
        org.junit.Assert.assertNotNull(moveResult18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str20, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Position position4 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int5 = position4.row;
        boolean boolean6 = board1.equals((java.lang.Object) int5);
        java.lang.String str7 = board1.toString();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board1.getEmptyPositions();
        boolean boolean9 = board1.isLosingBoard();
        boolean boolean10 = board1.isFull();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n" + "'", str7, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |    2|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board.Position position4 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        int int5 = position4.row;
        boolean boolean6 = board1.equals((java.lang.Object) int5);
        int int7 = board1.getScore();
        boolean boolean8 = board1.moveUp();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveUp();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean5 = board0.isLosingBoard();
        boolean boolean6 = board0.moveUp();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int3 = cell2.getValue();
        java.lang.String str4 = cell2.toString();
        java.lang.String str5 = cell2.toString();
        boolean boolean6 = cell0.canMergeWith(cell2);
        boolean boolean7 = cell0.isEmpty();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "." + "'", str4, ".");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "." + "'", str5, ".");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean3 = board0.isWinningBoard();
        boolean boolean4 = board0.moveRight();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(board0);
        int int6 = board0.getSize();
        boolean boolean7 = board0.isFull();
        boolean boolean8 = board0.isFull();
        boolean boolean9 = board0.moveRight();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board0);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board10);
        boolean boolean12 = board11.isWinningBoard();
        ar.edu.unrc.game2048.Board.Position position15 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (int) (byte) 1);
        boolean boolean16 = board11.equals((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.String str3 = position2.toString();
        int int4 = position2.col;
        java.lang.String str5 = position2.toString();
        java.lang.String str6 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 100)" + "'", str3, "(100, 100)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(100, 100)" + "'", str5, "(100, 100)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(100, 100)" + "'", str6, "(100, 100)");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        ar.edu.unrc.game2048.Board board0 = new ar.edu.unrc.game2048.Board();
        ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
        boolean boolean2 = board0.isWinningBoard();
        boolean boolean3 = board0.moveUp();
        boolean boolean5 = board0.equals((java.lang.Object) '#');
        boolean boolean6 = board0.moveRight();
        boolean boolean7 = board0.isLosingBoard();
        boolean boolean8 = board0.moveDown();
        ar.edu.unrc.game2048.Board.Position position11 = new ar.edu.unrc.game2048.Board.Position(2048, (int) (short) -1);
        ar.edu.unrc.game2048.Board.Position position14 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, 100);
        java.lang.String str15 = position14.toString();
        boolean boolean16 = position11.equals((java.lang.Object) str15);
        boolean boolean17 = board0.equals((java.lang.Object) str15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(100, 100)" + "'", str15, "(100, 100)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }
}

