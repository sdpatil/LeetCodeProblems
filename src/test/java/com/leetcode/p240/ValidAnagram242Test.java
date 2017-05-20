package com.leetcode.p240;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/16/17.
 */
public class ValidAnagram242Test {
    ValidAnagram242 validAnagram242;

    @Before
    public void setup(){
        validAnagram242 = new ValidAnagram242();
    }

    @Test
    public void simpleTest(){
        boolean result = validAnagram242.isAnagram("anagram","nagaram");
        assert result;

        result = validAnagram242.isAnagram("car","rat");
        assert !result;
    }
}
