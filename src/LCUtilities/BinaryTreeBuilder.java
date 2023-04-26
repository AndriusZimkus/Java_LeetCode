package LCUtilities;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeBuilder {
    public static TreeNodeCustom buildBinaryTree(String rootList) {

        ArrayList<Integer> numbers = new ArrayList<>();
        rootList = rootList.substring(1, rootList.length() - 1);
        String[] s = rootList.split(",");

        for (String x : s) {
            if (x.equals("null")) {
                numbers.add(null);
            } else {
                numbers.add(Integer.parseInt(x));
            }
        }

        TreeNodeCustom current = null;
        TreeNodeCustom root = null;
        boolean isLeft = true;

        Queue<TreeNodeCustom> treeNodeCustomQueue = new LinkedList<>();

        for (Integer x : numbers) {
            if (current == null) {
                root = new TreeNodeCustom();
                current = root;
                continue;
            } else {
                if (x != null) {
                    TreeNodeCustom currentTreeNode = new TreeNodeCustom();
                    treeNodeCustomQueue.add(currentTreeNode);
                    if (current.left == null && isLeft) {
                        current.left = currentTreeNode;
                    } else if (current.right == null) {
                        current.right = currentTreeNode;
                    }
                }
            }
            if (!isLeft) {
                current = treeNodeCustomQueue.remove();
            }
            isLeft = !isLeft;

        }

        return root;
    }
}
