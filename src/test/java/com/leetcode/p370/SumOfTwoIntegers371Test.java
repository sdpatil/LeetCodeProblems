package com.leetcode.p370;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/10/17.
 */
public class SumOfTwoIntegers371Test {
    SumOfTwoIntegers371 problem;

    @Before
    public void setup(){
        problem = new SumOfTwoIntegers371();
    }

    @Test
    public void simpleTest(){
        int result = problem.getSum(1,2);
        System.out.println("Result " + result);
        assert result==3;
    }

    @Test
    public void secondTest(){
        int result = problem.getSum(2,2);
        System.out.println("Result " + result);
        assert result==4;
    }
}
