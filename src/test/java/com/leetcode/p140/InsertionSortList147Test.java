package com.leetcode.p140;

import com.leetcode.ListNode;
import org.junit.Test;

/**
 * Created by sunilpatil on 6/19/17.
 */
public class InsertionSortList147Test {
    InsertionSortList147 problem = new InsertionSortList147();

    @Test
    public void simpleTest(){
        ListNode listNode= new ListNode(3);
        listNode.next = new ListNode(1);
        listNode.next.next = new ListNode(2);
        ListNode root= problem.insertionSortList(listNode);
        System.out.println(root);
    }
}
