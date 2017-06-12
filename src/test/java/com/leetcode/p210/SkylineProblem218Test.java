package com.leetcode.p210;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 6/8/17.
 */
public class SkylineProblem218Test {
    SkylineProblem218 problem;

    @Before
    public void setup(){
        problem = new SkylineProblem218();
    }

    @Test
    public void simpleTest(){
        int[][] buildings = {
                {1,3,4},
                {3,4,4},
                {7,6,2},
                {8,11,4},
                {7,9,3},
                {10,11,7}
        };
        List<int[]> skylines = problem.getSkyline(buildings);
        for(int[] skyline: skylines)
            System.out.println(Arrays.toString(skyline));
    }

    @Test
    public void simple2Test(){
        int[][] buildings = {
                {2,9,10},
                {3,7,15},
                {5,12,12},
                {15,20,10},
                {19,24,8}
        };
        List<int[]> skylines = problem.getSkyline(buildings);
        for(int[] skyline: skylines)
            System.out.println(Arrays.toString(skyline));
    }
}
