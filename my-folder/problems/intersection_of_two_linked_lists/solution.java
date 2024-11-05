/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int getDifference(ListNode head1, ListNode head2) {
        int l1=0, l2=0;
        while(head1 != null || head2 != null) {
            if(head1 != null) {
                l1++;
                head1 = head1.next;
            }
            if(head2 != null) {
                l2++;
                head2 = head2.next;
            }
        }
        return l1-l2;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int d = getDifference(headA, headB);

        if(d < 0) {
            while(d < 0) {
                headB = headB.next;
                d++;
            }
        } else if(d > 0) {
            while(d > 0) {
                headA = headA.next;
                d--;
            }
        }

        while(headA != null) {
            if(headA == headB)
                return headA;

            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}