package com.leetcode.p0;

/**
 * Created by sunilpatil on 5/10/17.
 */
public class AddTwoNumbers2 {
    public static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode resultNode = new ListNode(0);
        ListNode dummyNode = resultNode;
        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum = sum + l1.data;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum = sum + l2.data;
                l2 = l2.next;
            }
            dummyNode.next = new ListNode(sum % 10);
            carry = sum / 10;
            dummyNode = dummyNode.next;
        }
        if (carry != 0)
            dummyNode.next = new ListNode(carry);

        return resultNode.next;
    }
}
