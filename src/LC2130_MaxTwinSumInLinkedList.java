import LCUtilities.ListNode;

import java.util.ArrayList;

public class LC2130_MaxTwinSumInLinkedList {
    public int pairSum(ListNode head) {

        int max = 0;
        ArrayList<Integer> vals = new ArrayList<>();
        int index = 0;
        for (ListNode current = head; current != null; current = current.next) {

            int currentValue = current.val;

            vals.add(currentValue);

            index++;

        }

        int n = vals.size();
        for (int i = 0; i < vals.size(); i++) {
            max = Math.max(max, vals.get(i) + vals.get(n - 1 - i));
            if (i > (n / 2 - 1)) {
                break;
            }
        }

        return max;
    }
}
