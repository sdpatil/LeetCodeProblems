package com.leetcode.p70;

import java.util.Arrays;

/**
 * Given an array with n objects colored red, white or blue, sort them so that objects of the
 * same color
 * are adjacent, with the colors in the order red, white and blue.

 Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue
 respectively.
 */
public class SortColors75 {
    public void sortColors(int[] nums) {
        int j = 0;
        int k = nums.length - 1;
        for (int i = 0; i <= k; i++) {
            if (nums[i] == 0 && i != j)
                swap(nums, i--, j++);
            else if (nums[i] == 2 && i != k)
                swap(nums, i--, k--);
        }
    }

    public void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
