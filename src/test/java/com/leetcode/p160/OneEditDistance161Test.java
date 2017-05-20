package com.leetcode.p160;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/16/17.
 */
public class OneEditDistance161Test {
    OneDistance161 oneDistance161;
    @Before
    public void setup(){
        oneDistance161 = new OneDistance161();
    }

    @Test
    public void simplePositiveTest(){
        boolean result = oneDistance161.isOneEditDistance("cat","car");
        System.out.println("Result " + result);
        assert result;
    }

    @Test
    public void simpleNegativeTest(){
        boolean result = oneDistance161.isOneEditDistance("saturday","sunday");
        System.out.println("Result " + result);
        assert !result;
    }

    @Test
    public void twoEmptyStringTest(){
        boolean result = oneDistance161.isOneEditDistance("","");
        System.out.println("Result " + result);
        assert !result;
    }

    @Test
    public void oneEmptyOneCharTest(){
        boolean result = oneDistance161.isOneEditDistance("","a");
        System.out.println("Result " + result);
        assert result;
    }

    @Test
    public void twoSmallStringsTest(){
        boolean result = oneDistance161.isOneEditDistance("a","ac");
        System.out.println("Result " + result);
        assert result;
    }

    @Test
    public void twoSmallEqualStringsTest(){
        boolean result = oneDistance161.isOneEditDistance("c","c");
        System.out.println("Result " + result);
        assert !result;
    }
}
