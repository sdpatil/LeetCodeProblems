package com.leetcode.p210;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by sunilpatil on 6/12/17.
 */
public class CourseScheduleII210Test {
    CourseScheduleII210 problem = new CourseScheduleII210();

    @Test
    public void simpleTest(){
        int[][] prereq = {
                {1,0}
        };

        int[] result = problem.findOrder(2,prereq);
        System.out.println("Result " + Arrays.toString(result));

        assert Arrays.equals(result, new int[]{0,1});
    }

    @Test
    public void simple2Test(){
        int[][] prereq = {
                {1,0},
                {2,0},
                {3,1},
                {3,2}
        };

        int[] result = problem.findOrder(4,prereq);
        System.out.println("Result " + Arrays.toString(result));

        assert Arrays.equals(result, new int[]{0,1,2,3});
    }
}
