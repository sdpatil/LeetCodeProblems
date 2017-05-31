package com.leetcode.p90;

import com.leetcode.ListNode;
import com.leetcode.ListNodeHelper;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/26/17.
 */
public class ReverseLinkedListII92Test {
    ReverseLinkedListII92 problem = new ReverseLinkedListII92();

    @Test
    public void simpleTest(){
        ListNode head = new ListNode(1);
        head.next =new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        assert ListNodeHelper.getLength(head) ==5;
        assert ListNodeHelper.verifyNodeValues(head, new int[]{1,2,3,4,5});
        ListNode result = problem.reverseBetween(head,2,4);
        assert ListNodeHelper.getLength(result) ==5;
        System.out.println(result);
        assert ListNodeHelper.verifyNodeValues(result, new int[]{1,4,3,2,5});
    }
}
