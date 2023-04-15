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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        int count=0;
        while(temp!=null) {
            count++;
            temp = temp.next;
        }
        count = count/2;
        ListNode curr = head;
        ListNode prev = null;
        if(curr.next==null || curr==null)
            return null;

        while(count>0) {
            prev=curr;
            curr=curr.next;
            count--;
        }
        prev.next = curr.next;

        return head;
    }
}