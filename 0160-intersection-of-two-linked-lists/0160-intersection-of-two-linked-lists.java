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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currHeadA = headA;
        ListNode currHeadB = headB;

        while(currHeadA != currHeadB) {
            currHeadA = (currHeadA == null) ? headB : currHeadA.next;
            currHeadB = (currHeadB == null) ? headA : currHeadB.next;
        }

        return currHeadA;
    }
}