package com.leetcode.p60;

import java.util.Arrays;

/**
 * Created by sunilpatil on 5/18/17.
 */
public class MinPathSum64 {
    public int minPathSum(int[][] cost) {

        if (cost.length == 0)
            return 0;
        int row = cost.length;
        int column = cost[0].length;
        int[][] minPathSum = new int[row][column];

        minPathSum[0][0] = cost[0][0];

        for (int i = 1; i < row; i++)
            minPathSum[i][0] = minPathSum[i - 1][0] + cost[i][0];

        for (int i = 1; i < column; i++)
            minPathSum[0][i] = minPathSum[0][i - 1] + cost[0][i];

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < column; j++) {
                minPathSum[i][j] = Math.min(minPathSum[i - 1][j], minPathSum[i][j - 1]) + cost[i][j];
            }
        }

        printDPTable(minPathSum);
        return minPathSum[row - 1][column - 1];
    }

    private static void printDPTable(int[][] editDistanceDP) {
        for (int[] row : editDistanceDP)
            System.out.println(Arrays.toString(row));
    }
}
