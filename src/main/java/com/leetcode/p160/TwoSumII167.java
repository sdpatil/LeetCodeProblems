package com.leetcode.p160;

import java.util.Arrays;

/**
 * Created by sunilpatil on 6/15/17.
 */
public class TwoSumII167 {

    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int searchValue = target - nums[i];
            int secondIndex = binarySearch(nums, searchValue, i + 1, nums.length - 1);
            if (secondIndex != -1)
                return new int[]{i + 1, secondIndex + 1};
        }
        return null;
    }

    //Binary Search non-recursive solution
    private int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = (end + start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
