public class RegularExpressionMatching10 {
    public boolean isMatch(String s, String p) {

        int patternLength = p.length();

        char currentPatternCharacter = ' ';
        char nextPatternCharacter = ' ';
        char subsequentPatternCharacter = ' ';
        boolean manyCharsProcess = false;
        int patternIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            currentPatternCharacter = p.charAt(patternIndex);

            if (patternIndex < p.length() - 1) {
                nextPatternCharacter = p.charAt(patternIndex + 1);
            } else {
                nextPatternCharacter = ' ';
            }

            manyCharsProcess = nextPatternCharacter == '*';

            if (manyCharsProcess) {
                char currentCharToMatch = p.charAt(patternIndex);
                if (patternIndex < p.length() - 2) {
                    subsequentPatternCharacter = p.charAt(patternIndex + 2);
                } else {
                    subsequentPatternCharacter = ' ';
                }

//                int currentCharIndex = i;
                for (int j = i; j < s.length(); j++) {
                    boolean isCurrentCharOk;

                    if (currentCharToMatch == '.' || currentCharToMatch == s.charAt(j)) {
                        isCurrentCharOk = true;
                    } else if (s.charAt(i) != subsequentPatternCharacter && subsequentPatternCharacter != '.') {
                        return false;
                    } else {
                        i--;
                        break;
                    }
                    i++;
                    if (i < s.length() && s.charAt(i) == subsequentPatternCharacter) {
                        i--;
                        break;
                    }
                }

                patternIndex += 2;

            } else {
                if (currentPatternCharacter != '.' && currentPatternCharacter != s.charAt(i)) {
                    return false;
                }

                patternIndex += 1;
            }


            if (patternIndex >= p.length()) {

                if (i < s.length() - 1) {
                    return false;
                } else {
                    return true;
                }

            }

        }

        return false;
    }
}
