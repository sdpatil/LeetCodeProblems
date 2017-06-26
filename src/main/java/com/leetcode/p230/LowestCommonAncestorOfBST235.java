package com.leetcode.p230;

import com.leetcode.TreeNode;

/**
 * Created by sunilpatil on 6/4/17.
 */
public class LowestCommonAncestorOfBST235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)
            return null;

        if(root.val > Math.max(p.val,q.val) )
            return lowestCommonAncestor(root.left,p,q);
        else if(root.val < Math.min(p.val,q.val))
            return lowestCommonAncestor(root.right,p,q);
        else
            return root;
    }
}