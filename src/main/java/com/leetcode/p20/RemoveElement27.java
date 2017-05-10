package com.leetcode.p20;

/**
 * Created by sunilpatil on 5/9/17.
 */
public class RemoveElement27 {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 1 && nums[0] == val)
            return 0;
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            while (start < end && nums[start] != val)
                start++;
            while (end > 0 && nums[end] == val)
                end--;
            swap(nums, start, end);
            start++;
            end--;
        }
        if(start == nums.length)
            return nums.length;

        return end + 1;
    }

    private void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
