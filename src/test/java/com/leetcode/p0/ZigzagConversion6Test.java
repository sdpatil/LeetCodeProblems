package com.leetcode.p0;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/20/17.
 */
public class ZigzagConversion6Test {
    ZigzagConversion6 problem;

    @Before
    public void setup(){
        problem = new ZigzagConversion6();
    }

    @Test
    public void simpleTest(){
        String input ="PAYPALISHIRING";
        String result =problem.convert(input,3);
        System.out.println("Result " + result);
        assert result.equals("PAHNAPLSIIGYIR");
    }

    @Test
    public void secondTest(){
        String input ="ABC";
        String result =problem.convert(input,2);
        System.out.println("Result " + result);
        assert result.equals("ACB");
    }
}
//PAHNAPLSIIGYIR
//PAHNALIGYPISRI