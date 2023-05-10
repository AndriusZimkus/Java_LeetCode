import java.util.ArrayList;
import java.util.List;

public class LC54_SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        ArrayList<Integer> answer = new ArrayList<>();

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;

        boolean isRight = true;
        boolean isDown = true;

        int i = 0;
        int j = 0;

        while (true) {


            while (j >= left && j <= right) {
                answer.add(matrix[i][j]);
                if (isRight) {
                    j++;
                } else j--;

            }

            j = (isRight) ? right : left;

            if (isDown) {
                top += 1;
            } else bottom -= 1;

            isRight = !isRight;

            if (isDown) {
                i++;
            } else i--;

            if (answer.size() == m * n) {
                break;
            }

            while (i >= top && i <= bottom) {


                answer.add(matrix[i][j]);

                if (isDown) {
                    i++;
                } else i--;

            }
            if (!isRight) {
                right -= 1;
                j = right;
            } else {
                left += 1;
                j = left;
            }

            i = (isDown) ? bottom : top;

            isDown = !isDown;

            if (answer.size() == m * n) {
                break;
            }


        }

        return answer;
    }
}

