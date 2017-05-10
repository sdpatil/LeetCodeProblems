package com.leetcode.p30;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 3/31/17.
 */
public class SearchInRotatedArray33Test {
    SearchInRotatedArray33 searchInRotatedArray33;

    @Before
    public void setup(){
        searchInRotatedArray33 = new SearchInRotatedArray33();
    }

    @Test
    public void simpleTest(){
        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        int result = searchInRotatedArray33.search(nums,1);
        System.out.println("Index " + result);
        assert result == 5;
    }
}
