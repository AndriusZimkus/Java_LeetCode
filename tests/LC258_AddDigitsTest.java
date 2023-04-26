import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LC258_AddDigitsTest {

    LC258_AddDigits lc258_addDigits = new LC258_AddDigits();

    @Test
    void addDigits1() {
        int num = 38;
        int result = lc258_addDigits.addDigits(num);

        Assertions.assertEquals(2, result);
    }

    @Test
    void addDigits2() {
        int num = 0;
        int result = lc258_addDigits.addDigits(num);

        Assertions.assertEquals(0, result);
    }
}
