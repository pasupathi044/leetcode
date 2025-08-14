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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        ListNode temp2 = null;
        while(temp!=null){
           
            if(temp==head && temp.val == val){
                head=head.next;
                temp=temp.next;
            }
            else{
               if(temp.val!=val){
                temp2 = temp;
                temp=temp.next;
               }
               else{
                  temp2.next=temp.next;
                  temp = temp.next;
               }
            } 
        }
        return head;
    }
}