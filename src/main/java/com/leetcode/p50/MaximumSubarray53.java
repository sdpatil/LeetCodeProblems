package com.leetcode.p50;

/**
 * Created by sunilpatil on 3/31/17.
 */
public class MaximumSubarray53 {
    public int maxSubArray(int[] nums) {
        int maxSubArray = Integer.MIN_VALUE;

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            maxSubArray = Math.max(sum, maxSubArray);
            if (sum < 0)
                sum = 0;
        }

        return maxSubArray;
    }
}
