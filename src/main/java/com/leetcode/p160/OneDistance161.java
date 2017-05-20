package com.leetcode.p160;

/**
 * Created by sunilpatil on 5/16/17.
 */
public class OneDistance161 {

    public boolean isOneEditDistance(String s, String t) {
        if (Math.abs(s.length() - t.length()) > 1)
            return false;

        int minLength = Math.min(s.length(), t.length());

        for (int i = 0; i < minLength; i++) {

            //Found first difference, check if replacing, removing or inserting one character makes rest of string equal if yes return false
            if (s.charAt(i) != t.charAt(i)) {
                if (s.substring(i + 1).equals(t.substring(i)) || s.substring(i).equals(t.substring(i + 1)) || s.substring(i + 1).equals(t.substring(i + 1)))
                    return true;
                else
                    return false;
            }
        }
        if (Math.abs(s.length() - t.length()) == 1)
            return true;

        return false;
    }

    public boolean isOneEditDistanceOld(String s, String t) {
        int distance = minDistance(s, t);
        return distance == 1;
    }

    public int minDistance(String word1, String word2) {
        int[][] distanceDP = new int[word1.length() + 1][word2.length() + 1];
        for (int i = 0; i <= word1.length(); i++)
            distanceDP[i][0] = i;
        for (int i = 0; i <= word2.length(); i++)
            distanceDP[0][i] = i;

        for (int i = 1; i <= word1.length(); i++) {
            for (int j = 1; j <= word2.length(); j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1))
                    distanceDP[i][j] = distanceDP[i - 1][j - 1];
                else {
                    distanceDP[i][j] = getMininmum(distanceDP[i - 1][j], distanceDP[i][j - 1], distanceDP[i - 1][j - 1]) + 1;
                }

            }
        }

        return distanceDP[word1.length()][word2.length()];
    }


    private static int getMininmum(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
}
