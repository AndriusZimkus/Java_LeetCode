import LCUtilities.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LC24_SwapNodesInPairsTest {

    LC24_SwapNodesInPairs lc24_swapNodesInPairs = new LC24_SwapNodesInPairs();

    @Test
    void swapPairs1() {

        int[] headArray = {1, 2, 3, 4};
        int[] expected = {2, 1, 4, 3};

        int n = headArray.length;
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

        head = lc24_swapNodesInPairs.swapPairs(head);

        int[] actual = new int[n];
        ListNode next = head;
        int i = 0;
        while (next != null) {
            actual[i] = next.val;
            i++;
            next = next.next;
        }

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    void swapPairs2() {

        int[] headArray = {};
        int[] expected = {};

        int n = headArray.length;
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

        head = lc24_swapNodesInPairs.swapPairs(head);

        int[] actual = new int[n];
        ListNode next = head;
        int i = 0;
        while (next != null) {
            actual[i] = next.val;
            i++;
            next = next.next;
        }

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    void swapPairs3() {

        int[] headArray = {1};
        int[] expected = {1};

        int n = headArray.length;
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

        head = lc24_swapNodesInPairs.swapPairs(head);

        int[] actual = new int[n];
        ListNode next = head;
        int i = 0;
        while (next != null) {
            actual[i] = next.val;
            i++;
            next = next.next;
        }

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    void swapPairs4() {

        int[] headArray = {1, 2, 3, 4, 5};
        int[] expected = {2, 1, 4, 3, 5};

        int n = headArray.length;
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

        head = lc24_swapNodesInPairs.swapPairs(head);

        int[] actual = new int[n];
        ListNode next = head;
        int i = 0;
        while (next != null) {
            actual[i] = next.val;
            i++;
            next = next.next;
        }

        Assertions.assertArrayEquals(expected, actual);

    }
}
