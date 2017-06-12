package com.leetcode.p300;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 6/8/17.
 */
public class NumberOfIslandsII305Test {
    NumberOfIslandsII305 problem;
    @Before
    public void setup(){
        problem = new NumberOfIslandsII305();
    }
    @Test
    public void simpleTest(){
        int[][] positions = {
                {0,0}, {0,1}, {1,2}, {2,1}
        };

        List<Integer> result = problem.numIslands2(3,3,positions);
        System.out.println(result);

        assert result.size() ==4;
        assert result.get(0) ==1;
        assert result.get(1) ==1;
        assert result.get(2) ==2;
        assert result.get(3) ==3;
    }

    @Test
    public void simple68Test(){
        int[][] positions = {
                {0,1}, {1,2}, {2,1}, {1,0}, {0,2},{0,0},{1,1}
        };

        List<Integer> result = problem.numIslands2(3,3,positions);
        System.out.println(result);

        assert result.size() ==7;
        assert result.get(0) ==1;
        assert result.get(1) ==2;
        assert result.get(2) ==3;
        assert result.get(3) ==4;
        assert result.get(4) ==3;
        assert result.get(5) ==2;
        assert result.get(6) ==1;

    }
}
