package com.leetcode.p20;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 3/27/17.
 */
public class GenerateParentheses22 {
    public List<String> generateParenthesis(int n) {
        List<String> results = new ArrayList<String>();
        generateParanthesis(n,n,"",results);
        return results;
    }

    public void generateParanthesis(int numberOfLeftParen, int numberOfRightParen,
                                    String partialString, List<String> result){
        if(numberOfLeftParen == 0 && numberOfRightParen ==0){
            result.add(partialString);
            return;
        }
        if(numberOfLeftParen > 0){
            generateParanthesis(numberOfLeftParen-1,numberOfRightParen,partialString+"(", result);
        }

        if(numberOfRightParen > numberOfLeftParen){
            generateParanthesis(numberOfLeftParen,numberOfRightParen-1,partialString+")", result);

        }
    }
}
