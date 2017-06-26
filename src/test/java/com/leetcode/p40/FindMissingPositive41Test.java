package com.leetcode.p40;

import org.junit.Test;

/**
 * Created by sunilpatil on 6/21/17.
 */
public class FindMissingPositive41Test {
    FindMissingPositive41 problem = new FindMissingPositive41();

    @Test
    public void simpleTest(){
        int[] nums = {1,2,0,4};
        int result = problem.firstMissingPositive(nums);
        assert result == 3;
    }

    @Test
    public void simple2Test(){
        int[] nums = {3,4,0,2};
        int result = problem.firstMissingPositive(nums);
        assert result == 3;
    }
}
