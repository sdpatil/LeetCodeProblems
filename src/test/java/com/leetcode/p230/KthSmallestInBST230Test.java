package com.leetcode.p230;

import com.leetcode.BTreePrinter;
import com.leetcode.TreeNode;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 6/4/17.
 */
public class KthSmallestInBST230Test {
    KthSmallestInBST230 problem;

    @Before
    public void setup(){
        problem = new KthSmallestInBST230();
    }

    @Test
    public void simpleTest(){
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);

        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        BTreePrinter.printNode(root);

        assert problem.kthSmallest(root,2) ==2;
        assert problem.kthSmallest(root,5) ==5;
    }
}
