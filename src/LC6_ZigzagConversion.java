import java.util.HashMap;

public class LC6_ZigzagConversion {
    public String convert(String s, int numRows) {

        if (numRows == 1) {
            return s;
        }

        HashMap<Integer, String> rowStrings = new HashMap<>();
        int currentRow = 1;
        boolean incUp = true;

        String newValue = "";
        for (int i = 0; i < s.length(); i++) {

            String currentString = String.valueOf(s.charAt(i));
            if (rowStrings.containsKey(currentRow)) {
                rowStrings.put(currentRow, rowStrings.get(currentRow) + currentString);
            } else rowStrings.put(currentRow, currentString);

            if (incUp) {
                currentRow += 1;
                if (currentRow > numRows) {
                    incUp = false;
                    currentRow -= 2;

                }
            } else {
                currentRow -= 1;
                if (currentRow == 0) {
                    incUp = true;
                    currentRow += 2;
                }
            }

        }

        String result = "";
        for (int i = 1; i <= numRows; i++) {
            if (rowStrings.containsKey(i)) {
                result += rowStrings.get(i);
            } else break;

        }

        return result;
    }
}
