package com.leetcode.p70;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/16/17.
 */
public class EditDistance72Test {
    EditDistance72 problem;

    @Before
    public void setup(){
        problem = new EditDistance72();
    }

    @Test
    public void simpleTest(){
        int distance = problem.minDistance("saturday","sunday");
        System.out.println("Distance " + distance);
        assert distance == 3;
    }
}
