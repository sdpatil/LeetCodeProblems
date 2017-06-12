package com.leetcode.p400;

import com.leetcode.TreeNode;

/**
 * Created by sunilpatil on 6/3/17.
 */
public class SumOfLeftLeaves404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null || isLeaf(root))
            return 0;


        if(isLeaf(root.left) )
            return root.left.val + sumOfLeftLeaves(root.right);
        else
            return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }

    private boolean isLeaf(TreeNode node){
        if(node == null)
            return false;
        if(node.left == null && node.right == null)
            return true;
        return false;
    }
}
