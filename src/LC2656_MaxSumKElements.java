public class LC2656_MaxSumKElements {
    public int maximizeSum(int[] nums, int k) {

        int max = maxFromArray(nums);

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += max + i;
        }

        return sum;
    }

    public int maxFromArray(int[] nums) {
        int max = nums[0];

        for (int i : nums) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
