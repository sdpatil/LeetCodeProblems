package com.leetcode.p40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 6/26/17.
 */
public class PermutationII47 {
    /**
     *
     *Given a collection of numbers that might contain duplicates, return all possible unique permutations.
     For example,
     [1,1,2] have the following unique permutations:
     [
     [1,1,2],
     [1,2,1],
     [2,1,1]
     ]
     Solution: Same as normal permutation with difference that we have to keep a used array and make sure that when
     we are using one of the numbers we mark it as used
     */
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        backtrack(nums,result,new ArrayList<Integer>(),used);
        return result;
    }

    public void backtrack(int[] nums, List<List<Integer>> list, List<Integer> tempList, boolean[] used){
        if(tempList.size() == nums.length){
            list.add(new ArrayList<>(tempList));
        } else{
            for(int i = 0; i < nums.length; i++){
                //This is the difference, dont reuse same digit twice and make sure that i and i-1 are not same
                if(used[i] || i > 0 && nums[i] == nums[i-1] && !used[i - 1])
                    continue;
                used[i] = true;
                tempList.add(nums[i]);
                backtrack(nums,list, tempList,  used);
                used[i] = false;
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
