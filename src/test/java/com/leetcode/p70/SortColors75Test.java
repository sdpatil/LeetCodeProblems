package com.leetcode.p70;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by sunilpatil on 5/24/17.
 */
public class SortColors75Test {
    SortColors75 problem;

    @Before
    public void setup(){
        problem = new SortColors75();
    }

    @Test
    public void simpleTest(){
        int[] colors = {0,1,2,2,1,0};
        System.out.println(Arrays.toString(colors));
         problem.sortColors(colors);
        System.out.println(Arrays.toString(colors));

        assert Arrays.equals(colors, new int[]{0,0,1,1,2,2});
    }

    @Test
    public void simple52Test(){
        int[] colors = {1,0};
        System.out.println(Arrays.toString(colors));
        problem.sortColors(colors);
        System.out.println(Arrays.toString(colors));

        assert Arrays.equals(colors, new int[]{0,1});
    }

    @Test
    public void simple53Test(){
        int[] colors = {2,1};
        System.out.println(Arrays.toString(colors));
        problem.sortColors(colors);
        System.out.println(Arrays.toString(colors));

        assert Arrays.equals(colors, new int[]{1,2});
    }

}
