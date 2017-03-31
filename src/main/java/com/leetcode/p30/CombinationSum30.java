package com.leetcode.p30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by sunilpatil on 3/31/17.
 */
public class CombinationSum30 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> combinationList = new ArrayList<List<Integer>>();
        combinationSum(candidates, target, 0, 0, new ArrayList<Integer>(), combinationList);
        return combinationList;
    }

    public void combinationSum(int[] candidates, int target, int index, int partialSum, List<Integer> partialSumList, List<List<Integer>> combinationList) {
        if (target == partialSum) {
            combinationList.add(new ArrayList<Integer>(partialSumList));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            partialSum = partialSum + candidates[i];
            partialSumList.add(candidates[i]);
            if (partialSum <= target) {
                combinationSum(candidates, target, i, partialSum, partialSumList, combinationList);
            }
            partialSum = partialSum - candidates[i];
            partialSumList.remove(partialSumList.size() - 1);
        }
    }
}
