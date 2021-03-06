package com.leetcode.p250;

import java.util.Arrays;

/**
 * Given an array of n integers nums and a target, find the number of index triplets i, j, k with 0 <= i < j < k < n
 * that satisfy the condition nums[i] + nums[j] + nums[k] < target.

 For example, given nums = [-2, 0, 1, 3], and target = 2.

 Return 2. Because there are two triplets which sums are less than 2:

 [-2, 0, 1]
 [-2, 0, 3]
 */
public class ThreeSumSmaller259 {
    public int threeSumSmaller(int[] nums, int target) {
        int count = 0;

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                // If i + start + end less than target then that means everything between
                // Second and third element also meets condition, so count all of them and move
                // middle by one
                if (nums[i] + nums[start] + nums[end] < target) {
                    count += end - start;
                    start++;
                } else {
                    //Sum is too big only way to get it down is by reducing last element
                    end--;
                }
            }
        }
        return count;
    }
}
