import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LC14_LongestCommonPrefixTest {

    LC14_LongestCommonPrefix lc14_longestCommonPrefix = new LC14_LongestCommonPrefix();

    @Test
    void longestCommonPrefix1() {
        String[] strs = {"flower", "flow", "flight"};

        String expected = "fl";
        String actual = lc14_longestCommonPrefix.longestCommonPrefix(strs);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void longestCommonPrefix2() {
        String[] strs = {"dog", "racecar", "car"};

        String expected = "";
        String actual = lc14_longestCommonPrefix.longestCommonPrefix(strs);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void longestCommonPrefix3() {
        String[] strs = {"aaa", "aaaaa", "aaaa"};

        String expected = "aaa";
        String actual = lc14_longestCommonPrefix.longestCommonPrefix(strs);

        Assertions.assertEquals(expected, actual);

    }
}
