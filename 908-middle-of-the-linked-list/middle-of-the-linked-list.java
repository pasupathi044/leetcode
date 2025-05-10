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
    public ListNode middleNode(ListNode head) {
    // edge case 
    if(head==null||head.next==null)return head;
    //count the size
    ListNode crr = head;
      int cnt=0;
          while(crr!= null){
            cnt++;
            crr=crr.next;
        }
    // find the mid
    double mid= cnt/2;
    //find the element in the list
    ListNode temp = head; 
      for(int i=0;i< mid;i++){
           temp=temp.next;
      }
    return temp;
    }
}