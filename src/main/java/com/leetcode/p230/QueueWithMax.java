package com.leetcode.p230;

import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * Created by sunilpatil on 5/12/17.
 */
public class QueueWithMax {
    private Queue<Integer> entries = new LinkedList<Integer>();
    private Deque<Integer> candidateForMax = new LinkedList<Integer>();

    public void enqueue(Integer x){
        entries.add(x);
        if(!candidateForMax.isEmpty()){
            while (!candidateForMax.isEmpty() && x > candidateForMax.getLast())
                candidateForMax.removeLast();
        }
        candidateForMax.addLast(x);
    }

    public int dequeue(){
        if(entries.isEmpty())
            throw new NoSuchElementException("queue is empty");
        int x = entries.remove();
        if(x == candidateForMax.getFirst()){
            candidateForMax.removeFirst();
        }
        return x;
    }

    public int getMax(){
        if(candidateForMax.isEmpty())
            throw new NoSuchElementException("Empty Queue");
        return candidateForMax.getFirst();
    }
}
