package LongestZigZagBinaryTree1372;

public class TreeNodeCustom {
    int val;
    TreeNodeCustom left;
    TreeNodeCustom right;

    TreeNodeCustom() {
    }

    TreeNodeCustom(int val) {
        this.val = val;
    }

    TreeNodeCustom(int val, TreeNodeCustom left, TreeNodeCustom right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
