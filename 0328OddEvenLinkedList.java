// https://leetcode.com/problems/odd-even-linked-list
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
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode oddCurrentNode = head;
        ListNode evenCurrentNode = head.next;
        ListNode evenHeadNode = evenCurrentNode;
        while (evenCurrentNode != null && evenCurrentNode.next != null) {
            oddCurrentNode.next = evenCurrentNode.next;
            oddCurrentNode = oddCurrentNode.next;
            
            evenCurrentNode.next = oddCurrentNode.next;
            evenCurrentNode = evenCurrentNode.next;
        }
        oddCurrentNode.next = evenHeadNode;
        return head;
    }
}
