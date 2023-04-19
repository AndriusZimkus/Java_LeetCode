import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RegularExpressionMatching10Test {

    RegularExpressionMatching10 regularExpressionMatching10;


    @BeforeEach
    void setUp() {
        regularExpressionMatching10 = new RegularExpressionMatching10();
    }

    @Test
    void isMatch1() {
        Assertions.assertEquals(false, regularExpressionMatching10.isMatch("aa", "a"));
    }

    @Test
    void isMatch2() {
        Assertions.assertEquals(true, regularExpressionMatching10.isMatch("aa", "a*"));
    }

    @Test
    void isMatch3() {
        Assertions.assertEquals(true, regularExpressionMatching10.isMatch("ab", ".*"));
    }

    @Test
    void isMatch4() {
        Assertions.assertEquals(true, regularExpressionMatching10.isMatch("mississippi", "mis*is*ip*."));
    }

    @Test
    void isMatch5() {
        Assertions.assertEquals(false, regularExpressionMatching10.isMatch("mississippi", "mis*is*p*."));
    }

    @Test
    void isMatch6() {
        Assertions.assertEquals(false, regularExpressionMatching10.isMatch("ab", ".*c"));
    }

    @Test
    void isMatch7() {
        Assertions.assertEquals(false, regularExpressionMatching10.isMatch("aaa", "ab*a"));
    }

    @Test
    void isMatch8() {
        Assertions.assertEquals(true, regularExpressionMatching10.isMatch("aaa", "a*a"));
    }

    @Test
    void isMatch9() {
        Assertions.assertEquals(true, regularExpressionMatching10.isMatch("a", "ab*"));
    }


}
