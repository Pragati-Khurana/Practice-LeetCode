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
    public ListNode middleNode(ListNode head) {
        int count=1;
        ListNode temp = head;
        while(temp.next != null) {
            count++;
            temp = temp.next;
        }
        int x = count/2 + 1;
        count=1;
        temp = head;
        while(count!=x) {
            count++;
            temp = temp.next;
        }
        return temp;
    }
}