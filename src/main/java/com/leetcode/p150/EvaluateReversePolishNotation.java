package com.leetcode.p150;

import java.util.Stack;

/**
 * Created by sunilpatil on 5/29/17.
 */
public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        if (tokens == null || tokens.length == 0)
            return 0;

        Stack<Integer> stack = new Stack();
        for (String s : tokens) {
            if (s.equals("+")) {
                int op1 = stack.pop();
                int op2 = stack.pop();
                stack.push(op1 + op2);
            } else if (s.equals("-")) {
                int op1 = stack.pop();
                int op2 = stack.pop();
                stack.push(op2 - op1);
            } else if (s.equals("*")) {
                int op1 = stack.pop();
                int op2 = stack.pop();
                stack.push(op1 * op2);
            } else if (s.equals("/")) {
                int op1 = stack.pop();
                int op2 = stack.pop();
                stack.push(op2 / op1);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}
