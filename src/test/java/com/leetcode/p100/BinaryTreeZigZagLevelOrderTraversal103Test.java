package com.leetcode.p100;

import com.leetcode.BTreePrinter;
import com.leetcode.TreeNode;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

/**
 * Created by sunilpatil on 6/3/17.
 */
public class BinaryTreeZigZagLevelOrderTraversal103Test {
    BinaryTreeZigZagLevelOrderTraversal103 problem;

    @Before
    public void setup(){
        problem = new BinaryTreeZigZagLevelOrderTraversal103();
    }

    @Test
    public void simpleTest(){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        BTreePrinter.printNode(root);

        List<List<Integer>> result = problem.zigzagLevelOrder(root);
        System.out.println(result);

        assert result.size() ==3;
        assert result.get(0).get(0) ==3;
        assert result.get(1).get(0) ==20;
        assert result.get(1).get(1) == 9;
        assert result.get(2).get(0) ==15;
        assert result.get(2).get(1) == 7;

    }
}
