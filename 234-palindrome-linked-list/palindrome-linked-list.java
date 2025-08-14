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
    public boolean isPalindrome(ListNode head) {
        //Find Middle 
        ListNode temp = head;
         ListNode f = head;
         ListNode s = head;
         while(f!=null && f.next!=null){
            f =f.next.next;
            s =s.next;
         }
        //Reverse
        ListNode prev = null;
        ListNode curr = s;
        while (curr!=null){
            ListNode nextNode = curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }

        // find if Palindrome 
        while(prev!=null){
            if(prev.val!=temp.val)return false;
            prev=prev.next;
            temp=temp.next;
        }
        return true;
    }

}