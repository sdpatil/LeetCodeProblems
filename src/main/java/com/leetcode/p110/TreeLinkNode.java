package com.leetcode.p110;

/**
 * Created by sunilpatil on 6/3/17.
 */
public class TreeLinkNode {
    int val;
    public TreeLinkNode left;
    public TreeLinkNode right;
    public TreeLinkNode next;

    public TreeLinkNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "TreeLinkNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                ", next=" + next +
                '}';
    }
}
