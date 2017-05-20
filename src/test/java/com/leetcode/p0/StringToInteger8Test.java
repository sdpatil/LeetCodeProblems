package com.leetcode.p0;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/13/17.
 */
public class StringToInteger8Test {
    StringToInteger8 problem;

    @Before
    public void setup(){
        problem = new StringToInteger8();
    }

    @Test
    public void simpleTest(){
        assert  problem.myAtoi("331") == 331;
        assert  problem.myAtoi("-17") == -17;
    }

    @Test
    public void badInputTest(){
        assert  problem.myAtoi("+-2") == 0;
        assert  problem.myAtoi("-0012a42") == -12;


    }

    @Test
    public void positiveTest(){
        assert  problem.myAtoi("+1") == 1;
        assert  problem.myAtoi("+0 123") == 1;


    }
}
