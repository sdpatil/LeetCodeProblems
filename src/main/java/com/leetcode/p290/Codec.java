package com.leetcode.p290;

import com.leetcode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by sunilpatil on 6/3/17.
 */
public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder result = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node != null){
                result.append(node.val +",");
                queue.add(node.left);
                queue.add(node.right);
            }else {
                result.append("#,");
            }
        }
        result.deleteCharAt(result.length()-1);
        return result.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] parts = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(parts[0]));

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int i =0;
        while (!queue.isEmpty()){
            TreeNode t = queue.poll();
            if(t == null)
                continue;;

            if(!parts[i].equals("#")){
                t.left = new TreeNode(Integer.parseInt(parts[i]));
            }else{
                t.left = null;
                queue.offer(null);
            }
            i++;
            if(!parts[i].equals("#")){
                t.right = new TreeNode(Integer.parseInt(parts[i]));
            }else{
                t.right = null;
                queue.offer(null);
            }
            i++;
        }
        return root;
    }
}
