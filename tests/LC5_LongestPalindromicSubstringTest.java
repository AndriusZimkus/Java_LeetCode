import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LC5_LongestPalindromicSubstringTest {

    LC5_LongestPalindromicSubstring lc5_longestPalindromicSubstring = new LC5_LongestPalindromicSubstring();

    @Test
    void longestPalindrome1() {
        String s = "babad";
        String expected = "bab";
        String actual = lc5_longestPalindromicSubstring.longestPalindrome(s);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void longestPalindrome2() {
        String s = "cbbd";
        String expected = "bb";
        String actual = lc5_longestPalindromicSubstring.longestPalindrome(s);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void longestPalindrome3() {
        String s = "cdadbdad";
        String expected = "dadbdad";
        String actual = lc5_longestPalindromicSubstring.longestPalindrome(s);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void longestPalindrome4() {
        String s = "bb";
        String expected = "bb";
        String actual = lc5_longestPalindromicSubstring.longestPalindrome(s);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void longestPalindrome5() {
        String s = "ccd";
        String expected = "cc";
        String actual = lc5_longestPalindromicSubstring.longestPalindrome(s);

        Assertions.assertEquals(expected, actual);

    }
}
