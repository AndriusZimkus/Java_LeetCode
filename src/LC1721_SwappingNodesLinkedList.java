import LCUtilities.ListNode;

public class LC1721_SwappingNodesLinkedList {
    public ListNode swapNodes(ListNode head, int k) {

        int sizeOfLinkedList = getLinkedListLength(head);
        if (sizeOfLinkedList < 2) {
            return head;
        }
        if (sizeOfLinkedList == 2) {

            ListNode placeholder = head.next;

            head.next = null;
            placeholder.next = head;


            return placeholder;
        }

        ListNode previousListNode = null;

        int i = 1;
        ListNode next = head;
        ListNode previous = null;
        ListNode firstPrevious = null;
        ListNode first = null;
        ListNode firstNext = null;
        ListNode secondPrevious = null;
        ListNode second = null;
        ListNode secondNext = null;
        int firstIndex = 0;
        int secondIndex = 0;
        if (k == sizeOfLinkedList - k + 1) {
            return head;
        }

        while (true) {

            if (i == k || i == sizeOfLinkedList - k + 1) {
                if (first == null) {
                    firstPrevious = previous;
                    first = next;
                    firstNext = next.next;
                    firstIndex = i;
                } else {
                    secondPrevious = previous;
                    second = next;
                    secondNext = next.next;
                    secondIndex = i;
                }

            }

            i++;

            previous = next;
            next = next.next;

            if (next == null) {
                break;
            }

        }
        

        if (firstIndex == 1) {
            head = second;
        }
        if (secondIndex == 1) {
            head = first;
        }

        if (Math.abs(firstIndex - secondIndex) == 1) {
            first.next = secondNext;
            if (firstPrevious != null) {
                firstPrevious.next = second;
            }

            second.next = first;


        } else {
            if (secondPrevious != null) {
                secondPrevious.next = first;
            }
            if (firstPrevious != null) {
                firstPrevious.next = second;
            }

            first.next = secondNext;
            second.next = firstNext;
        }


        return head;
    }

    private int getLinkedListLength(ListNode head) {
        ListNode next = head;
        int i = 0;
        while (next != null) {
            i++;
            next = next.next;
        }
        return i;
    }
}
