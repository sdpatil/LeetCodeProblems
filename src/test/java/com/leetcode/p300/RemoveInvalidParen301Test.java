package com.leetcode.p300;

import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 6/25/17.
 */
public class RemoveInvalidParen301Test {
    RemoveInvalidParen301 problem = new RemoveInvalidParen301();

    @Test
    public void simple4Test(){
        String input ="()()()";
        List<String> result = problem.removeInvalidParentheses(input);
        System.out.println(result);
        assert result.size() ==1;
        assert result.contains("()()()");

    }


    @Test
    public void simpleTest(){
        String input ="()())()";
        List<String> result = problem.removeInvalidParentheses(input);
        System.out.println(result);
        assert result.size() ==2;
        assert result.contains("()()()");
        assert result.contains("(())()");
    }

    @Test
    public void simple2Test(){
        String input ="(a)())()";
        List<String> result = problem.removeInvalidParentheses(input);
        System.out.println(result);
        assert result.size() ==2;
        assert result.contains("(a)()()");
        assert result.contains("(a())()");
    }

    @Test
    public void simple3Test(){
        String input =")(";
        List<String> result = problem.removeInvalidParentheses(input);
        System.out.println(result);
        assert result.size() ==1;
    }

    @Test
    public void simple5Test(){
        String input ="";
        List<String> result = problem.removeInvalidParentheses(input);
        System.out.println(result);
        assert result.size() ==1;
    }
}
