package com.leetcode.p300;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/20/17.
 */
public class LongestIncreasingSubsequenceTest {
    LongestIncreasingSubsequence300 problem;

    @Before
    public void setup(){
        problem = new LongestIncreasingSubsequence300();
    }

    @Test
    public void simpleTest(){
        int[] nums = new int[]{10, 9, 2, 5, 3, 7, 101, 18};
        int result = problem.lengthOfLIS(nums);
        System.out.println("Result " + result);
        assert result==4;
    }

    public void secondTest(){

        int[] nums = new int[]{10, 22, 9, 33, 21, 50, 41, 60, 80};
        int result = problem.lengthOfLIS(nums);
        System.out.println("Result " + result);
        assert result==4;
    }
}
