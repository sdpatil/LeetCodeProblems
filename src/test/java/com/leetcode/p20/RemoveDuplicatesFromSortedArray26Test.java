package com.leetcode.p20;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by sunilpatil on 5/25/17.
 */
public class RemoveDuplicatesFromSortedArray26Test {
    RemoveDuplicatesFromSortedArray26 problem;

    @Before
    public void setup(){
        problem = new RemoveDuplicatesFromSortedArray26();
    }

    @Test
    public void simpleTest(){
        int[] nums = {1,1,2};
        int length = problem.removeDuplicates(nums);
        System.out.println("Length " + length);
        assert length ==2;
        assert Arrays.equals(nums,new int[]{1,2,2});
    }

    @Test
    public void simple2Test(){
        int[] nums = {1,2,2};
        int length = problem.removeDuplicates(nums);
        System.out.println("Length " + length);
        assert length ==2;
        assert Arrays.equals(nums,new int[]{1,2,2});
    }

    @Test
    public void simple12Test(){
        int[] nums = {1,1};
        int length = problem.removeDuplicates(nums);
        assert length ==1;
        assert Arrays.equals(nums,new int[]{1,1});
    }
}
