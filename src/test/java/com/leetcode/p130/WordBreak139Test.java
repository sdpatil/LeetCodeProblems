package com.leetcode.p130;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 5/14/17.
 */
public class WordBreak139Test {
    WordBreak139 problem;

    @Before
    public void setup(){
        problem = new WordBreak139();
    }

    @Test
    public void simpleTest(){
        String s ="leetcode";
        List<String> dict = new ArrayList<String>();
        dict.add("leet");
        dict.add("code");

        boolean result = problem.wordBreak(s,dict);
        System.out.println("Result " + result);
        assert result;
    }

    @Test
    public void simple30Test(){
        String s ="aaaaaaa";
        List<String> dict = new ArrayList<String>();
        dict.add("aaaa");
        dict.add("aaa");

        boolean result = problem.wordBreak(s,dict);
        System.out.println("Result " + result);
        assert result;
    }

    @Test
    public void simple2Test(){
        String s ="abcd";
        List<String> dict = new ArrayList<String>();
        dict.add("a");
        dict.add("abc");
        dict.add("b");
        dict.add("cd");
        boolean result = problem.wordBreak(s,dict);
        System.out.println("Result " + result);
        assert result;
    }

    @Test
    public void googleInterviewTest(){
        //"mobile","samsung","sam","sung","man","mango",    "icecream","and","go","i","like","ice","cream"
        String s ="ilikesamsung";
        List<String> dict = new ArrayList<String>();
        dict.add("mobile");
        dict.add("samsung");
        dict.add("sam");
        dict.add("sung");
        dict.add("man");
        dict.add("mango");
        dict.add("icecream");
        dict.add("and");
        dict.add("go");
        dict.add("i");
        dict.add("like");
        dict.add("ice");
        dict.add("cream");

        assert  problem.wordBreak("ilikesamsung",dict);
    }

    @Test
    public void simple4Test(){
        String s ="iamace";
        List<String> dict = new ArrayList<String>();
        dict.add("i");
        dict.add("a");

        dict.add("am");
        dict.add("ace");

        boolean result = problem.wordBreak(s,dict);
        System.out.println("Result " + result);
        assert result;
    }

}
