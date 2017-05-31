package com.leetcode.p200;

import com.leetcode.ListNode;
import com.leetcode.ListNodeHelper;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/24/17.
 */
public class RemoveLinkedListElement203Test {

    RemoveLinkedListElement203 problem;

    @Before
    public void setup(){
        problem = new RemoveLinkedListElement203();
    }

    @Test
    public void deleteLastElementTest(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        assert ListNodeHelper.getLength(head) == 6;
        assert ListNodeHelper.verifyNodeValues(head,new int[]{1,2,3,4,5,6});
        problem.removeElements(head,6);
        assert ListNodeHelper.getLength(head) == 5;
        assert ListNodeHelper.verifyNodeValues(head,new int[]{1,2,3,4,5});
    }

    @Test
    public void deleteMiddleElementTest(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        assert ListNodeHelper.getLength(head) == 6;
        assert ListNodeHelper.verifyNodeValues(head,new int[]{1,2,3,4,5,6});
        problem.removeElements(head,3);
        assert ListNodeHelper.getLength(head) == 5;
        assert ListNodeHelper.verifyNodeValues(head,new int[]{1,2,4,5,6});
    }

    @Test
    public void deleteFirstElementTest(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        assert ListNodeHelper.getLength(head) == 6;
        assert ListNodeHelper.verifyNodeValues(head,new int[]{1,2,3,4,5,6});
        head =problem.removeElements(head,1);
        assert ListNodeHelper.getLength(head) == 5;
        assert ListNodeHelper.verifyNodeValues(head,new int[]{2,3,4,5,6});
    }

    @Test
    public void deleteNonExistingElementTest(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        assert ListNodeHelper.getLength(head) == 6;
        assert ListNodeHelper.verifyNodeValues(head,new int[]{1,2,3,4,5,6});
        head =problem.removeElements(head,11);
        assert ListNodeHelper.getLength(head) == 6;
        assert ListNodeHelper.verifyNodeValues(head,new int[]{1,2,3,4,5,6});
    }

    @Test
    public void badInputTest(){
        ListNode test =problem.removeElements(null,11);
        assert test == null;
    }


    @Test
    public void removeAllElementsTest(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);


        assert ListNodeHelper.getLength(head) == 2;
        assert ListNodeHelper.verifyNodeValues(head,new int[]{1,1});
        head =problem.removeElements(head,1);
        assert head == null;
    }
}
