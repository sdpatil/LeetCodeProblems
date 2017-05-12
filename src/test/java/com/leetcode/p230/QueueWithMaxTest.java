package com.leetcode.p230;

import org.junit.Test;

/**
 * Created by sunilpatil on 5/12/17.
 */
public class QueueWithMaxTest {

    @Test
    public void simpleTest(){
        QueueWithMax queueWithMax = new QueueWithMax();
        queueWithMax.enqueue(3);
        queueWithMax.enqueue(1);
        queueWithMax.enqueue(3);
        queueWithMax.enqueue(2);
        queueWithMax.enqueue(0);

        assert queueWithMax.getMax() == 3;
        queueWithMax.enqueue(1);
        assert queueWithMax.getMax() == 3;
        queueWithMax.dequeue();
        queueWithMax.dequeue();
        queueWithMax.enqueue(2);
        assert queueWithMax.getMax() == 3;
        queueWithMax.enqueue(4);
        assert queueWithMax.getMax() == 4;
        queueWithMax.dequeue();
        queueWithMax.enqueue(4);
        assert queueWithMax.getMax() == 4;
    }
}
