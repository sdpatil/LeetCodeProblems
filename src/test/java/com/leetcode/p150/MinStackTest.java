package com.leetcode.p150;

import org.junit.Test;

/**
 * Created by sunilpatil on 5/12/17.
 */
public class MinStackTest {

    @Test
    public void simpleTest(){
        MinStack minStack = new MinStack();
        minStack.push(-2);
        assert minStack.getMin() == -2;
        minStack.push(0);
        assert minStack.getMin() == -2;
        minStack.push(-3);
        assert minStack.getMin() == -3;
        minStack.pop();
        assert minStack.top() ==0;
        assert minStack.getMin() ==-2;
    }

    @Test
    public void descendingTest(){

        MinStack minStack = new MinStack();
        minStack.push(5);
        minStack.push(4);
        minStack.push(3);
        minStack.push(2);
        minStack.push(1);

        assert minStack.top() ==1;
        assert minStack.getMin() ==1;
        minStack.pop();
        assert minStack.top() ==2;
        assert minStack.getMin() ==2;
    }

    @Test
    public void ascendingTest(){
        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.push(2);
        minStack.push(3);
        minStack.push(4);
        minStack.push(5);

        assert minStack.getMin() == 1;
        minStack.pop();
        minStack.pop();
        minStack.pop();
        assert minStack.getMin() == 1;

    }
}
