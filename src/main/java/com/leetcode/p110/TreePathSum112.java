package com.leetcode.p110;

import com.leetcode.TreeNode;

/**
 * Created by sunilpatil on 5/17/17.
 */
public class TreePathSum112 {

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        if (root.left == null && root.right == null && sum == root.val)
            return true;

        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

    public boolean hasPathSum3(TreeNode root, int sum) {
        if (root == null && sum == 0)
            return false;
        return hasPathSum2(root, sum);

    }

    public boolean hasPathSum2(TreeNode root, int sum) {
        if (sum == 0 && root == null)
            return true;
        if (root == null)
            return false;

        return hasPathSum2(root.left, sum - root.val) || hasPathSum2(root.right, sum - root.val);
    }
}
