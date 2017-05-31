package com.leetcode.p230;

import java.util.Stack;

/**
 * Created by sunilpatil on 5/30/17.
 */
public class MyQueue {
    private Stack<Integer> enqueStack;
    private Stack<Integer> dequeStack;
    /** Initialize your data structure here. */
    public MyQueue() {
        enqueStack = new Stack<Integer>();
        dequeStack = new Stack<Integer>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        enqueStack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(dequeStack.isEmpty()){
            while(!enqueStack.isEmpty()){
                int val = enqueStack.pop();
                dequeStack.push(val);
            }
        }
        return dequeStack.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(dequeStack.isEmpty()){
            while(!enqueStack.isEmpty()){
                int val = enqueStack.pop();
                dequeStack.push(val);
            }
        }
        return dequeStack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return enqueStack.isEmpty() && dequeStack.isEmpty();
    }
}
