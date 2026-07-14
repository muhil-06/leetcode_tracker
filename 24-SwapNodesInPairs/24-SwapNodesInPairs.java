// Last updated: 14/07/2026, 14:18:54
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
    public ListNode swapPairs(ListNode head) {
        ListNode d=new ListNode(0);
        d.next=head;
        ListNode prev=d;
        while(prev.next!=null&&prev.next.next!=null){
            ListNode first=prev.next;
            ListNode second=first.next;
            first.next=second.next;
            second.next=first;
            prev.next=second;
            prev=first;
        }
        return d.next;
        
    }
}