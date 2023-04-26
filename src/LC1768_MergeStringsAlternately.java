public class LC1768_MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder alternatingLetters = new StringBuilder();

        int word1Length = word1.length();
        int word2Length = word2.length();

        int longerWordLength = (word1Length > word2Length ? word1Length : word2Length);

        for (int i = 0; i < longerWordLength; i++) {
            if (i < word1Length) {
                alternatingLetters.append(word1.charAt(i));
            }
            if (i < word2Length) {
                alternatingLetters.append(word2.charAt(i));
            }

        }

        return alternatingLetters.toString();
    }
}
