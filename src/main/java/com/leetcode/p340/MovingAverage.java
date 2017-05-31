package com.leetcode.p340;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 346. Moving Average from Data Stream
 * Created by sunilpatil on 5/30/17.
 */
public class MovingAverage {
    int size;
    Deque<Integer> queue;
    double currentTotal = 0;

    /**
     * Initialize your data structure here.
     */
    public MovingAverage(int size) {
        this.size = size;
        this.queue = new LinkedList<Integer>();
    }

    public double next(int val) {
        if (this.queue.size() > size - 1) {
            int removedValue = this.queue.removeFirst();
            currentTotal = currentTotal - removedValue;
        }
        currentTotal = currentTotal + val;
        queue.addLast(val);
        return currentTotal / queue.size();

    }
}
