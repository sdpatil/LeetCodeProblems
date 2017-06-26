package com.leetcode.p600;

import org.junit.Test;

/**
 * Created by sunilpatil on 6/15/17.
 */
public class ValidTraingleNumber611Test {
    ValidTraingleNumber611 problem = new ValidTraingleNumber611();

    @Test
    public void simpleTest(){
        int[] sides = {2,2,3,4};

        int count = problem.triangleNumber(sides);
        System.out.println("Triangle count " + count);
        assert count ==3;
    }
}
