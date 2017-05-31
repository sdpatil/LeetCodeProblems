package com.leetcode.p30;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/22/17.
 */
public class CountAndSay38Test {
    CountAndSay38 problem;

    @Before
    public void setup(){
        problem = new CountAndSay38();
    }

    @Test
    public void simpleTest(){
        assert problem.countAndSay(2).equals("11");
        assert problem.countAndSay(3).equals("21");
        assert problem.countAndSay(4).equals("1211");
        assert problem.countAndSay(5).equals("111221");
    }
}
