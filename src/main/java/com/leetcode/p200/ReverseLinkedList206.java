package com.leetcode.p200;

import com.leetcode.ListNode;

/**
 * Created by sunilpatil on 5/10/17.
 */
public class ReverseLinkedList206 {
    public ListNode reverseList(ListNode head) {
        ListNode lastNode = null;
        ListNode tempNode = null;
        while(head != null){
            tempNode = head.next;
            head.next = lastNode;
            lastNode = head;
            head = tempNode;

        }
        return lastNode;
    }
}
