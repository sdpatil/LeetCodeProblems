package com.leetcode.p370;

/**
 * Created by sunilpatil on 4/26/17.
 */
public class GuessNumber2 {
    int number;

    public GuessNumber2(int number) {
        this.number = number;
    }

    public int getMoneyAmount(int n) {
        int start = 1;
        int end = n;
        int moneyToPay = 0;
        while (start <= end) {
            int mid = ((end + start) / 2);
            System.out.printf("Start ->%d, End -> %d  Mid ->%d \n",start,end,mid );
            int guessN = guess(mid);
            if (guessN == 0)
                return mid;
            else if (guessN < 0) {
                start = mid+1;
            } else {
                end = mid;
            }
            moneyToPay = moneyToPay + mid;
        }
        return moneyToPay;
    }

    private int guess(int num) {
        return Integer.compare(num, number);
    }
}
