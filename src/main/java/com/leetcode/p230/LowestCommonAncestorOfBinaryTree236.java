package com.leetcode.p230;

import com.leetcode.TreeNode;

/**
 * Created by sunilpatil on 6/3/17.
 */
public class LowestCommonAncestorOfBinaryTree236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)
            return null;
        if(root == p || root == q)
            return root;
        TreeNode leftLCA = lowestCommonAncestor(root.left,p,q);
        TreeNode rightLCA = lowestCommonAncestor(root.right,p,q);
        if(leftLCA!= null && rightLCA != null)
            return root;
        else {
            if(leftLCA != null)
                return leftLCA;
            else
                return rightLCA;
        }
    }
}
