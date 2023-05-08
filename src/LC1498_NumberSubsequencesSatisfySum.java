import java.util.Arrays;

public class LC1498_NumberSubsequencesSatisfySum {
    public int numSubseq(int[] nums, int target) {


        Arrays.sort(nums);

        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int answer = 0;

        int[] power = new int[n];
        int modulo = 1000000007;

        power[0] = 1;
        for (int i = 1; i < n; i++) {
            power[i] = (power[i - 1] * 2) % modulo;
        }

        while (left <= right) {
            if (nums[left] + nums[right] > target) {
                right -= 1;
            } else {
                answer += power[right - left];
                answer %= modulo;
                left += 1;
            }
        }
        return answer;
    }
}
