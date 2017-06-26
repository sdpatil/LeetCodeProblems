package com.leetcode.p80;

/**
 * Created by sunilpatil on 6/26/17.
 */
public class RemoveDuplicatesII80 {
    /*
        Problem: Given an array of number remove {1,1,1,2,2,3} 3rd duplicate.
        Ex. output in this case is {1,1,2,2,3,0}

        Solution:- Basic idea is same as that of the RemoveDuplicate, you maintain write
        index and start iterating through the array, whenver current element is more than
        2nd last element in the new array then copy it to new array
     */
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i < 2 || n > nums[i-2])
                nums[i++] = n;
        return i;
    }
}
