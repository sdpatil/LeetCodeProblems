package com.leetcode.p440;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/21/17.
 */
public class ArrangeCoins441Test {
    ArrangeCoins441 problem;

    @Before
    public void setup(){
        problem = new ArrangeCoins441();
    }

    @Test
    public void simpleTest(){
        int result = problem.arrangeCoins(5);
        System.out.println("Result " + result);
        assert result == 2;
    }

    @Test
    public void simple3Test(){
        int result = problem.arrangeCoins(6);
        System.out.println("Result " + result);
        assert result == 3;
    }

    @Test
    public void simple2Test(){
        int result = problem.arrangeCoins(8);
        System.out.println("Result " + result);
        assert result == 3;
    }
}
