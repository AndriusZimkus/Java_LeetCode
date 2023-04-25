public class AddTwoNumbers2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int firstNumber = parseNumberFromListNode(l1);
        int secondNumber = parseNumberFromListNode(l2);
        
        Integer finalNumber = firstNumber + secondNumber;

        return parseListNodeFromNumber(finalNumber);

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
}
