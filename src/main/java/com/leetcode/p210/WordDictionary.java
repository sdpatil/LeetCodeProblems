package com.leetcode.p210;

import com.leetcode.TreeNode;
import com.leetcode.p200.Trie;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by sunilpatil on 5/21/17.
 */
public class WordDictionary {

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
    public WordDictionary() {
        root = new TrieNode();
    }

    /**
     * Adds a word into the data structure.
     */
    public void addWord(String word) {
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
     * Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.
     */
    public boolean search(String word) {
        return searchRecursive(root, word, 0);
    }

    public boolean searchRecursive(TrieNode current, String word, int index) {
        if (index == word.length())
            return current.endOfWord;

        char ch = word.charAt(index);
        if (ch != '.') {
            TrieNode node = current.children.get(ch);
            if (node == null)
                return false;

            return searchRecursive(node, word, index + 1);
        } else {
            for (TrieNode currentChild : current.children.values()) {
                if (searchRecursive(currentChild, word, index + 1))
                    return true;
            }
            return false;
        }
    }
}
