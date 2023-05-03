import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC2215_Difference2Arrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<Integer> answer1 = new ArrayList<>();
        List<Integer> answer2 = new ArrayList<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);


        fillAnswerList(answer1, nums1, nums2);
        fillAnswerList(answer2, nums2, nums1);

        List<List<Integer>> answerList = new ArrayList<>(List.of(answer1, answer2));

        return answerList;

    }

    private void fillAnswerList(List<Integer> answerList, int[] primaryList, int[] secondaryList) {
        for (int i = 0; i < primaryList.length; i++) {
            if (i == 0 || primaryList[i] != primaryList[i - 1]) {
                if (Arrays.binarySearch(secondaryList, primaryList[i]) < 0) {
                    answerList.add(primaryList[i]);
                }
            }
        }
    }
}
