package com.leetcode.p10;

import com.leetcode.ListNode;

/**
 * Created by sunilpatil on 5/25/17.
 */
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n <= 0)
            return head;
        ListNode first = head;
        ListNode second = head;
        int counter = 0;
        ListNode oldHead = head;
        while (counter <= n ) {
            if(first == null){
                if(counter == n)
                    return oldHead.next;
                else
                    return oldHead;
            }else {
                first = first.next;
                counter++;
            }
        }

        while (first != null) {
            first = first.next;
            second = second.next;
        }
        ListNode deletedNode = null;
        if (counter == n + 1) {
            deletedNode = second.next;
            second.next = second.next.next;
            return oldHead;
        }
        return null;
    }
}
