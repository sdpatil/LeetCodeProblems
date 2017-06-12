package com.leetcode.p280;

import com.leetcode.TreeNode;

/**
 * Created by sunilpatil on 6/4/17.
 */
public class InOrderSuccessor285 {

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode result = null;
        while(root != null){
            if(root.val > p.val){
                result = root;
                root = root.left;
            }else
                root = root.right;
        }

        return result;
    }
}
