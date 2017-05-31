package com.leetcode.p20;

import com.leetcode.ListNode;
import com.leetcode.ListNodeHelper;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/26/17.
 */
public class SwapNodesInPairs24Test {
    SwapNodesInPairs24 problem = new SwapNodesInPairs24();

    @Test
    public void simpleTest(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        assert ListNodeHelper.getLength(head) ==4;
        assert ListNodeHelper.verifyNodeValues(head, new int[]{1,2,3,4});
        ListNode result = problem.swapPairs(head);
        assert ListNodeHelper.getLength(result) ==4;
        assert ListNodeHelper.verifyNodeValues(result, new int[]{2,1,4,3});
    }
}
