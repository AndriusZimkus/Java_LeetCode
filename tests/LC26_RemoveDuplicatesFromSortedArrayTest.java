import org.junit.jupiter.api.Test;

class LC26_RemoveDuplicatesFromSortedArrayTest {

    LC26_RemoveDuplicatesFromSortedArray lc26_removeDuplicatesFromSortedArray = new LC26_RemoveDuplicatesFromSortedArray();

    @Test
    void removeDuplicates1() {
        int[] nums = {1, 1, 2}; // Input array
        int[] expectedNums = {1, 2}; // The expected answer with correct length

        int k = lc26_removeDuplicatesFromSortedArray.removeDuplicates(nums); // Calls your implementation

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    @Test
    void removeDuplicates2() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}; // Input array
        int[] expectedNums = {0, 1, 2, 3, 4}; // The expected answer with correct length

        int k = lc26_removeDuplicatesFromSortedArray.removeDuplicates(nums); // Calls your implementation

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}
