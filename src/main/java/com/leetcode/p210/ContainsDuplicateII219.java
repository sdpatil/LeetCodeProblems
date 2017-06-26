package com.leetcode.p210;

import java.util.HashSet;

/**
 * Created by sunilpatil on 6/23/17.
 */
public class ContainsDuplicateII219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++)
            set.add(nums[i]);

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(k + nums[i]))
                return true;
        }
        return false;
    }
}
