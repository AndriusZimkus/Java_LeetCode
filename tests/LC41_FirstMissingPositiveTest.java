import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LC41_FirstMissingPositiveTest {

    LC41_FirstMissingPositive LC41FirstMissingPositive;

    @Test
    void firstMissingPositive1() {
        int[] nums = {1, 2, 0};

        Assertions.assertEquals(3, LC41FirstMissingPositive.firstMissingPositive(nums));

    }

    @Test
    void firstMissingPositive2() {
        int[] nums = {3, 4, -1, 1};

        Assertions.assertEquals(2, LC41FirstMissingPositive.firstMissingPositive(nums));

    }

    @Test
    void firstMissingPositive3() {
        int[] nums = {7, 8, 9, 10, 11};

        Assertions.assertEquals(1, LC41FirstMissingPositive.firstMissingPositive(nums));

    }

    @BeforeEach
    void setUp() {
        LC41FirstMissingPositive = new LC41_FirstMissingPositive();
    }
}
