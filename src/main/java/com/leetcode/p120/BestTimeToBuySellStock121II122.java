package com.leetcode.p120;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 5/15/17.
 */
public class BestTimeToBuySellStock121II122 {

    public int maxProfit2(int[] prices) {
        if (prices.length <= 1)
            return 0;

        int minPriceSoFar = prices[0];
        int maxProfit = Integer.MIN_VALUE;
        List<Integer> profit = new ArrayList<Integer>();
        profit.add(0);
        for (int i = 1; i < prices.length; i++) {
            minPriceSoFar = Math.min(minPriceSoFar, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPriceSoFar);
            profit.add(maxProfit);
        }
        int maxPriceSoFar = Integer.MIN_VALUE;
        //  maxProfit = Integer.MIN_VALUE;
        for (int i = prices.length - 1; i > 0; i--) {
            maxPriceSoFar = Math.max(maxPriceSoFar, prices[i]);
            maxProfit = Math.max(maxProfit, (maxPriceSoFar - prices[i]) + profit.get(i - 1));
        }
        return maxProfit;
    }

    public int maxProfit(int[] prices) {
        int total = 0;
        for (int i=0; i< prices.length-1; i++) {
            if (prices[i+1]>prices[i]) total += prices[i+1]-prices[i];
        }

        return total;
    }
}
