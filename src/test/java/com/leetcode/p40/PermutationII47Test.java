package com.leetcode.p40;

import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 6/26/17.
 */
public class PermutationII47Test {
    PermutationII47 problem = new PermutationII47();

    @Test
    public void simpleTest(){
        int[] nums = {1,2,2};
        List<List<Integer>> result =problem.permuteUnique(nums);
        System.out.println(result);
        assert result.size()==3;
    }
}
