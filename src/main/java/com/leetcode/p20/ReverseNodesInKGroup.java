package com.leetcode.p20;

import com.leetcode.ListNode;

/**
 * Created by sunilpatil on 5/26/17.
 */
public class ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k <=0 )
            return head;
        ListNode current = head;
        ListNode next = null;
        ListNode prev = null;

        ListNode temp = head;
        int countLength = k;
        while (countLength > 0) {
            if (temp == null)
                return head;
            temp = temp.next;
            countLength--;
        }

        int count = k;
        while (current != null && count > 0) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count--;
        }
        if (next != null)
            head.next = reverseKGroup(next, k);

        return prev;
    }
}
