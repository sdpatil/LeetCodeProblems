package com.leetcode.p570;

import com.leetcode.BTreePrinter;
import com.leetcode.TreeNode;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 6/4/17.
 */
public class SubtreeOfAnotherTree572Test {
    SubtreeOfAnotherTree572 problem;

    @Before
    public void setup(){
        problem = new SubtreeOfAnotherTree572();
    }

    @Test
    public void simpleTest(){
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);

        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        BTreePrinter.printNode(root);

        assert problem.isSubtree(root, root.right);
        assert problem.isSubtree(root.left.right, root);
    }
}
