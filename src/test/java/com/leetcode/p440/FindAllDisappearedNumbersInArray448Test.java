package com.leetcode.p440;

import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 6/11/17.
 */
public class FindAllDisappearedNumbersInArray448Test {
    FindAllDisappearedNumbersInArray448 problem = new FindAllDisappearedNumbersInArray448();

    @Test
    public void simpleTest(){
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> result= problem.findDisappearedNumbers(nums);

        System.out.println(result);
        assert result.size() == 2;
        assert result.contains(5);
        assert result.contains(6);
    }
}
