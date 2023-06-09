import LCUtilities.BinaryTreeBuilder;
import LCUtilities.TreeNodeCustom;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LC1372_LongestZigZagBinaryTreeTest {

    @Test
    void longestZigZag1() {
        String rootList = "[1,null,1,1,1,null,null,1,1,null,1,null,null,null,1,null,1]";

        TreeNodeCustom root = BinaryTreeBuilder.buildBinaryTree(rootList);

        LC1372_LongestZigZagBinaryTree solution1372 = new LC1372_LongestZigZagBinaryTree();

        int longest = solution1372.longestZigZag(root);

        Assertions.assertEquals(3, longest);

    }

    @Test
    void longestZigZag2() {
        String rootList = "[1,1,1,null,1,null,null,1,1,null,1]";

        TreeNodeCustom root = BinaryTreeBuilder.buildBinaryTree(rootList);

        LC1372_LongestZigZagBinaryTree solution1372 = new LC1372_LongestZigZagBinaryTree();

        int longest = solution1372.longestZigZag(root);

        Assertions.assertEquals(4, longest);
    }

    @Test
    void longestZigZag3() {
        String rootList = "[1]";

        TreeNodeCustom root = BinaryTreeBuilder.buildBinaryTree(rootList);

        LC1372_LongestZigZagBinaryTree solution1372 = new LC1372_LongestZigZagBinaryTree();

        int longest = solution1372.longestZigZag(root);

        Assertions.assertEquals(0, longest);
    }

    @Test
    void longestZigZag4() {
        String rootList = "[1,9,9,2,6,10,8,1,4,9,5,8,2,3,3,5,2," +
                "2,2,6,7,4,8,3,3,1,7,null,null,1,6,6,10,3,3,9,null,6,9,7," +
                "2,3,7,10,6,9,5,1,10,1,1,4,2,4,5,9,10,1,6,8,6,6,7,7,5,8,null,null,null," +
                "8,8,3,null,8,1,8,1,4,null,5,8,2,9,8,4,6,1,4,4,4,2,9,6,null,null,7,null,5,10," +
                "null,2,9,10,5,null,null,4,null,2,5,10,6,2,3,7,10,2,null,8,10,3,9,5,5,5,4,6,null," +
                "null,null,10,null,8,7,8,null,5,2,4,6,4,10,1,null,null,4,9,3,5,3,8,4,8,8,null,null,null," +
                "2,null,4,9,null,null,3,2,null,null,4,4,6,2,null,null,null,null,7,5,null,null,8,4,10,6,10," +
                "null,null,3,null,null,1,7,5,10,null,null,null,3,4,1,5,3,1,10,9,10,2,1,null,6,4,null,4,null,null,1,9," +
                "null,6,3,2,null,9,9,null,null,null,null,3,null,null,null,null,null,2,null,2,3,null,null,5,3,3,3,9,null," +
                "null,10,4,8,9,1,null,null,2,3,5,10,4,3,8,null,null,3,null,6,5,10,5,null,null,null,null,7,8,3,null,null,3," +
                "10,10,8,null,null,5,null,9,9,7,4,7,3,7,2,null,null,null,null,null,4,9,null,null,9,5,4,10,null,3,5,9,4,1,7," +
                "5,6,7,5,10,10,null,null,null,9,9,3,10,3,7,1,null,10,2,9,null,3,7,3,3,3,null,4,3,8,10,9,4,6,null,null,null," +
                "null,null,null,null,null,9,null,null,null,null,null,2,null,4,1,5,null,3,6,3,null,8,null,6,null,3,null,5,4,9,10,null,null," +
                "null,5,6,null,null,null,null,null,null,null,null,null,null,1,null,null,null,null,null,null,null,null,3,null,5,9,8,null,4,2," +
                "null,null,null,null,null,null,7,null,null,null,4,null,2,null,2,7,null,null,5,null,null,5,null,null,7,6,5,4,null,null,null,null,null," +
                "2,3,null,5,2,1,4,4,2,9,3,7,1,9,null,null,10,10,9,7,1,null,4,5,10,3,null,5,1,null,null,null,null,null,null,null,3,3,6,2,7,7,null,null," +
                "10,null,null,null,null,5,3,null,3,9,7,4,7,null,9,2,5,null,4,1,3,null,2,null,9,5,8,null,null,6,null,2,null,4,null,null,null,6,null,null," +
                "null,2,null,4,8,null,10,null,5,null,null,7,7,null,null,null,null,null,null,9,3,5,5,null,8,null,null,3,null,null,null,10,null,null,null,null," +
                "2,null,null,null,null,null,6,5,null,null,null,7,10,null,null,null,8,null,5,null,null,null,null,5,8,7,3,6,6,6,8,5,6,5,null,null,null,3,4,null," +
                "null,null,null,null,null,10,5,3,8,null,9,null,null,3,10,5,null,7,8,6,null,5,2,null,null,7,3,2,7,1,3,10,6,null,null,null,null,null,null,4,3,null," +
                "null,6,8,2,null,null,null,null,null,null,null,4,4,8,3,9,9,null,null,null,null,null,null,null,null,7,null,null,null,null,null,3,9,3,8,6,null,5,null," +
                "null,2,null,null,3,null,10,null,null,4,null,null,null,null,null,3,null,null,8,1,null,null,null,7,null,null,null,6,null,4,5,3,3,null,10,null,null,null," +
                "3,null,2,8,6,null,null,null,8,10,8,9,8,2,5,8,null,null,null,8,6,null,7,5,10,5,2,10,8,null,4,null,6,5,6,2,null,9,3,null,null,2,null,7,null,null,null,5," +
                "null,null,1,4,null,null,8,5,null,null,7,null,2,3,null,9,3,null,5,7,null,null,9,4,null,4,3,null,null,null,8,5,4,4,null,6,4,10,1,10,null,6,2,5,5,5,9,3,9,4," +
                "null,null,null,1,null,null,null,null,null,2,null,8,8,null,9,9,null,null,null,6,8,null,null,null,2,null,null,1,null,5,null,null,null,null,null,null,null," +
                "null,2,5,8,10,10,1,9,4,2,8,7,7,8,10,5,10,null,2,6,6,10,3,null,null,null,5,null,null,4,null,7,null,null,8,null,null,6,null,null,3,null,null,5,null,3,null," +
                "4,3,9,null,null,null,null,2,8,8,null,null,null,null,null,null,null,null,null,null,3,4,null,null,null,9,null,null,null,null,null,5,null,null,null,7,null," +
                "null,4,null,null,5,null,null,null,null,5,10,10,3,null,null,null,5,2,3,3,1,3,4,6,9,null,null,null,null,null,null,null,7,null,null,null,null,9,2,4,10,null," +
                "null,null,7,null,null,null,null,7,null,null,null,null,null,null,null,null,8,4,10,null,null,null,null,2,10,9,4,1,null,6,7,10,2,8,6,1,7,8,null,10,6,null," +
                "null,3,null,null,null,null,null,2,null,null,5,2,10,5,null,3,null,null,10,6,8,7,6,null,null,null,4,null,null,5,10,4,null,null,null,null,null,null,null," +
                "5,6,3,null,null,null,null,null,null,null,null,10,null,8,null,10,3,null,null,null,null,7,null,5,null,null,null,5,null,10,5,5,null,3,5,10,null,2,1,7,null," +
                "5,null,5,4,9,6,6,6,1,9,8,1,1,9,null,null,null,7,null,null,null,null,null,null,null,9,3,null,null,null,null,null,4,null,3,10,7,6,10,null,8,3,7,1,4,4,3,6," +
                "5,null,null,8,6,null,null,2,null,null,null,null,10,7,6,null,null,null,null,null,null,7,1,1,2,null,10,7,null,null,null,null,null,null,null,null,null,null," +
                "9,null,null,null,null,null,6,null,null,8,7,4,8,null,3,2,null,null,null,null,null,null,null,10,null,null,null,null,null,null,null,null,2,3,8,null,4,7,9," +
                "null,null,3,4,6,7,null,null,null,null,null,1,null,null,5,7,null,5,null,null,4,10,9,5,5,4,3,null,null,null,null,null,null,null,null,null,null,null,null," +
                "null,1,9,1,10,4,9,10,3,1,3,1,6,null,null,2,6,null,3,null,3,2,4,null,null,9,null,null,null,null,10,5,null,3,null,9,null,null,null,5,null,3,5,null,6,4,6,9,null,null,null,10,null,8,null,null,null,10,null,null,1,null,null,8,null,null,7,null,2,null,5,null,null,7,null,null,null,null,null,null,null,3,null,1,6,4,2,null,2,null,7,null,null,null,null,null,null,3,null,1,null,8,2,4,null,null,6,null,8,null,6,8,null,null,null,null,null,3,6,null,9,null,null,null,3,6,8,8,1,null,5,6,10,7,10,10,10,9,null,10,1,7,1,5,null,6,null,null,null,null,null,null,null,null,null,6,null,null,null,6,null,2,4,2,4,null,2,4,null,2,9,null,null,null,null,1,10,1,6,null,null,null,null,null,4,3,6,7,10,null,null,null,null,null,6,8,6,9,10,null,8,null,null,null,null,null,null,null,null,null,7,null,3,6,1,6,1,7,null,10,null,null,null,null,null,null,null,10,null,null,null,null,5,5,6,7,7,6,9,2,null,9,7,3,null,7,7,null,null,8,2,7,5,4,4,null,null,10,9,null,9,2,null,9,null,2,null,null,null,null,null,null,null,2,null,null,null,1,4,null,2,null,4,null,null,2,null,1,null,1,null,null,4,null,8,null,10,null,null,null,10,7,null,null,null,null,null,null,null,null,null,null,null,null,9,4,8,6,null,null,null,null,null,6,null,2,2,null,null,null,null,null,null,null,null,null,null,null,6,10,null,7,6,5,1,3,3,1,6,6,5,null,null,5,null,null,null,2,null,null,null,null,5,2,1,4,9,6,10,5,6,3,6,3,4,7,1,null,4,null,null,null,null,9,null,null,null,null,null,1,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,8,null,null,2,3,null,2,null,null,5,10,null,null,6,null,10,null,null,10,3,null,null,null,null,null,null,null,null,null,null,null,null,null,null,9,null,4,null,4,4,6,5,4,2,6,null,3,9,null,null,null,null,10,null,4,null,6,null,null,1,null,null,null,2,null,null,1,2,10,8,10,null,10,5,8,null,8,5,null,3,null,null,null,null,8,null,null,null,null,6,null,null,null,7,null,null,null,7,null,null,null,3,null,null,null,7,7,null,null,null,2,null,null,9,null,2,8,7,10,5,null,9,null,null,null,null,null,null,6,7,null,null,4,null,null,null,null,null,null,null,null,null,null,null,2,null,null,7,null,8,9,5,null,6,5,null,5,null,null,null,null,null,null,null,null,null,null,null,null,10,4,null,null,null,null,null,1,null,2,null,null,8,3,6,4,null,null,6,8,null,null,null,null,null,null,1,8,null,null,null,null,null,1,null,null,null,null,null,4,null,null,6,null,9,null,1,8,null,3,2,null,null,2,7,3,1,1,null,null,6,null,6,null,null,null,null,null,3,null,8,null,null,null,9,9,null,10,1,null,6,4,null,null,null,null,5,5,null,9,null,null,null,8,6,null,null,null,null,null,null,null,null,null,null,null,null,null,2,null,null,null,5,8,null,null,null,null,3,null,null,null,null,10,1,4,null,4,null,6,1,null,null,null,2,8,1,null,10,null,null,null,null,6,null,null,null,3]";


        TreeNodeCustom root = BinaryTreeBuilder.buildBinaryTree(rootList);

        LC1372_LongestZigZagBinaryTree solution1372 = new LC1372_LongestZigZagBinaryTree();

        int longest = solution1372.longestZigZag(root);

        Assertions.assertEquals(13, longest);
    }

    @Test
    void longestZigZag5() {
        String rootList = "[6,9,7,3,null,2,8,5,8,9,7,3,9,9,4,2,10,null," +
                "5,4,3,10,10,9,4,1,2,null,null,6,5,null,null,null,null,9," +
                "null,9,6,5,null,5,null,null,7,7,4,null,1,null,null,3,7,null," +
                "9,null,null,null,null,null,null,null,null,9,9,null,null,null," +
                "7,null,null,null,null,null,null,null,null,null,6,8,7,null,null,null,3,10,null,null,null,null,null,1,null,1,2]";

        TreeNodeCustom root = BinaryTreeBuilder.buildBinaryTree(rootList);

        LC1372_LongestZigZagBinaryTree solution1372 = new LC1372_LongestZigZagBinaryTree();

        int longest = solution1372.longestZigZag(root);

        Assertions.assertEquals(5, longest);
    }
}
