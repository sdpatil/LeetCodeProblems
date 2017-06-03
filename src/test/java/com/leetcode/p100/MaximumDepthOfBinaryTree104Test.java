package com.leetcode.p100;

import com.leetcode.TreeNode;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 6/2/17.
 */
public class MaximumDepthOfBinaryTree104Test {

    MaximumDepthOfBinaryTree104 problem;

    @Before
    public void setup(){
        problem = new MaximumDepthOfBinaryTree104();
    }

    @Test
    public void simpleTest(){
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);

        int result = problem.maxDepth(root);
        System.out.println("Max Depth " + result);
        assert result == 4;
    }
}
