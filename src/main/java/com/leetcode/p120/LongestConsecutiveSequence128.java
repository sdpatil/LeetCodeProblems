package com.leetcode.p120;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sunilpatil on 6/8/17.
 */
public class LongestConsecutiveSequence128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        int max = 0;

        //Add all the numbers to a HashSet first
        for(int num: nums)
            numSet.add(num);

        for(int num: nums){
            //That means the num or the consequentive sequence around num has not been processed yet
            if(numSet.remove(num)){
                int sum =1;
                int val = num;
                while(numSet.remove(val-1))
                    val = val-1;
                sum = sum + Math.abs(val-num);
                val = num;

                while (numSet.remove(val+1))
                    val = val+1;
                sum = sum + Math.abs(val-num);

                max = Math.max(sum,max);
            }
        }

        return max;
    }
}
