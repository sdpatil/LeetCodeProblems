package com.leetcode.p120;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 5/23/17.
 */
public class TriangleMinPathSum120Test {
    TriangleMinPathSum120 problem;

    @Before
    public void setup(){
        problem = new TriangleMinPathSum120();
    }

    @Test
    public void simpleTest(){
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3,4));
        triangle.add(Arrays.asList(6,5,7));
        triangle.add(Arrays.asList(4,1,8,3));

        int result = problem.minimumTotal(triangle);
        System.out.println("Result " + result);
        assert result ==11;
    }

    @Test
    public void singleRowTest() {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        triangle.add(Arrays.asList(2));
       assert  problem.minimumTotal(triangle) ==2;
    }

    @Test
    public void emptyTriangleTest() {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();

        assert  problem.minimumTotal(triangle) ==0;
    }
}
