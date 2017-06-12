package com.leetcode.p120;

import org.junit.Test;

/**
 * Created by sunilpatil on 6/8/17.
 */
public class LongestConsecutiveSequence128Test {
    LongestConsecutiveSequence128 problem = new LongestConsecutiveSequence128();

    @Test
    public void simpleTest(){
        int[] nums = {100, 4, 200, 1, 3, 2};
        int result = problem.longestConsecutive(nums);
        System.out.print("Result " + result);
        assert result ==4;
    }

    @Test
    public void simple2Test(){
        int[] nums = {1, 3, 5, 7, 9};
        int result = problem.longestConsecutive(nums);
        System.out.print("Result " + result);
        assert result ==1;
    }

    @Test
    public void simple3Test(){
        int[] nums = {1,2, 3,4, 5,6, 7,8, 9};
        int result = problem.longestConsecutive(nums);
        System.out.print("Result " + result);
        assert result ==nums.length;
    }
}
