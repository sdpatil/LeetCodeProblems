package com.leetcode.p300;

/**
 * Created by sunilpatil on 5/20/17.
 */
public class LongestIncreasingSubsequence300 {

    public int lengthOfLIS(int[] nums) {
        int[] dptable = new int[nums.length];

        int i = 0;
        int j = 0;
        for (i = 0; i < nums.length; i++)
            dptable[i] = 1;

        for (i = 1; i < nums.length; i++) {

            for (j = 0; j < i; j++) {
                if (nums[i] > nums[j] && dptable[i] < dptable[j] + 1)
                    dptable[i] = dptable[j] + 1;
            }
        }

        int max = 0;
        for (int count : dptable)
            max = Math.max(max, count);
        return max;
    }

    public int lengthOfLISRecursive(int[] nums) {
        int longestSubsequence = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int currentLength = 0;
            int currentNumber = nums[i];
            for (int j = i; j < nums.length; j++) {
                if (nums[j] > currentNumber) {
                    currentLength++;
                    currentNumber = nums[j];
                }
            }

            longestSubsequence = Math.max(currentLength, longestSubsequence);
        }
        return longestSubsequence;
    }
}
