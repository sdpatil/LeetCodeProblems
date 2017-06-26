package com.leetcode.p10;

/**
 * Created by sunilpatil on 5/22/17.
 */
public class IntegerToRoman {
    /**
     * This method is used for converting decimal to Roman String.
     * Basic idea is keep symbols for 1-9 10-90 , 100-900 in array when you get new decimal divide it by
     * multiple 10,100,... and pickup corresponding element from array
     */
    public String intToRoman(int num) {
        String M[] = {"", "M", "MM", "MMM"};
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[(num%10)];
    }
}
