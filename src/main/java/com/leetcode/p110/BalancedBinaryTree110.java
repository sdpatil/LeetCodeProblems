package com.leetcode.p110;

import com.leetcode.TreeNode;

/**
 * Created by sunilpatil on 5/24/17.
 */
public class BalancedBinaryTree110 {
    public boolean isBalanced(TreeNode root) {
        return isBalanced(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    public boolean isBalanced(TreeNode root,int min, int max){
        if(root == null)
            return true;

        if(root.val > max || root.val < min)
            return false;

        return isBalanced(root.left,min,root.val) && isBalanced(root.right,root.val,max);
    }
}
