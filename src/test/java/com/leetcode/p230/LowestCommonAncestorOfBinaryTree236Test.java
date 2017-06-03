package com.leetcode.p230;

import com.leetcode.BTreePrinter;
import com.leetcode.TreeNode;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 6/3/17.
 */
public class LowestCommonAncestorOfBinaryTree236Test {
    LowestCommonAncestorOfBinaryTree236 problem;

    @Before
    public void setup(){
        problem = new LowestCommonAncestorOfBinaryTree236();
    }

    @Test
    public void simpleTest(){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        BTreePrinter.printNode(root);

        TreeNode returnNode = problem.lowestCommonAncestor(root,root.left,root.right);
        System.out.println(returnNode);
        assert returnNode.val ==3;
        assert problem.lowestCommonAncestor(root,root.left,root.left.right.right).val ==5;
    }
}
