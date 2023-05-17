import LCUtilities.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LC2130_MaxTwinSumInLinkedListTest {

    LC2130_MaxTwinSumInLinkedList lc2130_maxTwinSumInLinkedList = new LC2130_MaxTwinSumInLinkedList();

    @Test
    void pairSum1() {

        int[] headArray = {5, 4, 2, 1};
        int expected = 6;

        ListNode head = null;
        ListNode previousListNode = null;
        for (int i = 0; i < headArray.length; i++) {
            ListNode currentListNode = new ListNode(headArray[i]);
            if (i == 0) {
                head = currentListNode;
            } else {
                previousListNode.next = currentListNode;
            }
            previousListNode = currentListNode;

        }

        int actual = lc2130_maxTwinSumInLinkedList.pairSum(head);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void pairSum2() {

        int[] headArray = {4, 2, 2, 3};
        int expected = 7;

        ListNode head = null;
        ListNode previousListNode = null;
        for (int i = 0; i < headArray.length; i++) {
            ListNode currentListNode = new ListNode(headArray[i]);
            if (i == 0) {
                head = currentListNode;
            } else {
                previousListNode.next = currentListNode;
            }
            previousListNode = currentListNode;

        }

        int actual = lc2130_maxTwinSumInLinkedList.pairSum(head);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void pairSum3() {

        int[] headArray = {1, 100000};
        int expected = 100001;

        ListNode head = null;
        ListNode previousListNode = null;
        for (int i = 0; i < headArray.length; i++) {
            ListNode currentListNode = new ListNode(headArray[i]);
            if (i == 0) {
                head = currentListNode;
            } else {
                previousListNode.next = currentListNode;
            }
            previousListNode = currentListNode;

        }

        int actual = lc2130_maxTwinSumInLinkedList.pairSum(head);

        Assertions.assertEquals(expected, actual);
    }
}
