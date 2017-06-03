package com.leetcode.p100;

import com.leetcode.BTreePrinter;
import com.leetcode.TreeNode;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 6/2/17.
 */
public class SortedArrayToBinaryTree108Test {
    SortedArrayToBinaryTree108 problem;

    @Before
    public void setup(){
        problem = new SortedArrayToBinaryTree108();
    }

    @Test
    public void simpleTest(){
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        TreeNode root = problem.sortedArrayToBST(nums);
        BTreePrinter.printNode(root);
    }
}
