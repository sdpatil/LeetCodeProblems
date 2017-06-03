package com.leetcode.p310;

import com.leetcode.BTreePrinter;
import com.leetcode.TreeNode;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 6/3/17.
 */
public class VerticalOrderTraversal314Test {

    VerticalOrderTraversal314 problem;

    @Before
    public void setup(){
        problem = new VerticalOrderTraversal314();
    }

    @Test
    public void simpleTest(){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        BTreePrinter.printNode(root);

        List<List<Integer>> verticalOrderList = problem.verticalOrder(root);
        System.out.println(verticalOrderList);

        assert verticalOrderList.size() ==4;
        assert verticalOrderList.get(0).size() == 1;
        assert verticalOrderList.get(1).size() == 2;
        assert verticalOrderList.get(2).size() == 1;
        assert verticalOrderList.get(3).size() == 1;

    }
}
