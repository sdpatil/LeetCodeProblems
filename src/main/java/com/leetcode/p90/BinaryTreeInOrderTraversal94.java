package com.leetcode.p90;

import com.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by sunilpatil on 6/2/17.
 */
public class BinaryTreeInOrderTraversal94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> resultList = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node =root;
        while(true){
            if(node != null){
                stack.push(node);
                node = node.left;
            }else{
                if(stack.isEmpty())
                    break;
                node = stack.pop();
                resultList.add(node.val);
                node = node.right;
            }
        }
        return resultList;

    }
}
