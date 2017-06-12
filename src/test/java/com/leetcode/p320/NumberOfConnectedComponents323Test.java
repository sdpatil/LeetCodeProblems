package com.leetcode.p320;

import org.junit.Test;

/**
 * Created by sunilpatil on 6/9/17.
 */
public class NumberOfConnectedComponents323Test {
    @Test
    public void simpleTest(){
        NumberOfConnectedComponents323 problem = new NumberOfConnectedComponents323();
        int[][] edges = {
                {0, 1}, {1, 2}, {3, 4}
        };
        int result = problem.countComponents(5,edges);
        System.out.println("Result " + result);
        assert result ==2;
    }

    @Test
    public void simple2Test(){
        NumberOfConnectedComponents323 problem = new NumberOfConnectedComponents323();
        int[][] edges = {
                {0, 1}, {1, 2}, {2, 3}, {3, 4}
        };
        int result = problem.countComponents(5,edges);
        System.out.println("Result " + result);
        assert result ==1;
    }

    @Test
    public void simple42Test(){
        NumberOfConnectedComponents323 problem = new NumberOfConnectedComponents323();
        int[][] edges = {

        };
        int result = problem.countComponents(1,edges);
        System.out.println("Result " + result);
        assert result ==1;
    }
}
