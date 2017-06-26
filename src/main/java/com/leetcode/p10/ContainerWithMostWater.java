package com.leetcode.p10;

/**
 * Created by sunilpatil on 6/11/17.
 */
public class ContainerWithMostWater {

    /**
     * Basic idea is start a pointer from zero to right most node and check how
     * much water can be filled, then check which edge of container is smaller
     * start or end, if start is smaller then start++ if end is smaller then
     * end--, if both equal then both end-- and start++;
     *
     * At every step get min height of start and end * current width to calculte
     * how much water, use it to check if this is max

     */
    public int maxArea(int[] height) {
        if (height == null || height.length == 0)
            return 0;
        int start = 0;
        int end = height.length - 1;
        int maxWater = Integer.MIN_VALUE;

        while (start < end) {
            int width = end - start;
            int minHeight = Math.min(height[start], height[end]);
            int currentArea = width * minHeight;
            maxWater = Math.max(currentArea, maxWater);
            //
            if (height[start] < height[end]) {
                start++;
            } else if (height[start] > height[end]) {
                end--;
            } else {
                start++;
                end--;
            }
        }
        return maxWater;
    }

}
