public class LC14_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        String lCP = "";
        int currentStartingIndex = 0;

        boolean inProgress = true;
        while (true) {

            int currentIndex = currentStartingIndex;
            char previousChar = ' ';

            for (String currentStr : strs) {

                if (currentIndex >= currentStr.length()) {
                    inProgress = false;
                    break;
                }

                char currentChar = currentStr.charAt(currentIndex);

                if (previousChar == ' ' || currentChar == previousChar) {
                    previousChar = currentChar;
                } else {
                    inProgress = false;
                    break;
                }


            }

            if (!inProgress) {
                break;
            }

            currentStartingIndex += 1;

        }

        lCP = strs[0].substring(0, currentStartingIndex);

        return lCP;
    }
}
