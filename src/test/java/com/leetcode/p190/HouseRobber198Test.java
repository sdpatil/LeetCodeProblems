package com.leetcode.p190;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/18/17.
 */
public class HouseRobber198Test {
    HouseRobber198 problem;

    @Before
    public void setup(){
        problem = new HouseRobber198();
    }

    @Test
    public void simpleTest(){
        int[] num = {1,2,3,4,5,6};
        int result = problem.rob(num);
        System.out.println("Result " + result);
        assert result == 12;
    }

    @Test
    public void emptyArrayTest(){
        int[] num = {};
        int result = problem.rob(num);
        System.out.println("Result " + result);
        assert result == 0;
    }

    @Test
    public void oneElementArrayTest(){
        int[] num = {10};
        int result = problem.rob(num);
        System.out.println("Result " + result);
        assert result == 10;


    }

    @Test
    public void twoElementArrayTest(){
        int[] num = {10,5};
        int result = problem.rob(num);
        System.out.println("Result " + result);
        assert result == 10;
    }

}
