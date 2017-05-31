package com.leetcode.p220;

import java.util.Stack;

/**
 * Created by sunilpatil on 5/31/17.
 */
public class BasicCalculator224 {
    public int calculate(String s) {
        if(s == null || s.length() == 0)
            return 0;
        char[] c = s.toCharArray();
        Stack<Integer> stack = new Stack<Integer>();
        int result = 0;
        int number = 0;
        int sign = 1;
        for (int i = 0; i < c.length; i++) {
            char currentChar = c[i];
            if (Character.isSpaceChar(currentChar)) {
                continue;
            } else if (Character.isDigit(currentChar)) {
                number = number * 10 + Character.getNumericValue(currentChar);
            } else if (currentChar == '+') {
                result += sign * number;
                number = 0;
                sign = 1;
            } else if (currentChar == '-') {
                result += sign * number;
                number = 0;
                sign = -1;
            } else if (currentChar == '(') {
                stack.push(result);
                stack.push(sign);
                sign = 1;
                result = 0;
            } else if (currentChar == ')') {
                result += sign * number;
                number = 0;
                result = result * stack.pop();
                result = result + stack.pop();
            }
        }
        if (number != 0)
            result += sign * number;
        return result;
    }
}
