package com.leetcode.p10;

import com.leetcode.ListNode;
import com.leetcode.ListNodeHelper;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/25/17.
 */
public class RemoveNthNodeFromEndOfListTest {
    RemoveNthNodeFromEndOfList problem = new RemoveNthNodeFromEndOfList();

    @Test
    public void simpleTest(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println(head);

        assert ListNodeHelper.getLength(head) ==5;
        assert ListNodeHelper.verifyNodeValues(head, new int[]{1,2,3,4,5});
        ListNode result = problem.removeNthFromEnd(head,2);

        assert ListNodeHelper.getLength(result) ==4;
        assert ListNodeHelper.verifyNodeValues(result, new int[]{1,2,3,5});
    }

    @Test
    public void badInputTest(){
        assert problem.removeNthFromEnd(null,2) == null;
        ListNode head = new ListNode(1);
        assert problem.removeNthFromEnd(head,0).val == 1;
    }

    @Test
    public void nMoreThanLengthTest(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        ListNode result = problem.removeNthFromEnd(head,3);
        System.out.println(result);
    }

    @Test
    public void removeFirstElementTest(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        ListNode result = problem.removeNthFromEnd(head,2);
        System.out.println("Result " + result);

    }

    @Test
    public void simple188Test(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        ListNode result = problem.removeNthFromEnd(head,1);
        assert result.val == 1;
    }

    @Test
    public void simple1Test(){
        ListNode head = new ListNode(1);
        ListNode result = problem.removeNthFromEnd(head,1);
        assert result == null;
    }
}
