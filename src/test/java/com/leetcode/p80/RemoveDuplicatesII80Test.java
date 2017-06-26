package com.leetcode.p80;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by sunilpatil on 6/26/17.
 */
public class RemoveDuplicatesII80Test {
    RemoveDuplicatesII80 problem = new RemoveDuplicatesII80();

    @Test
    public void  simpleTest(){
        int[] nums = {1,1,1,2,2,3};
        int result = problem.removeDuplicates(nums);
        System.out.println("Result " + result);
        System.out.println(Arrays.toString(nums));
        assert result == 5;
    }

    @Test
    public void  simpleAllSameTest(){
        int[] nums = {1,1,1,1,1,1};
        int result = problem.removeDuplicates(nums);
        System.out.println("Result " + result);
        System.out.println(Arrays.toString(nums));
        assert result == 2;
    }

    @Test
    public void  simpleAllDifferenceTest(){
        int[] nums = {1,2,3,4,5,6};
        int result = problem.removeDuplicates(nums);
        System.out.println("Result " + result);
        System.out.println(Arrays.toString(nums));
        assert result == 6;
    }

    @Test
    public void  simple38Test(){
        int[] nums = {1,2,2};
        int result = problem.removeDuplicates(nums);
        System.out.println("Result " + result);
        System.out.println(Arrays.toString(nums));
        assert result == 3;
    }
}
