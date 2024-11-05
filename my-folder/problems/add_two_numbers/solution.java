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
        ListNode ll1 = l1;
        ListNode ll2 = l2;
        ListNode temp = new ListNode();
        ListNode dummy = temp;
        int carry=0;

        while(ll1 != null || ll2 != null || carry != 0) {
            int sum=0;
            if(ll1 != null) {
                sum += ll1.val;
                ll1 = ll1.next;
            }

            if(ll2 != null) {
                sum += ll2.val;
                ll2 = ll2.next;
            }
            sum += carry;
            ListNode nn = new ListNode();
            nn.val = sum % 10;
            nn.next = null;
            carry = sum/10;
            temp.next = nn;
            temp = nn;
        }
        return dummy.next;
    }
}