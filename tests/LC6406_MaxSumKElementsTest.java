import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LC6406_MaxSumKElementsTest {

    LC6406_MaxSumKElements lc6406_maxSumKElements = new LC6406_MaxSumKElements();

    @Test
    void maximizeSum1() {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;
        int expected = 18;
        int actual = lc6406_maxSumKElements.maximizeSum(nums, k);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maximizeSum2() {
        int[] nums = {5, 5, 5};
        int k = 2;
        int expected = 11;
        int actual = lc6406_maxSumKElements.maximizeSum(nums, k);

        Assertions.assertEquals(expected, actual);
    }
}
