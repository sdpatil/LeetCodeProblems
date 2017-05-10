package com.leetcode.p140;

/**
 * Created by sunilpatil on 5/5/17.
 */
public class HasCycle141 {

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != null && fast != null){
            if(slow == fast)
                return true;

            if(slow.next != null )
                slow = slow.next;

            if(fast.next != null && fast.next.next != null)
                fast = fast.next.next;
        }
        return false;
    }


}
