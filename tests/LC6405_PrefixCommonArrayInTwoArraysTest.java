import org.junit.jupiter.api.Test;

class LC6405_PrefixCommonArrayInTwoArraysTest {

    LC6405_PrefixCommonArrayInTwoArrays lc6405_prefixCommonArrayInTwoArrays = new LC6405_PrefixCommonArrayInTwoArrays();

    @Test
    void findThePrefixCommonArray() {
        int[] A = {1, 3, 2, 4};
        int[] B = {3, 1, 2, 4};
        int[] C = lc6405_prefixCommonArrayInTwoArrays.findThePrefixCommonArray(A, B);

        for (int i : C) {
            System.out.println(i);
        }

    }
}
