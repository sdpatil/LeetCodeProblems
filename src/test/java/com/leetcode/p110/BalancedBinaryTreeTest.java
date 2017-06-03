package com.leetcode.p110;

import com.leetcode.TreeNode;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/24/17.
 */
public class BalancedBinaryTreeTest {
    BalancedBinaryTree110 problem;

    @Before
    public void setup(){
        problem = new BalancedBinaryTree110();
    }

    @Test
    public void simpleTest(){
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(8);
    //    root.right = new TreeNode(12);

        assert problem.isBalanced(root);

        root.left.left = new TreeNode(9);
        root.left.left.left = new TreeNode(19);
        assert !problem.isBalanced(root);
    }

    @Test
    public void simple200Test(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);

        assert problem.isBalanced(root);
    }
}
