package com.leetcode.p300;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sunilpatil on 5/23/17.
 */
public class NumArray {
    int[] nums;

    public NumArray(int[] nums) {
        for (int i = 1; i < nums.length; i++)
            nums[i] = nums[i] + nums[i - 1];
        this.nums = nums;
    }

    public int sumRange(int i, int j) {
        if (i == 0)
            return nums[j];
        return nums[j] - nums[i - 1];
    }
}
