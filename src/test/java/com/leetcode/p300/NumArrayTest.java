package com.leetcode.p300;

import org.junit.Test;

/**
 * Created by sunilpatil on 5/23/17.
 */
public class NumArrayTest {

    @Test
    public void simpleTest(){
        NumArray numArray = new NumArray(new int[] {-2, 0, 3, -5, 2, -1});
        assert numArray.sumRange(0,2) ==1;
        assert numArray.sumRange(2,5) ==-1;
        assert numArray.sumRange(0,5) ==-3;


    }
}
