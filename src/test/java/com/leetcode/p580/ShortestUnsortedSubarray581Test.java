package com.leetcode.p580;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/14/17.
 */
public class ShortestUnsortedSubarray581Test {
    ShortestUnsortedSubarray581 problem;

    @Before
    public void setup(){
        problem = new ShortestUnsortedSubarray581();
    }

    @Test
    public void simpleTest(){
        int[] num ={2, 6, 4, 8, 10, 9, 15};
        int result = problem.findUnsortedSubarray(num);
        System.out.println("Result " + result);
        assert result == 5;
    }

    @Test
    public void unsortedInStartTest(){
        int[] num ={4, 2, 6, 8, 9, 10, 15};
        int result = problem.findUnsortedSubarray(num);
        System.out.println("Result " + result);
        assert result == 2;
    }

    @Test
    public void unsortedInEndTest(){
        int[] num ={2, 4, 6, 8, 9, 15, 10};
        int result = problem.findUnsortedSubarray(num);
        System.out.println("Result " + result);
        assert result == 2;
    }

    @Test
    public void sortedArrayTest(){
        int[] num ={1,2,3,4};
        int result = problem.findUnsortedSubarray(num);
        System.out.println("Result " + result);
        assert result == 0;
    }
}
