package com.leetcode.p30;

/**
 * Created by sunilpatil on 5/22/17.
 */
public class CountAndSay38 {
    public String countAndSay(int n) {
        String nextNumber = "1";

        for (int i = 1; i < n; i++)
            nextNumber = nextNumber(nextNumber);
        return nextNumber;

    }

    public String nextNumber(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); ++i) {
            int count = 1;
            while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                ++i;
                ++count;
            }
            sb.append(count);
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
