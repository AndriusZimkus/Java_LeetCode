public class LC6403_MaxNumberOfFishInGrid {
    int m;
    int n;

    public int findMaxFish(int[][] grid) {
        int ans = 0;
        m = grid.length;
        n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) { // water cell to start dfs
                    ans = Math.max(ans, helper(grid, i, j));
                }
            }
        }
        return ans;
    }

    public int helper(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i == m || j == n || grid[i][j] <= 0) return 0;
        int total = grid[i][j];
        grid[i][j] = 0; // changing the value to avoid reComputation
        total += helper(grid, i + 1, j);
        total += helper(grid, i - 1, j);
        total += helper(grid, i, j + 1);
        total += helper(grid, i, j - 1);
        return total;

    }

    public int findMaxFishMyAttemp(int[][] grid) {

        int max = 0;

        boolean[][] marked = new boolean[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {

                int currentResult = findMaxFishFromStartCell(grid, j, i, marked);
                if (currentResult > max) {
                    max = currentResult;
                }

            }
        }

        return max;
    }

    private int findMaxFishFromStartCell(int[][] grid, int startingX, int startingY, boolean[][] marked) {

        int currentFish = grid[startingY][startingX];

        // Land
        if (currentFish == 0) {
            return 0;
        }

        int[][] myInt = new int[grid.length][];
        for (int i = 0; i < grid.length; i++) {
            int[] aMatrix = grid[i];
            int aLength = aMatrix.length;
            myInt[i] = new int[aLength];
            System.arraycopy(aMatrix, 0, myInt[i], 0, aLength);
        }
        int max = 0;
        int nextResult = 0;

//        if (!marked[startingY][startingX]) {
//
//            boolean[][] myMarked = new boolean[marked.length][];
//            for (int i = 0; i < marked.length; i++) {
//                boolean[] aMatrix = marked[i];
//                int aLength = aMatrix.length;
//                myMarked[i] = new boolean[aLength];
//                System.arraycopy(aMatrix, 0, myMarked[i], 0, aLength);
//            }
//
//            myMarked[startingY][startingX] = true;
//
//
//            if (startingX > 0 && myInt[startingY][startingX - 1] > 0 && !myMarked[startingY][startingX - 1]) {
//                nextResult = findMaxFishFromStartCell(myInt, startingX - 1, startingY, myMarked);
//                if (nextResult > max) {
//                    max = nextResult;
//                }
//            }
//            if (startingY > 0 && myInt[startingY - 1][startingX] > 0 && !myMarked[startingY - 1][startingX]) {
//                nextResult = findMaxFishFromStartCell(myInt, startingX, startingY - 1, myMarked);
//                if (nextResult > max) {
//                    max = nextResult;
//                }
//            }
//            if (startingX < grid[0].length - 1 && myInt[startingY][startingX + 1] > 0 && !myMarked[startingY][startingX + 1]) {
//                nextResult = findMaxFishFromStartCell(myInt, startingX + 1, startingY, myMarked);
//                if (nextResult > max) {
//                    max = nextResult;
//                }
//            }
//            if (startingY < grid.length - 1 && myInt[startingY + 1][startingX] > 0 && !myMarked[startingY + 1][startingX]) {
//                nextResult = findMaxFishFromStartCell(myInt, startingX, startingY + 1, myMarked);
//                if (nextResult > max) {
//                    max = nextResult;
//                }
//            }
//
//        }

        myInt[startingY][startingX] = 0;

        if (startingX > 0 && myInt[startingY][startingX - 1] > 0) {
            max += findMaxFishFromStartCell(myInt, startingX - 1, startingY, marked);

//            nextResult = findMaxFishFromStartCell(myInt, startingX - 1, startingY, marked);
//            if (nextResult > max) {
//                max = nextResult;
//            }
        }
        if (startingY > 0 && myInt[startingY - 1][startingX] > 0) {
            max += findMaxFishFromStartCell(myInt, startingX, startingY - 1, marked);
//            nextResult = findMaxFishFromStartCell(myInt, startingX, startingY - 1, marked);
//            if (nextResult > max) {
//                max = nextResult;
//            }
        }
        if (startingX < grid[0].length - 1 && myInt[startingY][startingX + 1] > 0) {
            max += findMaxFishFromStartCell(myInt, startingX + 1, startingY, marked);
//            nextResult = findMaxFishFromStartCell(myInt, startingX + 1, startingY, marked);
//            if (nextResult > max) {
//                max = nextResult;
//            }
        }
        if (startingY < grid.length - 1 && myInt[startingY + 1][startingX] > 0) {
            max += findMaxFishFromStartCell(myInt, startingX, startingY + 1, marked);
//            nextResult = findMaxFishFromStartCell(myInt, startingX, startingY + 1, marked);
//            if (nextResult > max) {
//                max = nextResult;
//            }
        }


        return currentFish + max;
    }
}
