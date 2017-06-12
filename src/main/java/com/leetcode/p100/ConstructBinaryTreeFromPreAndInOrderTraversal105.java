package com.leetcode.p100;

import com.leetcode.TreeNode;

/**
 * Created by sunilpatil on 6/3/17.
 */
public class ConstructBinaryTreeFromPreAndInOrderTraversal105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || preorder.length != inorder.length)
            return null;

        return buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private TreeNode buildTree(int[] preOrder, int preStart, int preEnd, int[] inOrder, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd)
            return null;

        int data = preOrder[preStart];
        TreeNode node = new TreeNode(data);

        int offSet = inStart;
        for (; offSet < inEnd; offSet++) {
            if (inOrder[offSet] == data)
                break;
        }

        int offSetDistance = offSet - inStart;

        node.left = buildTree(preOrder, preStart + 1, preStart + offSetDistance, inOrder, inStart, offSet - 1);
        node.right = buildTree(preOrder, preStart + offSetDistance + 1, preEnd, inOrder, offSet + 1, inEnd);

        return node;
    }
}
