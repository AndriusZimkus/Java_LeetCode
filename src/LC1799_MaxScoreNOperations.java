import java.util.Arrays;

public class LC1799_MaxScoreNOperations {
    public int backtrack(int[] nums, int mask, int pairsPicked, int[] memo) {
        // If we have picked all the numbers from 'nums' array, we can't get more score.
        if (2 * pairsPicked == nums.length) {
            return 0;
        }

        // If we already solved this sub-problem then return the stored result.
        if (memo[mask] != -1) {
            return memo[mask];
        }

        int maxScore = 0;

        // Iterate on 'nums' array to pick the first and second number of the pair.
        for (int firstIndex = 0; firstIndex < nums.length; ++firstIndex) {
            for (int secondIndex = firstIndex + 1; secondIndex < nums.length; ++secondIndex) {

                // If the numbers are same, or already picked, then we move to next number.
                if (((mask >> firstIndex) & 1) == 1 || ((mask >> secondIndex) & 1) == 1) {
                    continue;
                }

                // Both numbers are marked as picked in this new mask.
                int newMask = mask | (1 << firstIndex) | (1 << secondIndex);

                // Calculate score of current pair of numbers, and the remaining array.
                int currScore = (pairsPicked + 1) * gcd(nums[firstIndex], nums[secondIndex]);
                int remainingScore = backtrack(nums, newMask, pairsPicked + 1, memo);

                // Store the maximum score.
                maxScore = Math.max(maxScore, currScore + remainingScore);
                // We will use old mask in loop's next interation,
                // means we discarded the picked number and backtracked.
            }
        }

        // Store the result of the current sub-problem.
        memo[mask] = maxScore;
        return maxScore;
    }

    public int maxScore(int[] nums) {
        int memoSize = 1 << nums.length; // 2^(nums array size)
        int[] memo = new int[memoSize];
        Arrays.fill(memo, -1);
        return backtrack(nums, 0, 0, memo);
    }

    // Utility function to calculate the gcd of two numbers.
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Second attempt - recursive, wrong at same case 69
//    public int maxScore(int[] nums) {
//
//        int m = nums.length;
//        int n = m / 2;
//        int answer = 0;
//
//        int[][] gcds = new int[m][m];
//
//        for (int i = 0; i < m; i++) {
//            for (int j = i + 1; j < m; j++) {
//                gcds[i][j] = gcd(nums[i], nums[j]);
//            }
//        }
//
//        int currentN = n;
//
//
//        int currentMaxGCD = 0;
//        List<Integer> maxIs = new ArrayList<>();
//        List<Integer> maxJs = new ArrayList<>();
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < m; j++) {
//                if (gcds[i][j] > currentMaxGCD) {
//                    currentMaxGCD = gcds[i][j];
//                    maxIs.clear();
//                    maxJs.clear();
//                }
//                if (gcds[i][j] == currentMaxGCD) {
//                    maxIs.add(i);
//                    maxJs.add(j);
//                }
//            }
//        }
//
//
//        answer = maxFromList(gcds, maxIs, maxJs, currentN);
//
//
//        return answer;
//    }
//
//    private int maxFromList(int[][] gcds, List<Integer> maxIs, List<Integer> maxJs, int currentN) {
//        if (currentN == 0) {
//            return 0;
//        }
//
//        int m = gcds.length;
//
//        int[][] localGCDs = new int[m][];
//        for (int i = 0; i < m; i++)
//            localGCDs[i] = gcds[i].clone();
//
//        int answer = 0;
//        int previousAnswer = 0;
//        for (int x = 0; x < maxIs.size(); x++) {
//            previousAnswer = 0;
//
//            int currentI = maxIs.get(x);
//            int currentJ = maxJs.get(x);
//
//            previousAnswer += currentN * gcds[currentI][currentJ];
//
//            Arrays.fill(localGCDs[currentI], 0);
//            Arrays.fill(localGCDs[currentJ], 0);
//            for (int i = 0; i < m; i++) {
//                localGCDs[i][currentJ] = 0;
//                localGCDs[i][currentI] = 0;
//            }
//
//            int currentMaxGCD = 0;
//            List<Integer> localMaxIs = new ArrayList<>();
//            List<Integer> localMaxJs = new ArrayList<>();
//
//            for (int i = 0; i < m; i++) {
//                for (int j = 0; j < m; j++) {
//                    if (localGCDs[i][j] > currentMaxGCD) {
//                        currentMaxGCD = localGCDs[i][j];
//                        localMaxIs.clear();
//                        localMaxJs.clear();
//                    }
//                    if (localGCDs[i][j] == currentMaxGCD) {
//                        localMaxIs.add(i);
//                        localMaxJs.add(j);
//                    }
//                }
//            }
//
//            previousAnswer += maxFromList(localGCDs, localMaxIs, localMaxJs, currentN - 1);
//
//            answer = Math.max(answer, previousAnswer);
//
//        }
//
//        return answer;
//    }
//
//    private int gcd(int x, int y) {
//
//        int min = Math.min(x, y);
//        int top = min;
//
//        for (int i = top; i > 0; i--) {
//            if (x % i == 0 && y % i == 0) {
//                return i;
//            }
//        }
//
//        return 1;
//    }

    // No duplicate solution - wrong
//    public int maxScore(int[] nums) {
//
//        int m = nums.length;
//        int n = m / 2;
//        int answer = 0;
//
//        int[][] gcds = new int[m][m];
//
//        for (int i = 0; i < m; i++) {
//            for (int j = i + 1; j < m; j++) {
//                gcds[i][j] = gcd(nums[i], nums[j]);
//            }
//        }
//
//        int currentN = n;
//
//        while (currentN > 0) {
//
//            int currentMaxGCD = 0;
//            int maxI = 0;
//            int maxJ = 0;
//
//            for (int i = 0; i < m; i++) {
//                for (int j = 0; j < m; j++) {
//                    if (gcds[i][j] > currentMaxGCD) {
//                        currentMaxGCD = gcds[i][j];
//                        maxI = i;
//                        maxJ = j;
//                    }
//                }
//            }
//
//            answer += currentN * currentMaxGCD;
//            Arrays.fill(gcds[maxI], 0);
//            Arrays.fill(gcds[maxJ], 0);
//            for (int i = 0; i < m; i++) {
//                gcds[i][maxJ] = 0;
//                gcds[i][maxI] = 0;
//            }
//
//            currentN -= 1;
//        }
//
//        return answer;
//    }
//
//    private int gcd(int x, int y) {
//
//        int min = Math.min(x, y);
//        int top = min;
//
//        for (int i = top; i > 0; i--) {
//            if (x % i == 0 && y % i == 0) {
//                return i;
//            }
//        }
//
//        return 1;
//    }
}
