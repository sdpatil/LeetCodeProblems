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

        while(i < heights.length){
            if(stack.isEmpty())
                stack.push(i++);
            else if(heights[stack.peek()] <= heights[i]){
                stack.push(i++);
            }else{
                int top = stack.pop();
                int currentArea = 0;
                if(stack.isEmpty())
                    currentArea = heights[top] * i;
                else
                    currentArea = heights[top] * (i - stack.peek()-1);
                maxRectangleArea= Math.max(maxRectangleArea, currentArea);
            }
        }

        while (!stack.isEmpty()) {
            int top = stack.pop();
            maxRectangleArea = Math.max(maxRectangleArea, heights[top] * (stack.isEmpty() ?i: i- stack.peek()-1));
        }

        return maxRectangleArea;
    }
}
