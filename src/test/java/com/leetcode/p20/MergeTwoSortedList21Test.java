package com.leetcode.p20;

import com.leetcode.ListNode;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/22/17.
 */
public class MergeTwoSortedList21Test {
    MergeTwoSortedList21 problem;

    @Before
    public void setup() {
        problem = new MergeTwoSortedList21();
    }

    @Test
    public void evenOddTest() {
        ListNode first = new ListNode(1);
        first.next = new ListNode(3);
        first.next.next = new ListNode(5);

        ListNode second = new ListNode(2);
        second.next = new ListNode(4);
        second.next.next = new ListNode(6);

        ListNode result = problem.mergeTwoLists(first, second);
        System.out.println("Result " + result);
        assert result.val == 1;
        assert result.next.val == 2;
        assert result.next.next.val == 3;
        assert result.next.next.next.val == 4;
        assert result.next.next.next.next.val == 5;
        assert result.next.next.next.next.next.val == 6;
    }

    @Test
    public void firstBeforeSecondTest() {
        ListNode first = new ListNode(1);
        first.next = new ListNode(2);
        first.next.next = new ListNode(3);

        ListNode second = new ListNode(4);
        second.next = new ListNode(5);
        second.next.next = new ListNode(6);

        ListNode result = problem.mergeTwoLists(first, second);
        System.out.println("Result " + result);
        assert result.val == 1;
        assert result.next.val == 2;
        assert result.next.next.val == 3;
        assert result.next.next.next.val == 4;
        assert result.next.next.next.next.val == 5;
        assert result.next.next.next.next.next.val == 6;
    }

    @Test
    public void secondBeforeFirstTest() {
        ListNode first = new ListNode(1);
        first.next = new ListNode(2);
        first.next.next = new ListNode(3);

        ListNode second = new ListNode(4);
        second.next = new ListNode(5);
        second.next.next = new ListNode(6);

        ListNode result = problem.mergeTwoLists( second, first);
        System.out.println("Result " + result);
        assert result.val == 1;
        assert result.next.val == 2;
        assert result.next.next.val == 3;
        assert result.next.next.next.val == 4;
        assert result.next.next.next.next.val == 5;
        assert result.next.next.next.next.next.val == 6;
    }

    @Test
    public void badInputValidationTest() {
        ListNode first = new ListNode(1);
        first.next = new ListNode(2);
        first.next.next = new ListNode(3);

        ListNode result = problem.mergeTwoLists(first,null);

        assert result.val ==1;
        assert result.next.val ==2;
        assert result.next.next.val ==3;

        result = problem.mergeTwoLists(null, first);

        assert result.val ==1;
        assert result.next.val ==2;

    }
}
