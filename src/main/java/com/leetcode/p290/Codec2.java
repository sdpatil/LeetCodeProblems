package com.leetcode.p290;

import com.leetcode.TreeNode;

import java.util.Stack;

/**
 * 297. Serialize and Deserialize Binary Tree

 * Created by sunilpatil on 6/3/17.
 */
public class Codec2 {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        StringBuilder result = new StringBuilder();

        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node == null)
                result.append("#");
            else {
                result.append(node.val);
                stack.push(node.right);
                stack.push(node.left);
            }
            result.append(",");

        }
        return result.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] parts = data.split(",");
        int[] t = {0};
        TreeNode root = deserialize(parts,t);
        return root;
    }

    public TreeNode deserialize(String[] data, int[] t){
        if(data[t[0]].equals("#"))
            return null;

        TreeNode node = new TreeNode(Integer.parseInt(data[t[0]]));
        t[0] = t[0]+1;
        node.left = deserialize(data, t);
        t[0] = t[0]+1;

        node.right = deserialize(data, t);
        return node;
    }
}
