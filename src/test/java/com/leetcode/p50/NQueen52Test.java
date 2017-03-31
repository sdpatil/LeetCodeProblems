package com.leetcode.p50;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 3/25/17.
 */
public class NQueen52Test {
    NQueen52 problem;

    @Before
    public void setup() {
        problem = new NQueen52();
    }

    @Test
    public void queens4Test() {
        int result = problem.totalNQueens (4);
        System.out.println("Result " + result);
        assert result == 2;
    }

    @Test
    public void queens8Test() {
        int result = problem.totalNQueens (8);
        System.out.println("Result " + result);
     //   assert result == 2;
    }
}
