public class LC28_FirstOccurence {
    public int strStr(String haystack, String needle) {

        if (needle.length() > haystack.length()) {
            return -1;
        }

        for (int i = 0; i < haystack.length(); i++) {

//            int numberToJump = 0;
            for (int j = 0; j < needle.length(); j++) {
                if (i + j >= haystack.length()) {
                    return -1;
                }
                if (needle.charAt(j) != haystack.charAt(i + j)) {
//                    numberToJump = j;
                    break;
                }

                if (j == needle.length() - 1) {
                    return i;
                }

            }

//            i += numberToJump;

        }

        return -1;
    }
}
