package org.example.medium;
import org.example.types.ListNode;

public class InsertGCDInLinkedList {
    //https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/description/
    public static int getGCD(int a, int b) {
        while (b != 0){
            int temp = a;
            a = b;
            b = temp % b;
        }
        return Math.abs(a);
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        for(ListNode current = head; current != null && current.next != null; current = current.next.next) {
            int insertedGCD = getGCD(current.val, current.next.val);
            current.next = new ListNode(insertedGCD, current.next);
        }
        return head;
    }
}
