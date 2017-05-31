package com.leetcode.p140;

import com.leetcode.ListNode;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/11/17.
 */
public class LinkedListCycle2142Test {
    LinkedListCycle2142 problem;

    @Before
    public void setup(){
        problem = new LinkedListCycle2142();
    }

    @Test
    public void simpleTest(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next =  head;

        assert problem.detectCycle(head) == head;
        assert problem.detectCycle(head.next) == head;
        assert problem.detectCycle(head.next.next) == head;
    }
}
