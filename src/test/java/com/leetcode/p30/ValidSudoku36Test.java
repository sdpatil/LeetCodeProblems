package com.leetcode.p30;

import org.junit.Test;

/**
 * Created by sunilpatil on 6/27/17.
 */
public class ValidSudoku36Test {
    ValidSudoku36 problem = new ValidSudoku36();

    @Test
    public void simpleTest() {
        char[][] puzzle = new char[9][9];

        puzzle[0] = new char[]{'5', '3', '.', '.', '7', '.', '.', '.', '.'};
        puzzle[1] = new char[]{'6', '.', '.', '1', '9', '5', '.', '.', '.'};
        puzzle[2] = new char[]{'.', '9', '8', '.', '.', '.', '.', '6', '.'};

        puzzle[3] = new char[]{'8', '.', '.', '.', '6', '.', '.', '.', '3'};
        puzzle[4] = new char[]{'4', '.', '.', '8', '.', '3', '.', '.', '1'};
        puzzle[5] = new char[]{'7', '.', '.', '.', '2', '.', '.', '.', '6'};

        puzzle[6] = new char[]{'.', '6', '.', '.', '.', '.', '2', '8', '.'};
        puzzle[7] = new char[]{'.', '.', '.', '4', '1', '9', '.', '.', '5'};
        puzzle[8] = new char[]{'.', '.', '.', '.', '8', '.', '.', '7', '9'};

        assert problem.isValidSudoku(puzzle);
    }

    @Test
    public void leetCode387Test(){
        String[] array = {"..4...63.",".........","5......9.","...56....","4.3.....1","...7.....","...5.....",".........","........."};
        char[][] puzzle = new char[9][9];

        for(int i = 0 ; i < array.length ;i++)
            puzzle[i] = array[i].toCharArray();

        assert !problem.isValidSudoku(puzzle);

    }
}
