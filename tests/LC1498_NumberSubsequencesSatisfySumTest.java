import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LC1498_NumberSubsequencesSatisfySumTest {

    LC1498_NumberSubsequencesSatisfySum lc1498_numberSubsequencesSatisfySum = new LC1498_NumberSubsequencesSatisfySum();

    @Test
    void numSubseq1() {
        int[] nums = {3, 5, 6, 7};
        int target = 9;
        int expected = 4;
        int actual = lc1498_numberSubsequencesSatisfySum.numSubseq(nums, target);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void numSubseq2() {
        int[] nums = {3, 3, 6, 8};
        int target = 10;
        int expected = 6;
        int actual = lc1498_numberSubsequencesSatisfySum.numSubseq(nums, target);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void numSubseq3() {
        int[] nums = {2, 3, 3, 4, 6, 7};
        int target = 12;
        int expected = 61;
        int actual = lc1498_numberSubsequencesSatisfySum.numSubseq(nums, target);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void numSubseq4() {
        int[] nums = {1, 2, 3, 5, 1, 2};
        int target = 5;
        int expected = 9;
        int actual = lc1498_numberSubsequencesSatisfySum.numSubseq(nums, target);

        Assertions.assertEquals(expected, actual);
    }
}
