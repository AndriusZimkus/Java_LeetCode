public class LC4_Median2SortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {


        // Solution https://leetcode.com/problems/median-of-two-sorted-arrays/solutions/2471/very-concise-o-log-min-m-n-iterative-solution-with-detailed-explanation/?orderBy=most_votes
        if (nums1 == null && nums2 == null) {
            return 0;
        } else if (nums1 == null) {
            return median(nums2);
        } else if (nums2 == null) {
            return median(nums1);
        }

        int n1 = nums1.length;
        int n2 = nums2.length;

        if (n2 > n1) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int low = 0;
        int high = n2 * 2;

        while (high >= low) {
            int mid2 = (low + high) / 2;
            int mid1 = n1 + n2 - mid2;

            double L1 = (mid1 == 0) ? Double.NEGATIVE_INFINITY : nums1[(mid1 - 1) / 2];    // Get L1, R1, L2, R2 respectively
            double L2 = (mid2 == 0) ? Double.NEGATIVE_INFINITY : nums2[(mid2 - 1) / 2];
            double R1 = (mid1 == n1 * 2) ? Double.POSITIVE_INFINITY : nums1[(mid1) / 2];
            double R2 = (mid2 == n2 * 2) ? Double.POSITIVE_INFINITY : nums2[(mid2) / 2];

            if (L1 > R2) low = mid2 + 1;        // A1's lower half is too big; need to move C1 left (C2 right)
            else if (L2 > R1) high = mid2 - 1;    // A2's lower half too big; need to move C2 left.
            else return (Math.max(L1, L2) + Math.min(R1, R2)) / 2;    // Otherwise, that's the right cut.


//            if (nums1[mid1] < nums2[mid2 + 1] && nums2[mid2] < nums1[mid1 + 1]) {
//                if ((n + m) % 2 == 0) {
//                    return (Math.max(nums1[mid1], nums2[mid2]) + Math.min(nums1[mid1 + 1], nums2[mid2 + 1])) / 2;
//                } else Math.min(nums1[mid1 + 1], nums2[mid2 + 1]);
//            }
//
//            if (nums1[mid1] > nums2[mid2 + 1]) {
//                low = (high + mid1) / 2;
//            } else if (nums2[mid2] > nums1[mid1 + 1]) {
//                high = (low + mid1) / 2;
//            }

        }

        return -1;


    }

    private double median(int[] nums) {
        if (nums.length % 2 == 0) {
            return (nums[nums.length / 2] + nums[nums.length / 2 + 1]) / 2;
        } else return (nums[nums.length / 2]);
    }

}
