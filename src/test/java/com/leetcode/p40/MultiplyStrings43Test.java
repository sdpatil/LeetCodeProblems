package com.leetcode.p40;

import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 6/27/17.
 */
public class MultiplyStrings43Test {
    MultiplyStrings43 problem = new MultiplyStrings43();

    @Test
    public void simpleTest(){
        String first = "123";
        String second = "123";
        String result= problem.multiply(first , second);
        System.out.println(result);
        assert result.equals("15129");
    }

    @Test
    public void simple2Test(){
        String first = "-123";
        String second = "123";
        String result= problem.multiply(first , second);
        System.out.println(result);
        assert result.equals("-15129");

        assert problem.multiply(second,first).equals("-15129");
        assert problem.multiply(first,first).equals("15129");

    }

    @Test
    public void thirdTest(){
        String first = "123";
        String second = "1";
        String result= problem.multiply(first , second);
        System.out.println(result);
        assert result.equals("123");
    }

    @Test
    public void fourthTest(){
        String first = "0";
        String second = "0";
        String result= problem.multiply(first , second);
        System.out.println(result);
        assert result.equals("0");
    }
}
