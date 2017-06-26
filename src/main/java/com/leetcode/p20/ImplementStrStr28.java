package com.leetcode.p20;

/**
 * Created by sunilpatil on 6/22/17.
 */
public class ImplementStrStr28 {

    /**
     * Problem here is to implement substring search, instead of implementing string hashing based solution a simple
     * solution is to start iteration in bigger string and then for every start position check if the substring
     * matches starting the first character. If yes return substring start position if not return -1
     *
     */
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null)
            return -1;
        char[] hayStackC = haystack.toCharArray();
        char[] needleC = needle.toCharArray();
        for (int i = 0; i < hayStackC.length - needleC.length + 1; i++) {
            int j = 0;
            for (; j < needleC.length; j++) {
                if (hayStackC[i + j] != needleC[j])
                    break;

            }
            if (j == needleC.length)
                return i;
        }
        return -1;
    }
}
