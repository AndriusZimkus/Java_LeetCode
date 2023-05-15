import LCUtilities.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LC1721_SwappingNodesLinkedListTest {

    LC1721_SwappingNodesLinkedList lc1721_swappingNodesLinkedList = new LC1721_SwappingNodesLinkedList();

    @Test
    void swapNodes1() {

        int[] headArray = {1, 2, 3, 4, 5};
        int k = 2;
        int[] expected = {1, 4, 3, 2, 5};

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

        head = lc1721_swappingNodesLinkedList.swapNodes(head, k);

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
    void swapNodes2() {

        int[] headArray = {7, 9, 6, 6, 7, 8, 3, 0, 9, 5};
        int k = 5;
        int[] expected = {7, 9, 6, 6, 8, 7, 3, 0, 9, 5};

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

        head = lc1721_swappingNodesLinkedList.swapNodes(head, k);

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
    void swapNodes3() {

        // Case 3
        int[] headArray = {1};
        int k = 1;
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

        head = lc1721_swappingNodesLinkedList.swapNodes(head, k);

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
    void swapNodes4() {

        // Case 3
        int[] headArray = {1, 2};
        int k = 1;
        int[] expected = {2, 1};

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

        head = lc1721_swappingNodesLinkedList.swapNodes(head, k);

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
    void swapNodes5() {

        // Case 8
        int[] headArray = {80, 46, 66, 35, 64};
        int k = 1;
        int[] expected = {64, 46, 66, 35, 80};

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

        head = lc1721_swappingNodesLinkedList.swapNodes(head, k);

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
    void swapNodes6() {

        // Case 131
        int[] headArray = {100, 90};
        int k = 2;
        int[] expected = {90, 100};

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

        head = lc1721_swappingNodesLinkedList.swapNodes(head, k);

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
    void swapNodes7() {

        // Case 132
        int[] headArray = {55, 60, 78, 53, 93, 37, 31, 4, 61, 11, 13, 51, 34, 83, 24, 96, 5, 77, 1, 67};
        int k = 11;
        int[] expected = {55, 60, 78, 53, 93, 37, 31, 4, 61, 13, 11, 51, 34, 83, 24, 96, 5, 77, 1, 67};

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

        head = lc1721_swappingNodesLinkedList.swapNodes(head, k);

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
    void swapNodes8() {

        // Case 5
        int[] headArray = {1, 2, 3};
        int k = 2;
        int[] expected = {1, 2, 3};

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

        head = lc1721_swappingNodesLinkedList.swapNodes(head, k);

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
