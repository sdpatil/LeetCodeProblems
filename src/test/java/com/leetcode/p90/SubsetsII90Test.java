package com.leetcode.p90;

import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 6/26/17.
 */
public class SubsetsII90Test {
    SubsetsII90 problem = new SubsetsII90();

    @Test
    public void simpleTest() {
        int[] input = {1, 2, 2};
        List<List<Integer>> result= problem.subsetsWithDup(input);
        System.out.println(result);
        assert result.size() ==6;
    }

    @Test
    public void simple2Test() {
        int[] input = {2, 2, 2};
        List<List<Integer>> result= problem.subsetsWithDup(input);
        System.out.println(result);
        assert result.size() ==4;
    }
}
