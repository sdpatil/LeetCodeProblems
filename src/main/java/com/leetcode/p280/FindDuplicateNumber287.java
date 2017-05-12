package com.leetcode.p280;

/**
 * Created by sunilpatil on 5/11/17.
 */
public class FindDuplicateNumber287 {
    public int findDuplicate(int[] nums) {
        long sum = 0;
        for (int i : nums)
            sum = sum + i;
        int expectedSum = (nums.length * (nums.length - 1)) / 2;
        return (int) sum - expectedSum;
    }
}
