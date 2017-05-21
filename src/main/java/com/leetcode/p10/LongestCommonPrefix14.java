package com.leetcode.p10;

/**
 * Created by sunilpatil on 5/20/17.
 */
public class LongestCommonPrefix14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        if (strs.length == 1)
            return strs[0];

        int smallestLength = Integer.MAX_VALUE;
        for(String s: strs)
            smallestLength = Math.min(smallestLength,s.length());

        int commonPrefix = 0;
        boolean foundDiff = false;
        for (; commonPrefix < smallestLength; commonPrefix++) {
            char c = strs[0].charAt(commonPrefix);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(commonPrefix) != c) {
                    foundDiff = true;
                    break;
                }
            }
            if (foundDiff)
                break;
            ;

        }

        return strs[0].substring(0, commonPrefix);
    }
}
