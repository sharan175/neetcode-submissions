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
    public void reorderList(ListNode head) {
         if (head == null || head.next == null) {
            return;
        }
         ListNode slow=head;
         ListNode fast=head;
         while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
         }
        ListNode n=slow.next;
        slow.next=null;
        ListNode prev=null;
        while(n!=null){
         ListNode next=n.next;
         n.next=prev;
         prev=n;
         n=next;
        }
         ListNode f=head;
         while(prev!=null){
            ListNode a=f;
            ListNode b=prev;
            f=f.next;
            prev=prev.next;
            a.next=b;
            b.next=f;
         }
           }
}
