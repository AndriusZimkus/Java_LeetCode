import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LC2466_CountGoodStringsTest {

    LC2466_CountGoodStrings lc2466_countGoodStrings = new LC2466_CountGoodStrings();

    @Test
    void countGoodStrings1() {
        int low = 3, high = 3, zero = 1, one = 1;
        int expected = 8;
        int actual = lc2466_countGoodStrings.countGoodStrings(low, high, zero, one);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void countGoodStrings2() {
        int low = 2, high = 3, zero = 1, one = 2;
        int expected = 5;
        int actual = lc2466_countGoodStrings.countGoodStrings(low, high, zero, one);

        Assertions.assertEquals(expected, actual);
    }
}
