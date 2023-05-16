import LCUtilities.ListNode;

public class LC24_SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode previous = null;
        for (ListNode current = head; current != null; current = current.next) {

            ListNode currentNext = current.next;
            if (currentNext == null) {
                break;
            }
            ListNode currentNextNext = currentNext.next;
            if (current == head) {
                head = current.next;
                current.next = currentNextNext;
                currentNext.next = current;
                previous = current;

            } else {
                previous.next = currentNext;
                current.next = currentNextNext;
                currentNext.next = current;
                previous = current;

            }


        }

        return head;
    }
}
