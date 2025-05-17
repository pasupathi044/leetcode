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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp =head;
        ListNode kthnode = null;
        ListNode prev=null;

        while(temp!=null){
            kthnode = findnode(temp,k);
            if(kthnode==null){
             prev.next = temp;
              break;
            }

            ListNode nxtnode = kthnode.next;
            kthnode.next = null;
            reverse(temp);
            if(temp==head){
                head=kthnode;
            }
            else{ prev.next = kthnode;}
            prev = temp;
            temp=nxtnode;
        }
        return head;
    }

// find k th node: 
    ListNode findnode (ListNode temp, int k){
        k-=1;
        while(temp!=null && k > 0){
            k--;
            temp= temp.next;
        }
        return temp;
    }
// find the reverse of the grp:
ListNode reverse(ListNode temp){
      ListNode a = temp;
      ListNode b = temp;
      ListNode n = null;
       while(a!=null){
        b=a.next;
        a.next=n;
        n=a;
        a=b;
       }
       return n;
}

}