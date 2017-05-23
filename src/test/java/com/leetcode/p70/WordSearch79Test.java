package com.leetcode.p70;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/21/17.
 */
public class WordSearch79Test {
    WordSearch79 problem;

    @Before
    public void setup(){
        problem = new WordSearch79();
    }

    @Test
    public void simpleTest(){
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };

        assert problem.exist(board,"ABCCED");
        assert problem.exist(board,"SEE");
        assert !problem.exist(board,"ABCB");

    }

    @Test
    public void case82Test(){
        char[][] board = {
                {'a'}
        };
        assert problem.exist(board,"a");

    }

    @Test
    public void case83Test(){
        char[][] board = {
                {'A','B','C','E','S','E','E','E','F','S'}
        };
        assert problem.exist(board,"ABCE");
        assert !problem.exist(board,"SFES");
        assert !problem.exist(board,"ADEE");
    }
}
