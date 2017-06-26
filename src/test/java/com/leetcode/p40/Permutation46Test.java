package com.leetcode.p40;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 3/26/17.
 */
public class Permutation46Test {
    Permutation46 permutation46;

    @Before
    public void setup(){
        permutation46 = new Permutation46();
    }

    @Test
    public void simple3Test(){
        int[] input = new int[]{1,2,3};
        List<List<Integer>> result = permutation46.permute(input);
        System.out.println(result);
        assert result.size() ==6;
    }
    @Test
    public void simple4Test(){
        int[] input = new int[]{1,2,3,4};
        List<List<Integer>> result = permutation46.permute(input);
        System.out.println(result.size());
        assert result.size() ==24;
    }
}
