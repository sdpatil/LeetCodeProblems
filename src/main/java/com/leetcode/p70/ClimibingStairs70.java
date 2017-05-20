package com.leetcode.p70;

/**
 * Created by sunilpatil on 5/15/17.
 */
public class ClimibingStairs70 {

    public int climbStairs(int n) {
        int[] stairs = new int[n + 1];
        stairs[0] = 1;
        for (int i = 0; i <= n; i++) {
            if (i >= 1)
                stairs[i] = stairs[i] + stairs[i - 1];
            if (i >= 2)
                stairs[i] = stairs[i] + stairs[i - 2];
        }
        return stairs[n];
    }

    public int climbStairsSimple(int n) {
        if(n < 0)
            return 0;
        if(n == 0)
            return 1;
        return climbStairsSimple(n-1) + climbStairsSimple(n-2);
    }
}
