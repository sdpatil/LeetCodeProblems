package com.leetcode.p20;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by sunilpatil on 5/9/17.
 */
public class RemoveElement27Test {
    RemoveElement27 removeElement27;

    @Before
    public void setup(){
        removeElement27 = new RemoveElement27();
    }

    @Test
    public void simpleTest(){
        int[] nums = new int[]{3,2,2,3};
        int result = removeElement27.removeElement(nums,3);
        System.out.println("Value of result " + result);
        System.out.println(Arrays.toString(nums));
        assert result ==2;
    }

    @Test
    public void removeEverythingTest(){
        int[] nums = new int[]{3,3};
        int result = removeElement27.removeElement(nums,3);
        System.out.println("Value of result " + result);
        System.out.println(Arrays.toString(nums));
        assert result ==0;
    }

    @Test
    public void removeNothingTest(){
        int[] nums = new int[]{3,3};
        int result = removeElement27.removeElement(nums,5);
        System.out.println("Value of result " + result);
        System.out.println(Arrays.toString(nums));
        assert result ==0;
    }

    @Test
    public void singleElementArrayEmptyTest(){
        int[] nums = new int[]{1};
        int result = removeElement27.removeElement(nums,1);
        System.out.println("Value of result " + result);
        System.out.println(Arrays.toString(nums));
        assert result ==0;
    }

    @Test
    public void singleElementArrayNonEmptyTest(){
        int[] nums = new int[]{1};
        int result = removeElement27.removeElement(nums,2);
        System.out.println("Value of result " + result);
        System.out.println(Arrays.toString(nums));
        assert result ==1;
    }
}
