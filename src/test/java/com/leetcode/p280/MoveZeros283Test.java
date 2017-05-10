package com.leetcode.p280;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by sunilpatil on 5/9/17.
 */
public class MoveZeros283Test {

    MoveZeros283 moveZeros283;

    @Before
    public void setup(){
        moveZeros283 = new MoveZeros283();
    }


    @Test
    public void simpleTest(){
        int[] nums = new int[]{0, 1, 0, 3, 12};
        moveZeros283.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
        assert nums[0] == 1;
        assert nums[1] == 3;
        assert nums[2] == 12;
        assert nums[3] == 0;
        assert nums[4] == 0;
    }
}
