package com.leetcode.p340;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by sunilpatil on 5/16/17.
 */
public class IntersectionOfTwoArrays349Test {
    IntersectionOfTwoArrays349 problem;

    @Before
    public void setup(){
        problem = new IntersectionOfTwoArrays349();
    }

    @Test
    public void simpleTest(){
        int[] num1 = {1, 2, 2, 1};
        int[] num2 = {2,2};

        int[] result = problem.intersection(num1,num2);
        System.out.println(Arrays.toString(result));

        Arrays.equals(result,new int[]{2});
    }

    @Test
    public void twoEmptyInputArrayTest(){


        int[] result = problem.intersection(new int[]{},new int[]{});
        System.out.println(Arrays.toString(result));

        Arrays.equals(result,new int[]{});
    }

    @Test
    public void oneEmptyInputArrayTest(){


        int[] result = problem.intersection(new int[]{},new int[]{1,2});
        System.out.println(Arrays.toString(result));

        Arrays.equals(result,new int[]{});
    }

    @Test
    public void nonIntersectingInputArrayTest(){


        int[] result = problem.intersection(new int[]{3,4},new int[]{1,2});
        System.out.println(Arrays.toString(result));

        Arrays.equals(result,new int[]{});
    }

    @Test
    public void complexTest(){
        int[] num1 = {7,2,2,4,7,0,3,4,5};
        int[] num2 = {3,9,8,6,1,9};
        int[] result = problem.intersection(num1,num2);
        System.out.println(Arrays.toString(result));

        Arrays.equals(result,new int[]{});
    }
}
