package com.leetcode.p320;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/13/17.
 */
public class PowerOfThree326Test {

    PowerOfThree326 problem;

    @Before
    public void setup() {
        problem = new PowerOfThree326();
    }

    @Test
    public void simpleTest() {
        assert problem.isPowerOfThree(3);
        assert problem.isPowerOfThree(9);
        assert problem.isPowerOfThree(27);

        assert !problem.isPowerOfThree(6);
        assert !problem.isPowerOfThree(12);

    }
}
