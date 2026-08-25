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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode n=null;
        ListNode m=null;
        while(l1!=null || l2!=null){
            int a=0,b=0;
            if(l1!=null) a=l1.val;
            if(l2!=null) b=l2.val;
            int c=a+b+carry;
            if(c<10) carry=0;
            if(c>=10){
             carry=1;
             c=c-10;
             }
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
            ListNode k=new ListNode(c);
            if(m==null){
                m=k;
                n=k;
            }
            n.next=k;
            n=n.next;
            n.next=null;
        }
        if(carry!=0){
            ListNode k=new ListNode(carry);
            n.next=k;
            k.next=null;
        }
        return m;
    }
}
