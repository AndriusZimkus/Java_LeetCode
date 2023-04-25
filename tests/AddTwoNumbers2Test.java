import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddTwoNumbers2Test {

    @Test
    void addTwoNumbers1() {
        int firstNumber = 342;
        int secondNumber = 465;

        ListNode l1 = AddTwoNumbers2.parseListNodeFromNumber(firstNumber);
        ListNode l2 = AddTwoNumbers2.parseListNodeFromNumber(secondNumber);


        ListNode l3 = new AddTwoNumbers2().addTwoNumbers(l1, l2);

        int result = AddTwoNumbers2.parseNumberFromListNode(l3);

        Assertions.assertEquals(807, result);
    }

    @Test
    void addTwoNumbers2() {
        int firstNumber = 9;
        int secondNumber = 9999999991;

        ListNode l1 = AddTwoNumbers2.parseListNodeFromNumber(firstNumber);
        ListNode l2 = AddTwoNumbers2.parseListNodeFromNumber(secondNumber);


        ListNode l3 = new AddTwoNumbers2().addTwoNumbers(l1, l2);

        int result = AddTwoNumbers2.parseNumberFromListNode(l3);

        Assertions.assertEquals(807, result);
    }
}
