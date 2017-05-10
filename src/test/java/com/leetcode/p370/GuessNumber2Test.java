package com.leetcode.p370;

import org.junit.Test;

/**
 * Created by sunilpatil on 4/26/17.
 */
public class GuessNumber2Test {

    @Test
    public void simpleTest(){
        GuessNumber2 guessNumberGame = new GuessNumber2(8);
        int moneyToPay = guessNumberGame.getMoneyAmount(10);
        System.out.println("Guess " + 21);
        assert moneyToPay == 21;
    }
}
