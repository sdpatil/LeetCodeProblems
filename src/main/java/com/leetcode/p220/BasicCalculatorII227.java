package com.leetcode.p220;

import java.util.Stack;

/**
 * Created by sunilpatil on 5/31/17.
 */
public class BasicCalculatorII227 {
    /*
        Problem:  Implement a basic calculator to evaluate a simple expression string.
        The expression string contains only non-negative integers, +, -, *, / operators and empty spaces .
        The integer division should truncate toward zero.You may assume that the given expression is always valid.
        Some examples:
            "3+2*2" = 7
            " 3/2 " = 1
            " 3+5 / 2 " = 5
        Solution: - Start parsing one character
     */
    public int calculate(String s) {
        if (s == null || s.length() == 0)
            return 0;

        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char sign = '+';
        char[] c = s.toCharArray();

        for (int i = 0; i < c.length; i++) {
            char n = c[i];
            // If current character is a digit convert it to number
            if (Character.isDigit(n)) {
                num = num * 10 + Character.getNumericValue(n);
            }
            // If current character is not a digit then its sign, first process last sign
            if (!Character.isDigit(n) && !Character.isSpaceChar(n) || i == c.length - 1) {
                if (sign == '+') {
                    stack.push(num);
                } else if (sign == '-') {
                    stack.push(-1 * num);
                } else if (sign == '*') {
                    stack.push(stack.pop() * num);
                } else if (sign == '/') {
                    stack.push(stack.pop() / num);
                }
                // Now store the new sign
                sign = n;
                num = 0;
            }
        }
        // Go through the stack and sum up all the result
        int result = 0;
        for (Integer i : stack)
            result = result + i;
        return result;
    }

    public static void main(String[] argv){
        BasicCalculatorII227 problem = new BasicCalculatorII227();
        int result = problem.calculate("2*3");
        System.out.println(result);
    }


}
