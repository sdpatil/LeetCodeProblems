package com.leetcode.p60;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/18/17.
 */
public class MinPathSum64Test {
    MinPathSum64 problem;

    @Before
    public void setup() {
        problem = new MinPathSum64();
    }

    @Test
    public void simpleTest() {
        int[][] path = {
                {1, 3, 5, 8},
                {4, 2, 1, 7},
                {4, 3, 2, 3}
        };

        int result = problem.minPathSum(path);
        System.out.println("Result " + result);
        assert result == 12;
    }
}
