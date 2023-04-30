public class LC2658_MaxNumberOfFishInGrid {
    int m;
    int n;

    public int findMaxFishSolution(int[][] grid) {
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

    public int findMaxFish(int[][] grid) {

        m = grid.length;
        n = grid[0].length;

        int max = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                max = Math.max(max, findMaxFishFromCell(grid, i, j));
            }
        }

        return max;
    }

    private int findMaxFishFromCell(int[][] grid, int x, int y) {
        if (x < 0 || y < 0 || x >= m || y >= n || grid[x][y] == 0) {
            return 0;
        }
        int currentFish = grid[x][y];

        int total = currentFish;

        grid[x][y] = 0;

        total += findMaxFishFromCell(grid, x - 1, y);
        total += findMaxFishFromCell(grid, x, y - 1);
        total += findMaxFishFromCell(grid, x + 1, y);
        total += findMaxFishFromCell(grid, x, y + 1);

        return total;
    }
}
