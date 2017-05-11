package com.leetcode.p80;

import com.leetcode.ListNode;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/10/17.
 */
public class RemoveDuplicateFromSortedList83Test {
    RemoveDuplicateFromSortedList83 problem;

    @Before
    public void setup() {
        problem = new RemoveDuplicateFromSortedList83();
    }

    //1->1->2
    @Test
    public void simpleTest() {
        ListNode headNode = new ListNode(1);
        headNode.next = new ListNode(1);
        headNode.next.next = new ListNode(2);

        System.out.println("Before " + headNode);
        problem.deleteDuplicates(headNode);
        System.out.println("After " + headNode);

        assert headNode.val == 1;
        assert headNode.next.val == 2;
    }

    //1->1->2->3->3
    @Test
    public void secondTest() {
        ListNode headNode = new ListNode(1);
        headNode.next = new ListNode(1);
        headNode.next.next = new ListNode(2);
        headNode.next.next.next = new ListNode(3);
        headNode.next.next.next.next = new ListNode(3);

        System.out.println("Before " + headNode);
        problem.deleteDuplicates(headNode);
        System.out.println("After " + headNode);

        assert headNode.val == 1;
        assert headNode.next.val == 2;
        assert headNode.next.next.val == 3;

    }
}
