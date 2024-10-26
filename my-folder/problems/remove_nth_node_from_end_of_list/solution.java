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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int l=0;
        ListNode temp = head;

        while(temp != null) {
            l++;
            temp = temp.next;
        }
        n = l-n+1;

        ListNode cur = head;
        ListNode prev = null;
        int i = 1;
        while(i < n) {
            prev = cur;
            cur = cur.next;
            i++;
        }
        
        if(cur == head)
            head = cur.next;
        else if(cur.next == null)
            prev.next = null;
        else
            prev.next = cur.next;

        return head;
    }
}