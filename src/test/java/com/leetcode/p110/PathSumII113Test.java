package com.leetcode.p110;

import com.leetcode.TreeNode;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 5/24/17.
 */
public class PathSumII113Test {
    PathSumII113 problem;

    @Before
    public void setup(){
        problem = new PathSumII113();
    }

    @Test
    public void simpleTest(){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);

        List<List<Integer>> result = problem.pathSum(root,22);
        System.out.println(result);
        assert result.size() ==2;
    }
}
