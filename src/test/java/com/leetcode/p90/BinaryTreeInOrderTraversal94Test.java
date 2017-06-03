package com.leetcode.p90;

import com.leetcode.TreeNode;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 6/2/17.
 */
public class BinaryTreeInOrderTraversal94Test {
    BinaryTreeInOrderTraversal94 problem;

    @Before
    public void setup(){
        problem = new BinaryTreeInOrderTraversal94();
    }

    @Test
    public void simpleTest(){
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> resultList = problem.inorderTraversal(root);
        System.out.println("Result " + resultList);

        assert resultList.size() ==3;
        assert resultList.get(0) ==1;
        assert resultList.get(1) ==3;
        assert resultList.get(2) ==2;
    }
}
