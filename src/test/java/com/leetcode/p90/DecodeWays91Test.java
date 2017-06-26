package com.leetcode.p90;

import org.junit.Test;

/**
 * Created by sunilpatil on 6/25/17.
 */
public class DecodeWays91Test {
    DecodeWays91 problem = new DecodeWays91();

    @Test
    public void simpleTest(){
        assert problem.numDecodings("0") ==0;
    }

    @Test
    public void simple2Test(){
        assert problem.numDecodings("01") ==1;
    }
}
