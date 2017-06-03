package com.leetcode.p540;

import com.leetcode.TreeNode;

/**
 * Created by sunilpatil on 6/2/17.
 */
public class DiameterOfBinaryTree543 {
    int maxDepth = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return maxDepth;
    }

    public int depth(TreeNode root) {
        if (root == null)
            return 0;

        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);
        maxDepth = Math.max(maxDepth, leftDepth + rightDepth);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
