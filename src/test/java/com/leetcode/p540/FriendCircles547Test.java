package com.leetcode.p540;

import org.junit.Test;

/**
 * Created by sunilpatil on 6/8/17.
 */
public class FriendCircles547Test {
    FriendCircles547 problem = new FriendCircles547();

    @Test
    public void simpleTest(){
        int[][] M = {
                {1,1,0},
                {1,1,0},
                {0,0,1}
        };

        int number = problem.findCircleNum(M);
        System.out.println("Result " + number);
        assert number == 2;
    }

    @Test
    public void simple2Test(){
        int[][] M = {
                {1,1,0},
                {1,1,1},
                {0,1,1}
        };

        int number = problem.findCircleNum(M);
        System.out.println("Result " + number);
        assert number == 1;
    }

    @Test
    public void simple74Test(){
        int[][] M = {
                {1,0,0,0,0,0,0,0,0,1,0,0,0,0,0},
                {0,1,0,1,0,0,0,0,0,0,0,0,0,1,0},
                {0,0,1,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,1,0,1,0,0,0,1,0,0,0,1,0,0,0},
                {0,0,0,0,1,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,0,0,0,0,0,0,0,0},
                {0,0,0,1,0,0,0,1,1,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0,0,0},
                {1,0,0,0,0,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0,0,0},
                {0,0,0,1,0,0,0,0,0,0,0,1,0,0,0},
                {0,0,0,0,1,0,0,0,0,0,0,0,1,0,0},
                {0,1,0,0,0,0,0,0,0,0,0,0,0,1,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,1}
        };

        int number = problem.findCircleNum(M);
        System.out.println("Result " + number);
        assert number == 8;
    }
}
