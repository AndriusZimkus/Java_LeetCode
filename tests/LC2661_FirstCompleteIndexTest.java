import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LC2661_FirstCompleteIndexTest {

    LC2661_FirstCompleteIndex lc2661_firstCompleteIndex = new LC2661_FirstCompleteIndex();

    @Test
    void firstCompleteIndex1() {
        int[] arr = {1, 3, 4, 2};
        int[][] mat = {{1, 4}, {2, 3}};
        int expected = 2;
        int actual = lc2661_firstCompleteIndex.firstCompleteIndex(arr, mat);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void firstCompleteIndex2() {
        int[] arr = {2, 8, 7, 4, 1, 3, 5, 6, 9};
        int[][] mat = {{3, 2, 5}, {1, 4, 6}, {8, 7, 9}};
        int expected = 3;
        int actual = lc2661_firstCompleteIndex.firstCompleteIndex(arr, mat);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void firstCompleteIndex3() {
        int[] arr = {1, 4, 5, 2, 6, 3};
        int[][] mat = {{4, 3, 5}, {1, 2, 6}};
        int expected = 1;
        int actual = lc2661_firstCompleteIndex.firstCompleteIndex(arr, mat);

        Assertions.assertEquals(expected, actual);
    }
}
