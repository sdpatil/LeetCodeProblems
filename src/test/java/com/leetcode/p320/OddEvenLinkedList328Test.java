package com.leetcode.p320;

import com.leetcode.ListNode;
import com.leetcode.ListNodeHelper;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/26/17.
 */
public class OddEvenLinkedList328Test {
    OddEvenLinkedList328 problem;

    @Before
    public void setup(){
        problem = new OddEvenLinkedList328();
    }

    @Test
    public  void simpleTest(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        assert ListNodeHelper.getLength(head) == 6;
        assert ListNodeHelper.verifyNodeValues(head, new int[]{1,2,3,4,5,6});
        ListNode result = problem.oddEvenList(head);
        assert ListNodeHelper.verifyNodeValues(head, new int[]{1,3,5,2,4,6});
    }

}
