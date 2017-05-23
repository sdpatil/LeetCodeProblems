package com.leetcode.p80;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by sunilpatil on 5/22/17.
 */
public class MergeSortedArray88Test {

    MergeSortedArray88 problem;

    @Before
    public void setup() {
        problem = new MergeSortedArray88();
    }

    @Test
    public void simpleTest() {
        int[] num1 = {1, 3, 5, 0, 0, 0};
        int[] num2 = {2, 4, 6};

        problem.merge(num1, 3, num2, 3);

        System.out.println(Arrays.toString(num1));
        assert Arrays.equals(num1, new int[]{1, 2, 3, 4, 5, 6});
    }

    @Test
    public void firstArrayTest() {
        int[] num1 = {1, 2, 3, 0, 0, 0};
        int[] num2 = {4, 5, 6};

        problem.merge(num1, 3, num2, 3);

        System.out.println(Arrays.toString(num1));
        assert Arrays.equals(num1, new int[]{1, 2, 3, 4, 5, 6});
    }

    @Test
    public void secondArrayTest() {
        int[] num1 = {4, 5, 6, 0, 0, 0};
        int[] num2 = {1, 2, 3};

        problem.merge(num1, 3, num2, 3);

        System.out.println(Arrays.toString(num1));
        assert Arrays.equals(num1, new int[]{1, 2, 3, 4, 5, 6});
    }

    @Test
    public void secondArrayEmptyArrayTest() {
        int[] num1 = {1};
        int[] num2 = {};

        problem.merge(num1, 1, num2, 0);

        System.out.println(Arrays.toString(num1));
        assert Arrays.equals(num1, new int[]{1});
    }

    @Test
    public void second2ArrayTest() {
        int[] num1 = {1, 2, 4, 5, 6, 0};
        int[] num2 = {3};

        problem.merge(num1, 5, num2, 1);

        System.out.println(Arrays.toString(num1));
        assert Arrays.equals(num1, new int[]{1, 2, 3, 4, 5, 6});
    }

    @Test
    public void testCase56Test() {
        int[] num1 = {0};
        int[] num2 = {1};

        problem.merge(num1, 0, num2, 1);

        System.out.println(Arrays.toString(num1));
        assert Arrays.equals(num1, new int[]{1});
    }
}
