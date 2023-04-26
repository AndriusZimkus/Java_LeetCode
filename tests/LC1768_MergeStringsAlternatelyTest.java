import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LC1768_MergeStringsAlternatelyTest {

    @Test
    void mergeAlternately() {
        LC1768_MergeStringsAlternately LC1768MergeStringsAlternately = new LC1768_MergeStringsAlternately();

        // Case 1
        String word1 = "abc";
        String word2 = "pqr";

        String expected = "apbqcr";
        String result = LC1768MergeStringsAlternately.mergeAlternately(word1, word2);

        Assertions.assertEquals(expected, result);

        // Case 2
        word1 = "ab";
        word2 = "pqrs";

        expected = "apbqrs";
        result = LC1768MergeStringsAlternately.mergeAlternately(word1, word2);

        Assertions.assertEquals(expected, result);

        // Case 3
        word1 = "abcd";
        word2 = "pq";

        expected = "apbqcd";
        result = LC1768MergeStringsAlternately.mergeAlternately(word1, word2);

        Assertions.assertEquals(expected, result);
    }

}
