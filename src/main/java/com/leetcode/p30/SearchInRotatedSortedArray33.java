package com.leetcode.p30;

/**
 * Created by sunilpatil on 6/22/17.
 */
public class SearchInRotatedSortedArray33 {
    /**
     Problem: Basic issue here is given rotated array how do i given number in it
     * Ex. Given {368,378,478,550,631,103,203,220,234,279} how do i find 220 in it.
     *
     * Solution: The basic idea is first find the smallest integer in the array once we have the index of smallest
     * integer check if the number that your looking for is between smallest integer and end of rotated array
     * if yes then do a binary search in 2nd half. If not do a binary search in the first half. Halfs are based on
     * the pivot
     *
     */
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return -1;
        int pivot = findPivot(nums);
        System.out.println("Pivot " + pivot);
        if (nums[pivot] == target)
            return pivot;
        else if (nums[nums.length - 1] >= target)
            return binarySearch(nums, pivot, nums.length - 1, target);
        else
            return binarySearch(nums, 0, pivot == 0 ? pivot : pivot - 1, target);
    }

    private int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    private int binarySearch(int[] nums, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}
