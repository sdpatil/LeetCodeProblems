package com.leetcode.p510;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/21/17.
 */
public class CoinChangeII518Test {
    CoinChangeII518 problem;

    @Before
    public void setup(){
        problem = new CoinChangeII518();
    }

    @Test
    public void simplePositiveTest(){
        int[] coins = {1,2,5};
        int result = problem.change(5,coins);
        System.out.println("Result " + result);
        assert result == 4;
    }

    @Test
    public void simpleNegativeTest(){
        int[] coins = {2};
        int result = problem.change(3,coins);
        System.out.println("Result " + result);
        assert result == 0;
    }

    @Test
    public void exactTest(){
        int[] coins = {10};
        int result = problem.change(10,coins);
        System.out.println("Result " + result);
        assert result == 1;
    }

    @Test
    public void badInput1Test(){
        int[] coins = {};
        int result = problem.change(10,coins);
        System.out.println("Result " + result);
        assert result == 0;
    }

    @Test
    public void badInput2Test(){
        int[] coins = {10};
        int result = problem.change(0,coins);
        System.out.println("Result " + result);
        assert result == 1;
    }

}
