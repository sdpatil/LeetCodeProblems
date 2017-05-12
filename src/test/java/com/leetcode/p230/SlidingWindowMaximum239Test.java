package com.leetcode.p230;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by sunilpatil on 5/12/17.
 */
public class SlidingWindowMaximum239Test {
    SlidingWindowMaximum239 problem;

    @Before
    public void setup(){
        problem = new SlidingWindowMaximum239();
    }

    @Test
    public void simpleTest(){
        int[] nums = new int[]{1,3,-1,-3,5,3,6,7};
        int[] result= problem.maxSlidingWindow(nums,3);
        System.out.println(Arrays.toString(result));

        assert Arrays.equals(result, new int[]{3,3,5,5,6,7});
    }

    @Test
    public void emptyArrayTest(){
        int[] nums = new int[]{};
        int[] result= problem.maxSlidingWindow(nums,3);
        System.out.println("Result " + result);
        assert result.length == 0;
    }

}
