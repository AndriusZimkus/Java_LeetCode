import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LC1035_UncrossedLinesTest {

    LC1035_UncrossedLines lc1035_uncrossedLines = new LC1035_UncrossedLines();

    @Test
    void maxUncrossedLines1() {
        int[] nums1 = {1, 4, 2};
        int[] nums2 = {1, 2, 4};
        int expected = 2;
        int actual = lc1035_uncrossedLines.maxUncrossedLines(nums1, nums2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxUncrossedLines2() {
        int[] nums1 = {2, 5, 1, 2, 5};
        int[] nums2 = {10, 5, 2, 1, 5, 2};
        int expected = 3;
        int actual = lc1035_uncrossedLines.maxUncrossedLines(nums1, nums2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxUncrossedLines3() {
        int[] nums1 = {1, 3, 7, 1, 7, 5};
        int[] nums2 = {1, 9, 2, 5, 1};
        int expected = 2;
        int actual = lc1035_uncrossedLines.maxUncrossedLines(nums1, nums2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxUncrossedLines4() {
        int[] nums1 = {5};
        int[] nums2 = {5};
        int expected = 1;
        int actual = lc1035_uncrossedLines.maxUncrossedLines(nums1, nums2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxUncrossedLines5() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {4, 5, 6};
        int expected = 0;
        int actual = lc1035_uncrossedLines.maxUncrossedLines(nums1, nums2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxUncrossedLines6() {
        int[] nums1 = {1, 2, 3, 4, 5, 6};
        int[] nums2 = {6, 5, 4, 3, 2, 1};
        int expected = 1;
        int actual = lc1035_uncrossedLines.maxUncrossedLines(nums1, nums2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxUncrossedLines7() {
        int[] nums1 = {1, 2, 3, 4, 5, 6};
        int[] nums2 = {6, 1, 3, 4, 2, 5};
        int expected = 4;
        int actual = lc1035_uncrossedLines.maxUncrossedLines(nums1, nums2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxUncrossedLines8() {
        int[] nums1 = {1, 2, 3, 4, 5, 6};
        int[] nums2 = {1, 3, 4, 2, 5, 8, 8, 2, 5};
        int expected = 4;
        int actual = lc1035_uncrossedLines.maxUncrossedLines(nums1, nums2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxUncrossedLines9() {
        int[] nums1 = {2, 1, 2};
        int[] nums2 = {2, 2, 2};
        int expected = 2;
        int actual = lc1035_uncrossedLines.maxUncrossedLines(nums1, nums2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxUncrossedLines10() {
        // Case 57
        int[] nums1 = {15, 14, 1, 7, 15, 1, 12, 18, 9, 15, 1, 20, 18, 15, 16, 18, 11, 8, 11, 18, 11, 11, 17, 20, 16, 20, 15, 15, 9, 18, 16, 4, 16, 1, 13, 10, 10, 20, 4, 18, 17, 3, 8, 1, 8, 19, 14, 10, 10, 12};
        int[] nums2 = {12, 8, 17, 4, 2, 18, 16, 10, 11, 12, 7, 1, 8, 16, 4, 14, 12, 18, 18, 19, 19, 1, 11, 18, 1, 6, 12, 17, 6, 19, 10, 5, 11, 16, 6, 17, 12, 1, 9, 3, 19, 2, 18, 18, 2, 4, 11, 11, 14, 9, 20, 19, 2, 20, 9, 15, 8, 7, 8, 6, 19, 12, 4, 11, 18, 18, 1, 6, 9, 17, 13, 19, 5, 4, 14, 9, 11, 15, 2, 5, 4, 1, 10, 11, 6, 4, 9, 7, 11, 7, 3, 8, 11, 12, 4, 19, 12, 17, 14, 18};
        int expected = 23;
        int actual = lc1035_uncrossedLines.maxUncrossedLines(nums1, nums2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxUncrossedLines11() {
        int[] nums1 = {2, 3, 1, 2, 5, 1, 3, 1, 3, 2, 3, 1, 2, 2, 3, 3, 3, 1, 3, 4, 4, 3, 4, 3, 4, 5, 4, 4, 1, 3};
        int[] nums2 = {5, 4, 5, 1, 1, 3, 4, 3, 2, 3};
        int expected = 7;
        int actual = lc1035_uncrossedLines.maxUncrossedLines(nums1, nums2);

        Assertions.assertEquals(expected, actual);
    }
}
