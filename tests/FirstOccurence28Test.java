import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FirstOccurence28Test {

    FirstOccurence28 firstOccurence28 = new FirstOccurence28();

    @Test
    void strStr1() {
        String haystack = "sadbutsad";
        String needle = "sad";
        Assertions.assertEquals(0, firstOccurence28.strStr(haystack, needle));
    }

    @Test
    void strStr2() {
        String haystack = "leetcode";
        String needle = "leeto";
        Assertions.assertEquals(-1, firstOccurence28.strStr(haystack, needle));
    }

    @Test
    void strStr3() {
        String haystack = "elempllllempa";
        String needle = "lempa";
        Assertions.assertEquals(8, firstOccurence28.strStr(haystack, needle));
    }

    @Test
    void strStr4() {
        String haystack = "mississippi";
        String needle = "issip";
        int result = firstOccurence28.strStr(haystack, needle);
        Assertions.assertEquals(4, result);
    }
    
    @Test
    void strStr5() {
        String haystack = "mississippi";
        String needle = "issipi";
        int result = firstOccurence28.strStr(haystack, needle);
        Assertions.assertEquals(-1, result);
    }
}
