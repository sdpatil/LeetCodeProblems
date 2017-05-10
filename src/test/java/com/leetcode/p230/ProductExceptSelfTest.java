package com.leetcode.p230;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by sunilpatil on 5/9/17.
 */
public class ProductExceptSelfTest {
    ProductExceptSelf problem;

    @Before
    public void setup(){
        problem = new ProductExceptSelf();
    }

    @Test
    public void simpleTest(){
        int[] nums = new int[]{1,2,3,4};
        System.out.println(Arrays.toString(nums));
        int[] products = problem.productExceptSelf(nums);
        System.out.println(Arrays.toString(products));
    }

    @Test
    public void zeroAndOneTest(){
        int[] nums = new int[]{1,0};
        System.out.println(Arrays.toString(nums));
        int[] products = problem.productExceptSelf(nums);
        System.out.println(Arrays.toString(products));
        assert products[0] == 0;
        assert products[1] == 1;
    }

    @Test
    public void twoZerosTest(){
        int[] nums = new int[]{0,0};
        System.out.println(Arrays.toString(nums));
        int[] products = problem.productExceptSelf(nums);
        System.out.println(Arrays.toString(products));
        assert products[0] == 0;
        assert products[1] == 0;
    }
}
