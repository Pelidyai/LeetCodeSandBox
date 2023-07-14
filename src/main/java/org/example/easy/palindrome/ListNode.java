package org.example.easy.palindrome;


public class ListNode {
    //https://leetcode.com/problems/palindrome-linked-list/
    public int val;
    public ListNode next;

    ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
