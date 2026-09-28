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
    public ListNode mergeKLists(ListNode[] lists) {
PriorityQueue<ListNode> q=new PriorityQueue<>((a,b)->a.val-b.val);
   for(ListNode l:lists){
    if(l!=null){
    q.offer(l);
    }
   }
   ListNode dummy=new ListNode(0);
   ListNode a=dummy;
   while(!q.isEmpty()){
      ListNode m=q.poll();
      a.next=m;
      a=a.next;
      if(m.next!=null){
        q.offer(m.next);
      }
   }
   return dummy.next;
    }
}
