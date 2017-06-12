package com.leetcode.p200;

import org.junit.Test;

/**
 * Created by sunilpatil on 6/8/17.
 */
public class NumberOfIslands200Test {
    NumberOfIslands200 problem = new NumberOfIslands200();

    @Test
    public void simpleTest(){
        char[][] grid ={
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };

        int result = problem.numIslands(grid);
        System.out.println("Number of island " + result);
        assert result == 3;
    }


    @Test
    public void simple2Test(){
        char[][] grid ={
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };

        int result = problem.numIslands(grid);
        System.out.println("Number of island " + result);
        assert result == 1;
    }

    @Test
    public void simple29Test() {
        char[][] grid = {
                {'1'},
                { '1'}
        };

        int result = problem.numIslands(grid);
        System.out.println("Number of island " + result);
        assert result == 1;
    }
}
