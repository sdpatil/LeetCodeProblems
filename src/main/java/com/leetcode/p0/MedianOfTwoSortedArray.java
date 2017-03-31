package com.leetcode.p0;

import java.util.Arrays;

/**
 * Created by sunilpatil on 3/30/17.
 */
public class MedianOfTwoSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       double firstMedian = findMedian(nums1);
       double secondMedian = findMedian(nums2);
       if(firstMedian == secondMedian)
           return firstMedian;
       else if(firstMedian > secondMedian){

       }else{

       }


        return 0;
    }

    public double findMedian(int[] num){
        if(num.length %2 ==1)
            return num[num.length/2];
        else{
            int first = num.length/2;
            return (num[first] + num[first+1])/2;
        }
    }
}
