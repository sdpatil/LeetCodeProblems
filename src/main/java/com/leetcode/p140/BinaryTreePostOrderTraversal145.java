package com.leetcode.p140;

import com.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by sunilpatil on 5/30/17.
 */
public class BinaryTreePostOrderTraversal145 {
    public List<Integer> postorderTraversal2(TreeNode root) {
        List<Integer> returnList = new ArrayList<Integer>();
        postOrderTraversalRecursive(root,returnList);
        return returnList;
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> returnList = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            stack.push(node);
            stack.push(node.right);
            stack.push(node.left);
        }
        return returnList;
    }

    public void postOrderTraversalRecursive(TreeNode root, List<Integer> returnList){
        if(root == null)
            return;
        postOrderTraversalRecursive(root.left,returnList);
        postOrderTraversalRecursive(root.right,returnList);
        returnList.add(root.val);
    }
}
