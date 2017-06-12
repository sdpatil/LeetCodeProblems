package com.leetcode.p450;

import com.leetcode.BTreePrinter;
import com.leetcode.TreeNode;
import org.junit.Test;

/**
 * Created by sunilpatil on 6/4/17.
 */
public class DeleteNodeInBST450Test {
    DeleteNodeInBST450 problem = new DeleteNodeInBST450();

    @Test
    public void simpleTest(){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right=new TreeNode(7);
        BTreePrinter.printNode(root);
        problem.deleteNode(root,3);
        BTreePrinter.printNode(root);

    }

    @Test
    public void simple2Test(){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right=new TreeNode(7);
        BTreePrinter.printNode(root);
        problem.deleteNode(root,5);
        BTreePrinter.printNode(root);

    }
}
