package com.leetcode.p30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Problem: Given a set of candidate numbers (C) (without duplicates) and a target number (T),
 * find all unique combinations in C where the candidate numbers sums to T.
 The same repeated number may be chosen from C unlimited number of times.

 Note:
 All numbers (including target) will be positive integers.
 The solution set must not contain duplicate combinations.
 For example, given candidate set [2, 3, 6, 7] and target 7,
 A solution set is:
 [
 [7],
 [2, 2, 3]
 ]
 Solution: Basic backtracking solution in which substract current number from target sum
 and send the rest to next iteration. Once remain is zero we found match. If remainder is less
 than zero  break
 */
public class CombinationSum30 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates,result,new ArrayList<>(), target,0);
        return result;
    }

    public void backtrack(int[] candidate, List<List<Integer>> result, List<Integer> tempList,
                          int remain, int start){
        if(remain < 0)
            return;
        else if(remain == 0) {
            result.add(new ArrayList<>(tempList));
        }else {
            for (int i = start; i < candidate.length ; i++){
                tempList.add(candidate[i]);
                backtrack(candidate,result,tempList, remain-candidate[i],i);
                tempList.remove(tempList.size()-1);
            }
        }
    }

}
