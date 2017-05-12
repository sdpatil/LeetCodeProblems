package com.leetcode.p160;

/**
 * Created by sunilpatil on 5/11/17.
 */
public class ExcelSheetColumnTitle168 {
    public String convertToTitle(int n) {
        if(n == 0)
            return "";
        return convertToTitle(--n / 26) + (char)('A' + (n % 26));
    }

    public  char getChar(int num){
        if(num == 0)
            return 'Z';

        return (char)('A' + (char)(num-1));
    }
}
