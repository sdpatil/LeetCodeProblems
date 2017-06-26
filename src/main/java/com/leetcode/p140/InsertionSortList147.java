package com.leetcode.p140;

import com.leetcode.ListNode;

/**
 * Created by sunilpatil on 6/19/17.
 */
public class InsertionSortList147 {

    public ListNode insertionSortList(ListNode L) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next =L;
        ListNode iter = L;

        while (iter != null && iter.next != null){
            if(iter.val > iter.next.val){
                ListNode target = iter.next, pre =dummyHead;
                while (pre.next.val < target.val){
                    pre = pre.next;
                }
                ListNode temp = pre.next;
                pre.next = target;
                iter.next = target.next;
                target.next = temp;
            }else
                iter = iter.next;
        }
        return dummyHead.next;
    }
}
