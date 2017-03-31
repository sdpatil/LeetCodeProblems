package com.leetcode.p20;

import java.util.Stack;

/**
 * Created by sunilpatil on 3/28/17.
 */
public class ValidateParenthesis20 {
    public boolean isValid(String s) {
        char[] c = s.toCharArray();
        Stack<Character> parenStack = new Stack<Character>();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '(') {
                parenStack.push('(');
            } else if (c[i] == '[') {
                parenStack.push('[');
            } else if (c[i] == '{') {
                parenStack.push('{');
            } else if (c[i] == ')') {
                if (!parenStack.isEmpty() && parenStack.peek() == '(')
                    parenStack.pop();
                else
                    return false;
            } else if (c[i] == ']') {
                if (!parenStack.isEmpty() && parenStack.peek() == '[')
                    parenStack.pop();
                else
                    return false;
            } else if (c[i] == '}') {
                if (!parenStack.isEmpty() && parenStack.peek() == '{')
                    parenStack.pop();
                else
                    return false;
            }
        }
        if (!parenStack.isEmpty())
            return false;
        return true;
    }
}
