package com.leetcode.p330;

/**
 * Created by sunilpatil on 7/1/17.
 */
public class IncreasingTripletSubsequence334 {
    /*
        Problem: Given an array of integer check if it has three non-increasing numbers
        Solution: Basic idea is very simple maintain 2 variables min and secondMin, check
        if the next number in array is less than min, if yes then that number becomes
        min, the second min will fill up only if we find a number bigger than min
        and third number will only fill up if we found a number bigger than second Min
     */
    public boolean increasingTriplet(int[] nums) {
        if(nums == null || nums.length < 3)
            return false;

        int min= Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for(int n: nums){
            if(n <= min)
                min = n;
            else if(n <= secondMin)
                secondMin = n;
            else
                return true;
        }
        return false;
    }
}