package com.leetcode.p10;

import org.junit.Test;

/**
 * Created by sunilpatil on 6/25/17.
 */
public class RegularExpressionMatching10Test {
    RegularExpressionMatching10 problem = new RegularExpressionMatching10();

    @Test
    public void simpleTest(){
        assert problem.isMatch("aa","aa");
        assert !problem.isMatch("aa","a");
        assert !problem.isMatch("aaa","aa");
        assert problem.isMatch("aa","a*");
        assert problem.isMatch("aa",".*");
        assert problem.isMatch("ab",".*");
        assert problem.isMatch("aab","c*a*b");
    }

    @Test
    public void simple3Test(){
//        assert problem.matchRegex("aa".toCharArray(),"aa".toCharArray());


  //      assert !problem.matchRegex("aa".toCharArray(),"a".toCharArray());
    //    assert !problem.matchRegex("aaa".toCharArray(),"aa".toCharArray());
        assert problem.matchRegex("aa".toCharArray(),"a*".toCharArray());
      //  assert problem.matchRegex("aa".toCharArray(),".*".toCharArray());
       // assert problem.matchRegex("ab".toCharArray(),".*".toCharArray());
       // assert problem.matchRegex("aab".toCharArray(),"c*a*b".toCharArray());
    }

}
