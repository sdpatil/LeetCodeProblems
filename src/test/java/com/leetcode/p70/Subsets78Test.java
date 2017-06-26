package com.leetcode.p70;

import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 6/25/17.
 */
public class Subsets78Test {
    Subsets78 problem = new Subsets78();

    @Test
    public void simpleTest(){
        int[] nums = {1,3,5};
        List<List<Integer>> result =problem.subsets(nums);
        System.out.println(result);
        assert result.size() ==8;

    }
}
