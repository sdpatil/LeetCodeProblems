package com.leetcode.p140;

import com.leetcode.TreeNode;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

/**
 * Created by sunilpatil on 5/30/17.
 */
public class BinaryTreePostOrderTraversal145Test {
    BinaryTreePostOrderTraversal145 problem;

    @Before
    public void setup(){
        problem = new BinaryTreePostOrderTraversal145();
    }

    @Test
    public void simpleTest(){
        TreeNode treeNode = new TreeNode(1);
        treeNode.right = new TreeNode(2);
        treeNode.right.left = new TreeNode(3);

        List<Integer> returnList = problem.postorderTraversal(treeNode);
        System.out.println(returnList);

    }

    @Test
    public void simple3Test(){
        TreeNode treeNode = new TreeNode(1);
        treeNode.right = new TreeNode(2);
        treeNode.right.left = new TreeNode(3);

        List<Integer> returnList = problem.postorderTraversal(treeNode);
        System.out.println(returnList);
    }
}
