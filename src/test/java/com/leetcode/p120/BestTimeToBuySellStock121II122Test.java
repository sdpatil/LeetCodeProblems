package com.leetcode.p120;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/15/17.
 */
public class BestTimeToBuySellStock121II122Test {
    BestTimeToBuySellStock121II122 problem;

    @Before
    public void setup(){
        problem = new BestTimeToBuySellStock121II122();
    }

    @Test
    public void simpleTest(){
        int[] prices = {12,11,13,9,12,8,14,13,15};
        int maxProfit = problem.maxProfit(prices);
        System.out.println("Maximum Profit  " + maxProfit);
        assert maxProfit == 10;
    }

    @Test
    public void arraySizeTwoTest(){
        int[] prices = {1,2};
        int maxProfit = problem.maxProfit(prices);
        System.out.println("Maximum Profit  " + maxProfit);
        assert maxProfit == 1;
    }

    @Test
    public void complexTest(){
        int[] prices = {2,1,2,0,1};
        int maxProfit = problem.maxProfit(prices);
        System.out.println("Maximum Profit  " + maxProfit);
        assert maxProfit == 2;
    }

    @Test
    public void complex2Test(){
        int[] prices = {3,3,5,0,0,3,1,4};
        int maxProfit = problem.maxProfit(prices);
        System.out.println("Maximum Profit  " + maxProfit);
        assert maxProfit == 8;
    }


}
