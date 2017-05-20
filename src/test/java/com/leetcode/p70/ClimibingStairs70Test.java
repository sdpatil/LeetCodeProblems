package com.leetcode.p70;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/15/17.
 */
public class ClimibingStairs70Test {
    ClimibingStairs70 problem;

    @Before
    public void setup(){
        problem = new ClimibingStairs70();
    }

    @Test
    public void simpleTest(){
        int result = problem.climbStairs(5);
        System.out.println("Result " + result);
        assert result == 8;
    }
}
