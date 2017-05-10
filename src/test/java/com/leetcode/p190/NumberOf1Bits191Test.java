package com.leetcode.p190;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/8/17.
 */
public class NumberOf1Bits191Test {

    NumberOf1Bits191 problem;

    @Before
    public void setup(){
        problem = new NumberOf1Bits191();
    }

    @Test
    public void simpleTest(){
        int result = problem.hammingWeight(11);
        System.out.println("Result " + result);
        assert result == 3;
    }

    @Test
    public void intMaxTest() {
        int result = problem.hammingWeight(214748364 );
        System.out.println("Result " + result);
        assert result == 3;
    }
}
