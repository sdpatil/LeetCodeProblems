package com.leetcode.p10;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/22/17.
 */
public class IntegerToRomanTest {
    IntegerToRoman problem;

    @Before
    public void setup(){
        problem = new IntegerToRoman();
    }

    @Test
    public void simpleTest(){
        System.out.println(problem.intToRoman(11));
    }
}
