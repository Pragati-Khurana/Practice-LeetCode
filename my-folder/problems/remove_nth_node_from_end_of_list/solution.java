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
    public ListNode reverse(ListNode prev, ListNode cur) {
        ListNode temp=null;

        while(cur!=null) {
            temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = null;
        ListNode cur = head;
        
        head = reverse(null, head);

        if(n==1) {
            head = head.next;
            head = reverse(null, head);
            return head;
        }

        int count=1;
        prev = null;
        cur = head;
        while(count<n) {
            prev = cur;
            cur = cur.next;
            count++;
        }
        prev.next = cur.next;

        head = reverse(null, head);

        return head;
    }
}