package medium;

import org.example.medium.InsertGCDInLinkedList;
import org.example.types.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InsertGCDInLinkedListTest {
    //https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/description/
    public ListNode createList(int[] nodeValues) {
        ListNode head = new ListNode(nodeValues[0], null);
        ListNode next = null;
        for (int i = nodeValues.length - 1; i > 0; i--) {
            next = new ListNode(nodeValues[i], next);
        }
        head.next = next;
        return head;
    }

    public void assertEqualsLists(ListNode expected, ListNode actual) {
        ListNode e = expected, a = actual;
        int positionIdx = 0;
        for (; e != null && a != null; e = e.next, a = a.next) {
            assertEquals(e.val, a.val,
                    "On position " + positionIdx + "expected: " + e.val + ", but actual is: " + a.val);
        }
        if (e != null || a != null) {
            fail();
        }
    }

    @Test
    public void testGCDInList1() {
        ListNode list = createList(new int[]{18, 6, 10, 3});
        InsertGCDInLinkedList insertGCDInLinkedList = new InsertGCDInLinkedList();
        ListNode actual = insertGCDInLinkedList.insertGreatestCommonDivisors(list);
        ListNode expected = createList(new int[]{18, 6, 6, 2, 10, 1, 3});
        assertEqualsLists(expected, actual);
    }

    @Test
    public void testGCDInList2() {
        ListNode list = createList(new int[]{7});
        InsertGCDInLinkedList insertGCDInLinkedList = new InsertGCDInLinkedList();
        ListNode actual = insertGCDInLinkedList.insertGreatestCommonDivisors(list);
        ListNode expected = createList(new int[]{7});
        assertEqualsLists(expected, actual);
    }
}
