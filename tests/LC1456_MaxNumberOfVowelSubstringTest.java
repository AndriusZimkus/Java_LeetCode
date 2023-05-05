import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LC1456_MaxNumberOfVowelSubstringTest {

    LC1456_MaxNumberOfVowelSubstring lc1456_maxNumberOfVowelSubstring = new LC1456_MaxNumberOfVowelSubstring();

    @Test
    void maxVowels1() {
        String s = "abciiidef";
        int k = 3;
        int expected = 3;
        int actual = lc1456_maxNumberOfVowelSubstring.maxVowels(s, k);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxVowels2() {
        String s = "aeiou";
        int k = 2;
        int expected = 2;
        int actual = lc1456_maxNumberOfVowelSubstring.maxVowels(s, k);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxVowels3() {
        String s = "leetcode";
        int k = 3;
        int expected = 2;
        int actual = lc1456_maxNumberOfVowelSubstring.maxVowels(s, k);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxVowels4() {
        String s = "a";
        int k = 3;
        int expected = 1;
        int actual = lc1456_maxNumberOfVowelSubstring.maxVowels(s, k);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxVowels5() {
        String s = "baaaa";
        int k = 5;
        int expected = 4;
        int actual = lc1456_maxNumberOfVowelSubstring.maxVowels(s, k);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxVowels6() {
        String s = "bbaaaa";
        int k = 5;
        int expected = 4;
        int actual = lc1456_maxNumberOfVowelSubstring.maxVowels(s, k);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxVowels7() {
        String s = "bba";
        int k = 4;
        int expected = 1;
        int actual = lc1456_maxNumberOfVowelSubstring.maxVowels(s, k);

        Assertions.assertEquals(expected, actual);
    }
}
