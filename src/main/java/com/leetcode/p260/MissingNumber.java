package com.leetcode.p260;

/**
 * Created by sunilpatil on 7/3/17.
 */
public class MissingNumber {
    /*
    Problem: Given an array containing n distinct numbers taken from
    0, 1, 2, ..., n, find the one that is missing from
    the array.

        For example,
        Given nums = [0, 1, 3] return 2

    Solution: The basic idea is to use XOR operation. We all know
    that a^b^b =a, which means two xor operations
    with the same number will eliminate the number and reveal the
    original number.
    In this solution, I apply XOR operation to both the index and
    value of the array. In a complete array with no
    missing numbers, the index and value should be perfectly
    corresponding( nums[index] = index), so in a missing array,
    what left finally is the missing number.
     */
    public int missingNumber(int[] nums) {
        int result = 0;
        int i = 0;
        for( i = 0 ; i < nums.length ; i++){
            result = result ^ i ^ nums[i];
        }
        return result ^i;
    }
}