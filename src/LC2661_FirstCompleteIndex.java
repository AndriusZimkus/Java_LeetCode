import java.util.HashMap;

public class LC2661_FirstCompleteIndex {
    public int firstCompleteIndex(int[] arr, int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;
        HashMap<Integer, Integer> rowCounts = new HashMap<>();
        HashMap<Integer, Integer> columnCounts = new HashMap<>();
        HashMap<Integer, Integer> valueRows = new HashMap<>();
        HashMap<Integer, Integer> valueColumns = new HashMap<>();


        for (int j = 0; j < n; j++) {
            for (int k = 0; k < m; k++) {
                int currentValue = mat[j][k];

                valueRows.put(currentValue, j);
                valueColumns.put(currentValue, k);

            }

        }

        for (int i = 0; i < arr.length; i++) {
            int currentValue = arr[i];
            int currentRow = valueRows.get(currentValue);
            int currentColumn = valueColumns.get(currentValue);

            if (rowCounts.containsKey(currentRow)) {
                rowCounts.put(currentRow, rowCounts.get(currentRow) + 1);
            } else rowCounts.put(currentRow, 1);

            if (columnCounts.containsKey(currentColumn)) {
                columnCounts.put(currentColumn, columnCounts.get(currentColumn) + 1);
            } else columnCounts.put(currentColumn, 1);

            if (rowCounts.get(currentRow) == m || columnCounts.get(currentColumn) == n) {
                return i;
            }

        }
        return 0;
    }

    public int firstCompleteIndexSecondAttempt(int[] arr, int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;
        HashMap<Integer, Integer> rowCounts = new HashMap<>();
        HashMap<Integer, Integer> columnCounts = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int currentValue = arr[i];
            boolean isFound = false;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (mat[j][k] == currentValue) {

                        // Add to row and column counts
                        if (rowCounts.containsKey(j)) {
                            rowCounts.put(j, rowCounts.get(j) + 1);
                        } else rowCounts.put(j, 1);

                        if (columnCounts.containsKey(k)) {
                            columnCounts.put(k, columnCounts.get(k) + 1);
                        } else columnCounts.put(k, 1);


                        if (rowCounts.get(j) == m || columnCounts.get(k) == n) {
                            return i;
                        }

                        isFound = true;
                        break;
                    }
                }
                if (isFound) {
                    break;
                }
            }


        }
        return 0;
    }

    public int firstCompleteIndexBruteForce(int[] arr, int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;

        for (int i = 0; i < arr.length; i++) {
            int currentValue = arr[i];
            boolean isFound = false;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (mat[j][k] == currentValue) {
                        mat[j][k] *= -1;

                        if (isRowFilledBruteForce(mat, j) || isColumnFilledBruteForce(mat, k)) {
                            return i;
                        }

                        isFound = true;
                        break;
                    }
                }
                if (isFound) {
                    break;
                }
            }


        }
        return 0;
    }

    private boolean isColumnFilledBruteForce(int[][] mat, int y) {

        for (int i = 0; i < mat.length; i++) {
            if (mat[i][y] > 0) {
                return false;
            }
        }

        return true;
    }

    private boolean isRowFilledBruteForce(int[][] mat, int x) {

        for (int i = 0; i < mat[x].length; i++) {
            if (mat[x][i] > 0) {
                return false;
            }
        }

        return true;
    }
}
