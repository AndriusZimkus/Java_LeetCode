import org.junit.jupiter.api.Test;

class LC2657_PrefixCommonArrayInTwoArraysTest {

    LC2657_PrefixCommonArrayInTwoArrays lc2657_prefixCommonArrayInTwoArrays = new LC2657_PrefixCommonArrayInTwoArrays();

    @Test
    void findThePrefixCommonArray() {
        int[] A = {1, 3, 2, 4};
        int[] B = {3, 1, 2, 4};
        int[] C = lc2657_prefixCommonArrayInTwoArrays.findThePrefixCommonArray(A, B);

        for (int i : C) {
            System.out.println(i);
        }

    }
}
