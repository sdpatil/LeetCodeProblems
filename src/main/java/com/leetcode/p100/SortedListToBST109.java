package com.leetcode.p100;

import com.leetcode.ListNode;
import com.leetcode.TreeNode;

/**
 * Created by sunilpatil on 6/4/17.
 */
public class SortedListToBST109 {
    ListNode h;
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null)
            return null;
        h = head;
        int length = getLength(head);
        return sortedListToBST(0, length-1);
    }

    public TreeNode sortedListToBST(int start, int end) {
        if(start > end)
            return null;
        int mid = (start+end)/2;

        TreeNode left = sortedListToBST(start, mid-1);
        TreeNode root = new TreeNode(h.val);
        h = h.next;
        TreeNode right = sortedListToBST(mid+1,end);

        root.left = left;
        root.right = right;
        return root;

    }

        public int getLength(ListNode head){
        int length = 0 ;
        ListNode current = head;
        while(current!= null){
            length = length+1;
            current = current.next;
        }
        return length;
    }
}
