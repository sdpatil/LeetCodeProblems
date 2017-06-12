package com.leetcode.p130;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by sunilpatil on 6/8/17.
 */
public class SurroundedRegions130Test {
    SurroundedRegions130 problem = new SurroundedRegions130();

    @Test
    public void simpleTest(){
        char[][] board ={
                {'X','X','X','X'},
                {'X','0','0','X'},
                {'X','X','0','X'},
                {'X','0','X','X'}
        };

        problem.solve(board);

        for(char[] row: board)
            System.out.println(Arrays.toString(row));

        /**
         * X X X X
         X X X X
         X X X X
         X O X X
         */
    }
}
