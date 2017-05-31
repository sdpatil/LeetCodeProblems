package com.leetcode.p140;

import com.leetcode.*;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by sunilpatil on 5/26/17.
 */
public class ReorderList143 {
    public void reorderList(com.leetcode.ListNode head) {
        if (head == null)
            return;

        ListNode slowPointer = head;
        ListNode fastPointer = head.next;

        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }

        ListNode head2 = slowPointer.next;
        slowPointer.next = null;

        Stack<ListNode> queue = new Stack<ListNode>();
        while (head2 != null) {
            ListNode temp2 = head2;
            head2 = head2.next;
            temp2.next = null;
            queue.push(temp2);
        }

        while (!queue.isEmpty()) {
            ListNode temp = queue.pop();
            temp.next = head.next;
            head.next = temp;
            head = temp.next;
        }

    }
}
