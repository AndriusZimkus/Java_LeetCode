import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RegularExpressionMatching10Test {

    @Test
    void isMatch() {
        RegularExpressionMatching10 regularExpressionMatching10 = new RegularExpressionMatching10();

        // Case 1
        String input = "aa";
        String pattern = "a";

        boolean expected = false;
        boolean result = regularExpressionMatching10.isMatch(input, pattern);

        Assertions.assertEquals(expected, result);

        // Case 2
        input = "aa";
        pattern = "a*";

        expected = true;
        result = regularExpressionMatching10.isMatch(input, pattern);

        Assertions.assertEquals(expected, result);

        // Case 3
        input = "ab";
        pattern = ".*";

        expected = true;
        result = regularExpressionMatching10.isMatch(input, pattern);

        Assertions.assertEquals(expected, result);
    }
}
