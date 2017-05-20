package com.leetcode.p120;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/15/17.
 */
public class BestTimeToBuySellStock121Test {

    BestTimeToBuySellStock121 problem;

    @Before
    public void setup(){
        problem = new BestTimeToBuySellStock121();
    }

    @Test
    public void simpleTest(){
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = problem.maxProfit(prices);
        System.out.println("Max Profit " + maxProfit);
        assert maxProfit == 5;
    }

    @Test
    public void emptyArrayTest(){
        int[] prices = {};
        int maxProfit = problem.maxProfit(prices);
        System.out.println("Max Profit " + maxProfit);
        assert maxProfit == 0;

    }

    @Test
    public void singleElementArrayTest(){
        int[] prices = {1};
        int maxProfit = problem.maxProfit(prices);
        System.out.println("Max Profit " + maxProfit);
        assert maxProfit == 0;

    }

}
