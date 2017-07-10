package com.leetcode.p130;

/**
 * Created by sunilpatil on 5/4/17.
 */
public class SingleNumber136 {
    /*
    Problem:Given an array of integers, every element appears
    twice except for one. Find that single one.

    Solution: Basic idea is xor all the numbers in array
    the numbers that appear twice will cancel out each others
    bit leaving only the number that does not appear twice
     */
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int val: nums){
            result = result^val;
        }
        return result;
    }
}
