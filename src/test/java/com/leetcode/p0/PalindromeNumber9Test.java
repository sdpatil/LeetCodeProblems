package com.leetcode.p0;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/17/17.
 */
public class PalindromeNumber9Test {
    PalindromeNumber9 problem;

    @Before
    public void setup(){
        problem =new PalindromeNumber9();
    }

    @Test
    public void simplePositiveTest(){
        int n = 1221;
        boolean result = problem.isPalindrome(n);
        System.out.println("Result " + result);
        assert result;

        assert problem.isPalindrome(0);
    }

    @Test
    public void negativeNumberPositiveTest(){
        int n = -1221;
        boolean result = problem.isPalindrome(n);
        System.out.println("Result " + result);
        assert !result;

        assert !problem.isPalindrome(-2147447412);
    }

    @Test
    public void simpleNegativeTest(){
        int n = 1211;
        boolean result = problem.isPalindrome(n);
        System.out.println("Result " + result);
        assert !result;
    }

}
