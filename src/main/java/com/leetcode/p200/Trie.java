package com.leetcode.p200;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sunilpatil on 5/21/17.
 */
public class Trie {

    private static class TrieNode {
        Map<Character, TrieNode> children;
        boolean endOfWord;

        public TrieNode() {
            children = new HashMap<Character, TrieNode>();
            endOfWord = false;
        }
    }

    TrieNode root;

    /**
     * Initialize your data structure here.
     */
    public Trie() {
        root = new TrieNode();
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null) {
                node = new TrieNode();
                current.children.put(ch, node);
            }
            current = node;
        }
        current.endOfWord = true;
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null)
                return false;
            current = node;
        }
        return current.endOfWord;
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        TrieNode current = root;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null)
                return false;
            current = node;
        }
        return true;
    }
}
