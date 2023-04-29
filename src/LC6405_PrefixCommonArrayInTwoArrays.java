import java.util.HashMap;

public class LC6405_PrefixCommonArrayInTwoArrays {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {

        int[] C = new int[A.length];
        HashMap<Integer, Integer> aIndeces = new HashMap<>();
        HashMap<Integer, Integer> bIndeces = new HashMap<>();

        int commonCount = 0;


        for (int i = 0; i < A.length; i++) {

            int currentA = A[i];
            int currentB = B[i];

            aIndeces.put(currentA, i);
            bIndeces.put(currentB, i);

            if (currentA == currentB) {
                commonCount += 1;
            } else {
                if (bIndeces.containsKey(currentA)) {
                    commonCount += 1;
                }
                if (aIndeces.containsKey(currentB)) {
                    commonCount += 1;
                }
            }

            C[i] = commonCount;

        }

        return C;
        
    }
}
