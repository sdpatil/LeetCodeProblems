package com.leetcode.p210;


import java.util.*;

/**
 * Created by sunilpatil on 5/24/17.
 */
public class WordSearchII212 {
    Set<String> res = new HashSet<String>();
    // Create a tried data structure with all the words in dictonary
    //perform dfs with one more char at a time
    public List<String> findWords(char[][] board, String[] words) {
        Trie trie = new Trie();
        //Create a trie data structure with all the words in the dictonary
        for (String word : words) {
            trie.insert(word);
        }
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dfs(board, visited, "", i, j, trie);
            }
        }
        return new ArrayList<String>(res);
    }

    public void dfs(char[][] board, boolean[][] visited, String str, int x, int y, Trie trie) {
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length) return;
        if (visited[x][y]) return;
        str += board[x][y];
        //If prefix doesnt match exit
        if (!trie.startsWith(str)) return;
        //If prefix match check if we build the whole word yet
        if (trie.search(str)) {
            res.add(str);
        }
        visited[x][y] = true;
        if (x - 1 >= 0)
            dfs(board, visited, str, x - 1, y, trie);
        if (x < board.length)
            dfs(board, visited, str, x + 1, y, trie);
        if (y - 1 >= 0)
            dfs(board, visited, str, x, y - 1, trie);
        if (y < board[0].length)
            dfs(board, visited, str, x, y + 1, trie);
        visited[x][y] = false;
    }

    private static class TrieNode {
        Map<Character, TrieNode> children;
        boolean endOfWord =false;
        public TrieNode() {
            children = new HashMap<Character, TrieNode>();
        }
    }
    public class Trie {
        TrieNode root;
        public Trie() {
            root = new TrieNode();
        }
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
}
