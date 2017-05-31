package com.leetcode.p510;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/23/17.
 */
public class LongestPalindromicSubsequence516Test {
    LongestPalindromicSubsequence516 problem;

    @Before
    public void setup(){
        problem = new LongestPalindromicSubsequence516();
    }

    @Test
    public void simpleTest(){
        System.out.println( problem.longestPalindromeSubseq("bbbab")) ;
        assert problem.longestPalindromicSubsequenceDP("bbbab") ==4;
        assert problem.longestPalindromeSubseq("cbbd") ==2;
    }
}
