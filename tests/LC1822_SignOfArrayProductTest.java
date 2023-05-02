import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LC1822_SignOfArrayProductTest {

    LC1822_SignOfArrayProduct lc1822_signOfArrayProduct = new LC1822_SignOfArrayProduct();

    @Test
    void arraySign1() {
        int[] nums = {-1, -2, -3, -4, 3, 2, 1};
        int expected = 1;
        int actual = lc1822_signOfArrayProduct.arraySign(nums);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void arraySign2() {
        int[] nums = {1, 5, 0, 2, -3};
        int expected = 0;
        int actual = lc1822_signOfArrayProduct.arraySign(nums);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void arraySign3() {
        int[] nums = {-1, 1, -1, 1, -1};
        int expected = -1;
        int actual = lc1822_signOfArrayProduct.arraySign(nums);

        Assertions.assertEquals(expected, actual);

    }
}
