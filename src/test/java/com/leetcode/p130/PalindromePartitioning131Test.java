package com.leetcode.p130;

import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 6/26/17.
 */
public class PalindromePartitioning131Test {
    PalindromePartitioning131 problem = new PalindromePartitioning131();

    @Test
    public void simpleTest(){
        String input = "aab";
        List<List<String>> result = problem.partition(input);
        System.out.println(result);
        assert result.size() ==2;
    }
}
