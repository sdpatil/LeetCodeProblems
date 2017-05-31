package com.leetcode.p330;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 5/24/17.
 */
public class PalindromicPairs336Test {
    PalindromicPairs336 problem;

    @Before
    public void setup(){
        problem = new PalindromicPairs336();
    }

    @Test
    public void simpleTest(){
        String[] words = {"bat", "tab", "cat"};
        List<List<Integer>> resultList = problem.palindromePairs(words);
        System.out.println(resultList);

        assert resultList.size() ==2;
    }

    @Test
    public void simple2Test(){
        String[] words = {"abcd", "dcba", "lls", "s", "sssll"};
        List<List<Integer>> resultList = problem.palindromePairs(words);
        System.out.println(resultList);

        assert resultList.size() ==4;
    }

}
