import LCUtilities.TreeNodeCustom;

public class LC1372_LongestZigZagBinaryTree {

    // Editorial solution
    int pathLength = 0;

    private void maxZigZag(TreeNodeCustom node, boolean goLeft, int steps) {
        if (node == null) {
            return;
        }
        pathLength = Math.max(pathLength, steps);
        if (goLeft) {
            maxZigZag(node.left, false, steps + 1);
            maxZigZag(node.right, true, 1);
        } else {
            maxZigZag(node.left, false, 1);
            maxZigZag(node.right, true, steps + 1);
        }
    }

    public int longestZigZag(TreeNodeCustom root) {
        maxZigZag(root, false, 0);
        maxZigZag(root, true, 0);
        return pathLength;
    }

//    public int longestZigZag(TreeNodeCustom root) {
//
//        int leftMax = maxZigZag(root, true, 0) - 1;
//        int rightMax = maxZigZag(root, false, 0) - 1;
//
//        return Math.max(leftMax, rightMax);
//    }
//
//    public int maxZigZag(TreeNodeCustom node, boolean isLeft, int currentCount) {
//
//        if (node == null) {
//            return currentCount;
//        }
//
//        if (isLeft) {
//
//            int correctZigZag = maxZigZag(node.left, false, currentCount + 1);
//            int leftIncorrect = maxZigZag(node.left, true, 0);
//            int rightIncorrect1 = maxZigZag(node.right, true, 0);
//            int rightIncorrect2 = maxZigZag(node.right, false, 0);
//
//            int maxResult = 0;
//            if (correctZigZag > leftIncorrect) {
//                maxResult = correctZigZag;
//            } else maxResult = leftIncorrect;
//
//            if (rightIncorrect1 > maxResult) {
//                maxResult = rightIncorrect1;
//            }
//            if (rightIncorrect2 > maxResult) {
//                maxResult = rightIncorrect2;
//            }
//
//            return maxResult;
//
//
//        } else {
//
//            int correctZigZag = maxZigZag(node.right, true, currentCount + 1);
//            int rightIncorrect = maxZigZag(node.right, false, 0);
//            int leftIncorrect1 = maxZigZag(node.left, true, 0);
//            int leftIncorrect2 = maxZigZag(node.left, false, 0);
//
//            int maxResult = 0;
//            if (correctZigZag > rightIncorrect) {
//                maxResult = correctZigZag;
//            } else maxResult = rightIncorrect;
//
//            if (leftIncorrect1 > maxResult) {
//                maxResult = leftIncorrect1;
//            }
//            if (leftIncorrect2 > maxResult) {
//                maxResult = leftIncorrect2;
//            }
//
//            return maxResult;
//
//        }
//
//    }


}
