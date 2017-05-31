package com.leetcode.p140;

import com.leetcode.ListNode;

/**
 * Created by sunilpatil on 5/5/17.
 */
public class HasCycle141 {

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                slow = head;
                while (slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }

            }


        }
        return false;
    }


}
