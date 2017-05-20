package com.leetcode.p120;

/**
 * Created by sunilpatil on 5/15/17.
 */
public class BestTimeToBuySellStock121 {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1)
            return 0;

        int maxProfit = Integer.MIN_VALUE;
        int minPriceSoFar = prices[0];

        for(int i = 0; i < prices.length ;i++){
            maxProfit = Math.max(maxProfit, prices[i] - minPriceSoFar);
            minPriceSoFar = Math.min(minPriceSoFar,prices[i]);
        }
        return maxProfit;
    }
}
