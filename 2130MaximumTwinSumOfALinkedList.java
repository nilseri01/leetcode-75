// https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list
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
    public int pairSum(ListNode head) {
        int result = 0;

        ListNode middle = findSecondHalfStartNode(head);
        ListNode tail = reverseLinkedList(middle); // reverse second half

        while (tail != null) {
            result = Math.max(result, head.val + tail.val);
            head = head.next;
            tail = tail.next;
        }

        return result;
    }

    private ListNode findSecondHalfStartNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
