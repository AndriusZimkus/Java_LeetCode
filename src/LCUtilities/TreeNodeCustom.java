package LCUtilities;

public class TreeNodeCustom {
    public int val;
    public TreeNodeCustom left;
    public TreeNodeCustom right;

    public TreeNodeCustom() {
    }

    public TreeNodeCustom(int val) {
        this.val = val;
    }

    public TreeNodeCustom(int val, TreeNodeCustom left, TreeNodeCustom right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
