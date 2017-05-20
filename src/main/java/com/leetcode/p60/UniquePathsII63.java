package com.leetcode.p60;

import java.util.Arrays;

/**
 * Created by sunilpatil on 5/18/17.
 */
public class UniquePathsII63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid.length == 0)
            return 0;
        if(obstacleGrid[0].length != 0 && obstacleGrid[0][0] ==1 )
            return 0;
        int row = obstacleGrid.length;
        int column = obstacleGrid[0].length;
        int[][] obstacelGridDP = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (obstacleGrid[i][j] != 1)
                    obstacelGridDP[i][j] = obstacleGrid[i][j];
                else
                    obstacelGridDP[i][j] = -1;
            }
        }

        obstacelGridDP[0][0] = 1;
        for (int i = 1; i < row; i++) {
            if (obstacelGridDP[i][0] == -1)
                obstacleGrid[i][0] = 0;
            else
                obstacelGridDP[i][0] = obstacelGridDP[i - 1][0];
        }

        for (int i = 1; i < column; i++) {
            if (obstacelGridDP[0][i] == -1)
                obstacleGrid[0][i] = 0;
            else
                obstacelGridDP[0][i] = obstacelGridDP[0][i - 1];
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < column; j++) {
                if (obstacelGridDP[i][j] == -1)
                    obstacleGrid[i][j] = 0;
                else {
                    if (obstacelGridDP[i - 1][j] == -1) {
                        obstacelGridDP[i][j] = obstacelGridDP[i][j - 1];
                    } else if (obstacelGridDP[i][j - 1] == -1) {
                        obstacelGridDP[i][j] = obstacelGridDP[i - 1][j];
                    } else
                        obstacelGridDP[i][j] = obstacelGridDP[i - 1][j] + obstacelGridDP[i][j - 1];
                }
            }
        }

        printDPTable(obstacelGridDP);

        return obstacelGridDP[row - 1][column - 1];
    }

    private static void printDPTable(int[][] editDistanceDP) {
        for (int[] row : editDistanceDP)
            System.out.println(Arrays.toString(row));
    }
}
