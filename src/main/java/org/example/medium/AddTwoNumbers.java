package org.example.medium;

import org.example.types.ListNode;

public class AddTwoNumbers {
    //https://leetcode.com/problems/add-two-numbers/
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode reversedSum = reversedSum(l1, l2);
        return reverse(reversedSum);
    }

    private ListNode reversedSum(ListNode reversed1, ListNode reversed2) {
        ListNode node1 = reversed1;
        ListNode node2 = reversed2;
        ListNode result = null;
        int extraOne = 0;
        while (node1 != null || node2 != null) {
            int val1 = node1 != null ? node1.val : 0;
            int val2 = node2 != null ? node2.val : 0;
            int sum = val1 + val2 + extraOne;
            extraOne = sum / 10;
            result = new ListNode(sum % 10, result);
            if (node1 != null) {
                node1 = node1.next;
            }
            if (node2 != null) {
                node2 = node2.next;
            }
        }
        if(extraOne == 1){
            result = new ListNode(1, result);
        }
        return result;
    }

    private ListNode reverse(ListNode head) {
        ListNode node = head;
        ListNode result = null;
        while (node != null) {
            result = new ListNode(node.val, result);
            node = node.next;
        }
        return result;
    }
}
