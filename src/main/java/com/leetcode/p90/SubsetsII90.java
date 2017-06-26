package com.leetcode.p90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 6/26/17.
 */
public class SubsetsII90 {

    /*
    Problem: Given array containting duplicates of integers generate all permutations of elements of the array
    that do not contains duplicate
    Ex. {1,2,2} generate [[], [1], [1, 2], [1, 2, 2], [2], [2, 2]]

    Solution:- This is backtracking problem is same as that of the generating all permutations with 2 differences
    1) We have to sort the input array so that duplicates colocate to each other
    2) while adding number to templist avoid adding duplicates, we do this by checking 2 conditions
    first if i is equal to start if yes we add it to tempList, if not we check if i != i-1 if yes
    then only we add it to temp list


         */
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, result, new ArrayList<>(), 0);
        return result;
    }

    public void backtrack(int[] nums, List<List<Integer>> result, List<Integer> tempList, int start) {
        result.add(new ArrayList<>(tempList));
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1])
                continue;
            int newMember = nums[i];
            tempList.add(newMember);
            backtrack(nums, result, tempList, i + 1);
            tempList.remove(tempList.indexOf(newMember));
        }
    }
}
