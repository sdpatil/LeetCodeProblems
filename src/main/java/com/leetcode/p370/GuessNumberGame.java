package com.leetcode.p370;

/**
 * Created by sunilpatil on 4/25/17.
 */
public class GuessNumberGame {

    int number;
    public GuessNumberGame(int number){
        this.number = number;
    }

    public int guessNumber(int n) {
        int start = 1;
        int end = n;

        while (start<= end){
            int mid = start + ((end-start)/2);
            int guessN = guess(mid);
            if(guessN == 0)
                return mid;
            else if(guessN > 0){
                start = mid+1;
            }else {
                end = mid-1;
            }

        }
        return 0;
    }

    private int guess(int num){
        return Integer.compare(num, number);
    }
}
