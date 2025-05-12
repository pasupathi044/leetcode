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
        // Edge case: if list is empty or has only one node, no rearrangement needed
        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head;            // Pointer to current odd node
        ListNode even = head.next;      // Pointer to current even node
        ListNode evenHead = even;       // Keep the head of even nodes to attach later

        // Loop until either even or even.next is null
        while (even != null && even.next != null) {
            odd.next = even.next;       // Link odd node to next odd node
            odd = odd.next;             // Move odd pointer forward

            even.next = odd.next;       // Link even node to next even node
            even = even.next;           // Move even pointer forward
        }

        // Attach even list after the end of odd list
        odd.next = evenHead;

        return head;
    }
}
