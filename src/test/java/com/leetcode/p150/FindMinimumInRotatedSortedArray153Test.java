package com.leetcode.p150;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 4/28/17.
 */
public class FindMinimumInRotatedSortedArray153Test {
    FindMinimumInRotatedSortedArray153 findMinimumInRotatedSortedArray153;

    @Before
    public void setup(){
        findMinimumInRotatedSortedArray153 = new FindMinimumInRotatedSortedArray153();
    }

    @Test
    public void simpleTest(){
        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        int result = findMinimumInRotatedSortedArray153.findMin(nums);
        System.out.println("Minimum element " + result);
        assert result == 0;
    }

    @Test
    public void simpleNonRotatedArrayTest(){
        int[] nums = new int[]{ 1, 2};
        int result = findMinimumInRotatedSortedArray153.findMin(nums);
        System.out.println("Minimum element " + result);
        assert result == 1;
    }

    @Test
    public void oneElementArrayTest(){
        int[] nums = new int[]{1};
        int result = findMinimumInRotatedSortedArray153.findMin(nums);
        System.out.println("Minimum element " + result);
        assert result == 1;
    }

    @Test
    public void simple2Test(){
        int[] nums = new int[]{2,1};
        int result = findMinimumInRotatedSortedArray153.findMin(nums);
        System.out.println("Minimum element " + result);
        assert result == 1;
    }

    @Test
    public void simple3Test(){
        int[] nums = new int[]{3,1,2};
        int result = findMinimumInRotatedSortedArray153.findMin(nums);
        System.out.println("Minimum element " + result);
        assert result == 1;
    }

    @Test
    public void simplet4Test(){
        int[] nums = new int[]{5, 6, 7, 8, 9, 10, 1, 2, 3};
        int result = findMinimumInRotatedSortedArray153.findMin(nums);
        System.out.println("Minimum element " + result);
        assert result == 1;
    }
}
