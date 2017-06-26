package com.leetcode.p250;

import org.junit.Test;

/**
 * Created by sunilpatil on 6/15/17.
 */
public class ThreeSumSmaller259Test {
    ThreeSumSmaller259 problem = new ThreeSumSmaller259();

    @Test
    public void simpleTest(){
        int[] nums = {-2, 0, 1, 3};
        int count = problem.threeSumSmaller(nums,2);
        System.out.println("Result " + count);
        assert count ==2;
    }
}
