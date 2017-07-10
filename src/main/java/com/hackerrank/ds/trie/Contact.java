package com.hackerrank.ds.trie;

import java.util.*;

/**
 * Created by sunilpatil on 7/10/17.
 */
public class Contact {
    public static class TrieNode{
        public Map<Character,TrieNode> children;
        public boolean endOfWord;
        public int numOfChildren;

        public TrieNode() {
            children = new HashMap<>();
            endOfWord = false;
            numOfChildren = 0;
        }

        @Override
        public String toString() {
            return "{" +
                    "children=" + children +
                    ", endOfWord=" + endOfWord +
                    ", numOfChildren=" + numOfChildren +
                    '}';
        }
    }

    public static class Trie{
        public TrieNode root;

        public Trie() {
            root= new TrieNode();
        }

        public void add(String s){
            TrieNode node = root;
            for(int i = 0; i < s.length() ;i++) {
                char currentChar = s.charAt(i);
                TrieNode currentNode = node.children.get(currentChar);
                if(currentNode == null){
                    currentNode = new TrieNode();
                    node.children.put(currentChar,currentNode);
                }
                node = currentNode;
            }
            node.endOfWord = true;
        }

        public void addRecursive(String s){
            addRecursiveHelper(s,0,root);
        }

        public int addRecursiveHelper(String s, int index , TrieNode trieNode){
            if(s.length() == index)
                return 0;
            char ch = s.charAt(index);
            TrieNode node = trieNode.children.get(ch);
            if(node == null) {
                node = new TrieNode();
                trieNode.children.put(ch,node);
            }
            if(index == s.length()-1) {
                node.endOfWord = true;
                node.numOfChildren =1;
                return 1;
            }else{
                node.numOfChildren = node.numOfChildren+ addRecursiveHelper(s,index+1,node);
            }
            return node.numOfChildren;
        }

        public int findPrefix(String s){
            TrieNode node = root;
            for(int i = 0 ; i < s.length(); i++){
                char currentChar = s.charAt(i);
                TrieNode currentNode = node.children.get(currentChar);
                if(currentNode == null)
                    return 0;
                node = currentNode;
            }
            return node.numOfChildren;
        }

        private int getChildren(TrieNode node){

            int count = 0;
            if(node.endOfWord)
                count = count+1;
            for(Map.Entry<Character,TrieNode> entry: node.children.entrySet()){
                count = count + getChildren(entry.getValue());
            }
            return count;
        }
    }

    public List<String> handleCommand(String[] commands){
        Trie trie =new Trie();

        List<String> outputList = new ArrayList<>();
        for(int  i= 0 ; i < commands.length; i++){
            String command = commands[i];
            String[] commandTokens = command.split(" ");
            switch (commandTokens[0]){
                case "add":
                    trie.addRecursive(commandTokens[1]);
                    break;
                case "find":
                    outputList.add(trie.findPrefix(commandTokens[1]) +"");
                    break;
            }
            System.out.print(trie.root);
        }
        return outputList;
    }

    public static void main(String[] argv){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] commands = new String[n+1];
        for(int i = 0 ; i <= n ; i++){
            commands[i] = scanner.nextLine();
        }
        Contact contact = new Contact();
        List<String> result = contact.handleCommand(commands);
        for(String s: result)
            System.out.println(s);

    }
}
