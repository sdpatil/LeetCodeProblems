package com.leetcode.p150;

import java.util.Stack;

/**
 * Created by sunilpatil on 5/12/17.
 */
public class MinStack2 {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack2() {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    public void push(int x) {
        stack.push(x);
        if(minStack.empty() || x <= minStack.peek())
            minStack.push(x);
    }

    public void pop() {
        int x=stack.pop();
        if(x == minStack.peek())
            minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
