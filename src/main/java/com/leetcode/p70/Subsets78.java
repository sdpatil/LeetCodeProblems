package com.leetcode.p70;

import java.util.*;

/**
 * Created by sunilpatil on 6/25/17.
 */
public class Subsets78 {

    /*
    Problem: Given array of integers generate all permutations of elements of the array
    Ex. {1,3,5} generate [[], [1], [1, 3], [1, 3, 5], [1, 5], [3], [3, 5], [5]]

    Solution:- This is backtrack problem in which we add a member to the templist perform backtrack
    and then take it out. Since we need all permutations we add every permutation to result without checking
     */
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums,result,new ArrayList<>(),0);
        return result;
    }

    public void backtrack(int[] nums, List<List<Integer>> result,  List<Integer> tempList, int start ) {
        result.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length;i++ ){
            int newMember = nums[i];
            tempList.add(newMember);
            backtrack(nums,result,tempList,i+1);
            tempList.remove(tempList.indexOf(newMember));
        }

    }

}
