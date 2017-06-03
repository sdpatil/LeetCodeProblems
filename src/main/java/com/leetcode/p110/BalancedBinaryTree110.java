package com.leetcode.p110;

import com.leetcode.TreeNode;

/**
 * Created by sunilpatil on 5/24/17.
 */
public class BalancedBinaryTree110 {

    public boolean isBalanced(TreeNode root) {
        return getHeight2(root) != -1;
    }

    public int getHeight2(TreeNode root) {
        //If node is null return true
        if (root == null)
            return 0;

        int leftHeight = getHeight2(root.left);
        if (leftHeight == -1)
            return -1;
        int rightHeight = getHeight2(root.right);
        if (rightHeight == -1)
            return -1;

        if (Math.abs(leftHeight - rightHeight) > 1)
            return -1;

        return Math.max(leftHeight, rightHeight) + 1;
    }


}
