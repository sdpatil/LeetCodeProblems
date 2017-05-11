package com.leetcode.p60;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/10/17.
 */
public class AddBinary67Test {
    AddBinary67 problem;
    @Before
    public void setup(){
        problem = new AddBinary67();
    }

    @Test
    public void simpleTest(){
        String result = problem.addBinary("11","1");
        System.out.println("Result " + result);
        assert result.equals("100");
    }

    @Test
    public void complexTest(){
        String f =     "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String s = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";

        String result = problem.addBinary(f,s);
        System.out.println("Result " + result);
        assert result.equals("100");
    }
}
