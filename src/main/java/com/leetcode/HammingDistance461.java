package com.leetcode;

/**
 * Created by sunilpatil on 5/13/17.
 */
public class HammingDistance461 {
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
            n = n >>> 1;
        }

        return count;
    }
}
