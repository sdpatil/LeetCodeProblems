package com.leetcode.p40;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/31/17.
 */
public class TrappingRainWaters42Test {
   TrappingRainWater42 problem;

   @Before
   public void setup(){
       problem = new TrappingRainWater42();
   }

   @Test
   public void simpleTest(){
        int[] heights = {0,1,0,2,1,0,1,3,2,1,2,1};
        int result = problem.trap(heights);
        System.out.println("Result " + result);
        assert result ==6;
   }
}
