package com.leetcode.p100;

import com.leetcode.BTreePrinter;
import com.leetcode.TreeNode;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 6/3/17.
 */
public class ConstructBinaryTreeFromInOrderPostOrderTraversal106Test {
    ConstructBinaryTreeFromInOrderPostOrderTraversal106 problem;

    @Before
    public void setup(){
        problem = new ConstructBinaryTreeFromInOrderPostOrderTraversal106();
    }

    @Test
    public void simpleTest(){
        int[] inOrder1 = {2,1,3};
        int[] postOrder1 = {2,3,1};

        TreeNode root = problem.buildTree( inOrder1, postOrder1);
        BTreePrinter.printNode(root);
    }

    @Test
    public void simple2Test(){
        int[] inOrder2 = {4,8,2,5,1,6,3,7};
        int[] postOrder2 = {8,4,5,2,6,7,3,1};

        TreeNode root = problem.buildTree(inOrder2,postOrder2);
        BTreePrinter.printNode(root);
    }
}
