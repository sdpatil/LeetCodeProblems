package com.leetcode.p280;

/**
 * Created by sunilpatil on 5/9/17.
 */
public class MoveZeros283 {
    public void moveZeroes(int[] nums) {
        int cursor = 0;
        int copyIndex = 0;
        //Copy all non-zero elements one after other using cursor
        while (cursor < nums.length) {
            if (nums[cursor] != 0)
                nums[copyIndex++] = nums[cursor++];
            else
                cursor++;
        }
        //Fill rest of the array with zeros
        while (copyIndex < nums.length)
            nums[copyIndex++] = 0;
    }

    private void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
