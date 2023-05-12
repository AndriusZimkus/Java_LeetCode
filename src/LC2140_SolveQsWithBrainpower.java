import java.util.Arrays;

public class LC2140_SolveQsWithBrainpower {

    long[] results;

    public long mostPoints(int[][] questions) {

        long currentPoints = 0;
        int left = 0;
        results = new long[questions.length];
        Arrays.fill(results, -1);

        return helper(questions, left, currentPoints);
    }

    private long helper(int[][] questions, int left, long currentPoints) {
        if (left >= questions.length) {
            return currentPoints;
        }

        if (results[left] > -1) {
            return results[left] + currentPoints;
        }

        for (int i = left; i < questions.length; i++) {
            long decisionSolve = questions[i][0];
            decisionSolve = helper(questions, i + questions[i][1] + 1, decisionSolve);

            long decisionSkip = helper(questions, i + 1, 0);
            long maxFromHere = Math.max(decisionSolve, decisionSkip);

            results[i] = maxFromHere;

            return maxFromHere + currentPoints;
        }


        return currentPoints;
    }
}
