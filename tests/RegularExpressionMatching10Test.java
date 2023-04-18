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

        // Case 4
        input = "mississippi";
        pattern = "mis*is*ip*.";

        expected = true;
        result = regularExpressionMatching10.isMatch(input, pattern);

        Assertions.assertEquals(expected, result);

        // Case 5
        input = "mississippi";
        pattern = "mis*is*p*.";

        expected = false;
        result = regularExpressionMatching10.isMatch(input, pattern);

        Assertions.assertEquals(expected, result);

        // Case 6
        input = "ab";
        pattern = ".*c";

        expected = false;
        result = regularExpressionMatching10.isMatch(input, pattern);

        Assertions.assertEquals(expected, result);

        // Case 7
        input = "aaa";
        pattern = "ab*a";

        expected = false;
        result = regularExpressionMatching10.isMatch(input, pattern);

        Assertions.assertEquals(expected, result);

        // Case 8
        input = "aaa";
        pattern = "a*a";

        expected = true;
        result = regularExpressionMatching10.isMatch(input, pattern);

        Assertions.assertEquals(expected, result);


    }
}
