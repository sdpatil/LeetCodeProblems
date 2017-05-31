package com.leetcode.p160;

import com.leetcode.ListNode;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/25/17.
 */
public class IntersectionOfTwoLists160Test {
    IntersectionOfTwoLists160 problem = new IntersectionOfTwoLists160();

    @Test
    public void simpleTest() {
        ListNode firstNode = new ListNode(1);
        firstNode.next = new ListNode(3);
        firstNode.next.next = new ListNode(5);


        ListNode secondNode = new ListNode(2);
        secondNode.next = firstNode.next.next;
        secondNode.next.next = new ListNode(7);

        ListNode interesectingNode = problem.getIntersectionNode(firstNode,secondNode);
        assert interesectingNode.val == 5;
    }
}
