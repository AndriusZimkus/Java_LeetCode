public class AddTwoNumbers2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode currentL1 = null;
        ListNode currentL2 = null;

        boolean isL1Empty = false;
        boolean isL2Empty = false;
        ListNode previousListNode = null;
        ListNode currentListNode = null;
        ListNode firstListNode = null;

        int currentL1Value = 0;
        int currentL2Value = 0;

        boolean hasCarry = false;

        while (!isL1Empty || !isL2Empty) {


            if (!isL1Empty) {
                if (currentL1 == null) {
                    currentL1 = l1;
                } else if (currentL1.next == null) {
                    currentL1 = null;
                    isL1Empty = true;
                } else currentL1 = currentL1.next;
            }


            if (!isL2Empty) {
                if (currentL2 == null) {
                    currentL2 = l2;
                } else if (currentL2.next == null) {
                    currentL2 = null;
                    isL2Empty = true;
                } else currentL2 = currentL2.next;


            }

            if (isL1Empty && isL2Empty && !hasCarry) {
                break;
            }

            if (currentL1 != null) {
                currentL1Value = currentL1.val;
            } else currentL1Value = 0;

            if (currentL2 != null) {
                currentL2Value = currentL2.val;
            } else currentL2Value = 0;


            int currentNumber = currentL1Value + currentL2Value + ((hasCarry) ? 1 : 0);

            if (currentNumber >= 10) {
                hasCarry = true;
            } else hasCarry = false;
            currentNumber = currentNumber % 10;

            currentListNode = new ListNode(currentNumber);

            if (firstListNode == null) {
                firstListNode = currentListNode;
            }
            if (previousListNode != null) {
//                currentListNode.next = previousListNode;
                previousListNode.next = currentListNode;
            }
            previousListNode = currentListNode;


        }

        return firstListNode;


//        int firstNumber = parseNumberFromListNode(l1);
//        int secondNumber = parseNumberFromListNode(l2);
//
//        Integer finalNumber = firstNumber + secondNumber;
//
//        return parseListNodeFromNumber(finalNumber);

    }

    public static int parseNumberFromListNode(ListNode listNode) {
        int i = 0;
        ListNode currentListNode = listNode;
        int number = 0;
        while (true) {
            number += currentListNode.val * Math.pow(10, i);
            i++;
            currentListNode = currentListNode.next;
            if (currentListNode == null) {
                break;
            }
        }

        return number;
    }

    public static ListNode parseListNodeFromNumber(int number) {

        String finalNumberString = Integer.toString(number);
        ListNode currentListNode = null;
        ListNode previousListNode = null;
        for (int x = 0; x < finalNumberString.length(); x++) {
            int currentNumber = Character.getNumericValue(finalNumberString.charAt(x));

            currentListNode = new ListNode(currentNumber);

            if (previousListNode != null) {
                currentListNode.next = previousListNode;
            }
            previousListNode = currentListNode;

        }

        return currentListNode;

    }

    public static ListNode parseListNodeFromString(String number) {


        ListNode currentListNode = null;
        ListNode previousListNode = null;
        for (int x = 0; x < number.length(); x++) {
            int currentNumber = Character.getNumericValue(number.charAt(x));

            currentListNode = new ListNode(currentNumber);

            if (previousListNode != null) {
                currentListNode.next = previousListNode;
            }
            previousListNode = currentListNode;

        }

        return currentListNode;

    }
}
