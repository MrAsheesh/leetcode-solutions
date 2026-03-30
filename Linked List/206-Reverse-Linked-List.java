/*
LeetCode 206 - Reverse Linked List
https://leetcode.com/problems/reverse-linked-list/submissions/1963620038/
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
    public ListNode reverseList(ListNode head) {
        ListNode CurrentPointer = head;
        ListNode PreviousPointer = null;
        while(CurrentPointer != null) {
            ListNode NextPointer = CurrentPointer.next;
            CurrentPointer.next = PreviousPointer;
            PreviousPointer = CurrentPointer;
            CurrentPointer = NextPointer;
        }
        return PreviousPointer;
    }
}
