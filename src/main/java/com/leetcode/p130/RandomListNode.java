package com.leetcode.p130;

/**
 * Created by sunilpatil on 5/26/17.
 */
public class RandomListNode {
    int label;
    RandomListNode next, random;

    public RandomListNode(int label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "RandomListNode{" +
                "label=" + label +
                ", next=" + next +
                '}';
    }
}
