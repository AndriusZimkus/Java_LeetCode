import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SingleNumber136Test {

    SingleNumber136 singleNumber136 = new SingleNumber136();

    @Test
    void singleNumber1() {
        int[] nums = {2, 2, 1};
        Assertions.assertEquals(1, singleNumber136.singleNumber(nums));
    }

    @Test
    void singleNumber2() {
        int[] nums = {4, 1, 2, 1, 2};
        Assertions.assertEquals(4, singleNumber136.singleNumber(nums));
    }

    @Test
    void singleNumber3() {
        int[] nums = {1};
        Assertions.assertEquals(1, singleNumber136.singleNumber(nums));
    }


}
