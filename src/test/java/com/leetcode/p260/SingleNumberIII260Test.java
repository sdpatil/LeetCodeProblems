package com.leetcode.p260;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by sunilpatil on 5/13/17.
 */
public class SingleNumberIII260Test {
    SingleNumberIII260 problem;

    @Before
    public void setup(){
        problem = new SingleNumberIII260();
    }

    @Test
    public void simpleTest(){
        int nums[] = new int[]{1, 2, 1, 3, 2, 5};
        int[] result = problem.singleNumber(nums);
        System.out.println("Result " + Arrays.toString(result));
        assert Arrays.equals(result,new int[]{5,3});
    }
}
