import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LC28_FirstOccurenceTest {

    LC28_FirstOccurence lC28FirstOccurence = new LC28_FirstOccurence();

    @Test
    void strStr1() {
        String haystack = "sadbutsad";
        String needle = "sad";
        Assertions.assertEquals(0, lC28FirstOccurence.strStr(haystack, needle));
    }

    @Test
    void strStr2() {
        String haystack = "leetcode";
        String needle = "leeto";
        Assertions.assertEquals(-1, lC28FirstOccurence.strStr(haystack, needle));
    }

    @Test
    void strStr3() {
        String haystack = "elempllllempa";
        String needle = "lempa";
        Assertions.assertEquals(8, lC28FirstOccurence.strStr(haystack, needle));
    }

    @Test
    void strStr4() {
        String haystack = "mississippi";
        String needle = "issip";
        int result = lC28FirstOccurence.strStr(haystack, needle);
        Assertions.assertEquals(4, result);
    }

    @Test
    void strStr5() {
        String haystack = "mississippi";
        String needle = "issipi";
        int result = lC28FirstOccurence.strStr(haystack, needle);
        Assertions.assertEquals(-1, result);
    }
}
