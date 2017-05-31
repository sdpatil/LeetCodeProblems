package com.leetcode.p0;

import java.util.Arrays;

/**
 * Created by sunilpatil on 3/30/17.
 */
public class MedianOfTwoSortedArray {

    public double findMedianSortedArrays(int[] nums1, int fS, int fE, int[] nums2, int sS, int sE) {
        int lengthOfFirst = fE - fS;
        int lengthOfSecond = sE - sS;

        if(lengthOfFirst == 0){
         return findMedian(nums2, sS, sE);
        }
        if(lengthOfSecond ==0){
            return findMedian(nums2, sS, sE);
        }
        if(lengthOfFirst == 0 && lengthOfSecond ==0)
            return -1;
        if(lengthOfFirst == 1 && lengthOfSecond ==1)
            return (nums1[fS] + nums2[sS])/2.0;


        double m1 = findMedian(nums1, fS, fE);
        double m2 =  findMedian(nums2, sS, sE);
        if(m1 == m2){
            return m1;
        }else if (m1 < m2){
            //return findMedianSortedArrays(nums1, m1, fE, nums2,0,m2 );
        }else{

        }
        return 0;
    }
    //Simple merge method
    public double findMedianSortedArrays2(int[] nums1, int[] nums2) {
     int n1 = 0;
     int n2 = 0;
     int[] result = new int[nums1.length + nums2.length];
     int r = 0;
     while (n1 < nums1.length || n2 < nums2.length){
         if(n1 >= nums1.length){
             result[r++] = nums2[n2++];
         }else if(n2 >= nums2.length){
             result[r++] = nums1[n1++];
         }else if(nums1[n1] < nums2[n2]){
             result[r++] = nums1[n1++];
         }else{
             result[r++] = nums2[n2++];
         }
     }
     System.out.println("Merged Array " + Arrays.toString(result));

     return findMedian(result);


    }

    public double findMedian(int[] num, int start, int end){
        int length = end -start;
        if(length %2 != 0){
            return num[length/2];
        }else{
            int f= num[length/2];
            int s= num[length/2+1];
            return ((double)(f+s))/2.0;
        }
    }

    public double findMedian(int[] num){
        if(num.length %2 ==1)
            return num[num.length/2];
        else{
            int first = num.length/2;
            return (double) (num[first] + num[first-1])/2.0;
        }
    }
}
