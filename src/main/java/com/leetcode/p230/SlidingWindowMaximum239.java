package com.leetcode.p230;

/**
 * Created by sunilpatil on 5/12/17.
 */
public class SlidingWindowMaximum239 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0)
            return new int[]{};
        int[] maxSlidingWindow = new int[nums.length + 1 - k];
        QueueWithMax queueWithMax = new QueueWithMax();
        for (int i = 0, slidingCount = 0; i < nums.length; i++) {
            if (i >= k) {
                maxSlidingWindow[slidingCount++] = queueWithMax.getMax();
                queueWithMax.dequeue();
            }
            queueWithMax.enqueue(nums[i]);
        }
        maxSlidingWindow[maxSlidingWindow.length - 1] = queueWithMax.getMax();

        return maxSlidingWindow;
    }


}
