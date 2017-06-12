package com.leetcode.p100;

import com.leetcode.BTreePrinter;
import com.leetcode.ListNode;
import com.leetcode.TreeNode;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 6/4/17.
 */
public class SortedListToBST109Test {
    SortedListToBST109 problem;

    @Before
    public void setup(){
        problem = new SortedListToBST109();
    }

    @Test
    public void simpleTest(){
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        node.next.next.next.next.next = new ListNode(6);
        node.next.next.next.next.next.next = new ListNode(7);
        node.next.next.next.next.next.next.next = new ListNode(8);
        node.next.next.next.next.next.next.next.next = new ListNode(9);
        node.next.next.next.next.next.next.next.next.next = new ListNode(10);

        TreeNode tree = problem.sortedListToBST(node);
        BTreePrinter.printNode(tree);
    }
}
