package com.leetcode.p230;

import com.leetcode.TreeNode;

import java.util.Stack;

/**
 * Created by sunilpatil on 6/4/17.
 */
public class KthSmallestInBST230 {

    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;
        while (true){
            if(node != null){
                stack.push(node);
                node = node.left;
            }else{
                if(stack.isEmpty())
                    return -1;
                node = stack.pop();
                k = k -1;
                if(k == 0)
                    return node.val;
                node = node.right;
            }
        }
    }
}
