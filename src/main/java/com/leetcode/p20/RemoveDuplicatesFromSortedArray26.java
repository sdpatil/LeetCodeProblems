package com.leetcode.p20;

/**
 * Created by sunilpatil on 5/25/17.
 */
public class RemoveDuplicatesFromSortedArray26 {
    public int removeDuplicates(int[] nums) {
        if(nums == null )
            return 0;
        if(nums.length == 1 )
            return 1;
        int copyCount = 1;
        for(int i = 1;  i< nums.length ;i++){
            if(nums[i-1] != nums[i])
                nums[copyCount++] = nums[i];
        }
        return copyCount;
    }
}
