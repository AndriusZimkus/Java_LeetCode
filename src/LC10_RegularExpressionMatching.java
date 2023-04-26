public class LC10_RegularExpressionMatching {
    public boolean isMatch(String s, String p) {

        // Solution from problem editorial

        // If both pattern and string is empty - it is end of search, it is correct
        // If only pattern is empty, there is still string left - not good
        if (p.isEmpty()) {
            return s.isEmpty();
        }

        boolean doesFirstMatch = (!s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.'));

        if (p.length() >= 2 && p.charAt(1) == '*') {
            // Zero or multiple characters process
            // It is ok if first is match and continuing with pattern in the same place
            // or if pattern after Kleene star matches string
            return (doesFirstMatch && isMatch(s.substring(1), p)) || isMatch(s, p.substring(2));
        } else {
            // Just go further one step
            return doesFirstMatch && isMatch(s.substring(1), p.substring(1));
        }

    }
}
