public class LC258_AddDigits {
    public int addDigits(int num) {

        int currentSum = 0;
        int currentDigit = 0;
        int currentNum = num;
        while (currentNum > 0) {
            currentDigit = currentNum % 10;
            currentNum /= 10;
            currentSum += currentDigit;
        }

        if (currentSum < 10) {
            return currentSum;
        } else return addDigits(currentSum);
    }
}
