package com.leetcode.p320;

import java.util.HashMap;

/**
 * Created by sunilpatil on 5/23/17.
 */
public class MaxSizeSubarray325 {
    public int maxSubArrayLen(int[] nums, int k) {
        if(nums == null || nums.length ==0)
            return 0;
        int sum = 0, max = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (sum == k) max = i + 1;
            else if (map.containsKey(sum - k))
                max = Math.max(max, i - map.get(sum - k));
            if (!map.containsKey(sum)) map.put(sum, i);
        }
        return max;
    }

}
