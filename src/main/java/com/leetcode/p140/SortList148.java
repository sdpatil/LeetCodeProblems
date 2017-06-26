package com.leetcode.p140;

import com.leetcode.ListNode;

/**
 * Created by sunilpatil on 6/19/17.
 */
public class SortList148 {
    /*
    Objective of this method is to sort a linked list. For that first break the list into middle by using
    slow and fast pointer. Then merge the two lists so this algorithm is similar to merge sort
     */
    public ListNode sortList(ListNode L) {
        if(L == null || L.next == null)
            return L;

        ListNode preSlow = null , slow =L, fast = L;
        while ( fast != null && fast.next != null){
            preSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        preSlow.next = null;

        return mergeTwoSortedLists(sortList(L), sortList(slow));
    }

    /*
    This method takes 2 sorted lists as input and merges them together to create a sorted list
    Basic idea is take first node for both first and second list, check if first is smaller add it to
    dummyNode.next if not add second to next node. Once you exhaust one of the linkedlist
     */
    public ListNode mergeTwoSortedLists(ListNode first, ListNode second){
        ListNode dummyNode =new ListNode(0);
        ListNode nextNode = dummyNode;
        while(first !=null && second != null ){
            if(first.val < second.val){
                nextNode.next = first;
                first = first.next;
            }else {
                nextNode.next = second;
                second = second.next;
            }
            nextNode = nextNode.next;
        }
        nextNode.next = first != null ? first: second;
        return dummyNode.next;
    }
}
