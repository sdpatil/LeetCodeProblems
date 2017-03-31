package com.leetcode.p150;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 3/31/17.
 */
public class MaximumProductSubarray152Test {
   MaximumProductSubarray152 maximumProductSubarray152;

   @Before
   public void setup(){
       maximumProductSubarray152 = new MaximumProductSubarray152();
   }

   @Test
   public void simpleTest(){
        int[] nums = new int[]{2,3,-2,4};
        int maxProduct = maximumProductSubarray152.maxProduct(nums);
        System.out.println("Max Product " + maxProduct);
        assert maxProduct == 6;
   }

    @Test
    public void twoNegativesTest(){
        int[] nums = new int[]{-4,-3};
        int maxProduct = maximumProductSubarray152.maxProduct(nums);
        System.out.println("Max Product " + maxProduct);
        assert maxProduct == 12;
    }

    @Test
    public void twoPositiveWithZeroTest(){
        int[] nums = new int[]{0,2};
        int maxProduct = maximumProductSubarray152.maxProduct(nums);
        System.out.println("Max Product " + maxProduct);
        assert maxProduct == 2;
    }

    @Test
    public void twoPositiveAndNegativeTest(){
        int[] nums = new int[]{3,-1,4};
        int maxProduct = maximumProductSubarray152.maxProduct(nums);
        System.out.println("Max Product " + maxProduct);
        assert maxProduct == 4;
    }
}
