import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LC3_LongestSubstringTest {

    LC3_LongestSubstring lc3LongestSubstring = new LC3_LongestSubstring();

    @Test
    void lengthOfLongestSubstring1() {
        String s = "abcabcbb";
        int expected = 3;
        int actual = lc3LongestSubstring.lengthOfLongestSubstring(s);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void lengthOfLongestSubstring2() {
        String s = "bbbbb";
        int expected = 1;
        int actual = lc3LongestSubstring.lengthOfLongestSubstring(s);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void lengthOfLongestSubstring3() {
        String s = "pwwkew";
        int expected = 3;
        int actual = lc3LongestSubstring.lengthOfLongestSubstring(s);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void lengthOfLongestSubstring4() {
        String s = "abcdbefg";
        int expected = 6;
        int actual = lc3LongestSubstring.lengthOfLongestSubstring(s);

        Assertions.assertEquals(expected, actual);
    }
}
