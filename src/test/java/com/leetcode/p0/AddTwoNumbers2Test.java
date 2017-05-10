package com.leetcode.p0;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/10/17.
 */
public class AddTwoNumbers2Test {

    AddTwoNumbers2 problem;

    @Before
    public void setup(){
        problem = new AddTwoNumbers2();
    }

    //(2 -> 4 -> 3) + (5 -> 6 -> 4)
    @Test
    public void simpleTest(){
        AddTwoNumbers2.ListNode first = new AddTwoNumbers2.ListNode(2);
        first.next = new AddTwoNumbers2.ListNode(4);
        first.next.next = new AddTwoNumbers2.ListNode(3);

        AddTwoNumbers2.ListNode second = new AddTwoNumbers2.ListNode(5);
        second.next = new AddTwoNumbers2.ListNode(6);
        second.next.next = new AddTwoNumbers2.ListNode(4);

        AddTwoNumbers2.ListNode result = problem.addTwoNumbers(first,second);

        System.out.println("Result " + result);

        assert result.data == 7;
        assert result.next.data == 0;
        assert result.next.next.data ==8;
    }


    //(2 -> 4 -> 3) + (5 -> 6 )
    @Test
    public void differentNumberOfDigitsTest(){
        AddTwoNumbers2.ListNode first = new AddTwoNumbers2.ListNode(2);
        first.next = new AddTwoNumbers2.ListNode(4);
        first.next.next = new AddTwoNumbers2.ListNode(3);

        AddTwoNumbers2.ListNode second = new AddTwoNumbers2.ListNode(5);
        second.next = new AddTwoNumbers2.ListNode(6);

        AddTwoNumbers2.ListNode result = problem.addTwoNumbers(first,second);

        System.out.println("Result " + result);

        assert result.data == 7;
        assert result.next.data == 0;
        assert result.next.next.data ==4;
    }

    //(9 -> 9 ) + (9 -> 9 )
    @Test
    public void carryInLastDigitTest(){
        AddTwoNumbers2.ListNode first = new AddTwoNumbers2.ListNode(9);
        first.next = new AddTwoNumbers2.ListNode(9);

        AddTwoNumbers2.ListNode second = new AddTwoNumbers2.ListNode(9);
        second.next = new AddTwoNumbers2.ListNode(9);

        AddTwoNumbers2.ListNode result = problem.addTwoNumbers(first,second);

        System.out.println("Result " + result);
        assert result.data == 8;
        assert result.next.data == 9;
        assert result.next.next.data ==1;
    }
}
