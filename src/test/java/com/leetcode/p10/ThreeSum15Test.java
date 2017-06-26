package com.leetcode.p10;

import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 6/15/17.
 */
public class ThreeSum15Test {
    ThreeSum15 problem = new ThreeSum15();

    @Test
    public void simpleTest(){
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = problem.threeSum (nums);
        System.out.println(result);
        assert result.size() == 2;
        assert result.get(0).size()==3;

    }

    @Test
    public void simple55Test(){
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = problem.threeSum (nums);
        System.out.println(result);
        assert result.size() == 2;
        assert result.get(0).size()==3;

    }


}
