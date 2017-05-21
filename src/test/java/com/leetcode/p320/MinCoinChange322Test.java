package com.leetcode.p320;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/21/17.
 */
public class MinCoinChange322Test {
    MinCoinChange322 problem;

    @Before
    public void setup(){
        problem = new MinCoinChange322();
    }

    @Test
    public void simplePositiveTest(){
        int[] coins = {1,2,5};
        int result = problem.coinChange(coins,11);
        System.out.println("Result " + result);
        assert result == 3;
    }

    @Test
    public void simpleNegativeTest(){
        int[] coins = {2};
        int result = problem.coinChange(coins,3);
        System.out.println("Result " + result);
        assert result == -1;
    }
}
