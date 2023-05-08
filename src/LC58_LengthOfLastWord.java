public class LC58_LengthOfLastWord {
    public int lengthOfLastWord(String s) {

        int n = s.length();

        if (n == 1) {
            if (s.equals(" ")) {
                return 0;
            } else return 1;
        }

        boolean hasStarted = false;
        int result = 0;

        for (int i = n - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            if (currentChar != ' ' && !hasStarted) {
                hasStarted = true;
            } else if (currentChar == ' ' && hasStarted) {
                return result;
            }
            if (currentChar != ' ') {
                result += 1;
            }

        }
        return result;
    }
}
