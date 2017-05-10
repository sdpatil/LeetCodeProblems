package com.leetcode.p370;

/**
 * Created by sunilpatil on 5/10/17.
 */
public class SumOfTwoIntegers371 {
    public int getSum(int a, int b) {
        if (b == 0)
            return a;
        else
            return getSum(a ^ b, (a & b) << 1);
    }


}
