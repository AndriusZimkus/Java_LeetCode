import java.util.Arrays;

public class LC1035_UncrossedLines {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {

        int n1 = nums1.length;
        int n2 = nums2.length;

        int[][] memo = new int[n1 + 1][n2 + 1];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        return solve(n1, n2, nums1, nums2, memo);

        //return helper(nums1, nums2, 0, 0, 0, 0);

    }

    private int solve(int i, int j, int[] nums1, int[] nums2, int[][] memo) {
        if (i <= 0 || j <= 0) {
            return 0;
        }

        if (memo[i][j] != -1) {
            return memo[i][j];
        }

        if (nums1[i - 1] == nums2[j - 1]) {
            memo[i][j] = 1 + solve(i - 1, j - 1, nums1, nums2, memo);
        } else {
            memo[i][j] =
                    Math.max(solve(i, j - 1, nums1, nums2, memo), solve(i - 1, j, nums1, nums2, memo));
        }
        return memo[i][j];
    }


    // Solution over time limit
    private int helper(int[] nums1, int[] nums2, int startIndex1, int startIndex2, int currentFound, int pruningLimit) {

        for (int i = startIndex1; i < nums1.length; i++) {

            for (int j = startIndex2; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    int continueIteration = helper(nums1, nums2, i + 1, j + 1, currentFound + 1, currentFound + 1);

                    if (j > startIndex2) {
                        int ignoreMatch = 0;
                        int maxWithIgnoreMatch = Math.min(currentFound + nums2.length - j, currentFound + nums1.length - i);

                        if (pruningLimit >= maxWithIgnoreMatch) {

                        } else {
                            ignoreMatch = helper(nums1, nums2, i + 1, startIndex2, currentFound, pruningLimit);
                        }

                        return Math.max(continueIteration, ignoreMatch);
                    } else {
                        return continueIteration;
                    }
                }
            }
        }

        return currentFound;
    }
}
