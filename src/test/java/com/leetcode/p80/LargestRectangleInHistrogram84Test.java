package com.leetcode.p80;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/29/17.
 */
public class LargestRectangleInHistrogram84Test {
    LargestRectangleInHistrogram84 problem;

    @Before
    public void setup(){
        problem = new LargestRectangleInHistrogram84();
    }

    @Test
    public void simpleTest(){
        int[] heihts = {2,1,5,6,2,3};

        int result = problem.largestRectangleArea(heihts);
        System.out.println("Result " + result);
        assert result ==10;
    }
}
