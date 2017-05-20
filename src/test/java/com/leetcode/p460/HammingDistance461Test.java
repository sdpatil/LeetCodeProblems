package com.leetcode.p460;

import com.leetcode.HammingDistance461;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/13/17.
 */
public class HammingDistance461Test {
    HammingDistance461 problem;

    @Before
    public void setup(){
        problem = new HammingDistance461();
    }

    @Test
    public void simpleTest(){
        int distance = problem.hammingDistance(1,4);
        System.out.println("Distance " + distance);
        assert distance ==2;
    }

    @Test
    public void simple2Test(){
        int distance = problem.hammingDistance(8,12);
        System.out.println("Distance " + distance);
        assert distance ==1;
    }

}
