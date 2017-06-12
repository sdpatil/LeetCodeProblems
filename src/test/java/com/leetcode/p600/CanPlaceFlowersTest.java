package com.leetcode.p600;

import org.junit.Test;

/**
 * Created by sunilpatil on 6/11/17.
 */
public class CanPlaceFlowersTest {
    CanPlaceFlowers problem = new CanPlaceFlowers();

    @Test
    public void simpleTest(){
        int[] flowerBeds = {1,0,0,0,1};
        assert problem.canPlaceFlowers(flowerBeds,1);
    }

    @Test
    public void simple2Test(){
        int[] flowerBeds = {1,0,0,0,1};
        assert !problem.canPlaceFlowers(flowerBeds,2);
    }

    @Test
    public void simple3Test(){
        int[] flowerBeds = {0};
        assert problem.canPlaceFlowers(flowerBeds,1);
    }

    @Test
    public void simple4Test(){
        int[] flowerBeds = {0,1,0};
        assert !problem.canPlaceFlowers(flowerBeds,1);
    }

    @Test
    public void simple5Test(){
        int[] flowerBeds = {0,0,1,0,0};
        assert problem.canPlaceFlowers(flowerBeds,1);
    }
}
