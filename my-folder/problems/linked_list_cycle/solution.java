/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null)
            return false;
        
        ListNode curr = head.next.next;
        ListNode prev = head.next;
        while(curr != null && curr.next!=null) {
            if(curr==prev)
                return true;
            prev = prev.next;
            curr = curr.next.next;
        }
        return false;
    }
}