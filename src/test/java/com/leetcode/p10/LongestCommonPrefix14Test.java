package com.leetcode.p10;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/20/17.
 */
public class LongestCommonPrefix14Test {
    LongestCommonPrefix14 problem;

    @Before
    public void setup(){
        problem = new LongestCommonPrefix14();
    }

    @Test
    public void simpleTest(){
        String result =problem.longestCommonPrefix(new String[]{"first","fifth"});
        System.out.println("Result " + result);
        assert result.equals("fi");
    }

    @Test
    public void inputValidationTest(){
        String result =problem.longestCommonPrefix(new String[]{});
        System.out.println("Result " + result);
        assert result == "";

        assert problem.longestCommonPrefix(new String[]{"One"}).equals("One");
    }

    @Test
    public void identicalStringTest(){
        String result =problem.longestCommonPrefix(new String[]{"first","first"});
        System.out.println("Result " + result);
        assert result.equals("first");
    }

    @Test
    public void fourStringTest(){
        String result =problem.longestCommonPrefix(new String[]{"first","fifth","fifty","fire"});
        System.out.println("Result " + result);
        assert result.equals("fi");
    }


    @Test
    public void unEqualLengthStringsTest(){
        String result =problem.longestCommonPrefix(new String[]{"aa","a"});
        System.out.println("Result " + result);
        assert result.equals("a");
    }
}
