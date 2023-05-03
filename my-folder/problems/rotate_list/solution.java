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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next==null)
            return head;

        int size = 1;
        ListNode curr = head;
        while(curr.next!=null) {
            size++;
            curr = curr.next;
        }
        k = k%size;
        int count=size-k;
        if(k==0)
            return head;
        //System.out.println("Size: " + size + " count: " + count);
        ListNode temp = head;
        while(count>1) {
            temp = temp.next;
            count--;
        }
        //System.out.println(temp.next.val);
        
        if(k>0)
            curr.next = head;

        head = temp.next;
        temp.next = null;

        return head;
    }
}