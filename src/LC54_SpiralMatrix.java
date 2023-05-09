import java.util.ArrayList;
import java.util.List;

public class LC54_SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        ArrayList<Integer> answer = new ArrayList<>();

        int top = 0;
        int bottom = n;
        int left = 0;
        int right = m;

        boolean isRight = true;
        boolean isDown = false;

        int i = 0;
        int j = 0;
        while (i <= bottom && i >= top) {
            isDown = !isDown;

            while (j >= left && j <= right - 1) {
                answer.add(matrix[i][j]);
                if (isRight) {
                    j++;
                } else j--;
            }
            isRight = !isRight;
            if (!isRight) {
                right -= 1;
            } else left += 1;

            if (isDown) {
                i++;
            } else i--;

        }
    }

        return answer;
}
}
