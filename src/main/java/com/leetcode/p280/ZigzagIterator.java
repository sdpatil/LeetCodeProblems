package com.leetcode.p280;

import java.util.Iterator;
import java.util.List;

/**
 * Created by sunilpatil on 5/20/17.
 */
public class ZigzagIterator {
    private Iterator<Integer> first;
    private Iterator<Integer> second;
    boolean turn = true;

    public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        this.first = v1.iterator();
        this.second = v2.iterator();
    }

    public int next() {
        if(turn && first.hasNext()){
            turn = false;
           return first.next();
        }else if(!turn && second.hasNext()){
            turn = true;
            return second.next();
        }else if(first.hasNext()){
            return first.next();
        }else{
            return second.next();
        }

    }

    public boolean hasNext() {
        return first.hasNext() || second.hasNext();
    }
}
