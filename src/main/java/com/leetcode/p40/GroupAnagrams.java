package com.leetcode.p40;

import java.util.*;

/**
 * Created by sunilpatil on 6/29/17.
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        //Create a map with anagram as key and list of words as map
        Map<String, List<String>> anagramToWordMap = new HashMap<>();

        for(String word: strs){
            //Convert a word to char array and sort that array
            char[] c = word.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            List<String> wordBag = anagramToWordMap.get(key);
            if(wordBag == null){
                wordBag = new ArrayList<>();
                anagramToWordMap.put(key,wordBag);
            }
            wordBag.add(word);
        }

        for(Map.Entry<String,List<String>> entry: anagramToWordMap.entrySet()){
            if(entry.getValue().size() >=1)
                result.add((List<String>)entry.getValue());
        }

        return result;
    }
}
