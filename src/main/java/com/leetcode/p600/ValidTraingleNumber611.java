package com.leetcode.p600;

import java.util.Arrays;

/**
 *Given an array consists of non-negative integers, your task is to count the number of
 * triplets chosen from the array that can make triangles
 * if we take them as side lengths of a triangle.

 Example 1:
 Input: [2,2,3,4]
 Output: 3
 Explanation:
 Valid combinations are:
 2,3,4 (using the first 2)
 2,3,4 (using the second 2)
 2,2,3
 */
public class ValidTraingleNumber611 {
    /**
     * Basic rule here is sum of lengths of 2 sides of triangle is always greater than the 3rd side
     * @param nums
     * @return
     */
    public int triangleNumber(int[] nums) {
        int count = 0;
        Arrays.sort(nums);

        // Start from then if sum of zeroth and n-2 is less than last side
        for(int i = nums.length-1; i >= 2 ; i--){
            int start = 0;
            int end = i-1;
            while (start < end){
                //If yes then include every body between start and end decrease end
                if(nums[start] + nums[end] > nums[i]){
                    count += (end-start);
                    end--;
                }else // Increase start because sum is too small
                    start++;
            }
        }
        return count;
    }
}
