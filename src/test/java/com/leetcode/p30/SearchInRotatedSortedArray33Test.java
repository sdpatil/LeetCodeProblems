package com.leetcode.p30;

import org.junit.Test;

/**
 * Created by sunilpatil on 6/22/17.
 */
public class SearchInRotatedSortedArray33Test {
    SearchInRotatedSortedArray33 problem = new SearchInRotatedSortedArray33();

    @Test
    public void simpleTest(){
        int[] nums = {368,378,478,550,631,103,203,220,234,279};
        int result = problem.search(nums,220);
        System.out.println("Result " + result);
        assert result == 7;
    }

    @Test
    public void badInputTest(){
        int[] nums = new int[0];
        int result = problem.search(nums,0);
        assert result == -1;

        int[] nums2 = {1};
         result = problem.search(nums2,0);
        assert result == -1;
    }

    @Test
    public void leetCode139Test(){
        int[] nums = {1,3};
        int result = problem.search(nums,3);
        System.out.println("Result " + result);
        assert result == 1;

    }
}
