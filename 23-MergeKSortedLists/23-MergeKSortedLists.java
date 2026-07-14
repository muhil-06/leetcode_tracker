// Last updated: 14/07/2026, 14:18:56
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
    public ListNode mergeKLists(ListNode[] list) {
        PriorityQueue <ListNode> pq=
        new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode node:list){
            if(node!=null){
                pq.offer(node);
            }
        }
        ListNode d=new ListNode(0);
        ListNode tail=d;
        while(!pq.isEmpty()){
            ListNode node=pq.poll();
            tail.next=node;
            tail=tail.next;
            if(node.next!=null){
                pq.offer(node.next);
            }
        }
        return d.next;
    }
}