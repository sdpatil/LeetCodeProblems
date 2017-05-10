package com.leetcode.p540;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by sunilpatil on 3/25/17.
 */
public class Problem540 {
    public int singleNonDuplicate(int[] nums) {
       int lo = 0;
       int hi = nums.length-1;
       while(lo < hi){
           int m = (lo + hi)/2;
           if(nums[m] != nums[m-1] && nums[m] != nums[m+1]) {
               return m;
           }else if(nums[m] != nums[m-1]){
               lo = m+1;
           }else if(nums[m] != nums[m+1]){

               hi = m;
           }

       }
       return -1;
    }


    public static int singleNumber(final List<Integer> a) {
        int start = 0;
        int end = a.size()-1;
        Collections.sort(a);
        while(start < end){
            int middle = (start+end)/2;
            if(a.get(middle) != a.get(middle-1) && a.get(middle) != a.get(middle+1))
                return a.get(middle);
            else if(a.get(middle) == a.get(middle-1)){
                end = middle;
            }else{
                start = middle+1;
            }

        }
        return -1;
    }

    public static void main(String[] argv){
        List<Integer> numList = Arrays.asList(1, 2, 3, 3, 1);
        System.out.println(singleNumber(numList));

        numList = Arrays.asList(1, 2, 2, 3, 1);
        System.out.println(singleNumber(numList));

        numList = Arrays.asList(1, 2, 3, 3, 2);
        System.out.println(singleNumber(numList));
    }
}
