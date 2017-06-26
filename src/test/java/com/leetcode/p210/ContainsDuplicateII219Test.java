package com.leetcode.p210;

import org.junit.Test;

/**
 * Created by sunilpatil on 6/23/17.
 */
public class ContainsDuplicateII219Test {
    ContainsDuplicateII219 problem = new ContainsDuplicateII219();

    @Test
    public void simpleTest(){
        int[] nums = {1,2,3,4,5,6};
        assert problem.containsNearbyDuplicate(nums,5);
        assert !problem.containsNearbyDuplicate(nums, 7);
    }

    @Test
    public void simple2Test(){
        int[] nums = {1};
        assert !problem.containsNearbyDuplicate(nums,1);
    }
}
