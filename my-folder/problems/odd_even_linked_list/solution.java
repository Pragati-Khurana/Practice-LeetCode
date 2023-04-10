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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null)
            return head;
            
        int count=2;
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode odd = head;
        ListNode even = head.next;

        while(curr != null) {
            if(curr.next==null) {
                if(count%2!=0) {
                    prev.next = null;
                    curr.next = even;
                    break;
                }
                else {
                    prev.next = even;
                }
            } else {
                prev.next = curr.next;
            }
            
            prev = curr;
            curr = curr.next;
            count++;
        }
        return head;
    }
}