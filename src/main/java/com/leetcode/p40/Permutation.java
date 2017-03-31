package com.leetcode.p40;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 3/26/17.
 */
public class Permutation {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        permute(0, nums, result);
        return result;
    }

    public void permute(int k, int[] nums, List<List<Integer>> result) {
        if (k == nums.length - 1) {
            result.add(convertIntArrayToList(nums));
            return;
        }
        for (int i = k; i < nums.length; i++) {
            swap(nums, k, i);
            permute(k + 1, nums, result);
            swap(nums, k, i);
        }
    }

    private void swap(int[] nums, int f, int s) {
        int temp = nums[f];
        nums[f] = nums[s];
        nums[s] = temp;
    }

    private static List<Integer> convertIntArrayToList(int[] input) {
        List<Integer> list = new ArrayList();
        for (int i : input) {
            list.add(i);
        }
        return list;
    }
}
