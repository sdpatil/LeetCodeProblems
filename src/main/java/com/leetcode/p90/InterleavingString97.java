package com.leetcode.p90;

/**
 * Created by sunilpatil on 5/18/17.
 */
public class InterleavingString97 {
    public boolean isInterleave(String s1, String s2, String s3) {
        int m = s1.length();
        int n = s2.length();

        if (m + n != s3.length())
            return false;

        boolean[][] dptable = new boolean[m + 1][n + 1];
        dptable[0][0] = true;

        for (int i = 1; i <= m; i++) {
            if (s1.charAt(i - 1) != s3.charAt(i - 1))
                dptable[i][0] = false;
            else
                dptable[i][0] = dptable[i - 1][0];
        }

        for (int i = 1; i <= n; i++) {
            if (s2.charAt(i - 1) != s3.charAt(i - 1))
                dptable[0][i] = false;
            else
                dptable[0][i] = dptable[0][i - 1];
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                int a = s1.charAt(i - 1);
                int b = s2.charAt(j - 1);
                int c = s3.charAt(i + j - 1);

                if (a == c && b != c) {
                    dptable[i][j] = dptable[i - 1][j];
                } else if (b == c && a != c) {
                    dptable[i][j] = dptable[i][j - 1];
                } else if (a == b && b == c) {
                    dptable[i][j] = (dptable[i - 1][j] || dptable[i][j - 1]);
                } else
                    dptable[i][j] = false;

            }
        }
        return dptable[m][n];
    }
}
