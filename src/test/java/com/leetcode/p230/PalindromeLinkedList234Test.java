package com.leetcode.p230;

import com.leetcode.ListNode;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/10/17.
 */
public class PalindromeLinkedList234Test {
    PalindromeLinkedList234 problem;

    @Before
    public void setup(){
        problem = new PalindromeLinkedList234();
    }

    @Test
    public void emptyLinkedListTest(){

        boolean result = problem.isPalindrome(null);
        assert result;
    }

    @Test
    public void singleElementLinkedListTest(){
        ListNode listNode = new ListNode(1);

        boolean result = problem.isPalindrome(listNode);
        assert result;
    }

    @Test
    public void simplePositiveTest(){
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(1);
        boolean result = problem.isPalindrome(listNode);
        assert result;
    }

    @Test
    public void simpleNegativeTest(){
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        boolean result = problem.isPalindrome(listNode);
        assert !result;
    }

    @Test
    public void oddNumberOfNodesTest(){
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(2);
        listNode.next.next.next.next = new ListNode(1);


        boolean result = problem.isPalindrome(listNode);
        assert result;
    }

    @Test
    public void complexTest(){
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(1);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next = new ListNode(1);

        boolean result = problem.isPalindrome(listNode);
        assert !result;
    }

    @Test
    public void getMiddleEvenTest(){
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        ListNode middle = problem.getMiddle(listNode);
        System.out.println("Middle " + middle);
        assert middle.val==3;
    }

    @Test
    public void getMiddleOddTest(){
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        ListNode middle = problem.getMiddle(listNode);
        System.out.println("Middle " + middle);

        assert middle.val==3;
    }
}
