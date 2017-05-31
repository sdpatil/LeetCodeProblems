package com.leetcode.p70;

import java.util.Arrays;

/**
 * Created by sunilpatil on 5/24/17.
 */
public class SortColors75 {
    public void sortColors(int[] nums) {
       int j = 0;
       int k =nums.length-1;
       for(int i = 0; i<= k ;i++){
           if (nums[i] == 0 && i != j)
               swap(nums,i--, j++);
           else if (nums[i] == 2 && i != k)
               swap(nums, i--, k--);
       }
    }



    public void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
