package com.leetcode.p210;

import org.junit.Test;

/**
 * Created by sunilpatil on 5/21/17.
 */
public class WordDictionaryTest {

    @Test
    public void simpleTest(){
        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");

        assert !wordDictionary.search("pad");
        assert wordDictionary.search("bad");
    }

    @Test
    public void prefixSearchTest(){
        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        assert wordDictionary.search(".ad");
    }

    @Test
    public void suffixSearchTest(){
        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        assert wordDictionary.search("b..");
    }

}
