package com.leetcode.p80;

import java.util.Stack;

/**
 * Created by sunilpatil on 5/29/17.
 */
public class LargestRectangleInHistrogram84 {

    public int largestRectangleArea(int[] heights) {
        if(heights == null || heights.length ==0)
            return 0;
        Stack<Integer> stack = new Stack<Integer>();
        int maxRectangleArea = 0;
        int i = 0;
        int currentArea = 0;

        while(i < heights.length){
            //Either stack is empty or still increasing
            if(stack.isEmpty() || heights[stack.peek()] <= heights[i]){
                stack.push(i++);
            }else{
                // Next height is smaller than before, so calculate area
                int top = stack.pop();
                if(stack.isEmpty())
                    currentArea = heights[top] * i;
                else
                    currentArea = heights[top] * (i - stack.peek()-1);
                maxRectangleArea= Math.max(maxRectangleArea, currentArea);
            }
        }

        while (!stack.isEmpty()) {
            int top = stack.pop();
            if(stack.isEmpty())
                currentArea = heights[top] * i;
            else
                currentArea = heights[top] * (i - stack.peek()-1);
            maxRectangleArea = Math.max(maxRectangleArea, currentArea);
        }

        return maxRectangleArea;
    }
}
