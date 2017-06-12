package com.leetcode.p100;

import com.leetcode.BTreePrinter;
import com.leetcode.TreeNode;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 6/3/17.
 */
public class ConstructBinaryTreeFromPreAndInOrderTraversal105Test {
    ConstructBinaryTreeFromPreAndInOrderTraversal105 problem;

    @Before
    public void setup(){
        problem = new ConstructBinaryTreeFromPreAndInOrderTraversal105();
    }

    @Test
    public void simpleTest(){
        int[] inOrder = {4, 2, 5, 1, 6, 3};
        int[] preOrder = {1, 2, 4, 5, 3, 6};

        TreeNode root = problem.buildTree(preOrder, inOrder);
        BTreePrinter.printNode(root);
    }
}
