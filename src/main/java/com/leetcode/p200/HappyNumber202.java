package com.leetcode.p200;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by sunilpatil on 6/11/17.
 */
public class HappyNumber202 {
    /*
    Write an algorithm to determine if a number is "happy".
A happy number is a number defined by the following process:
Starting with any positive integer, replace the number by the
sum of the squares of its digits, and repeat the process until
the number equals 1 (where it will stay), or it loops endlessly
in a cycle which does not include 1. Those numbers for which this
process ends in 1 are happy numbers.
Example: 19 is a happy number
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
     */
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        set.add(n);
        while (n != 1) {
            n = getSum(n);
            if (n == 1)
                return true;
            // Have we seen this number already if yes that means
            //we are looping so break
            if (set.contains(n))
                return false;
            set.add(n);
        }
        return false;
    }

    private int getSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            sum += Math.pow(digit, 2);
        }
        return sum;
    }
}
