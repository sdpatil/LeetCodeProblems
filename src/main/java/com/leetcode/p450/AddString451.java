package com.leetcode.p450;

/**
 * Created by sunilpatil on 5/31/17.
 */
public class AddString451 {
    public String addStrings(String num1, String num2) {
        if (num1 == null)
            return num2;
        if (num2 == null)
            return num1;
        int num1Counter = num1.length() - 1;
        int num2Counter = num2.length() - 1;

        StringBuilder resultString = new StringBuilder();
        int carry = 0;
        while (num1Counter >= 0 || num2Counter >= 0) {
            int num1Digit = 0;
            if (num1Counter >= 0)
                num1Digit = num1.charAt(num1Counter--) - '0';
            int num2Digit = 0;
            if (num2Counter >= 0)
                num2Digit = num2.charAt(num2Counter--) - '0';

            int result = carry + num1Digit + num2Digit;
            if (result > 9) {
                carry = result / 10;
                result = result % 10;
            } else
                carry = 0;
            resultString.append(result);
        }
        if (carry != 0)
            resultString.append(carry);
        return resultString.reverse().toString();
    }
}
