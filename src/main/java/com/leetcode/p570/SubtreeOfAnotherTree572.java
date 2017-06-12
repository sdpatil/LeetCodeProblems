package com.leetcode.p570;

import com.leetcode.TreeNode;

/**
 * Created by sunilpatil on 6/4/17.
 */
public class SubtreeOfAnotherTree572 {

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null)
            return false;
        if(isSame(s,t))
            return true;
        return isSubtree(s.left,t) || isSubtree(s.right,t);
    }

    public boolean isSame(TreeNode s, TreeNode t){
        if(s == null && t == null)
            return true;
        if( s== null || t == null)
            return false;

        if(s.val != t.val )
            return false;

        return isSame(s.left, t.left) && isSame(s.right, t.right);
    }
}
