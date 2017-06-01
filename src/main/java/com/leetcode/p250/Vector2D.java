package com.leetcode.p250;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * 251. Flatten 2D Vector
 * Created by sunilpatil on 5/23/17.
 */
public class Vector2D implements Iterator<Integer> {
    Stack<Integer> stack = new Stack<Integer>();

    public Vector2D(List<List<Integer>> vec2d) {
        for(int i = vec2d.size()-1; i>=0 ; i-- ){
            List<Integer> currentList = vec2d.get(i);
            for(int j = currentList.size() -1; j >= 0 ; j--){
                stack.push(currentList.get(j));
            }
        }
    }

    public Integer next() {
        return stack.pop();
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }
}
