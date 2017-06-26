package com.leetcode.p40;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 3/26/17.
 */
public class Permutation46 {
    /*
    Problem: Given a collection of distinct numbers, return all possible permutations.
        For example,
        [1,2,3] have the following permutations:
        [
          [1,2,3],
          [1,3,2],
          [2,1,3],
          [2,3,1],
          [3,1,2],
          [3,2,1]
        ]

     Solution:- Iterate through the list of numbers every time starting with 0 instead of start. Check if the number
        is already part of permutation if ye
     */
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums,result,new ArrayList<>());
        return result;
    }
    public void backtrack(int[] nums, List<List<Integer>> result, List<Integer> tempList ){
        // Add to result only if size matches
        if(tempList.size() == nums.length)
            result.add(new ArrayList<>(tempList));

        for(int i = 0 ; i < nums.length ;i++){
            // This is to make sure that same number is not added twice to result
            if(tempList.contains(nums[i]))
                continue;
            tempList.add(nums[i]);
            backtrack(nums,result,tempList);
            tempList.remove(tempList.size()-1);
        }
    }

}
