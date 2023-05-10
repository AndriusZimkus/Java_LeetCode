import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class LC54_SpiralMatrixTest {

    LC54_SpiralMatrix lc54_spiralMatrix = new LC54_SpiralMatrix();

    @Test
    void spiralOrder1() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> expected = new ArrayList<>(List.of(1, 2, 3, 6, 9, 8, 7, 4, 5));

        List<Integer> actual = lc54_spiralMatrix.spiralOrder(matrix);

        Assertions.assertIterableEquals(expected, actual);


    }

    @Test
    void spiralOrder2() {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        List<Integer> expected = new ArrayList<>(List.of(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7));

        List<Integer> actual = lc54_spiralMatrix.spiralOrder(matrix);

        Assertions.assertIterableEquals(expected, actual);


    }

    @Test
    void spiralOrder3() {
        int[][] matrix = {{1}};
        List<Integer> expected = new ArrayList<>(List.of(1));

        List<Integer> actual = lc54_spiralMatrix.spiralOrder(matrix);

        Assertions.assertIterableEquals(expected, actual);

    }

    @Test
    void spiralOrder4() {
        int[][] matrix = {{1, 2, 3, 4, 5}};
        List<Integer> expected = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        List<Integer> actual = lc54_spiralMatrix.spiralOrder(matrix);

        Assertions.assertIterableEquals(expected, actual);

    }

    @Test
    void spiralOrder5() {
        int[][] matrix = {{1}, {2}, {3}, {4}, {5}};
        List<Integer> expected = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        List<Integer> actual = lc54_spiralMatrix.spiralOrder(matrix);

        Assertions.assertIterableEquals(expected, actual);

    }
}
