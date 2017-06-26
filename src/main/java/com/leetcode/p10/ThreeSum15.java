package com.leetcode.p10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by sunilpatil on 6/15/17.
 */
public class ThreeSum15 {

    /*
    Problem:  Given an integer array find all combinations of 3 elements whose sum is equal to zero
    Solution: First sort the array, then for every element, start 2 pointers one pointing to first element
    after i and second pointing to last element, add them to see if their sum equals to -1* nums[i], if yes then
    that means we found combination if not then check if sum is larger than target if yes k-- i.e. move inwards
    if not j++, move towards end

     */
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0 ; i < nums.length-2; i++){
            //Skip duplicates of the first element
            if(i == 0 || (nums[i] != nums[i-1])) {
                int j = i + 1;
                int k = nums.length - 1;
                int target = -1 * nums[i];
                while (j < k) {
                    if (nums[j] + nums[k] == target){
                        result.add(Arrays.asList(i,j,k));
                        while (j < k && nums[j] == nums[j+1])
                            j++;
                        while (j < k && nums[k] == nums[k-1])
                            k--;
                        j++;
                        k--;
                    }else if(nums[j] + nums[k] > target) {
                        k--;
                    }else{
                        j++;
                    }
                }
            }
        }
        return result;
    }
/*
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length < 2)
            return result;

        for(int i = 0 ; i < nums.length-2; i++){
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])){
                int lo = i+1;
                int hi = nums.length-1;
                int sum = 0 - nums[i];

                while (lo < hi){
                    if(nums[lo] + nums[hi] == sum){
                        result.add(Arrays.asList(nums[i],nums[lo],nums[hi]));
                        while (lo < hi && nums[lo] == nums[lo+1] )
                            lo++;
                        while (lo < hi && nums[hi] == nums[hi-1])
                            hi--;
                        lo++;
                        hi--;
                    }else if(nums[lo] + nums[hi] < sum)
                        lo++;
                    else
                        hi--;
                }
            }
        }
        return result;
    }*/
}
