package com.leetcode.p320;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/23/17.
 */
public class MaxSizeSubarray325Test {
    MaxSizeSubarray325 problem;

    @Before
    public void setup(){
        problem = new MaxSizeSubarray325();
    }

    @Test
    public void simpleTest(){
        int[] nums = {1,-1,5,-2,3};
        int result = problem.maxSubArrayLen(nums,3);
        System.out.println("Result " + result);
        assert result==4;
    }

    @Test
    public void simple2Test(){
        int[] nums = {-2,-1,2,1};
        int result = problem.maxSubArrayLen(nums,1);
        System.out.println("Result " + result);
        assert result ==2;
    }
}
