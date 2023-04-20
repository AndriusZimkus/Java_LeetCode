import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FirstMissingPositive41Test {

    FirstMissingPositive41 firstMissingPositive41;

    @Test
    void firstMissingPositive1() {
        int[] nums = {1, 2, 0};

        Assertions.assertEquals(3, firstMissingPositive41.firstMissingPositive(nums));

    }

    @Test
    void firstMissingPositive2() {
        int[] nums = {3, 4, -1, 1};

        Assertions.assertEquals(2, firstMissingPositive41.firstMissingPositive(nums));

    }

    @Test
    void firstMissingPositive3() {
        int[] nums = {7, 8, 9, 10, 11};

        Assertions.assertEquals(1, firstMissingPositive41.firstMissingPositive(nums));

    }

    @BeforeEach
    void setUp() {
        firstMissingPositive41 = new FirstMissingPositive41();
    }
}
