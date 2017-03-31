package com.leetcode.p540;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 3/25/17.
 */
public class Problem540Test {
    Problem540 problem;

    @Before
    public void setup() {
        problem = new Problem540();
    }

    @Test
    public void simpleTest() {
        int[] a = new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8};
        int result = problem.singleNonDuplicate(a);
        assert result == 2;
    }

    @Test
    public void simple2Test() {
        int[] a = new int[]{3, 3, 7, 7, 10, 11, 11};
        int result = problem.singleNonDuplicate(a);
        assert result == 10;
    }

    @Test
    public void simple3Test(){
        int[] a = new int[]{1,1,2};
        int result = problem.singleNonDuplicate(a);
        assert result == 2;
    }
}
