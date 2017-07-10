package com.leetcode.p260;

import org.junit.Test;

/**
 * Created by sunilpatil on 6/12/17.
 */
public class AlienDictionary269Test {
    AlienDictionary269 problem = new AlienDictionary269();

    @Test
    public void simpleTest(){
        String[] words ={"wrt",
                "wrf",
                "er",
                "ett",
                "rftt"};

        String result =problem.alienOrder(words);
        System.out.println("Result " + result);
        assert result.equals("wertf");

    }

    @Test
    public void simple2Test(){
        String[] words ={
                "z",
                "x"};

        String result =problem.alienOrder(words);
        System.out.println("Result " + result);
        assert result.equals("zx");

    }

    @Test
    public void simple3Test(){
        String[] words ={
                "z",
                "x",
                "z"};

        String result =problem.alienOrder(words);
        System.out.println("Result " + result);
        assert result.equals("");

    }
}
