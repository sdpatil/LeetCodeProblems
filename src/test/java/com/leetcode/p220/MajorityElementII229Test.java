package com.leetcode.p220;

import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 6/11/17.
 */
public class MajorityElementII229Test {
    MajorityElementII229 problem = new MajorityElementII229();

    @Test
    public void simpleTest(){
        int[] nums = {1,2,3,1,2};
        List<Integer> result = problem.majorityElement(nums);
        System.out.println(result);
    }
}
