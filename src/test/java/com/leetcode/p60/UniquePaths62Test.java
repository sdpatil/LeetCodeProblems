package com.leetcode.p60;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/18/17.
 */
public class UniquePaths62Test {
    UniquePaths62 problem;

    @Before
    public void setup(){
        problem = new UniquePaths62();
    }

    @Test
    public void twoByThreeArrayTest(){
        int result = problem.uniquePaths(2,3);
        System.out.println("Result " + result);
        assert result == 3;
    }

    @Test
    public void sevenByThreeArrayTest(){
        int result = problem.uniquePaths(7,3);
        System.out.println("Result " + result);
        assert result == 28;
    }

    @Test
    public void oneByTwoArrayTest(){
        int result = problem.uniquePaths(1,2);
        System.out.println("Result " + result);
        assert result == 1;
    }

    @Test
    public void twoByTwoArrayTest(){
        int result = problem.uniquePaths(2,2);
        System.out.println("Result " + result);
        assert result == 2;
    }
}
