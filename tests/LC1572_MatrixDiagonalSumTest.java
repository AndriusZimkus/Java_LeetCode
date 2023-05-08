import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LC1572_MatrixDiagonalSumTest {

    LC1572_MatrixDiagonalSum lc1572_matrixDiagonalSum = new LC1572_MatrixDiagonalSum();

    @Test
    void diagonalSum1() {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int expected = 25;
        int actual = lc1572_matrixDiagonalSum.diagonalSum(mat);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void diagonalSum2() {
        int[][] mat = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        int expected = 8;
        int actual = lc1572_matrixDiagonalSum.diagonalSum(mat);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void diagonalSum3() {
        int[][] mat = {{5}};
        int expected = 5;
        int actual = lc1572_matrixDiagonalSum.diagonalSum(mat);

        Assertions.assertEquals(expected, actual);

    }
}
