package com.leetcode.p280;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/11/17.
 */
public class FindDuplicateNumber287Test {
    FindDuplicateNumber287 problem;

    @Before
    public void setup(){
        problem = new FindDuplicateNumber287();
    }

    @Test
    public void simpleTest(){
        int[] nums = new int[]{1,1};
        int result = problem.findDuplicate(nums);
        System.out.println("Result " + result);
        assert result==1;
    }
}
