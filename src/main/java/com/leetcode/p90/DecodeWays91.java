package com.leetcode.p90;

import java.util.Arrays;

/**
 * Created by sunilpatil on 6/25/17.
 */
public class DecodeWays91 {

    /**
     * Problem: Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12). Number of ways to decode
     * 12 is 2
     * <p>
     * Solution: This is a DP solution in which loop through the string looking at 1 and 2 character strings at a time
     * if the single character is not 0 then number of ways to decode it is number of ways to decode
     */
    public int numDecodings(String s) {
        if(s == null || s.length() == 0)
            return 0;
        int n = s.length();
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = Character.getNumericValue(s.charAt(0)) ==0  ?0:1;

        for(int i =2; i <=n ; i++) {
            int first = Integer.valueOf(s.substring(i - 1, i));
            int second = Integer.valueOf(s.substring(i-2,i));

            if(first!=0) // If this is not zero then number of ways to decode i-1
                dp[i] = dp[i-1];

            if(second>= 10 && second<= 26)
                dp[i] = dp[i]+ dp[i-2];
        }
        return dp[n];
    }
}
