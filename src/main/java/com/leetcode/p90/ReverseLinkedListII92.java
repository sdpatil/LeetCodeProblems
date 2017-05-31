package com.leetcode.p90;

import com.leetcode.ListNode;

/**
 * Created by sunilpatil on 5/26/17.
 */
public class ReverseLinkedListII92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null)
            return head;
        ListNode dummyNode = new ListNode(Integer.MIN_VALUE);
        dummyNode.next = head;

        ListNode pre = dummyNode;
        for (int i = 0; i < m - 1; i++)
            pre = pre.next;

        ListNode start = pre.next;
        ListNode then = start.next;

        for (int i = 0; i < n - m; i++) {
            start.next = then.next;
            then.next = pre.next;
            pre.next = then;
            then = start.next;
        }

        // lastNonReversedNode.next = prev;
        return dummyNode.next;
    }
}
