public class LC26_RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 1) {
            return 1;
        }
        int currentIndex = 1;
        int currentNumber = nums[0];
        int previousNumber = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentNumber = nums[i];
            if (currentNumber != previousNumber) {
                nums[currentIndex] = currentNumber;
                previousNumber = currentNumber;
                currentIndex += 1;
            }
        }
        
        return currentIndex;
    }
}
