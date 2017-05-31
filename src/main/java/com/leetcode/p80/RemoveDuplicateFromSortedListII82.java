package com.leetcode.p80;

import com.leetcode.ListNode;

/**
 * Created by sunilpatil on 5/26/17.
 */
public class RemoveDuplicateFromSortedListII82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = new ListNode(Integer.MAX_VALUE);
        temp.next = head;

        int duplicateVal = Integer.MIN_VALUE;
        while(head != null && head.next != null){
            if(head.val == head.next.val)
                duplicateVal = head.val;
            if(head.val != duplicateVal)
                temp.next =head;

        }
        return temp.next;
    }
}
