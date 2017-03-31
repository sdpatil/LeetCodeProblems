package com.leetcode.p40;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 3/31/17.
 */
public class CombinationSum240Test {
    CombinationSum240 combinationSum240;

    @Before
    public void setup(){
        combinationSum240 = new CombinationSum240();
    }

    @Test
    public void simpleTest(){
        int[] num = new int[]{10, 1, 2, 7, 6, 1, 5};
        List<List<Integer>> combinationList = combinationSum240.combinationSum2(num,8);
        for(List<Integer>  combination: combinationList)
            System.out.println(combination);

        assert combinationList.size()==4;
    }
}
