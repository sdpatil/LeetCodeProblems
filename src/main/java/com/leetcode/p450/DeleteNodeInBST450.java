package com.leetcode.p450;

import com.leetcode.TreeNode;

/**
 * Created by sunilpatil on 6/4/17.
 */
public class DeleteNodeInBST450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        //Root is null return
        if (root == null) {
            return null;
        } else if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null)
                return root.right;
            if (root.right == null)
                return root.left;

            TreeNode minNode = findMin(root.right);
            root.val = minNode.val;
            root.right = deleteNode(root.right, root.val);
        }
        return root;
    }

    public TreeNode findMin(TreeNode root){
        if(root == null)
            return null;
        if(root.left == null)
            return root;
        else
            return findMin(root.left);
    }


}
