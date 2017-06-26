package com.leetcode.p190;

import com.leetcode.BTreePrinter;
import com.leetcode.TreeNode;
import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 6/14/17.
 */
public class BinaryTreeRightSideView199Test {
    BinaryTreeRightSideView199 problem = new BinaryTreeRightSideView199();

    @Test
    public void simpleTest(){
        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(3);
        treeNode.left.left = new TreeNode(1);
        treeNode.left.right = new TreeNode(2);

        treeNode.right = new TreeNode(7);
        treeNode.right.left = new TreeNode(6);
        treeNode.right.right = new TreeNode(8);

        BTreePrinter.printNode(treeNode);
        List<Integer> rightSideList = problem.rightSideView(treeNode);
        System.out.println(rightSideList);
        assert rightSideList.size() == 3;
        assert rightSideList.get(0) ==5;
        assert rightSideList.get(1) ==7;
        assert rightSideList.get(2) ==8;
    }

    @Test
    public void simple2Test(){
        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(3);
        treeNode.left.left = new TreeNode(1);
        treeNode.left.right = new TreeNode(2);

        treeNode.right = new TreeNode(7);
        treeNode.right.left = new TreeNode(6);
        treeNode.right.right = new TreeNode(8);
        treeNode.left.right.left = new TreeNode(-2);

        //treeNode.right.right.right = new TreeNode(18);


        BTreePrinter.printNode(treeNode);
        List<Integer> rightSideList = problem.rightSideView(treeNode);
        System.out.println(rightSideList);
    }

    @Test
    public void badInputTest(){
        List<Integer> rightSideList = problem.rightSideView(null);
        System.out.println(rightSideList);
        assert rightSideList.size() == 0;
    }
}
