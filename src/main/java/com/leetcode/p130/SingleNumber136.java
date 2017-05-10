package com.leetcode.p130;

/**
 * Created by sunilpatil on 5/4/17.
 */
public class SingleNumber136 {

    public int singleNumber(int[] nums) {
        int result = 0;
        for(int val: nums){
            result = result^val;
        }
        return result;
    }
}
