package easy;

import org.example.easy.palindrome.IsPalindrome;
import org.example.easy.palindrome.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IsPalindromeTest {
    //https://leetcode.com/problems/palindrome-linked-list/
    public ListNode createList(int[] nodeValues) {
        ListNode head = new ListNode(nodeValues[0], null);
        ListNode next = null;
        for (int i = nodeValues.length - 1; i > 0; i--) {
            next = new ListNode(nodeValues[i], next);
        }
        head.next = next;
        return head;
    }

    @Test
    public void testIsPalindrome1(){
        ListNode list = createList(new int[]{1, 2, 2, 1});
        IsPalindrome isPalindrome = new IsPalindrome();
        assertTrue(isPalindrome.isPalindrome(list));
    }

    @Test
    public void testIsPalindrome2(){
        ListNode list = createList(new int[]{1, 2, 3, 4});
        IsPalindrome isPalindrome = new IsPalindrome();
        assertFalse(isPalindrome.isPalindrome(list));
    }

    @Test
    public void testIsPalindrome3(){
        ListNode list = createList(new int[]{1, 0, 1});
        IsPalindrome isPalindrome = new IsPalindrome();
        assertTrue(isPalindrome.isPalindrome(list));
    }
}
