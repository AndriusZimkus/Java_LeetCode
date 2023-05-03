import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class LC2215_Difference2ArraysTest {

    LC2215_Difference2Arrays lc2215_difference2Arrays = new LC2215_Difference2Arrays();

    @Test
    void findDifference1() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};

        List<Integer> answer1 = new ArrayList<>(List.of(1, 3));
        List<Integer> answer2 = new ArrayList<>(List.of(4, 6));

        List<List<Integer>> expected = new ArrayList<>(List.of(answer1, answer2));
        List<List<Integer>> actual = lc2215_difference2Arrays.findDifference(nums1, nums2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findDifference2() {
        int[] nums1 = {1, 2, 3, 3};
        int[] nums2 = {1, 1, 2, 2};

        List<Integer> answer1 = new ArrayList<>(List.of(3));
        List<Integer> answer2 = new ArrayList<>();

        List<List<Integer>> expected = new ArrayList<>(List.of(answer1, answer2));
        List<List<Integer>> actual = lc2215_difference2Arrays.findDifference(nums1, nums2);

        Assertions.assertEquals(expected, actual);
    }
}
