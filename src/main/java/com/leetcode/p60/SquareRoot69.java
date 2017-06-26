package com.leetcode.p60;

/**
 * Created by sunilpatil on 6/22/17.
 */
public class SquareRoot69 {
    public int mySqrt(int k) {
        if (k <= 1)
            return k;

        int start = 0;
        int end = k;
        int answer = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //Since we need to deal with approximation (Not exact match we dont have == condition in search
            if (mid <= k / mid) {
                start = mid + 1;
                answer = mid;
            } else
                end = mid - 1;
        }
        return answer;
    }
}
