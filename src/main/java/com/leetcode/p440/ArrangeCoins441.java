package com.leetcode.p440;

/**
 * Created by sunilpatil on 5/21/17.
 */
public class ArrangeCoins441 {
    public int arrangeCoins(int n) {
        int start = 0;
        while (n > 0) {
            start++;
            n = n - start;
            if( n < start+1)
                return start;
        }
        return start;
    }
}
