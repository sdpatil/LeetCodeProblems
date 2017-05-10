package com.leetcode.p150;

/**
 * Created by sunilpatil on 4/28/17.
 */
public class FindMinimumInRotatedSortedArray153 {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        if (nums.length == 1 || nums[start] < nums[end])
            return nums[0];
        while (start <= end) {
            mid = (start + end) / 2;
            if (nums[mid] > nums[mid + 1])
                return nums[mid + 1];
            else if (nums[mid] > nums[end])
                start = mid + 1;
            else
                end = mid;
            System.out.println("Mid " + nums[mid]);
        }
        return -1;
    }
}
