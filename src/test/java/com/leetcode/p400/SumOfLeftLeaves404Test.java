package com.leetcode.p400;

import com.leetcode.TreeNode;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 6/3/17.
 */
public class SumOfLeftLeaves404Test {
    SumOfLeftLeaves404 problem;

    @Before
    public void setup(){
        problem = new SumOfLeftLeaves404();
    }

    @Test
    public void simpleTest(){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        int result = problem.sumOfLeftLeaves(root);
        System.out.println("Result " + result);
        assert result == 24;
    }

    @Test
    public void simpleInput2Test(){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        int result = problem.sumOfLeftLeaves(root);
        System.out.println("Result " + result);
        assert result == 9;

        root.left =null;
        root.right = new TreeNode(9);
         result = problem.sumOfLeftLeaves(root);
        System.out.println("Result " + result);
        assert result == 0;
    }

    @Test
    public void badInputTest(){
        int result = problem.sumOfLeftLeaves(null);
        System.out.println("Result " + result);
        assert result == 0;

        TreeNode root = new TreeNode(3);
        result = problem.sumOfLeftLeaves(null);
        System.out.println("Result " + result);
        assert result == 0;
    }
}
