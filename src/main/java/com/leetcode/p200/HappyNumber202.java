package com.leetcode.p200;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by sunilpatil on 6/11/17.
 */
public class HappyNumber202 {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        set.add(n);
        while (n != 1){
            n = getSum(n);
            if(n == 1)
                return true;

            if(set.contains(n))
                return false;
            set.add(n);
        }
        return false;
    }

    private int getSum(int n){
        int sum = 0;
        while (n > 0){
            int digit = n %10;
            n = n /10;
            sum += Math.pow(digit,2);
        }
        return sum;
    }
}
