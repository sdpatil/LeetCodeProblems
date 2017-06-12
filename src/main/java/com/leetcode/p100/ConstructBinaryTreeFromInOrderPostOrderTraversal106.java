package com.leetcode.p100;

import com.leetcode.TreeNode;

/**
 * Created by sunilpatil on 6/3/17.
 */
public class ConstructBinaryTreeFromInOrderPostOrderTraversal106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(postorder.length == 0 || inorder.length != postorder.length)
            return null;

        return buildTree(postorder,0, postorder.length-1, inorder, 0, inorder.length-1);
    }

    public TreeNode buildTree(int[] postOrder, int postStart, int postEnd, int[] inOrder, int inStart, int inEnd){
        if(postStart > postEnd || inStart > inEnd)
            return null;

        int data = postOrder[postEnd];
        TreeNode node = new TreeNode(data);

        int offset = inStart;
        for(; offset < inEnd ;offset++){
            if(inOrder[offset] ==data)
                break;
        }
        int offSetDistance = offset -inStart;

        node.left = buildTree(postOrder,postStart, postStart+offSetDistance-1, inOrder, inStart, offset-1);
        node.right = buildTree(postOrder, postStart+offSetDistance, postEnd-1, inOrder, offset+1, inEnd );

        return node;
    }
}
