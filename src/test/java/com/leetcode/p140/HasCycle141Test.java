package com.leetcode.p140;

import com.leetcode.ListNode;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/5/17.
 */
public class HasCycle141Test {
    HasCycle141 hasCycle141 = new HasCycle141();

    @Test
    public void singleElementTest(){
        ListNode head = new ListNode(1);

        assert !hasCycle141.hasCycle(head);
    }

    @Test
    public void twoElementNoCycleTest(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        assert !hasCycle141.hasCycle(head);
    }

    @Test
    public void twoElementCycleTest(){
        ListNode head = new ListNode(1);
        head.next = head;

        assert hasCycle141.hasCycle(head);
    }

    @Test
    public void testNumberOf1Bits(){
        int i =11;
        int count = 0;
        while(i >0) {
            int s = i&1;
            if(s == 1)
                count++;
            i = i >>1;
        }
        System.out.println("Number of 1's " + count);
    }

    @Test
    public void fiveElementCycleTest(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next =  head;

        assert hasCycle141.hasCycle(head);
    }

    @Test
    public void fourElementCycleTest(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next =  head;

        assert hasCycle141.hasCycle(head);
    }

    @Test
    public void threeElementCycleTest(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next =  head;

        assert hasCycle141.hasCycle(head.next);
    }
}
