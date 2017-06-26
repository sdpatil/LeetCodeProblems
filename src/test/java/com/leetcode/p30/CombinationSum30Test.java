package com.leetcode.p30;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 3/31/17.
 */
public class CombinationSum30Test {

    CombinationSum30 combinationSum30;

    @Before
    public void setup(){
        combinationSum30 = new CombinationSum30();
    }

    @Test
    public void simpleTest(){
        int[] num = new int[]{2, 3, 6, 7};
        List<List<Integer>> combinationList = combinationSum30.combinationSum(num,7);
        for(List<Integer>  combination: combinationList)
            System.out.println(combination);

        assert combinationList.size()==2;
    }

    @Test
    public void simple2Test(){
        int[] num = new int[]{1,2,3};
        List<List<Integer>> combinationList = combinationSum30.combinationSum(num,4);
        for(List<Integer>  combination: combinationList)
            System.out.println(combination);

        assert combinationList.size()==7;
    }
}
