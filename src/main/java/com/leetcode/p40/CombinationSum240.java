package com.leetcode.p40;

import java.util.*;

/**
 * Problem:  Given a collection of candidate numbers (C) and a target number (T),
 * find all unique combinations in C where the candidate numbers sums to T.
 Each number in C may only be used once in the combination.
 Note:
 All numbers (including target) will be positive integers.
 The solution set must not contain duplicate combinations.
 For example, given candidate set [10, 1, 2, 7, 6, 1, 5] and target 8,
 A solution set is:
 [
 [1, 7],
 [1, 2, 5],
 [2, 6],
 [1, 1, 6]
 ]
 */
public class CombinationSum240 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
       List<List<Integer>> result = new ArrayList<>();
       Arrays.sort(candidates);
       backtrack(candidates,result,new ArrayList<>(), target,0);
       return result;
    }

   public void backtrack(int[] candidates, List<List<Integer>> result, List<Integer> partialList,
                         int remain, int start){
        if(remain <0)
            return;
        else if(remain == 0)
            result.add(new ArrayList<>(partialList));
        else{
            for(int i = start ; i < candidates.length ;i++){
                //This is the only difference
                if(i > start && candidates[i] == candidates[i-1])
                    continue;;
                partialList.add(candidates[i]);
                backtrack(candidates,result, partialList, remain-candidates[i], i+1);
                partialList.remove(partialList.size()-1);
            }
        }
   }
}
