import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LC10_RegularExpressionMatchingTest {

    LC10_RegularExpressionMatching lC10RegularExpressionMatching;


    @BeforeEach
    void setUp() {
        lC10RegularExpressionMatching = new LC10_RegularExpressionMatching();
    }

    @Test
    void isMatch1() {
        Assertions.assertEquals(false, lC10RegularExpressionMatching.isMatch("aa", "a"));
    }

    @Test
    void isMatch2() {
        Assertions.assertEquals(true, lC10RegularExpressionMatching.isMatch("aa", "a*"));
    }

    @Test
    void isMatch3() {
        Assertions.assertEquals(true, lC10RegularExpressionMatching.isMatch("ab", ".*"));
    }

    @Test
    void isMatch4() {
        Assertions.assertEquals(true, lC10RegularExpressionMatching.isMatch("mississippi", "mis*is*ip*."));
    }

    @Test
    void isMatch5() {
        Assertions.assertEquals(false, lC10RegularExpressionMatching.isMatch("mississippi", "mis*is*p*."));
    }

    @Test
    void isMatch6() {
        Assertions.assertEquals(false, lC10RegularExpressionMatching.isMatch("ab", ".*c"));
    }

    @Test
    void isMatch7() {
        Assertions.assertEquals(false, lC10RegularExpressionMatching.isMatch("aaa", "ab*a"));
    }

    @Test
    void isMatch8() {
        Assertions.assertEquals(true, lC10RegularExpressionMatching.isMatch("aaa", "a*a"));
    }

    @Test
    void isMatch9() {
        Assertions.assertEquals(true, lC10RegularExpressionMatching.isMatch("a", "ab*"));
    }


}
