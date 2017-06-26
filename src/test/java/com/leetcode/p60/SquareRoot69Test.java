package com.leetcode.p60;

import org.junit.Test;

/**
 * Created by sunilpatil on 6/22/17.
 */
public class SquareRoot69Test {
    SquareRoot69 problem = new SquareRoot69();

    @Test
    public void simpleTest(){
        int result = problem.mySqrt(25);
        System.out.println("Result " + result);
        assert result==5;

        result = problem.mySqrt(24);
        System.out.println("Result " + result);
        assert result==4;
    }

    @Test
    public void badInputTest(){
        int result = problem.mySqrt(0);
        System.out.println("Result " + result);
        assert result == 0;
        result = problem.mySqrt(1);
        System.out.println("Result " + result);
        assert result == 1;

        result = problem.mySqrt(2147395599);
        System.out.println("Result " + result);
        assert result == 46339;

    }

}
