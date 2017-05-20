package com.leetcode.p580;

/**
 * Created by sunilpatil on 5/14/17.
 */
public class ShortestUnsortedSubarray581 {
    public int findUnsortedSubarray(int[] nums) {
        int result = 0;
        int startIndex =0,endIndex = 0;
        for(  startIndex = 0 ; startIndex < nums.length-1; startIndex++){
            if( nums[startIndex] > nums[startIndex+1])
                break;;
        }
        if(startIndex == nums.length-1)
            return 0;
        startIndex = startIndex-1;
        for(endIndex = nums.length-1 ; endIndex >=0 ; endIndex-- ){
            if(nums[endIndex-1] > nums[endIndex])
                break;

        }
        System.out.println("Start Index -> " + startIndex + " End Index -> " + endIndex);
        return endIndex-startIndex;
    }
}
