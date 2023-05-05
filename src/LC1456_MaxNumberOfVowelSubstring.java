public class LC1456_MaxNumberOfVowelSubstring {

    /**
     * Sliding window implementation
     *
     * @param s
     * @param k
     * @return int - Max count of vowels in given substring length
     */
    public int maxVowels(String s, int k) {

        int currentVowelCount = 0;
        int maxVowelCount = 0;
        for (int i = 0; i < k && i < s.length(); i++) {
            currentVowelCount += isCharVowel(s.charAt(i));
        }
        maxVowelCount = currentVowelCount;

        for (int i = k; i < s.length(); i++) {
            currentVowelCount = currentVowelCount - isCharVowel(s.charAt(i - k)) + isCharVowel(s.charAt(i));
            maxVowelCount = Math.max(currentVowelCount, maxVowelCount);
            if (maxVowelCount == k) {
                return maxVowelCount;
            }
        }


        return maxVowelCount;
    }

    private int isCharVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return 1;
        }
        return 0;
    }
}
