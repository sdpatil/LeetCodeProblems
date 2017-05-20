package com.leetcode.p270;

/**
 * Created by sunilpatil on 5/19/17.
 */
public class FindCelebrity277 {
    int celebity;
    public FindCelebrity277(int c){
        this.celebity =c;
    }
    private boolean knows(int a, int b){
        if(b == celebity)
            return true;
        return false;
    }

    public int findCelebrity(int n) {
        int candidate = 0;
        for(int i = 1; i < n; i++){
            if(knows(candidate, i))
                candidate = i;
        }
        for(int i = 0; i < n; i++){
            if(i != candidate && (knows(candidate, i) || !knows(i, candidate))) return -1;
        }
        return candidate;
    }
}
