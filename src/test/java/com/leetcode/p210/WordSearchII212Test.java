package com.leetcode.p210;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 5/24/17.
 */
public class WordSearchII212Test {
    WordSearchII212 problem;

    @Before
    public void setup(){
        problem = new WordSearchII212();
    }

    @Test
    public void simpleTest(){
        String[] words = {"oath","pea","eat","rain"};
        char[][] board = {
                {'o','a','a','n'},
                {'e','t','a','e'},
                {'i','h','k','r'},
                {'i','f','l','v'}
        };
        List<String> wordList =problem.findWords(board,words);
        System.out.println(wordList);
        assert wordList.size() ==2;
        assert wordList.contains("eat");
        assert wordList.contains("oath");
    }

    @Test
    public void simple2Test(){
        String[] words = {"baa","abba","baab","aba"};
        char[][] board = {
                {'b','a','b','b','a'}
        };
        List<String> wordList =problem.findWords(board,words);
        System.out.println(wordList);
      //  assert wordList.size() ==2;
    }

    @Test
    public void simple3Test(){
        String[] words = {"baa","abba","baab","aba"};
        char[][] board = {
                {'b'},
                {'a'},
                {'b'},
                {'b'},
                {'a'}
        };
        List<String> wordList =problem.findWords(board,words);
        System.out.println(wordList);
      //  assert wordList.size() ==2;
    }

    @Test
    public void simple4Test(){
        String[] words = {"a"};
        char[][] board = {
                {'a','a'}
        };
        List<String> wordList =problem.findWords(board,words);
        System.out.println(wordList);
        assert wordList.size() ==1;
        assert wordList.contains("a");
    }

    @Test
    public void simple28Test(){
        String[] words = {"aaa"};
        char[][] board = {
                {'a','a'}
        };
        List<String> wordList =problem.findWords(board,words);
        System.out.println(wordList);
        assert wordList.size() ==0;

    }

    @Test
    public void simple32Test(){
        String[] words = {"ab","cb","ad","bd","ac","ca","da","bc","db","adcb","dabc","abb","acb"};
        char[][] board = {
                {'a','b'},
                {'c','d'}
        };
        List<String> wordList =problem.findWords(board,words);
        System.out.println(wordList);
        assert wordList.size() ==5;
        assert wordList.contains("ab");
        assert wordList.contains("bd");
        assert wordList.contains("ca");
        assert wordList.contains("db");

    }
}
