package com.leetcode.p100;

import com.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by sunilpatil on 6/3/17.
 */
public class BinaryTreeZigZagLevelOrderTraversal103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null)
            return result;

        Stack<TreeNode> stack1 = new Stack<TreeNode>();
        Stack<TreeNode> stack2 = new Stack<TreeNode>();
        stack1.add(root);
        int level = -1;
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            List<Integer> currentRow = new ArrayList<Integer>();

            while (!stack1.isEmpty()) {
                TreeNode node = stack1.pop();
                currentRow.add(node.val);
                if (node.left != null)
                    stack2.push(node.left);
                if (node.right != null)
                    stack2.push(node.right);
            }
            result.add(currentRow);
            currentRow = new ArrayList<Integer>();
            while (!stack2.isEmpty()) {
                TreeNode node = stack2.pop();
                currentRow.add(node.val);
                if (node.right != null)
                    stack1.push(node.right);
                if (node.left != null)
                    stack1.push(node.left);
            }
            if (!currentRow.isEmpty())
                result.add(currentRow);
        }
        return result;
    }


}
