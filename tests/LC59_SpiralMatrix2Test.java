import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LC59_SpiralMatrix2Test {

    LC59_SpiralMatrix2 lc59_spiralMatrix2 = new LC59_SpiralMatrix2();

    @Test
    void generateMatrix3() {
        int n = 3;
        int[][] expected = {{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};
        int[][] actual = lc59_spiralMatrix2.generateMatrix(n);

        for (int i = 0; i < n; i++) {
            Assertions.assertArrayEquals(expected[i], actual[i]);
        }

    }

    @Test
    void generateMatrix1() {
        int n = 1;
        int[][] expected = {{1}};
        int[][] actual = lc59_spiralMatrix2.generateMatrix(n);

        for (int i = 0; i < n; i++) {
            Assertions.assertArrayEquals(expected[i], actual[i]);
        }


    }
}
