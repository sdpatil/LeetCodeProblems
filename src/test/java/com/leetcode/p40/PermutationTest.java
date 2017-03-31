package com.leetcode.p40;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 3/26/17.
 */
public class PermutationTest {
    Permutation permutation;

    @Before
    public void setup(){
        permutation = new Permutation();
    }

    @Test
    public void simple3Test(){
        int[] input = new int[]{1,2,3};
        List<List<Integer>> result = permutation.permute(input);
        System.out.println(result);
        assert result.size() ==6;
    }
    @Test
    public void simple4Test(){
        int[] input = new int[]{1,2,3,4};
        List<List<Integer>> result = permutation.permute(input);
        System.out.println(result);
        assert result.size() ==6;
    }
}
