package com.leetcode.p80;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/31/17.
 */
public class MaximalRectangle85Test {
    MaximalRectangle85 problem;

    @Before
    public void setup(){
        problem = new MaximalRectangle85();
    }

    @Test
    public void simpleTest(){
        char[][] matrix = {
                {1, 0, 1, 0, 0},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 0, 0, 1, 0}
        };

        int result = problem.maximalRectangle(matrix);
        System.out.println("Result " + result);
        assert result ==6;
    }
}
