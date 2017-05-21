package com.leetcode.p320;

/**
 * Created by sunilpatil on 5/21/17.
 */
public class MinCoinChange322 {
    public int coinChange(int[] coins, int amount) {
        if (coins.length == 0 || amount <= 0)
            return 0;

        int[] dpTable = new int[amount + 1];
        dpTable[0] = 0;

        for (int i = 1; i <= amount; i++) {
            dpTable[i] = Integer.MAX_VALUE;
        }

        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    int temp = dpTable[i - coins[j]];

                    if (temp != Integer.MAX_VALUE && temp + 1 < dpTable[i])
                        dpTable[i] = temp + 1;
                }
            }
        }
        if (dpTable[amount] == Integer.MAX_VALUE)
            return -1;
        return dpTable[amount];
    }
}
