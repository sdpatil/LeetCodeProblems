package com.leetcode.p50;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 3/31/17.
 */
public class MaximumSubarray53Test {
    MaximumSubarray53 maximumSubarray53;

    @Before
    public void setup(){
        maximumSubarray53 = new MaximumSubarray53();
    }

    @Test
    public void simpleTest(){
        int[] num = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int maxSubArray = maximumSubarray53.maxSubArray(num);
        System.out.println("Maximum subarray " + maxSubArray);
        assert maxSubArray == 6;
    }

    @Test
    public void singleNegativeNumber(){
        int[] num = new int[]{-1};
        int maxSubArray = maximumSubarray53.maxSubArray(num);
        System.out.println("Maximum subarray " + maxSubArray);
        assert maxSubArray == -1;
    }
}
