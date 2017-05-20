package com.leetcode.p60;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/18/17.
 */
public class UniquePathsII63Test {
    UniquePathsII63 problem;

    @Before
    public void setup(){
        problem = new UniquePathsII63();
    }

    @Test
    public void emptyArrayTest(){
        int paths= problem.uniquePathsWithObstacles(new int[0][0]);
        System.out.println("Unique Paths " + paths);
        assert paths == 0;
    }


    @Test
    public void simpleTest(){
        int[][] nums = {
                {0,0,0},
                {0,-1,0},
                {0,0,0}
        };

        int paths= problem.uniquePathsWithObstacles(nums);
        System.out.println("Unique Paths " + paths);
        assert paths == 2;
    }

    @Test
    public void breakerTopRowTest(){
        int[][] nums = {
                {0,1,0},
                {0,0,0},
                {0,0,0}
        };

        int paths= problem.uniquePathsWithObstacles(nums);
        System.out.println("Unique Paths " + paths);
        assert paths == 3;
    }

    @Test
    public void breakerLeftColumnTest(){
        int[][] nums = {
                {0,0,0},
                {1,0,0},
                {0,0,0}
        };

        int paths= problem.uniquePathsWithObstacles(nums);
        System.out.println("Unique Paths " + paths);
        assert paths == 3;
    }

    @Test
    public void singleElementZeroTest(){
        int[][] nums = {
                {0}
        };

        int paths= problem.uniquePathsWithObstacles(nums);
        System.out.println("Unique Paths " + paths);
        assert paths == 1;
    }

    @Test
    public void singleElementOneTest(){
        int[][] nums = {
                {1}
        };
        int paths= problem.uniquePathsWithObstacles(nums);
        System.out.println("Unique Paths " + paths);
        assert paths == 0;
    }

    @Test
    public void twoElementOneTest(){
        int[][] nums = {
                {0,-1}
        };
        int paths= problem.uniquePathsWithObstacles(nums);
        System.out.println("Unique Paths " + paths);
        assert paths == 0;
    }
}
