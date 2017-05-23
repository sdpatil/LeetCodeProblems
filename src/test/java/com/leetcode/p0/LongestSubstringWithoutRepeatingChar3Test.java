package com.leetcode.p0;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/22/17.
 */
public class LongestSubstringWithoutRepeatingChar3Test {
    LongestSubstringWithoutRepeatingChar3 problem;

    @Before
    public void setup(){
        problem = new LongestSubstringWithoutRepeatingChar3();
    }

    @Test
    public void simpleTest(){
        assert  problem.lengthOfLongestSubstring("abcabcbb") ==3;
        assert problem.lengthOfLongestSubstring("bbbbb") ==1;
    }

    @Test
    public void badInputTest(){
        assert  problem.lengthOfLongestSubstring("") ==0;

    }

    @Test
    public void lastCharTest(){
        assert problem.lengthOfLongestSubstring("pwwkew") ==3;
        assert  problem.lengthOfLongestSubstring("dvdf") ==3;
    }

    @Test
    public void test201Test(){
        assert  problem.lengthOfLongestSubstring("sdd") ==2;

    }
}
