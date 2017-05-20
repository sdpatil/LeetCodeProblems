package com.leetcode.p160;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/13/17.
 */
public class MajorityElement169Test {
    MajorityElement169 problem;

    @Before
    public void setup(){
        problem = new MajorityElement169();
    }

    @Test
    public  void majorityInTheBeginingTest(){
        int[] num = new int[] {1,1,1,2,3};
        int result = problem.majorityElement(num);
        System.out.println("Result " + result);
        assert result == 1;
    }

    @Test
    public  void majorityInTheMiddleTest(){
        int[] num = new int[] {1,2,3,2,2};
        int result = problem.majorityElement(num);
        System.out.println("Result " + result);
        assert result == 2;
    }

    @Test
    public  void majorityInTheEndTest(){
        int[] num = new int[] {3,3,3,1,2};
        int result = problem.majorityElement(num);
        System.out.println("Result " + result);
        assert result == 3;
    }
}
