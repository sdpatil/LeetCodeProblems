package com.leetcode.p10;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/11/17.
 */
public class RomanToInteger13Test {
    RomanToInteger problem;

    @Before
    public void setup(){
        problem = new RomanToInteger();
    }

    @Test
    public void simpleTest(){
        int result = problem.romanToInt("IC");
        System.out.println("Result -> " + result);
        assert result == 99;
    }

    @Test
    public void complexTest(){
        int result = problem.romanToInt("XXXXXIIIIIIIII");
        System.out.println("Result -> " + result);
        assert result == 59;

        result = problem.romanToInt("LVIIII");
        System.out.println("Result -> " + result);
        assert result == 59;

        result = problem.romanToInt("LIX");
        System.out.println("Result -> " + result);
        assert result == 59;
    }

    @Test
    public void longString(){

        int result = problem.romanToInt("MMMDLXXXVI");
        System.out.println("Result -> " + result);
     //   assert result == 59;
    }
}
