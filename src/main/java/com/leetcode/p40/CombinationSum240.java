package com.leetcode.p40;

import java.util.*;

/**
 * Created by sunilpatil on 3/31/17.
 */
public class CombinationSum240 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> combinationList = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        combinationSum(candidates, target, 0, 0, new ArrayList<Integer>(), combinationList);
        return combinationList;
    }

    public void combinationSum(int[] candidates, int target, int index, int partialSum, List<Integer> partialSumList, List<List<Integer>> combinationList) {
        if (target == partialSum) {
            ArrayList<Integer> addList = new ArrayList<Integer>(partialSumList);
            combinationList.add(new ArrayList<Integer>(partialSumList));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1])
                continue;
            partialSum = partialSum + candidates[i];
            partialSumList.add(candidates[i]);
            if (partialSum <= target) {
                combinationSum(candidates, target, i + 1, partialSum, partialSumList, combinationList);
            }
            partialSum = partialSum - candidates[i];
            partialSumList.remove(partialSumList.size() - 1);
        }
    }
}
