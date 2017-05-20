package com.leetcode.p470;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/13/17.
 */
public class TotalHammingDistance477Test {
    TotalHammingDistance477 problem;

    @Before
    public void setup(){
        problem= new TotalHammingDistance477();
    }

    @Test
    public void simpleTest(){
        int[] nums = new int[]{4,14,2};
        int result = problem.totalHammingDistance(nums);
        System.out.println("Result " + result);
        assert result == 6;

    }
}
