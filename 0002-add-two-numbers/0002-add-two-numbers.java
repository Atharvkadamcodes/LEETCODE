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
import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        while (l1 != null) {
            s1.append(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            s2.append(l2.val);
            l2 = l2.next;
        }

        s1.reverse();
        s2.reverse();

        BigInteger n1 = new BigInteger(s1.toString());
        BigInteger n2 = new BigInteger(s2.toString());

        String result = n1.add(n2).toString();

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for (int i = result.length() - 1; i >= 0; i--) {
            curr.next = new ListNode(result.charAt(i) - '0');
            curr = curr.next;
        }

        return dummy.next;
    }
}