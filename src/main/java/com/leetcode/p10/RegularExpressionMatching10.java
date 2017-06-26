package com.leetcode.p10;

import java.util.Arrays;

/**
 * Created by sunilpatil on 6/25/17.
 */
public class RegularExpressionMatching10 {
    public boolean matchRegex(char[] text, char[] pattern) {
        boolean T[][] = new boolean[text.length + 1][pattern.length + 1];

        T[0][0] = true;
        //Deals with patterns like a* or a*b* or a*b*c*
        for (int i = 1; i < T[0].length; i++) {
            if (pattern[i-1] == '*') {
                T[0][i] = T[0][i - 2];
            }
        }

        for (int i = 1; i < T.length; i++) {
            for (int j = 1; j < T[0].length; j++) {
                if (pattern[j - 1] == '.' || pattern[j - 1] == text[i - 1]) {
                    T[i][j] = T[i-1][j-1];
                } else if (pattern[j - 1] == '*')  {
                    T[i][j] = T[i][j - 2];
                    if (pattern[j-2] == '.' || pattern[j - 2] == text[i - 1]) {
                        T[i][j] = T[i][j] | T[i - 1][j];
                    }
                } else {
                    T[i][j] = false;
                }
            }
        }
        printTable(T);
        return T[text.length][pattern.length];
    }
    public boolean isMatch(String text, String pattern) {
        boolean[][] dpTable = new boolean[text.length()+1][pattern.length()+1];
        dpTable[0][0] = true;
        for (int i = 1; i < dpTable[0].length; i++) {
            if (pattern.charAt(i-1) == '*') {
                dpTable[0][i] = dpTable[0][i - 2];
            }
        }


        for(int i = 1; i < dpTable.length ; i++ ){
            for(int j = 1 ; j < dpTable[0].length; j++){
                if(pattern.charAt(j-1) == '.' || pattern.charAt(j-1) == text.charAt(i-1)){
                    dpTable[i][j] = dpTable[i-1][j-1];
                }else if(pattern.charAt(j-1) == '*'){
                    dpTable[i][j] =dpTable[i][j-2];
                    if(pattern.charAt(j-2) =='.' || pattern.charAt(j-2) == text.charAt(i-1))
                        dpTable[i][j] = dpTable[i][j] | dpTable[i-1][j];
                }else
                    dpTable[i][j] = false;
            }
        }
        printTable(dpTable);

        return dpTable[text.length()][pattern.length()];
    }

    private void printTable(boolean[][] dpTable){
        for(boolean[] dpRow:dpTable)
            System.out.println(Arrays.toString(dpRow));
    }
}
