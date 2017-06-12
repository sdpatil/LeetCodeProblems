package com.leetcode.p440;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 6/11/17.
 */
public class FindDuplicatesInArray442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if(nums == null || nums.length == 0)
            return result;

        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]);
            if(nums[index-1] > 0)
                nums[index-1] = -1*nums[index-1];
            else
                result.add(Math.abs(nums[i]));
        }

        return result;
    }
}
