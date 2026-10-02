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
    public ListNode oddEvenList(ListNode head) {
        ListNode evenHead = null;
        ListNode evenTail = null;

        ListNode oddHead = null;
        ListNode oddTail = null;

        int count = 1;
        ListNode curr = head;

        while(curr != null) {
            ListNode next = curr.next;
            curr.next = null;

            if(count % 2 == 0) {
                if(evenHead == null) {
                    evenHead = evenTail = curr;
                } else {
                    evenTail.next = curr;
                    evenTail = curr;
                }
            } else {
                if(oddHead == null) {
                    oddHead = oddTail = curr;
                } else {
                    oddTail.next = curr;
                    oddTail = curr;
                }
            }

            count++;
            curr = next;
        }

        if(oddHead == null) {
            return evenHead;
        }

        oddTail.next = evenHead;
        return oddHead;
    }
}