package com.leetcode.p110;

import com.leetcode.TreeNode;

/**
 * Created by sunilpatil on 6/2/17.
 */
public class MinimumDepthOfBinaryTree111 {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);

        //If either left or right child is empty then we cannot use it
        if (leftDepth == 0 || rightDepth == 0)
            return leftDepth + rightDepth + 1;
        else //If both left and right subtree is not empty then take minimum of them
            return Math.min(leftDepth, rightDepth) + 1;
    }
}
