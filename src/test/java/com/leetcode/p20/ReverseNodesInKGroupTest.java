package com.leetcode.p20;

import com.leetcode.ListNode;
import com.leetcode.ListNodeHelper;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/26/17.
 */
public class ReverseNodesInKGroupTest {
    ReverseNodesInKGroup problem = new ReverseNodesInKGroup();

    @Test
    public void simpleK2Test(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        assert ListNodeHelper.getLength(head) ==5;
        assert ListNodeHelper.verifyNodeValues(head, new int[]{1,2,3,4,5});
        ListNode result = problem.reverseKGroup(head,2);
        assert ListNodeHelper.getLength(result) ==5;
        assert ListNodeHelper.verifyNodeValues(result, new int[]{2,1,4,3,5});
    }

    @Test
    public void simpleK3Test(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        assert ListNodeHelper.getLength(head) ==5;
        assert ListNodeHelper.verifyNodeValues(head, new int[]{1,2,3,4,5});
        ListNode result =problem.reverseKGroup(head,3);
        assert ListNodeHelper.getLength(result) ==5;
        assert ListNodeHelper.verifyNodeValues(result, new int[]{3,2,1,4,5});
    }

    @Test
    public void badInputTest(){
        ListNode result =problem.reverseKGroup(null,3);
        assert result == null;

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        result = problem.reverseKGroup(head,3);
        assert ListNodeHelper.getLength(head) ==2;
        assert ListNodeHelper.verifyNodeValues(head, new int[]{1,2});
    }

}
