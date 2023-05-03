public class LC4_Median2SortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if (nums1 == null && nums2 == null) {
            return 0;
        } else if (nums1 == null) {
            return median(nums2);
        } else if (nums2 == null) {
            return median(nums1);
        }

        int n = nums1.length;
        int m = nums2.length;

        if (n > m) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int left = 0;
        int right = n;

        while (true) {
            int mid1 = (left + right / 2);
            int mid2 = (n + m) / 2 - mid1;

            if (nums1[mid1] < nums2[mid2 + 1] && nums2[mid2] < nums1[mid1 + 1]) {
                if ((n + m) % 2 == 0) {
                    return (Math.max(nums1[mid1], nums2[mid2]) + Math.min(nums1[mid1 + 1], nums2[mid2 + 1])) / 2;
                } else Math.min(nums1[mid1 + 1], nums2[mid2 + 1]);
            }

            if (nums1[mid1] > nums2[mid2 + 1]) {
                left = (right + mid1) / 2;
            } else if (nums2[mid2] > nums1[mid1 + 1]) {
                right = (left + mid1) / 2;
            }

        }


    }

    private double median(int[] nums) {
        if (nums.length % 2 == 0) {
            return (nums[nums.length / 2] + nums[nums.length / 2 + 1]) / 2;
        } else return (nums[nums.length / 2]);
    }

}
