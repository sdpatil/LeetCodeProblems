package com.leetcode.p210;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by sunilpatil on 6/23/17.
 */
public class ContainsDuplicateII219 {
    public boolean containsNearbyDuplicate2(int[] nums, int k) {
        HashMap<Integer, Integer> numToIndexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numToIndexMap.containsKey(nums[i])) {
                int previousIndex = numToIndexMap.get(nums[i]);
                if (i - previousIndex <= k)
                    return true;
            }
            numToIndexMap.put(nums[i], i);
        }
        return false;
    }

    /*
        Problem: Given an array of integers and an integer k, find out whether there are two distinct indices
        i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at
        most k.

        Solution: Iterate through the array checking if current number is in a set, if not add the current number
        in set, always make sure to remove number further than k distance from current index is removed
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer>  numSet = new HashSet<>();
        for(int i = 0 ; i < nums.length; i++){

            if(i > k){
                numSet.remove(nums[i -k -1]);
            }
            if(numSet.contains(nums[i]))
                return true;
            numSet.add(nums[i]);
        }
        return false;
    }
}
