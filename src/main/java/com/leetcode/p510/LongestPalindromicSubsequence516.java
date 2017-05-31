package com.leetcode.p510;

import java.util.Arrays;

/**
 * Created by sunilpatil on 5/23/17.
 */
public class LongestPalindromicSubsequence516 {
    public int longestPalindromeSubseq(String str) {
        int n = str.length();
        int[][] dpTable = new int[n][n];
        for(int i = 0; i < n ;i++){
            dpTable[i][i] =1;
        }

        for(int k = 2; k <= n ; k++){
            for(int i = 0; i < str.length() -k +1 ;i++){
                int j =  i + k -1;
                if(str.charAt(i) == str.charAt(j) && k == 2) {
                    dpTable[i][j] = 2;
                }else if(str.charAt(i) == str.charAt(j)){
                    dpTable[i][j] = dpTable[i+1][j-1] +2;
                }else {
                    dpTable[i][j] = Math.max(dpTable[i][j-1], dpTable[i+1][j]);
                }
            }
        }
        printTable(dpTable);
        return dpTable[0][n-1];
    }

    public  int longestPalindromicSubsequenceDP(String str) {
        if(str == null || str.length() ==0)
            return 0;

        int n = str.length();
        int[][] dpTable = new int[n][n];

        for(int i = 0; i < n ; i++){
            dpTable[i][i] =1;
        }
        int longestSubSequence =Integer.MIN_VALUE;
        String longestSubsequence = null;
        for(int k = 2; k <= n ; k++){
            for(int i = 0; i < str.length() -k +1 ;i++){
                int j =  i + k -1;
                if(str.charAt(i) == str.charAt(j) && k == 2) {
                    dpTable[i][j] = 2;
                }else if(str.charAt(i) == str.charAt(j)){
                    dpTable[i][j] = dpTable[i+1][j-1] +2;
                }else {
                    dpTable[i][j] = Math.max(dpTable[i][j-1], dpTable[i+1][j]);
                }
            }
        }
        printTable(dpTable);
        return dpTable[0][n-1];
    }

    public static void printTable(int[][] dpTable){
        for(int[] dpRow: dpTable)
        System.out.println(Arrays.toString(dpRow));
    }
}
