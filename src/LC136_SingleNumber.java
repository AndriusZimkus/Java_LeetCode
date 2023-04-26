public class LC136_SingleNumber {
    public int singleNumber(int[] nums) {


        // Bitwise XOR operator
        int result = 0;
        for (int i : nums) {
            result ^= i;
        }
        return result;

    }
}
