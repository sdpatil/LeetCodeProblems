package com.leetcode;

/**
 * Created by sunilpatil on 5/24/17.
 */
public class ListNodeHelper {
    public static int getLength(ListNode head){
        int count = 0;
        while(head != null){
            head = head.next;
            count++;
        }
        return count;
    }

    public static boolean verifyNodeValues(ListNode head, int[] nodeValues){
        if(getLength(head) != nodeValues.length)
            return false;

        int count = 0;
        while(head != null){
            if(head.val != nodeValues[count])
                return false;
            head = head.next;
            count++;

        }
        return true;
    }
}
