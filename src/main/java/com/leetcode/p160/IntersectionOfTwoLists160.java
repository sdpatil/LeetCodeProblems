package com.leetcode.p160;

import com.leetcode.ListNode;

/**
 * Created by sunilpatil on 5/25/17.
 */
public class IntersectionOfTwoLists160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null  || headB == null)
            return null;
        ListNode l1 = headA;
        int length1 = 0;
        while (l1 != null){
            l1 =l1.next;
            length1++;
        }

        ListNode l2 = headB;
        int length2 = 0;
        while (l2 != null){
            l2 = l2.next;
            length2++;

        }
        ListNode head1, head2;
        int diff =0 ;
        if(length1 < length2){
            head1 = headB;
            head2 = headA;
            diff = length2 - length1;

        }else{
            head1 = headA;
            head2 = headB;
            diff = length1 - length2;
        }

        for(int i = 0 ; i < diff ;i++)
            head1 = head1.next;

        while (head1 != null && head2 != null){
            if(head1 == head2)
                return head1;
            head1 = head1.next;
            head2 = head2.next;
        }
        return null;
    }
}
