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
        ListNode l = new ListNode();
        ListNode head = l;
        ListNode prev = l;
        int carry = 0;
        while(l1!=null || l2!=null) {
            int temp = (l1!=null?l1.val:0) + (l2!=null?l2.val:0) + carry;
            carry = temp/10;
            l.val = temp%10;
            
            if((l2!=null?l2.next!=null?true:false:false) || (l1!=null?l1.next!=null?true:false:false)) {
                l = new ListNode();
                prev.next = l;
                prev = prev.next;
            }

            l1 = (l1!=null?l1.next:null);
            l2 = (l2!=null?l2.next:null);
        }
        if(carry>0) {
            l = new ListNode();
            l.val = carry;
            prev.next = l;
        }
        return head;
    }
}