package com.leetcode.p440;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 6/11/17.
 */
public class FindAllDisappearedNumbersInArray448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums == null || nums.length == 0)
            return result;

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0)
                nums[index] = -1 * nums[index];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                result.add(i + 1);
        }

        return result;
    }
}
