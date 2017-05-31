package com.leetcode.p80;

import com.leetcode.ListNode;
import com.leetcode.ListNodeHelper;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/26/17.
 */
public class RemoveDuplicateFromSortedListII82Test {
    RemoveDuplicateFromSortedListII82 problem = new RemoveDuplicateFromSortedListII82();

    @Test
    public void simpleTest(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);

        assert ListNodeHelper.getLength(head) == 7;
        assert ListNodeHelper.verifyNodeValues(head, new int[]{1,2,3,3,4,4,5});
        ListNode result = problem.deleteDuplicates(head);
        assert ListNodeHelper.getLength(head) == 3;
        assert ListNodeHelper.verifyNodeValues(head, new int[]{1,2,5});
    }
}
