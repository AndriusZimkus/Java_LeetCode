import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LC2656_MaxSumKElementsTest {

    LC2656_MaxSumKElements lc2656_maxSumKElements = new LC2656_MaxSumKElements();

    @Test
    void maximizeSum1() {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;
        int expected = 18;
        int actual = lc2656_maxSumKElements.maximizeSum(nums, k);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maximizeSum2() {
        int[] nums = {5, 5, 5};
        int k = 2;
        int expected = 11;
        int actual = lc2656_maxSumKElements.maximizeSum(nums, k);

        Assertions.assertEquals(expected, actual);
    }
}
