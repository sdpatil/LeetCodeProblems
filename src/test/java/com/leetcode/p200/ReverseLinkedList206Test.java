package com.leetcode.p200;

import com.leetcode.ListNode;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 5/10/17.
 */
public class ReverseLinkedList206Test {
    ReverseLinkedList206 problem;

    @Before
    public void setup(){
        problem = new ReverseLinkedList206();
    }

    @Test
    public void simpleTest(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        System.out.println("Input " + head);
        ListNode reversedList = problem.reverseList(head);
        System.out.println("Reverse " + reversedList);

        assert reversedList.val == 3;
        assert reversedList.next.val==2;
        assert reversedList.next.next.val==1;
    }
}
