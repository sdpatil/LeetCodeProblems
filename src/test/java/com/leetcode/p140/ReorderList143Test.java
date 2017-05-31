package com.leetcode.p140;

import com.leetcode.ListNode;
import com.leetcode.ListNodeHelper;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/26/17.
 */
public class ReorderList143Test {
    ReorderList143 problem = new ReorderList143();


    @Test
    public void simpleTest(){
        com.leetcode.ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        problem.reorderList(head);
        System.out.println(head);
        assert ListNodeHelper.verifyNodeValues(head, new int[]{1,4,2,3});


    }
}
