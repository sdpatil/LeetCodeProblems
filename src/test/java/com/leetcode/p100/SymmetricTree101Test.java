package com.leetcode.p100;

import com.leetcode.TreeNode;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 6/2/17.
 */
public class SymmetricTree101Test {
    SymmetricTree101 problem;

    @Before
    public void setup() {
        problem = new SymmetricTree101();
    }

    @Test
    public void simpleTest() {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(2);
        root1.left.left = new TreeNode(3);
        root1.left.right = new TreeNode(4);
        root1.right.left = new TreeNode(4);
        root1.right.right = new TreeNode(3);

        assert problem.isSymmetric(root1);
    }

    @Test
    public void simple2Test() {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(2);
        root1.left.right = new TreeNode(3);
        root1.right.right = new TreeNode(3);

        assert !problem.isSymmetric(root1);
    }
}
