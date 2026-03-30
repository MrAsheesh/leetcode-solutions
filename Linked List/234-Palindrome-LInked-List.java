/*
Leetcode 234 - Palindrome Linked List
https://leetcode.com/problems/palindrome-linked-list/description/
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        //Finding mid
        ListNode Slow = head;
        ListNode Fast = head;
        while(Fast != null && Fast.next != null) {
            Slow = Slow.next;
            Fast = Fast.next.next;
        }
        ListNode Prev = null;
        while(Slow != null) {
            ListNode NextP = Slow.next;
            Slow.next = Prev;
            Prev = Slow;
            Slow = NextP;
        }
        ListNode Dummy = head;
        while(Prev != null) {
            if(Dummy.val != Prev.val) return false;
            Dummy = Dummy.next;
            Prev = Prev.next;
        }

        return true;
    }
}
