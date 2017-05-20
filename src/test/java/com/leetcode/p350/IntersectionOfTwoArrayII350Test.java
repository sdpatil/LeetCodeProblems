package com.leetcode.p350;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by sunilpatil on 5/16/17.
 */
public class IntersectionOfTwoArrayII350Test {
    IntersectionOfTwoArrayII350 problem;

    @Before
    public void setup(){
        problem = new IntersectionOfTwoArrayII350();
    }

    @Test
    public void simpleTest(){
        int[] num1 = {1, 2, 2, 1};
        int[] num2 = {2,2};

        int[] result = problem.intersect(num1,num2);
        System.out.println(Arrays.toString(result));

        Arrays.equals(result,new int[]{2,2});
    }

    @Test
    public void twoEmptyInputArrayTest(){


        int[] result = problem.intersect(new int[]{},new int[]{});
        System.out.println(Arrays.toString(result));

        Arrays.equals(result,new int[]{});
    }

    @Test
    public void oneEmptyInputArrayTest(){


        int[] result = problem.intersect(new int[]{},new int[]{1,2});
        System.out.println(Arrays.toString(result));

        Arrays.equals(result,new int[]{});
    }

    @Test
    public void nonIntersectingInputArrayTest(){


        int[] result = problem.intersect(new int[]{3,4},new int[]{1,2});
        System.out.println(Arrays.toString(result));

        Arrays.equals(result,new int[]{});
    }

    @Test
    public void complexTest(){
        int[] num1 = {7,2,2,4,7,0,3,4,5};
        int[] num2 = {3,9,8,6,1,9};
        int[] result = problem.intersect(num1,num2);
        System.out.println(Arrays.toString(result));

        Arrays.equals(result,new int[]{});
    }
}
