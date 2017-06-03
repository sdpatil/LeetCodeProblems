package com.leetcode.p100;

import com.leetcode.TreeNode;

/**
 * Created by sunilpatil on 6/2/17.
 */
public class MaximumDepthOfBinaryTree104 {

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
