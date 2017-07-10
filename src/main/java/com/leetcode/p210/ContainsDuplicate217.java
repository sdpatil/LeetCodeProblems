package com.leetcode.p210;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by sunilpatil on 7/3/17.
 */
public class ContainsDuplicate217 {

    /*
        Problem: Given an array of integers, find if the array contains any duplicates. Your function
        should return true if any value appears at least twice in the array, and it should return false
        if every element is distinct.

        Solution: Iterate through the nums array and for every element check if its already in HashSet, if not
        put it in set if yes return true
     */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> h = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (h.contains(nums[i]))
                return true;
            h.add(nums[i]);
        }
        return false;
    }

    public boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1])
                return true;
        }
        return false;
    }

    public static void main(String[] argv){
        ContainsDuplicate217 containsDuplicate217 = new ContainsDuplicate217();

        int[] nums = {1,2,3,4,5};
        System.out.println(containsDuplicate217.containsDuplicate(nums));
        System.out.println(containsDuplicate217.containsDuplicate2(nums));
    }
}