package com.leetcode.p230;

/**
 * Created by sunilpatil on 5/9/17.
 */
public class ProductExceptSelf {
    public int[] productExceptSelf2(int[] nums) {
        int[] product = new int[nums.length];
        int p = 1;
        int numZeros = 0;
        for (int i : nums) {
            if (i == 0)
                numZeros++;
            else
                p = p * i;
        }
        if (nums.length == numZeros)
            p = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (numZeros != 0)
                    product[i] = 0;
                else
                    product[i] = p / nums[i];
            } else {
                if (numZeros == 1)
                    product[i] = p;
                else
                    product[i] = 0;
            }
        }
        return product;
    }

    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0, tmp = 1; i < nums.length; i++) {
            result[i] = tmp;
            tmp *= nums[i];
        }
        for (int i = nums.length - 1, tmp = 1; i >= 0; i--) {
            result[i] *= tmp;
            tmp *= nums[i];
        }
        return result;
    }
}
