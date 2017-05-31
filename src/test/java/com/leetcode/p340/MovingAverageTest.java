package com.leetcode.p340;

import org.junit.Test;

/**
 * Created by sunilpatil on 5/30/17.
 */
public class MovingAverageTest {

    @Test
    public void simpleTest() {
        MovingAverage movingAverage = new MovingAverage(3);
        assert movingAverage.next(1) == 1;
        assert movingAverage.next(10) == 5.5;
        assert movingAverage.next(3) == 4.666666666666667;
        assert movingAverage.next(5) == 6;
    }
}
