package com.leetcode.p0;

/**
 * Created by sunilpatil on 5/13/17.
 */
public class StringToInteger8 {
    public int myAtoi(String str) {
        char[] c = str.toCharArray();
        int result = 0;
        boolean isNegative = false;
        boolean isSign = false;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '-') {
                isNegative = true;
                if (isSign) {
                    return 0;
                }
                isSign = true;
            } else if (c[i] == '+') {
                if (isSign) {
                    return 0;
                }
                isSign = true;
            } else if (Character.isDigit(c[i]))
                result = result * 10 + Character.getNumericValue(c[i]);
            else if (Character.isSpaceChar(c[i]))
                result = result;
            else
                break;
        }
        if (isNegative)
            result = result * -1;
        return result;
    }
}
