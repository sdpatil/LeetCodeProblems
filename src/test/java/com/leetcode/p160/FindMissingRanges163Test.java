package com.leetcode.p160;

import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 7/3/17.
 */
public class FindMissingRanges163Test {
    FindMissingRanges163 problem = new FindMissingRanges163();

    @Test
    public void simpleTest(){
        int[] nums = {0, 1, 3, 50, 75};
        List<String> result = problem.findMissingRanges(nums,0,99);
        System.out.println(result);
    }
}
