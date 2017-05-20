package com.leetcode.p60;

import java.util.Arrays;

/**
 * Created by sunilpatil on 3/31/17.
 */
public class UniquePaths62 {
    public int uniquePaths(int m, int n) {

        int[][] paths = new int[m][n];
        for (int i = 0; i < m; i++)
            paths[i][0] = 1;

        for (int i = 0; i < n; i++)
            paths[0][i] = 1;

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                paths[i][j] = paths[i - 1][j] + paths[i][j - 1];
            }
        }

        printDPTable(paths);
        return paths[m - 1][n - 1];
    }

    private static void printDPTable(int[][] editDistanceDP) {
        for (int[] row : editDistanceDP)
            System.out.println(Arrays.toString(row));
    }
}
