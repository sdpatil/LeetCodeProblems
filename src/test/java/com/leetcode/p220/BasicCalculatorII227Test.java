package com.leetcode.p220;

import org.junit.Test;

/**
 * Created by sunilpatil on 6/27/17.
 */
public class BasicCalculatorII227Test {
    BasicCalculatorII227 problem = new BasicCalculatorII227();

    @Test
    public void simpleTest(){
        String input = "3+2*2";
        int result = problem.calculate(input);
        System.out.println(result);
        assert result ==7;

    }

    @Test
    public void simple2Test(){
        String input = "3/2";
        int result = problem.calculate(input);
        System.out.println(result);
        assert result ==1;

    }
    @Test
    public void simple3Test(){
        String input = " 3+5 / 2 ";
        int result = problem.calculate(input);
        System.out.println(result);
        assert result ==5;

    }
}
