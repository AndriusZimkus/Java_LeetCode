public class RegularExpressionMatching10 {
    public boolean isMatch(String s, String p) {

//        int patternLength = p.length();
//
//        char currentPatternCharacter = ' ';
//        char nextPatternCharacter = ' ';
//        boolean manyCharsProcess = false;
//        int patternIndex = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            currentPatternCharacter = p.charAt(patternIndex);
//
//            if (patternIndex < p.length() - 1) {
//                nextPatternCharacter = p.charAt(patternIndex + 1);
//            }
//
//            manyCharsProcess = nextPatternCharacter == '*';
//
//            if (manyCharsProcess) {
//                char currentCharToMatch = s.charAt(i);
//
//                for (int j = i; j < s.length(); j++) {
//                    if (s.charAt(j) == currentCharToMatch) {
//                        i++;
//                    } else {
//                        break;
//                    }
//                }
//                patternIndex += 1;
//
//            } else {
//                if (currentPatternCharacter != '.' && currentPatternCharacter != s.charAt(i)) {
//                    return false;
//                }
//
//                patternIndex += 1;
//            }
//
//
//            if (patternIndex >= p.length()) {
//                return false;
//            }
//
//        }

        return true;
    }
}
