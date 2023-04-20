import LongestZigZagBinaryTree1372.BinaryTreeBuilder;
import LongestZigZagBinaryTree1372.LongestZigZagBinaryTree1372;
import LongestZigZagBinaryTree1372.TreeNodeCustom;

public class Main {
    public static void main(String[] args) {

        String rootList = "[1,null,1,1,1,null,null,1,1,null,1,null,null,null,1,null,1]";

        TreeNodeCustom root = BinaryTreeBuilder.buildBinaryTree(rootList);

        LongestZigZagBinaryTree1372 solution1372 = new LongestZigZagBinaryTree1372();

        int longest = solution1372.longestZigZag(root);
        System.out.println(longest);

    }
}
