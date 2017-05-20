package com.leetcode.p470;

/**
 * Created by sunilpatil on 5/13/17.
 */
public class TotalHammingDistance477 {
    public int totalHammingDistance(int[] nums) {
        int total = 0, n = nums.length;
        for(int j =0 ; j < 32; j++){
            int bitCount= 0;
            for(int i = 0; i < n ;i++){
                bitCount += (nums[i] >> j) &1;
            }
            total += bitCount * (n - bitCount);
        }
        return total;
    }
        public int totalHammingDistance2(int[] nums) {
        int totalDistance = 0;
        for (int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length;j++){
                totalDistance = totalDistance+ hammingDistance(nums[i],nums[j]);
            }
        }
        return totalDistance;
    }

    public int hammingDistance(int x, int y) {
        int t = x ^ y;
        System.out.printf("x -> %d y -> %d result -> %d\n",x,y,t);
        return hammingWeight(t);
    }

    public int hammingWeight(int n) {
        long c = n;
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1)
                count++;
            //Use >>> instead of >> to handle unsigned
            n = n >>> 1;
        }

        return count;
    }
}
