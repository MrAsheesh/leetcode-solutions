/*
LeetCode 92 - Reversed Linked List ||
https://leetcode.com/problems/reverse-linked-list-ii/submissions/1963622664/
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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode prev = dummyNode;

        for(int i=1; i<left; i++) {
            prev = prev.next;
        }

        ListNode current = prev.next;
        for(int i=0; i<(right-left); i++) {
            ListNode nxt = current.next;
            current.next = nxt.next;
            nxt.next = prev.next;
            prev.next = nxt;
        }

        return dummyNode.next;

    }
}
