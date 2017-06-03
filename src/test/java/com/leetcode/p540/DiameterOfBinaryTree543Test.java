package com.leetcode.p540;

import com.leetcode.TreeNode;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 6/2/17.
 */
public class DiameterOfBinaryTree543Test {
    DiameterOfBinaryTree543 problem;

    @Before
    public void setup(){
        problem = new DiameterOfBinaryTree543();
    }

    @Test
    public void simpleTest(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int result =problem.diameterOfBinaryTree(root);
        System.out.println("Result " + result);
        assert result == 3;
    }
}
