package com.leetcode.p230;

/**
 * Created by sunilpatil on 5/13/17.
 */
public class PowerOfTwo231 {
    boolean isPowerOfTwo(int n) {
      return n > 0 && ((n & (n-1)) ==0);
    }
    boolean isPowerOfTwo2(int n) {
        return n > 0 && Integer.bitCount(n) ==1;
    }
}