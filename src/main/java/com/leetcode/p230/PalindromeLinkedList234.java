package com.leetcode.p230;

import com.leetcode.ListNode;

import java.util.Stack;

/**
 * Created by sunilpatil on 5/10/17.
 */
public class PalindromeLinkedList234 {


    public boolean isPalindrome2(ListNode head) {
        Stack<Integer> stack = new Stack();
        ListNode next = head;
        while (next != null) {
            stack.push(next.val);
            next = next.next;
        }
        while (head != null) {
            if (stack.pop() != head.val)
                return false;
            head = head.next;
        }

        return true;
    }

    public boolean isPalindrome(ListNode head) {
        if(head == null)
            return true;
        ListNode middle = getMiddle(head);

        ListNode reversedHead = reverseList(middle);
        while (head != null && reversedHead != null){
            if(head.val != reversedHead.val)
                return false;
            head = head.next;
            reversedHead = reversedHead.next;
        }
        return true;
    }

    public ListNode getMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while( fast!= null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverseList(ListNode head) {
        ListNode lastNode = null;
        ListNode tempNode = null;
        while(head != null){
            tempNode = head.next;
            head.next = lastNode;
            lastNode = head;
            head = tempNode;

        }
        return lastNode;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}