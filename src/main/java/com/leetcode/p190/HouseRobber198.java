package com.leetcode.p190;

/**
 * Created by sunilpatil on 5/18/17.
 */
public class HouseRobber198 {
    public int rob(int[] nums) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                a = Math.max(a + nums[i], b);
            } else {
                b = Math.max(b + nums[i], a);

            }
        }
        return Math.max(a, b);
    }
}
