import java.util.HashMap;

public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {

        int[] indeces = new int[2];

        HashMap<Integer, Integer> complementIndeces = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {

            Integer currentNumber = nums[i];
            Integer currentComplement = target - nums[i];

            if (complementIndeces.containsKey(currentNumber)) {
                indeces[0] = complementIndeces.get(currentNumber);
                indeces[1] = i;

                return indeces;
            }

            complementIndeces.put(currentComplement, i);

        }

        return indeces;
    }
}
