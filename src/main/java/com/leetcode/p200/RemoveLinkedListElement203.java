package com.leetcode.p200;

import com.leetcode.ListNode;

/**
 * Created by sunilpatil on 5/24/17.
 */
public class RemoveLinkedListElement203 {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null)
            return null;

        ListNode dummy = new ListNode(-1);
        ListNode tempDummy = dummy;
        while (head != null){
            if(head.val != val){
                dummy.next = head;
                dummy = dummy.next;
            }
            head = head.next;
        }
        dummy.next = null;

        return tempDummy.next;
    }

    /**
     *   if(head.val == val)
     return head.next;
     ListNode orignalHead = head;
     while (head != null ){
     if(head.next != null && head.next.val == val){
     if(head.next.next != null){
     head.next.val = head.next.next.val;
     head.next.next = head.next.next.next;
     }else {
     head.next = null;
     }
     }
     head = head.next;
     }
     */
}
