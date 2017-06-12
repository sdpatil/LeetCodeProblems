package com.leetcode.p200;

import org.junit.Test;

/**
 * Created by sunilpatil on 6/11/17.
 */
public class CourseSchedule207Test {
    CourseSchedule207 problem = new CourseSchedule207();

    @Test
    public void simpleTest(){
        int[][] prereq = {
                {1,0}
        };
        assert problem.canFinish(2,prereq);
    }

    @Test
    public void simple2Test(){
        int[][] prereq = {
                {1,0},
                {0,1}
        };
        assert !problem.canFinish(2,prereq);
    }

    @Test
    public void simple3Test(){
        int[][] prereq = {

        };
        assert problem.canFinish(1,prereq);
    }
}
