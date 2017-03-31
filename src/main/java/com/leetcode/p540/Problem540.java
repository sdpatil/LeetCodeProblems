package com.leetcode.p540;

/**
 * Created by sunilpatil on 3/25/17.
 */
public class Problem540 {
    public int singleNonDuplicate(int[] nums) {
        for(int i = 0; i < nums.length-1 ; i = i+2)
            if(nums[i] != nums[i+1])
                return nums[i];
        return nums[nums.length-1];
    }
}
