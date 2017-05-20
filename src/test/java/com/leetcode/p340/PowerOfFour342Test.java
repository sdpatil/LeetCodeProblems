package com.leetcode.p340;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/13/17.
 */
public class PowerOfFour342Test {
    PowerOfFour342 problem;

    @Before
    public void setup(){
        problem = new PowerOfFour342();
    }

    @Test
    public void simpleTest(){
        assert problem.isPowerOfFour(4);
        assert problem.isPowerOfFour(16);
        assert problem.isPowerOfFour(64);

        assert !problem.isPowerOfFour(6);
        assert !problem.isPowerOfFour(8);
        assert !problem.isPowerOfFour(12);

    }

    @Test
    public void simple2Test(){
        System.out.println(Integer.toBinaryString(-2147483648));
        assert !problem.isPowerOfFour(-2147483648);
    }
}
