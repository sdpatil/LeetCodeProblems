package com.leetcode.p290;

import org.junit.Test;

/**
 * Created by sunilpatil on 6/7/17.
 */
public class MedianFinderTest {

    @Test
    public void simple3Test(){
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(0);
        medianFinder.addNum(0);
        assert medianFinder.findMedian() ==0;
    }

    @Test
    public void simple5Test(){
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(-1);
        assert medianFinder.findMedian() == -1.0;
        medianFinder.addNum(-2);
        assert medianFinder.findMedian() ==-1.5;
        medianFinder.addNum(-3);
        assert medianFinder.findMedian() ==-2.0;
        medianFinder.addNum(-4);
        assert medianFinder.findMedian() ==-2.5;
        medianFinder.addNum(-5);
        assert medianFinder.findMedian() ==-3.0;
    }
}
