package com.leetcode.p210;

/**
 * Created by sunilpatil on 7/3/17.
 */
public class HouseRobberII213 {
    /*
      Problem:  After robbing those houses on that street, the thief has found himself a new place for his thievery
        so that he will not get too much attention. This time, all houses at this place are arranged in a
        circle. That means the first house is the neighbor of the last one. Meanwhile, the security system
        for these houses remain the same as for those in the previous street.

        Solution: - This problem is same as that of the basic house robber. IN order to deal with circular
        nature of the houses. Check the maximum if you include last house vs. exculte last house
        maximum of those 2 is the answer
     */
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        if(nums.length == 1)
            return nums[0];
        if(nums.length == 2)
            return Math.max(nums[0],nums[1]);
        int withoutLastHouse = robHelper(nums,0,nums.length-1);
        int withLastHouse = robHelper(nums, 1, nums.length);

        return Math.max(withLastHouse,withoutLastHouse);
    }


    public int robHelper(int[] nums, int start, int end){
        int prevMax = 0 ;
        int currMax = 0;
        for(int i = start; i < end; i++){
            int n = nums[i];
            int temp = currMax;
            currMax = Math.max(prevMax+n, currMax);
            prevMax = temp;
        }
        return currMax;
    }
}
