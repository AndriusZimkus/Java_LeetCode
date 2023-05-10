public class LC59_SpiralMatrix2 {
    public int[][] generateMatrix(int n) {

        int[][] answer = new int[n][n];

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        boolean isRight = true;
        boolean isDown = true;

        int i = 0;
        int j = 0;
        int currentNumber = 1;

        while (true) {

            while (j >= left && j <= right) {
                answer[i][j] = currentNumber;
                currentNumber += 1;

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

            if (currentNumber == n * n + 1) {
                break;
            }

            while (i >= top && i <= bottom) {

                answer[i][j] = currentNumber;
                currentNumber += 1;

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

            if (currentNumber == n * n + 1) {
                break;
            }


        }

        return answer;
    }
}

