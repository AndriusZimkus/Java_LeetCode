import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeStringsAlternately1768Test {

    @Test
    void mergeAlternately() {
        MergeStringsAlternately1768 mergeStringsAlternately1768 = new MergeStringsAlternately1768();

        // Case 1
        String word1 = "abc";
        String word2 = "pqr";

        String expected = "apbqcr";
        String result = mergeStringsAlternately1768.mergeAlternately(word1, word2);

        Assertions.assertEquals(expected, result);

        // Case 2
        word1 = "ab";
        word2 = "pqrs";

        expected = "apbqrs";
        result = mergeStringsAlternately1768.mergeAlternately(word1, word2);

        Assertions.assertEquals(expected, result);

        // Case 3
        word1 = "abcd";
        word2 = "pq";

        expected = "apbqcd";
        result = mergeStringsAlternately1768.mergeAlternately(word1, word2);

        Assertions.assertEquals(expected, result);
    }

}
