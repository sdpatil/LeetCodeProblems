package com.leetcode.p230;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/13/17.
 */
public class PowerOfTwo231Test {
    PowerOfTwo231 problem;

    @Before
    public void setup(){
        problem = new PowerOfTwo231();
    }

    @Test
    public void simpleTest(){
        assert problem.isPowerOfTwo(2);
        assert !problem.isPowerOfTwo(3);
        assert problem.isPowerOfTwo(4);
        assert !problem.isPowerOfTwo(5);
        assert !problem.isPowerOfTwo(6);

    }
}
