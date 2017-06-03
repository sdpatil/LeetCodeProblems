package com.leetcode.p110;

import com.leetcode.TreeNode;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 6/2/17.
 */
public class MinimumDepthOfBinaryTree111Test {
    MinimumDepthOfBinaryTree111 problem;

    @Before
    public void setup(){
        problem = new MinimumDepthOfBinaryTree111();
    }

    @Test
    public void simpleTest(){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(17);

        int result = problem.minDepth(root);
        System.out.println("Min Depth " + result);
        assert result==2;
    }

    @Test
    public void simple19Test(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);

        int result = problem.minDepth(root);
        System.out.println("Min Depth " + result);
        assert result==2;
    }
}
