package com.leetcode.p100;

import com.leetcode.TreeNode;

/**
 * Created by sunilpatil on 6/2/17.
 */
public class SymmetricTree101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return false;

        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null)
            return true;
        if (root1 == null || root2 == null)
            return false;
        if (root1.val != root2.val)
            return false;

        return isSymmetric(root1.left, root2.right) && isSymmetric(root1.right, root2.left);
    }
}
