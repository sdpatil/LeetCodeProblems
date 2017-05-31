package com.leetcode.p230;

import org.junit.Test;

import java.util.Stack;

/**
 * Created by sunilpatil on 5/30/17.
 */
public class MyQueueTest {

    @Test
    public void simpleTest(){
        MyQueue myQueue = new MyQueue();
        assert myQueue.empty();

        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);

        assert myQueue.pop() == 1;
        assert myQueue.pop() == 2;
        assert myQueue.pop() == 3;
        assert myQueue.empty();

    }

    @Test
    public void simple2Test(){
        MyQueue myQueue = new MyQueue();
        assert myQueue.empty();

        myQueue.push(1);
        myQueue.push(2);


        assert myQueue.pop() == 1;
        myQueue.push(3);
        assert myQueue.pop() == 2;
        assert myQueue.pop() == 3;
        assert myQueue.empty();

    }
}
