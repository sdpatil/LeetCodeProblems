package com.leetcode.p190;

/**
 * Created by sunilpatil on 5/8/17.
 */
public class NumberOf1Bits191 {
    public int hammingWeight(int n) {
        long c = n;
        int count =0;
        while(n!= 0){
            if( (n & 1) == 1)
                count++;
            n = n>>1;
        }

        return count;
    }
}
