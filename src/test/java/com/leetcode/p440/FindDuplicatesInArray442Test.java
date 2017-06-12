package com.leetcode.p440;

import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 6/11/17.
 */
public class FindDuplicatesInArray442Test {
    FindDuplicatesInArray442 problem = new FindDuplicatesInArray442();

    @Test
    public void simpleTest(){
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> result = problem.findDuplicates(nums);
        System.out.println(result);
        assert result.size() ==2;
        assert result.contains(3);
        assert result.contains(2);
    }


    @Test
    public void simple2Test(){
        int[] nums = {10,2,5,10,9,1,1,4,3,7};
        List<Integer> result = problem.findDuplicates(nums);
        System.out.println(result);
        assert result.size() ==2;
        assert result.contains(10);
        assert result.contains(1);
    }

}
