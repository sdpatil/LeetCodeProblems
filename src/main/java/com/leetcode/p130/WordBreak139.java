package com.leetcode.p130;

import java.util.List;

/**
 * Created by sunilpatil on 5/14/17.
 */
public class WordBreak139 {

    public boolean wordBreak(String s,  List<String> wordDict) {
        int size = s.length();
        if(size == 0)
            return true;
        for(int i = 1; i <= size ;i++){
            if(wordDict.contains(s.substring(0,i)) && wordBreak(s.substring(i),wordDict))
                return true;
        }
        return false;
    }

    public boolean wordBreak2(String s, int c, List<String> wordDict) {
        if (c == s.length())
            return true;

        for (int i = c + 1; i <= s.length(); i++) {
            String word = s.substring(c, i);
            if (wordDict.contains(word))
                return wordBreak2(s, i, wordDict);
        }
        return false;
    }
}
