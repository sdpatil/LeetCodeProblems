package com.leetcode.p150;

/**
 * Created by sunilpatil on 3/31/17.
 */
public class MaximumProductSubarray152 {
    /*
    public int maxProduct1(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            product = product * nums[i];
            maxProduct = Math.max(product, maxProduct);

            if (product == 0)
                product = 1;
        }

        return maxProduct;
    }*/

    public int maxProduct(int[] A){
        if (A == null || A.length == 0) {
            return 0;
        }
        int max = A[0], min = A[0], result = A[0];
        for (int i = 1; i < A.length; i++) {
            int temp = max;
            max = Math.max(Math.max(max * A[i], min * A[i]), A[i]);
            min = Math.min(Math.min(temp * A[i], min * A[i]), A[i]);
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

}
