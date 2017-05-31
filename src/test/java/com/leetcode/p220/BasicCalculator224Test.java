package com.leetcode.p220;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/31/17.
 */
public class BasicCalculator224Test {
    BasicCalculator224 problem;

    @Before
    public void setup(){
        problem = new BasicCalculator224();
    }

    @Test
    public void simpleTest(){
        assert problem.calculate("1 + 1") ==2;
        assert problem.calculate(" 2-1 + 2 ") ==3;
        assert problem.calculate("(1+(4+5+2)-3)+(6+8)") ==23;
    }

}
