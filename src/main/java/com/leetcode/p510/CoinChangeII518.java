package com.leetcode.p510;

import java.util.Arrays;

/**
 * Created by sunilpatil on 5/21/17.
 */
public class CoinChangeII518 {
    public int change(int amount, int[] coins) {
        if (amount <= 0 )
            return 1;
        if(coins.length == 0)
            return 0;
        int m = coins.length;
        int[][] dpTable = new int[m][amount + 1];

        for (int i = 0; i < m; i++) {
            dpTable[i][0] = 1;
            for (int j = 1; j <= amount; j++) {
                int withOutThisCoin = 0;
                if (i - 1 >= 0)
                    withOutThisCoin = dpTable[i - 1][j];

                int withThisCoin = 0;
                if (j >= coins[i]) {
                    withThisCoin = dpTable[i][j - coins[i]];
                }
                dpTable[i][j] = withOutThisCoin + withThisCoin;
            }
        }
        printDPTable(dpTable);
        return dpTable[m - 1][amount];
    }

    /**
     * public int numOfCombinationsForFinalScore(int finalScore, int[] indivdiualPlayScore) {
     * int[][] numCombinationsForScore = new int[indivdiualPlayScore.length][finalScore + 1];
     * for (int i = 0; i < indivdiualPlayScore.length; i++) {
     * numCombinationsForScore[i][0] = 1;
     * for (int j = 1; j <= finalScore; ++j) {
     * int withoutThisPlay = 0;
     * if (i-1 >= 0) {
     * withoutThisPlay = numCombinationsForScore[i - 1][j];
     * }
     * int withThisPlay = 0;
     * if (j >= indivdiualPlayScore[i])
     * withThisPlay = numCombinationsForScore[i][j - indivdiualPlayScore[i]];
     * numCombinationsForScore[i][j] = withThisPlay + withoutThisPlay;
     * }
     * }
     * return numCombinationsForScore[indivdiualPlayScore.length - 1][finalScore];
     * }
     *
     * @param dpTable
     */

    private void printDPTable(int[][] dpTable) {
        for (int[] dpRow : dpTable)
            System.out.println(Arrays.toString(dpRow));
    }

}