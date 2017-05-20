package com.leetcode.p340;

/**
 * Created by sunilpatil on 5/13/17.
 */
public class PowerOfFour342 {
    public boolean isPowerOfFour(int num) {
        return num >0 && Integer.bitCount(num) == 1 && (num&0x55555555) !=0 ;
    }

    public static void main(String[] argv){
        System.out.println(" " + 0x55555555 +" " + Integer.toBinaryString(0x55555555));
        for(int i = 0 ; i < 10 ; i++) {
            int n = (int)Math.pow(4, i);
            System.out.println( n+ " " + Integer.bitCount(n)+ " " + Integer.lowestOneBit(n) +" " + Integer.toBinaryString(n));
        }
    }
}
