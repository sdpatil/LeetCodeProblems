package com.leetcode.p260;

import java.util.*;

/**
 * Created by sunilpatil on 6/12/17.
 */
public class AlienDictionary269 {

    /*
        Problem: Given list of words create lexographical order
        Solution: First figure out how many unique characters are there in the words, create graph with those many
        vertexes. Now go through every pair of words, comparing chars at same position. If the chars are different
        then create a edge from first char to second char.
        Once this graph is built out perform topological search on it to find out order of letters
     */
    public String alienOrder(String[] words) {
        if(words == null || words.length ==0)
            return "";
        Map<Character,LinkedList<Character>> charToEdgesMap = getVertexMap(words);
        for(int i = 1  ; i < words.length ;i++ ){
            char[] firstWord = words[i-1].toCharArray();
            char[] secondWord = words[i].toCharArray();
            int length = Math.min(firstWord.length , secondWord.length);
            for(int count = 0 ; count < length ;count++ ){
                if(firstWord[count] == secondWord[count]) {
                    continue;
                }else {
                    //Break once we find non matching char
                    addEdge(charToEdgesMap, firstWord[count],secondWord[count]);
                    break;
                }
            }
        }
        return topologicalSort(charToEdgesMap.size(),charToEdgesMap);
    }

    //Add edge from letter that comes first to letter that comes second
    private void addEdge(Map<Character,LinkedList<Character>> charToEdgesMap, char f, char s){
        LinkedList firstVertexList = charToEdgesMap.get(f);
        if(!firstVertexList.contains(s))
            firstVertexList.add(s);
    }

    // Create one vertex for each of the unique character
    private Map<Character, LinkedList<Character>> getVertexMap(String[] words){
        Map<Character,LinkedList<Character>> charToEdgesMap = new HashMap<>();
        for(String word: words){
            char[] c = word.toCharArray();
            for(int i = 0 ; i < c.length ; i++)
                if(!charToEdgesMap.containsKey(c[i]))
                    charToEdgesMap.put(c[i], new LinkedList());
        }
        return charToEdgesMap;
    }


    public String topologicalSort(int numberOfVertex, Map<Character,LinkedList<Character>> charToEdgesMap){
        Map<Character,Integer> inOrderEdgesCountMap = new HashMap<>();

        for(Map.Entry<Character,LinkedList<Character>> entry: charToEdgesMap.entrySet()){
            inOrderEdgesCountMap.put(entry.getKey(),0);
        }

        for(LinkedList<Character> edges: charToEdgesMap.values()){
            for(Character c: edges){
                if(inOrderEdgesCountMap.containsKey(c)){
                    inOrderEdgesCountMap.put(c, inOrderEdgesCountMap.get(c)+1);
                }else{
                    inOrderEdgesCountMap.put(c,1);
                }
            }
        }

        Queue<Character> queue = new LinkedList<>();
        for(Map.Entry<Character,Integer> charToFreq: inOrderEdgesCountMap.entrySet()){
            if(charToFreq.getValue() == 0)
                queue.add(charToFreq.getKey());
        }

        char[] result = new char[numberOfVertex];
        int resultCount = 0;
        while (!queue.isEmpty()){
            Character currentChar = queue.poll();
            result[resultCount++] = currentChar;

            LinkedList<Character> edgesList = charToEdgesMap.get(currentChar);
            for(Character ch: edgesList){
                int count = inOrderEdgesCountMap.get(ch);
                if(--count == 0)
                    queue.add(ch);
                else
                    inOrderEdgesCountMap.put(ch,count);

            }
        }
        if(resultCount != numberOfVertex)
            return  "";
        return new String(result);
    }

}
