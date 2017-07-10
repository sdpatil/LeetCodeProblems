package com.leetcode.p20;

import com.leetcode.ListNode;

/**
 * Created by sunilpatil on 7/5/17.
 */
public class MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0 ){
            return null;
        }
        return mergeKLists(lists,0,lists.length-1);
    }

    public ListNode mergeKLists(ListNode[] lists, int left, int right){
        if(left < right){
            int mid = (left + right)/2;
            return mergeTwoLists(mergeKLists(lists,left,mid),mergeKLists(lists,mid+1,right));
        }
        return lists[left];
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode demoNode = new ListNode(0);
        ListNode resultNode = demoNode;
        ListNode first = l1;
        ListNode second = l2;
        while (first != null && second != null) {
            if (first.val < second.val) {
                demoNode.next = first;
                first = first.next;
            } else {
                demoNode.next = second;
                second = second.next;
            }
            demoNode = demoNode.next;
        }
        if (first != null)
            demoNode.next = first;
        if (second != null)
            demoNode.next = second;
        return resultNode.next;
    }
}
