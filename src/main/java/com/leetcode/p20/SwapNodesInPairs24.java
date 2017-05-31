package com.leetcode.p20;

import com.leetcode.ListNode;

/**
 * Created by sunilpatil on 5/26/17.
 */
public class SwapNodesInPairs24 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummyNode = new ListNode(Integer.MAX_VALUE);
        dummyNode.next = head;

        ListNode previousNode = dummyNode;
        ListNode currentNode = head;
        while (currentNode != null && currentNode.next != null) {
            ListNode firstNode = currentNode;
            ListNode secondNode = currentNode.next;
            ListNode thirdNode = currentNode.next.next;


            previousNode.next = secondNode;
            secondNode.next = firstNode;
            firstNode.next = thirdNode;

            currentNode = thirdNode;
            previousNode = firstNode;
        }
        return dummyNode.next;
    }
}
