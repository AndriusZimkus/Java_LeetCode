public class LC5_LongestPalindromicSubstring {
    public String longestPalindrome(String s) {

        if (s.length() == 1) {
            return String.valueOf(s.charAt(0));
        }
        if (s.length() == 2 && s.charAt(0) == s.charAt(1)) {
            return s;
        }

        int lo = 0;
        int hi = 0;

        for (int i = 1; i < s.length(); i++) {
            int currentLo = i;
            int currentHi = i;

            // Odd case
            while (true) {
                currentLo -= 1;
                currentHi += 1;
                if (currentLo >= 0 && currentHi < s.length() && s.charAt(currentLo) == s.charAt(currentHi)) {
                    if ((currentHi - currentLo) > (hi - lo)) {
                        lo = currentLo;
                        hi = currentHi;
                    }
                } else break;

            }

            currentLo = i - 1;
            currentHi = i;
            // Even case
            while (true) {

                if (currentLo >= 0 && currentHi < s.length() && s.charAt(currentLo) == s.charAt(currentHi)) {
                    if ((currentHi - currentLo) > (hi - lo)) {
                        lo = currentLo;
                        hi = currentHi;
                    }
                    currentLo -= 1;
                    currentHi += 1;
                    continue;
                } else break;

            }
        }


        return s.substring(lo, hi + 1);

    }
}
