public class LC41_FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {

        // Non-constant space
        int[] numsCopy = new int[nums.length];

        for (int x : nums) {
            if (x <= nums.length && x > 0) {
                numsCopy[x - 1] = x;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (numsCopy[i] == 0) {
                return i + 1;
            }
        }


        return nums.length + 1;
    }
}
