package com.leetcode.p90;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/18/17.
 */
public class InterleavingString97Test {
    InterleavingString97 problem;

    @Before
    public void setup(){
        problem=new InterleavingString97();
    }

    @Test
    public void simpleTest(){
        String first ="aabcc";
        String second = "dbbca";

        assert problem.isInterleave(first,second,"aadbbcbcac");
        assert !problem.isInterleave(first,second,"aadbbbaccc");
    }

    @Test
    public void lengthProblemTest(){
        String first ="a";
        String second = "b";

        assert !problem.isInterleave(first,second,"a");
    }
}
