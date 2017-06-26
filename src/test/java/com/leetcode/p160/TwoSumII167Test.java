package com.leetcode.p160;

import org.junit.Test;

/**
 * Created by sunilpatil on 6/15/17.
 */
public class TwoSumII167Test {
    TwoSumII167 problem = new TwoSumII167();

    @Test
    public void simpleTest(){
        int[] nums ={2, 7, 11, 15};

        int[] index = problem.twoSum(nums,9);
        assert index != null;
        assert index[0] ==1;
        assert index[1] ==2;
    }

    @Test
    public void simple11Test(){
        int[] nums ={0,0,3,4};

        int[] index = problem.twoSum(nums,0);
        assert index != null;
        assert index[0] ==1;
        assert index[1] ==2;
    }

    @Test
    public void simple2Test(){
        int[] nums ={2,3,4};

        int[] index = problem.twoSum(nums,6);
        assert index != null;
        assert index[0] ==1;
        assert index[1] ==3;
    }
}
