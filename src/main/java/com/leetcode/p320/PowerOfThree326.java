package com.leetcode.p320;

/**
 * Created by sunilpatil on 5/13/17.
 */
public class PowerOfThree326 {
    public boolean isPowerOfThree(int n) {
        return n > 0&& (1162261467 % n) == 0;
    }
}
