import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LC1799_MaxScoreNOperationsTest {

    LC1799_MaxScoreNOperations lc1799_maxScoreNOperations = new LC1799_MaxScoreNOperations();

    @Test
    void maxScore1() {
        int[] nums = {1, 2};
        int expected = 1;
        int actual = lc1799_maxScoreNOperations.maxScore(nums);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxScore2() {
        int[] nums = {3, 4, 6, 8};
        int expected = 11;
        int actual = lc1799_maxScoreNOperations.maxScore(nums);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxScore3() {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int expected = 14;
        int actual = lc1799_maxScoreNOperations.maxScore(nums);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxScore4() {
        int[] nums = {1, 2, 3, 4, 15, 17};
        int expected = 14;
        int actual = lc1799_maxScoreNOperations.maxScore(nums);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxScore5() {
        int[] nums = {697035, 181412, 384958, 575458};
        int expected = 869;
        int actual = lc1799_maxScoreNOperations.maxScore(nums);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxScore6() {
        // Case 69
        int[] nums = {109497, 983516, 698308, 409009, 310455, 528595, 524079, 18036, 341150, 641864, 913962, 421869, 943382, 295019};
        int expected = 527;
        int actual = lc1799_maxScoreNOperations.maxScore(nums);

        Assertions.assertEquals(expected, actual);
    }
}
