package com.leetcode.p200;

import org.junit.Test;

/**
 * Created by sunilpatil on 5/21/17.
 */
public class TrieTest {

    @Test
    public void simpleTest(){
         Trie trie = new Trie();
         trie.insert("Sunil");
         trie.insert("Suman");
         trie.insert("Sadhana");

         assert trie.search("Sunil");
         assert !trie.search("Suhas");
         assert trie.startsWith("Sun");
         assert !trie.startsWith("Suh");
        assert !trie.startsWith("xyz");
        assert !trie.search("xyz");

    }

    @Test
    public void invalidInputTest(){
        Trie trie = new Trie();


        assert !trie.search("Sunil");
        assert !trie.startsWith("Sunil");

        trie.insert("Sunil");
        trie.insert("Suman");
        trie.insert("Sadhana");
        assert trie.search("Sunil");

        assert !trie.search("Suhas");
        //   assert trie.startsWith("Sun");
        //  assert !trie.startsWith("Sum");
    }
}
