import LCUtilities.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LC2_AddTwoNumbersTest {

    @Test
    void addTwoNumbers1() {
        int firstNumber = 342;
        int secondNumber = 465;

        ListNode l1 = LC2_AddTwoNumbers.parseListNodeFromNumber(firstNumber);
        ListNode l2 = LC2_AddTwoNumbers.parseListNodeFromNumber(secondNumber);


        ListNode l3 = new LC2_AddTwoNumbers().addTwoNumbers(l1, l2);

        int result = LC2_AddTwoNumbers.parseNumberFromListNode(l3);

        Assertions.assertEquals(807, result);
    }

    @Test
    void addTwoNumbers2() {
        int firstNumber = 9999999;
        int secondNumber = 9999;

        ListNode l1 = LC2_AddTwoNumbers.parseListNodeFromNumber(firstNumber);
        ListNode l2 = LC2_AddTwoNumbers.parseListNodeFromNumber(secondNumber);

        ListNode l3 = new LC2_AddTwoNumbers().addTwoNumbers(l1, l2);

        int result = LC2_AddTwoNumbers.parseNumberFromListNode(l3);

        Assertions.assertEquals(10009998, result);
    }

    @Test
    void addTwoNumbers3() {
        int firstNumber = 199;
        int secondNumber = 1;

        ListNode l1 = LC2_AddTwoNumbers.parseListNodeFromNumber(firstNumber);
        ListNode l2 = LC2_AddTwoNumbers.parseListNodeFromNumber(secondNumber);

        ListNode l3 = new LC2_AddTwoNumbers().addTwoNumbers(l1, l2);

        int result = LC2_AddTwoNumbers.parseNumberFromListNode(l3);

        Assertions.assertEquals(200, result);
    }
}
