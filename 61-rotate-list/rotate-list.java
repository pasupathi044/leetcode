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
    public ListNode rotateRight(ListNode head, int k) {
       // find the length and loop 
         ListNode temp = head;
         int cnt =1;
          if (head == null || head.next == null || k == 0) return head;
         while(temp.next!=null){
            cnt+=1;
           temp=temp.next;
         }
        temp.next= head;
        // solve edgecases
        k= k%cnt;
        if(k%cnt==0) {
            temp.next = null;
            return head ;}

        //  find the pviot:
         ListNode end = head;
         for(int i =0 ; i< cnt-k-1;i++ ){
            end = end.next;
         } 
        // make end the tail and end next as the head
       ListNode nhead=  end.next;
       end.next =null;
       return nhead;   

    }
}