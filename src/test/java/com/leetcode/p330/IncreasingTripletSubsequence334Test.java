package com.leetcode.p330;

import org.junit.Test;

/**
 * Created by sunilpatil on 7/1/17.
 */
public class IncreasingTripletSubsequence334Test {
    IncreasingTripletSubsequence334 problem = new IncreasingTripletSubsequence334();

    @Test
    public void simplePositiveTest(){
        int[] nums = {1,2,3,4,5};
        assert problem.increasingTriplet(nums);
    }

    @Test
    public void simpleNegativeTest(){
        int[] nums = {5,4,3,2,1 };
        assert !problem.increasingTriplet(nums);
    }

    @Test
    public void simple1PositiveTest(){
        int[] nums = {3,2,3,2,5};
        assert problem.increasingTriplet(nums);
    }

    @Test
    public void leetcode22Test(){
        int[] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        assert !problem.increasingTriplet(nums);
    }

}
