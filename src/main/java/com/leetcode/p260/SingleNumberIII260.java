package com.leetcode.p260;

import java.util.ArrayList;

/**
 * Created by sunilpatil on 5/13/17.
 */
public class SingleNumberIII260 {
    /*
    Problem: Given an array of numbers nums, in which exactly two elements appear only once
    and all the other elements appear exactly twice. Find the two elements that appear only once.
For example:
Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].
Solution: Once again, we need to use XOR to solve this problem. But this time, we need to do it
in two passes:
In the first pass, we XOR all elements in the array, and get the XOR of the two numbers we need
to find. Note that since the two numbers are distinct, so there must be a set bit (that is,
the bit with value '1') in the XOR result. Find
out an arbitrary set bit (for example, the rightmost set bit).

In the second pass, we divide all numbers into two groups, one with the aforementioned bit set,
another with the aforementinoed bit unset. Two different numbers we need to find must fall into
thte two distrinct groups. XOR numbers in each group, we can find a number in either group.
     */
    public int[] singleNumber(int[] nums) {
        int result = 0;
        for(int n: nums)
            result = result^n;
        System.out.println("Result " + result + " " + Integer.toBinaryString(result));

        int resultLowestBit = Integer.lowestOneBit(result);
        ArrayList<Integer> zeroBit = new ArrayList<Integer>();
        ArrayList<Integer> oneBit = new ArrayList<Integer>();
        for(int n: nums){
            if((n&resultLowestBit) == 0){
                System.out.println("Zero bit " + n);
                zeroBit.add(n);
            }else{
                System.out.println("One bit " + n);
                oneBit.add(n);
            }
        }
        int firstN = 0;
        for(int i : zeroBit)
            firstN = firstN ^i;
        System.out.println("First Number " + firstN);
        int secondN = 0;
        for(int i: oneBit)
            secondN = secondN^i;
        System.out.println("Second Number " + secondN);
        return new int[]{firstN,secondN};
    }
}
