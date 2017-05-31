package com.leetcode.p380;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/23/17.
 */
public class RansomeNote383Test {
    RansomeNote383 problem;

    @Before
    public void setup(){
        problem = new RansomeNote383();
    }

    @Test
    public void simpleTest(){
       assert  !problem.canConstruct("a","b");
       assert !problem.canConstruct("aa", "ab");
       assert problem.canConstruct("aa", "aab");
    }

    @Test
    public void badInputTest(){
        assert  !problem.canConstruct(null,"b");
        assert  !problem.canConstruct("a",null);
        assert  !problem.canConstruct("a","");
        assert  problem.canConstruct("","aaa");

    }
}
