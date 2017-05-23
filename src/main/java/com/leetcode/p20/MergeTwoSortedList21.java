package com.leetcode.p20;

import com.leetcode.ListNode;
import com.leetcode.TreeNode;

/**
 * Created by sunilpatil on 5/22/17.
 */
public class MergeTwoSortedList21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode demoNode = new ListNode(0);
        ListNode resultNode = demoNode;
        ListNode first = l1;
        ListNode second = l2;
        while (first != null && second != null) {
            if (first.val < second.val) {
                demoNode.next = first;
                first = first.next;
            } else {
                demoNode.next = second;
                second = second.next;
            }
            demoNode = demoNode.next;
        }
        if (first != null)
            demoNode.next = first;
        if (second != null)
            demoNode.next = second;
        return resultNode.next;
    }
}
