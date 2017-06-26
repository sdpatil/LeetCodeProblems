package com.leetcode.p220;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 6/11/17.
 */
public class MajorityElementII229 {
    /**
     *  Problem -> There are 2 elements which are more than 1/3 each of array find them
     *  {1,2,1,2,4} Then result is 1,2
      Solution -> First first element as first majority and second element as second
     majority, go through rest of array. If next element is either first candidate
     or second candidate increase count if not decrease count
     */
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if(nums == null || nums.length == 0)
            return result;
        int candidate1 = nums[0];
        int candidate2 = nums[0];
        int candidateCount1 = 0;
        int candidateCount2 =0;
        for(int n: nums){
            if(candidate1 == n){
                candidateCount1++;
            }else if(candidate2 == n){
                candidateCount2++;
            }else if(candidateCount1 == 0){
                candidate1 = n;
                candidateCount1=1;
            }else if(candidateCount2 == 0){
                candidate2 = n;
                candidateCount2 =1;
            }else{
                candidateCount1--;
                candidateCount2--;
            }
        }
        int count1 = 0, count2 =0;
        for(int n: nums){
            if(candidate1 == n)
                count1++;
            else if(candidate2 == n)
                count2++;
        }
        if(count1 > nums.length/3)
            result.add(candidate1);
        if(count2 > nums.length/3)
            result.add(candidate2);
        return result;
    }
}
