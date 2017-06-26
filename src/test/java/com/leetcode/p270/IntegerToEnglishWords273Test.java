package com.leetcode.p270;

import org.junit.Test;

/**
 * Created by sunilpatil on 6/24/17.
 */
public class IntegerToEnglishWords273Test {
    IntegerToEnglishWords273 problem = new IntegerToEnglishWords273();

    @Test
    public void simpleTest(){
        String result = problem.numberToWords (1977);
        System.out.println("Result " + result);
        assert result.equals("One Thousand Nine Hundred Seventy Seven");
    }

    @Test
    public void simple2Test(){
        String result = problem.numberToWords (12345);
        System.out.println("Result " + result);
        assert result.equals("Twelve Thousand Three Hundred Forty Five");
    }

    @Test
    public void simple3Test(){
        String result = problem.numberToWords (20);
        System.out.println("Result " + result);
        assert result.equals("Twenty");
    }

    @Test
    public void simple4Test(){
        String result = problem.numberToWords (101);
        System.out.println("Result " + result);
        assert result.equals("One Hundred One");
    }
}
