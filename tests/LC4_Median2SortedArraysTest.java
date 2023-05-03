import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LC4_Median2SortedArraysTest {

    LC4_Median2SortedArrays lc4_median2SortedArrays = new LC4_Median2SortedArrays();

    @Test
    void findMedianSortedArrays1() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double expected = 2;
        double actual = lc4_median2SortedArrays.findMedianSortedArrays(nums1, nums2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMedianSortedArrays2() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        double expected = 2.5;
        double actual = lc4_median2SortedArrays.findMedianSortedArrays(nums1, nums2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMedianSortedArrays3() {
        int[] nums1 = {6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[] nums2 = {1, 2, 3, 4, 5};
        double expected = 8;
        double actual = lc4_median2SortedArrays.findMedianSortedArrays(nums1, nums2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMedianSortedArrays4() {
        int[] nums1 = {10, 20, 25, 35};
        int[] nums2 = {3, 8, 12, 27, 34, 40};
        double expected = 22.5;
        double actual = lc4_median2SortedArrays.findMedianSortedArrays(nums1, nums2);

        Assertions.assertEquals(expected, actual);
    }
}
