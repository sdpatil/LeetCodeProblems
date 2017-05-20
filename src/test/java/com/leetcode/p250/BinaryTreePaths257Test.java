package com.leetcode.p250;

import com.leetcode.TreeNode;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 5/17/17.
 */
public class BinaryTreePaths257Test {
    BinaryTreePaths257 problem;

    @Before
    public void setup(){
        problem = new BinaryTreePaths257();
    }

    @Test
    public void simpleTest(){
        TreeNode rootNode = new TreeNode(1);
        rootNode.left = new TreeNode(2);
        rootNode.right = new TreeNode(3);
        rootNode.left.right = new TreeNode(5);

        List<String> paths = problem.binaryTreePaths(rootNode);
        System.out.println("result " + paths);

        assert paths.size() == 2;
        assert paths.get(0).equals("1->2->5");
        assert paths.get(1).equals("1->3");
    }

    @Test
    public void emptyHeadTest(){
        List<String> paths = problem.binaryTreePaths(null);
        System.out.println("result " + paths);

        assert paths.size() == 0;
    }
}
