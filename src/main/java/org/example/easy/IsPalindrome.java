package org.example.easy;

import org.example.types.ListNode;

public class IsPalindrome {
    //https://leetcode.com/problems/palindrome-linked-list/
    private int listSize = 0;

    private boolean isPalindrome = true;

    private ListNode checkIsPalindromeRecursively(ListNode node, int currentIdx) {
        if (node == null) {
            return null;
        }
        if (currentIdx < listSize / 2) {
            currentIdx++;
            ListNode foundNode = checkIsPalindromeRecursively(node.next, currentIdx);
            if(foundNode == null){
                return null;
            }
            if (foundNode.val == node.val) {
                return foundNode.next;
            } else {
                isPalindrome = false;
                return null;
            }
        }
        return listSize % 2 == 0
                ? node
                : node.next;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode node = head;
        while (node != null) {
            node = node.next;
            listSize++;
        }
        checkIsPalindromeRecursively(head, 0);
        return isPalindrome;
    }
}
