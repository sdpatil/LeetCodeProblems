package com.leetcode.p370;

import org.junit.Test;

/**
 * Created by sunilpatil on 4/25/17.
 */
public class GuessNumberGameTest {

    @Test
    public void simpleTest(){
        GuessNumberGame guessNumberGame = new GuessNumberGame(6);
        int guess = guessNumberGame.guessNumber(10);
        System.out.println("Guess " + guess);
        assert guess == 6;
    }


    @Test
    public void simple2Test(){
        GuessNumberGame guessNumberGame = new GuessNumberGame(7);
        int guess = guessNumberGame.guessNumber(10);
        System.out.println("Guess " + guess);

        assert guess == 7;
    }
}
