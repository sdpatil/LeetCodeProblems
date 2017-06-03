package com.leetcode.p40;

/**
 * Created by sunilpatil on 5/30/17.
 */
public class TrappingRainWater42 {

    public int trap(int[] height) {
        int a = 0;
        int b = height.length -1;
        int max = 0;
        int leftMax = 0;
        int rightMax = 0;

        while (a < b){
            leftMax = Math.max(leftMax, height[a]);
            rightMax = Math.max(rightMax,height[b]);
            if(leftMax < rightMax){
                max += (leftMax - height[a]);
                a++;
            }else{
                 max += (rightMax - height[b]);
                 b--;
            }
        }
        return max;
    }
}
