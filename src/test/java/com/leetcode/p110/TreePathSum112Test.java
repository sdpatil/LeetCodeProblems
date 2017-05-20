package com.leetcode.p110;

import com.leetcode.TreeNode;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/17/17.
 */
public class TreePathSum112Test {
    TreePathSum112 problem;

    @Before
    public void setup(){
        problem = new TreePathSum112();
    }

    @Test
    public void simpleTest(){
        TreeNode rootNode = new TreeNode(5);
        rootNode.left = new TreeNode(4);
        rootNode.right =new TreeNode(8);
        rootNode.left.left = new TreeNode(11);
        rootNode.left.left.left= new TreeNode(7);
        rootNode.left.left.right= new TreeNode(2);
        rootNode.right.left =new TreeNode(13);
        rootNode.right.right =new TreeNode(4);
        rootNode.right.right.right =new TreeNode(1);



        boolean result = problem.hasPathSum(rootNode,22);
        System.out.println("Result " + result);
        assert result;

         result = problem.hasPathSum(rootNode,23);
        System.out.println("Result " + result);
        assert !result;
    }

    @Test
    public void emptyTreeTest(){
        TreeNode rootNode = null;

        boolean result = problem.hasPathSum(rootNode,1);
        System.out.println("Result " + result);
        assert !result;

        result = problem.hasPathSum(rootNode,0);
        System.out.println("Result " + result);
        assert !result;
    }

    @Test
    public void complexTest(){
        TreeNode rootNode = new TreeNode(1);
        rootNode.left = new TreeNode(2);

        boolean result = problem.hasPathSum(rootNode,1);
        System.out.println("Result " + result);
        assert !result;
    }
}
