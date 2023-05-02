public class LC1822_SignOfArrayProduct {
    public int arraySign(int[] nums) {

        int result = 1;

        for (int i : nums) {
            result *= signFunc(i);
            if (i == 0) return 0;
        }
        return result;
    }

    private int signFunc(int x) {
        if (x > 0) return 1;
        if (x < 0) return -1;
        return 0;
    }
}
