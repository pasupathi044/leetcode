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
        ListNode prev = null;
        ListNode temp=head;
        ListNode temp2=head;
        while(temp != null){
          temp2=temp.next;
          temp.next=prev;
          prev=temp;
          temp=temp2;
        }
        return prev;
    }
}