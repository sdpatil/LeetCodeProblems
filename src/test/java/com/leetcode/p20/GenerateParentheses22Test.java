package com.leetcode.p20;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 3/28/17.
 */
public class GenerateParentheses22Test {
    GenerateParentheses22 generateParentheses22;

    @Before
    public void setup(){
        generateParentheses22 = new GenerateParentheses22();
    }

    @Test
    public void parenthesis2Test(){
        List<String> resultList = generateParentheses22.generateParenthesis(2);
        System.out.println("Results " + resultList);
        assert resultList.size() ==2;
    }

    @Test
    public void parenthesis3Test(){
        List<String> resultList = generateParentheses22.generateParenthesis(3);
        System.out.println("Results " + resultList);
        assert resultList.size() ==5;
    }
}
