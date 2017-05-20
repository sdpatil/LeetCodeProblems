package com.leetcode.p70;

import java.util.Arrays;

/**
 * Created by sunilpatil on 5/16/17.
 */
public class EditDistance72 {
    public int minDistance(String word1, String word2) {
        int[][] distanceDP = new int[word1.length()+1][word2.length()+1];
        for(int i = 0; i <= word1.length(); i++)
            distanceDP[i][0] = i;
        for(int i = 0; i <= word2.length(); i++)
            distanceDP[0][i] = i;

        for(int i = 1; i <= word1.length() ; i++){
            for(int j = 1 ; j <= word2.length() ; j++){
                if(word1.charAt(i-1) == word2.charAt(j-1))
                    distanceDP[i][j] = distanceDP[i-1][j-1];
                else{
                    distanceDP[i][j] = getMininmum(distanceDP[i-1][j], distanceDP[i][j-1],distanceDP[i-1][j-1])+1;
                }

            }
        }

        return distanceDP[word1.length()][word2.length()];
    }


    private static int getMininmum(int a, int b, int c){
        return Math.min(a, Math.min(b,c));
    }
}
