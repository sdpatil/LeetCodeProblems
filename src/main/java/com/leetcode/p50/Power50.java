package com.leetcode.p50;

/**
 * Created by sunilpatil on 6/29/17.
 */
public class Power50 {
    /*
        problem : Calcualte x to the power n
     */
    public double pow(double x, int n) {
        if(n == 0)
            return 1;
        else if ( n < 0){
            n = -1 *n;
            x = 1/x;
        }else  if ( n%2 == 0){
            //This means n is even number
            return pow(x*x, n/2);
        }
       //This means n is odd number
        return x * pow(x*x , n/2);
    }

    public static void main(String[] argv){
        Power50 power50 = new Power50();
        System.out.println(power50.pow(2,4));
        System.out.println(power50.pow(22.14659,-2));

    }
}