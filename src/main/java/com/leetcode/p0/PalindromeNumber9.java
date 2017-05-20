package com.leetcode.p0;

/**
 * Created by sunilpatil on 5/17/17.
 */
public class PalindromeNumber9 {
    public boolean isPalindrome(int x) {
        if (x == 0)
            return true;
        if (x < 0)
            return false;
        int originalNumber = x;
        long reversedNumber = 0;
        while (x > 0) {
            int s = x % 10;
            reversedNumber = reversedNumber * 10 + s;
            x = x / 10;
        }
        if (originalNumber == reversedNumber)
            return true;
        return false;
    }
}
