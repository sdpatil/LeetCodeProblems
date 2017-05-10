package com.geekforgeeks;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/10/17.
 */
public class BitMagicTest {
    BitMagic problem;


    @Before
    public void setup(){
        problem = new BitMagic();
    }
    @Test
    public void simpleTest(){
        System.out.println(Integer.toBinaryString(5));
        int result = problem.toggleKtHBit(5,1);
        System.out.println("Result " + Integer.toBinaryString(result));
    }
}
