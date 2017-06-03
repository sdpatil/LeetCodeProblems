package com.leetcode.p140;

import com.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by sunilpatil on 5/30/17.
 */
public class BinaryTreePostOrderTraversal145 {


    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> returnList = new ArrayList<Integer>();
        if(root == null)
            return returnList;
        Stack<TreeNode> stack1 = new Stack<TreeNode>();
        Stack<TreeNode> stack2 = new Stack<TreeNode>();

        stack1.push(root);
        while (!stack1.isEmpty()) {
            TreeNode node = stack1.pop();
            if(node.left !=null)
                stack1.push(node.left);
            if(node.right !=null)
                stack1.push(node.right);
            stack2.push(node);
        }
        while (!stack2.isEmpty())
            returnList.add(stack2.pop().val);
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
