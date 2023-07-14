package medium;

import org.example.medium.AddTwoNumbers;
import org.example.types.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddTwoNumbersTest {
    //https://leetcode.com/problems/add-two-numbers/
    public ListNode createList(int[] nodeValues) {
        ListNode head = new ListNode(nodeValues[0], null);
        ListNode next = null;
        for (int i = nodeValues.length - 1; i > 0; i--) {
            next = new ListNode(nodeValues[i], next);
        }
        head.next = next;
        return head;
    }

    public void assertListsEquals(ListNode expected, ListNode actual) {
        while (expected != null && actual != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
        assertNull(expected);
        assertNull(actual);
    }

    @Test
    public void testAddTwoNumbers1() {
        ListNode list1 = createList(new int[]{2, 4, 3});
        ListNode list2 = createList(new int[]{5, 6, 4});
        ListNode expected = createList(new int[]{7, 0, 8});
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode actual = addTwoNumbers.addTwoNumbers(list1, list2);
        assertListsEquals(expected, actual);
    }

    @Test
    public void testAddTwoNumbers2() {
        ListNode list1 = createList(new int[]{0});
        ListNode list2 = createList(new int[]{0});
        ListNode expected = createList(new int[]{0});
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode actual = addTwoNumbers.addTwoNumbers(list1, list2);
        assertListsEquals(expected, actual);
    }

    @Test
    public void testAddTwoNumbers3() {
        ListNode list1 = createList(new int[]{9, 9, 9, 9, 9, 9, 9});
        ListNode list2 = createList(new int[]{9, 9, 9, 9});
        ListNode expected = createList(new int[]{8, 9, 9, 9, 0, 0, 0, 1});
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode actual = addTwoNumbers.addTwoNumbers(list1, list2);
        assertListsEquals(expected, actual);
    }

    @Test
    public void testAddTwoNumbers4() {
        ListNode list1 = createList(new int[]{2,4,9});
        ListNode list2 = createList(new int[]{5,6,4,9});
        ListNode expected = createList(new int[]{7,0,4,0,1});
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode actual = addTwoNumbers.addTwoNumbers(list1, list2);
        assertListsEquals(expected, actual);
    }
}
