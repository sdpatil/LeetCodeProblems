package com.leetcode.p160;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/22/17.
 */
public class CompareVersionNumber165Test {
    CompareVersionNumber165 problem;

    @Before
    public void setup(){
        problem = new CompareVersionNumber165();
    }

    @Test
    public void simpleTest(){
        assert problem.compareVersion("0.1","1.1") == -1;
        assert problem.compareVersion("1.1","0.1") == 1;
        assert problem.compareVersion("0.1","0.1") == 0;
    }

    @Test
    public void threeLevelNestingTest(){
        assert problem.compareVersion("1.0.1","1") ==1;
    }

    @Test
    public void fourLevelVersionTest(){
        assert problem.compareVersion("1.9.9.9","1.10.0.0") ==-1;
    }

    @Test
    public void testCase62Test(){
        assert problem.compareVersion("1.0","1") ==0;
    }
}
