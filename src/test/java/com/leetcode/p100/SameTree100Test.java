package com.leetcode.p100;

import com.leetcode.TreeNode;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/24/17.
 */
public class SameTree100Test {
    SameTree100 problem;

    @Before
    public void setup(){
        problem = new SameTree100();
    }

    @Test
    public void simplePosTest(){
        TreeNode firstNode = new TreeNode(2);
        firstNode.left = new TreeNode(1);
        firstNode.right = new TreeNode(3);
        assert problem.isSameTree(firstNode,firstNode);
    }

    @Test
    public void differentValTest(){
        TreeNode firstNode = new TreeNode(2);
        firstNode.left = new TreeNode(1);
        firstNode.right = new TreeNode(3);

        TreeNode secondNode = new TreeNode(22);
        secondNode.left = new TreeNode(1);
        secondNode.right = new TreeNode(3);
        assert !problem.isSameTree(firstNode,secondNode);
    }

    @Test
    public void differentLeftNodeTest(){
        TreeNode firstNode = new TreeNode(2);
        firstNode.left = new TreeNode(1);
        firstNode.right = new TreeNode(3);

        TreeNode secondNode = new TreeNode(2);
        secondNode.right = new TreeNode(3);
        assert !problem.isSameTree(firstNode,secondNode);
    }

    @Test
    public void differentRightNodeTest(){
        TreeNode firstNode = new TreeNode(2);
        firstNode.left = new TreeNode(1);
        firstNode.right = new TreeNode(3);

        TreeNode secondNode = new TreeNode(2);
        secondNode.left = new TreeNode(1);

        assert !problem.isSameTree(firstNode,secondNode);
    }
}
