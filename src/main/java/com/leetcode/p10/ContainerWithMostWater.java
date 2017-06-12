package com.leetcode.p10;

/**
 * Created by sunilpatil on 6/11/17.
 */
public class ContainerWithMostWater {
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
