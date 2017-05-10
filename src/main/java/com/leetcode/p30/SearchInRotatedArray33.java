package com.leetcode.p30;

/**
 * Created by sunilpatil on 3/31/17.
 */
public class SearchInRotatedArray33 {
    public int search(int[] nums, int target) {
        int mid = findMin(nums);
        System.out.println("Real mid " + nums[mid]);
        return 0;
    }

    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        if (nums.length == 1 || nums[start] < nums[end])
            return nums[0];
        while (start <= end) {
            mid = (start + end) / 2;
            if (nums[mid] > nums[mid + 1])
                return mid + 1;
            else if (nums[mid] > nums[end])
                start = mid + 1;
            else
                end = mid;
        }
        return -1;
    }
}
