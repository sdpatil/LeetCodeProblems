package com.leetcode.p10;

import org.junit.Test;

/**
 * Created by sunilpatil on 6/11/17.
 */
public class ContainerWithMostWaterTest {
    ContainerWithMostWater problem = new ContainerWithMostWater();

    @Test
    public void simpleTest(){
        int[] heights = {1,2,1,3,4,4,5,6,2,1,31,3,2,1,2,3,4,1};
        int result = problem.maxArea(heights);
        System.out.println("Result " + result);
        assert result ==48;
    }
}
