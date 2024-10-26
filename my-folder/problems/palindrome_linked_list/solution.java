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
    public boolean isPalindrome(ListNode head) {
        String ori = "";
        String rev = "";
        ListNode prev = null;
        ListNode cur = head;
        ListNode front;

        while(cur != null) {
            ori = ori + cur.val;
            front = cur.next;
            cur.next = prev;
            prev = cur;
            cur = front;
        }
        head = prev;
        ListNode temp = head;
        int i=0;
        while(temp != null) {
            rev = rev + temp.val;
            if(Integer.parseInt(String.valueOf(ori.charAt(i))) != temp.val)
                return false;
            i++;
            temp = temp.next;
        }
        
        if(ori.equals(rev))
            return true;
        return false;
    }
}