package com.leetcode.p40;

import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 6/29/17.
 */
public class GroupAnagramsTest {
    GroupAnagrams problem = new GroupAnagrams();

    @Test
    public void simpleTest(){
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> anagramsList = problem.groupAnagrams(words);
        System.out.println(anagramsList);
        assert anagramsList.size() == 3;

    }
}
