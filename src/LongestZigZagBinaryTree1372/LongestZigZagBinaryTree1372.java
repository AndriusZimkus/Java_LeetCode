package LongestZigZagBinaryTree1372;

public class LongestZigZagBinaryTree1372 {
    public int longestZigZag(TreeNodeCustom root) {

        int leftMax = maxZigZag(root, true, 0) - 1;
        int rightMax = maxZigZag(root, false, 0) - 1;

        return Math.max(leftMax, rightMax);
    }

    public int maxZigZag(TreeNodeCustom node, boolean isLeft, int currentCount) {

        if (node == null) {
            return currentCount;
        }

        if (isLeft) {

            int correctZigZag = maxZigZag(node.left, false, currentCount + 1);
            int leftIncorrect = maxZigZag(node.left, true, 0);
            int rightIncorrect1 = maxZigZag(node.right, true, 0);
            int rightIncorrect2 = maxZigZag(node.right, false, 0);

            int maxResult = 0;
            if (correctZigZag > leftIncorrect) {
                maxResult = correctZigZag;
            } else maxResult = leftIncorrect;

            if (rightIncorrect1 > maxResult) {
                maxResult = rightIncorrect1;
            }
            if (rightIncorrect2 > maxResult) {
                maxResult = rightIncorrect2;
            }

            return maxResult;


        } else {

            int correctZigZag = maxZigZag(node.right, true, currentCount + 1);
            int rightIncorrect = maxZigZag(node.right, false, 0);
            int leftIncorrect1 = maxZigZag(node.left, true, 0);
            int leftIncorrect2 = maxZigZag(node.left, false, 0);

            int maxResult = 0;
            if (correctZigZag > rightIncorrect) {
                maxResult = correctZigZag;
            } else maxResult = rightIncorrect;

            if (leftIncorrect1 > maxResult) {
                maxResult = leftIncorrect1;
            }
            if (leftIncorrect2 > maxResult) {
                maxResult = leftIncorrect2;
            }

            return maxResult;

        }

    }


}
