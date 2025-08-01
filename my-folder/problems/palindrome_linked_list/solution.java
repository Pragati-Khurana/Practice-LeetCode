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
    public ListNode Reverse(ListNode head) {
        if(head == null || head.next == null)
            return head;
        
        ListNode newHead = Reverse(head.next);

        ListNode front = head.next;
        front.next = head;
        head.next = null;

        return newHead;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newHead = Reverse(slow.next);
        System.out.println(slow.next);

        ListNode first = head;
        ListNode second = newHead;

        // System.out.println(head.val + " " + newHead.val);

        while(second != null) {
            if(first.val != second.val) {
                Reverse(newHead);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        Reverse(newHead);
        return true;
    }
}