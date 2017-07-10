package com.leetcode.p100;

import com.leetcode.ListNode;
import com.leetcode.TreeNode;

/**
 * Problem: How to convert a sorted linked list into BST
 * Solution: Basic idea is same as that of the sorted array, which is find the middle and that becomes root node
 * the left hand side of middle becomes left subtree and right hand side of middle becomes right subtree
 * Since we cant go back, we have to build node from left most child one by one,
 * First build left child, then the current node then right child
 */
public class SortedListToBST109 {
    ListNode h;
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null)
            return null;
        h = head;
        int length = getLength(head);
        return sortedListToBST(0, length - 1);
    }
    public TreeNode sortedListToBST(int start, int end) {
        if (start > end)
            return null;
        int mid = start + (end - start) / 2;
        //First build the left subtree
        TreeNode left = sortedListToBST(start, mid - 1);
        TreeNode root = new TreeNode(h.val);
        // only after you consume current head that move to next.head
        h = h.next;
        TreeNode right = sortedListToBST(mid + 1, end);
        root.left = left;
        root.right = right;
        return root;
    }
    public int getLength(ListNode head) {
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length = length + 1;
            current = current.next;
        }
        return length;
    }
}
