package com.leetcode.p260;

import java.util.ArrayList;

/**
 * Created by sunilpatil on 5/13/17.
 */
public class SingleNumberIII260 {
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
