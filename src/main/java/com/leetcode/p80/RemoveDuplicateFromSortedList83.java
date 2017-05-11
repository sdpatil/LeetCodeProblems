package com.leetcode.p80;

import com.leetcode.ListNode;

/**
 * Created by sunilpatil on 5/10/17.
 */
public class RemoveDuplicateFromSortedList83 {

    public ListNode deleteDuplicates2(ListNode head) {
        ListNode next = head;
        while (next != null) {
            ListNode temp = next;
            while (temp.next != null && temp.val == temp.next.val)
                temp = temp.next;
            next.next = temp.next;
            next = next.next;
        }
        return head;
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode list = head;
        while (list != null){
            if(list.next ==null)
                break;
            if(list.val == list.next.val)
                list.next = list.next.next;
            else
                list = list.next;
        }
        return head;
    }
}
