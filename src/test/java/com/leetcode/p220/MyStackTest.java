package com.leetcode.p220;

import org.junit.Test;

/**
 * Created by sunilpatil on 5/30/17.
 */
public class MyStackTest {

    @Test
    public void simpleTest(){
        MyStack myStack = new MyStack();
        assert myStack.empty();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        assert !myStack.empty();
        assert myStack.top() ==3;
        assert myStack.pop() ==3;
        assert myStack.pop() ==2;
        assert myStack.pop() ==1;
    }
}
