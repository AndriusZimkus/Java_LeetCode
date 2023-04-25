public class AddTwoNumbers2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int firstNumber = 0;
        int secondNumber = 0;


        int i = 0;
        ListNode currentListNode = l1;
        while (true) {
            firstNumber += currentListNode.val * Math.pow(10, i);
            i++;
            currentListNode = currentListNode.next;
            if (currentListNode == null) {
                break;
            }
        }

        i = 0;
        currentListNode = l2;
        while (true) {
            secondNumber += currentListNode.val * Math.pow(10, i);
            i++;
            currentListNode = currentListNode.next;
            if (currentListNode == null) {
                break;
            }
        }

        Integer finalNumber = firstNumber + secondNumber;

        String finalNumberString = finalNumber.toString();
        currentListNode = null;
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
