package com.leetcode.p220;

import org.junit.Test;

/**
 * Created by sunilpatil on 7/1/17.
 */
public class ContainsDuplicateIII220Test {
    ContainsDuplicateIII220 problem = new ContainsDuplicateIII220();

    @Test
    public void simpleTest(){
        int[] nums = {1,2,3,4,5,6};

        assert problem.containsNearbyAlmostDuplicate(nums,2,1);
    }

    @Test
    public void simpleNegativeTest(){
        int[] nums = {0,4,8,12,16,20};
        assert !problem.containsNearbyAlmostDuplicate(nums,3,3);
    }

    @Test
    public void leetcode26Test(){
        int[] nums = {-1,-1};
        assert !problem.containsNearbyAlmostDuplicate(nums,1,-1 );
    }

    @Test
    public void leetcode39Test(){
        int[] nums = {-2147483648,-2147483647};
        assert problem.containsNearbyAlmostDuplicate(nums,3,3 );
    }

    @Test
    public void leetcode30Test(){
        int[] nums = {-3,3};
        assert !problem.containsNearbyAlmostDuplicate(nums,2,4 );
    }

    @Test
    public void leetcode22Test(){
        int[] nums = {-1,-1};
        assert !problem.containsNearbyAlmostDuplicate(nums,0,1 );
    }

    @Test
    public void leetcode33Test(){
        int[] nums = {1,3,1};
        assert !problem.containsNearbyAlmostDuplicate(nums,1,1 );
    }

    @Test
    public void leetcode36Test(){
        int[] nums = {-1,2147483647};
        assert !problem.containsNearbyAlmostDuplicate(nums,1,2147483647 );
    }
}
