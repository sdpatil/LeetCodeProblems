package com.leetcode.p250;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * 251. Flatten 2D Vector
 * Created by sunilpatil on 5/23/17.

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
*/

/*
    Solution: I first hold the 2D List inside a Iterator of List this allows me to operate on the subsequent list once
    needed. I then remove the first list from the 2D List and store as row which is evaluated when next() & hasNext()
    are called. I then want to ensure row iterator is pointing to a none empty list so i call the getNextRow() method.
    next() and hashNext() are now very simple. next() returns the next element of the current list then ensures row
    isn't empty. hasNext() checks row isn't null and has a next value.
 */
public class Vector2D {
    Iterator<List<Integer>> itrs;
    Iterator<Integer> row;
    public Vector2D(List<List<Integer>> vec2d) {
        if(vec2d == null || vec2d.size() == 0) return;
        itrs = vec2d.iterator();
        row = itrs.next().iterator();
        getNextRow();
    }

    private void getNextRow(){
        while(!row.hasNext() && itrs.hasNext()) row = itrs.next().iterator();
    }

    public int next() {
        int next = row.next();
        getNextRow();
        return next;
    }

    public boolean hasNext() {
        return row != null && row.hasNext();
    }
}