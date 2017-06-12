package com.leetcode.p290;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Created by sunilpatil on 6/7/17.
 */
public class MedianFinder {
    private int DEFAULT_INITIAL_CAPACITY = 16;
    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;

    /**
     * initialize your data structure here.
     */
    public MedianFinder() {
        minHeap = new PriorityQueue<Integer>();
        maxHeap = new PriorityQueue<Integer>(DEFAULT_INITIAL_CAPACITY,
                Collections.reverseOrder());
    }

    public void addNum(int num) {
        if (minHeap.isEmpty())
            minHeap.add(num);
        else {
            if (num >= minHeap.peek())
                minHeap.add(num);
            else
                maxHeap.add(num);
        }

        if (minHeap.size() > maxHeap.size() + 1)
            maxHeap.add(minHeap.remove());
        else if (maxHeap.size() > minHeap.size())
            minHeap.add(maxHeap.remove());
    }

    public double findMedian() {
        if (minHeap.size() == maxHeap.size()) {
            return (minHeap.peek() + maxHeap.peek()) * 0.5;
        } else
            return minHeap.peek();
    }
}
