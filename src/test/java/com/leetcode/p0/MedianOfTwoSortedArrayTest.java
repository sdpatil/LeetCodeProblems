package com.leetcode.p0;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 3/30/17.
 */
public class MedianOfTwoSortedArrayTest {
    MedianOfTwoSortedArray medianOfTwoSortedArray;

    @Before
    public void setup(){
        medianOfTwoSortedArray = new MedianOfTwoSortedArray();
    }

    @Test
    public void simpleTest(){
        int[] num1 = new int[]{1,3,5,7,9};
        int[] num2 = new int[]{2,4,6,8};
        double result = medianOfTwoSortedArray.findMedianSortedArrays(num1,num2);
        System.out.println("Result " + result);
        assert result == 5.0;
    }

    @Test
    public void evenNumberTest(){
        int[] num1 = new int[]{1,3};
        int[] num2 = new int[]{2};
        double result = medianOfTwoSortedArray.findMedianSortedArrays(num1,num2);
        System.out.println("Result " + result);
        assert result == 2.0;
    }

    @Test
    public void oddNumberTest(){
        int[] num1 = new int[]{1,2};
        int[] num2 = new int[]{3,4};
        double result = medianOfTwoSortedArray.findMedianSortedArrays(num1,num2);
        System.out.println("Result " + result);
        assert result == 2.5;
    }
}
