package com.leetcode.p330;

import com.leetcode.p210.WordSearchII212;

import java.util.*;

/**
 * Created by sunilpatil on 5/24/17.
 */
public class PalindromicPairs336 {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        if(words == null || words.length <2)
            return resultList;
        HashMap<String,Integer> map = new HashMap<String, Integer>();
        for(int i = 0; i < words.length; i++)
            map.put(words[i],i);

        for(int i = 0; i < words.length ;i++){
            String currentWord = words[i];
            for(int j = 0; j <= currentWord.length() ;j++){
                String firstString = currentWord.substring(0,j);
                String secondString= currentWord.substring(j);
                if(isPalindrome(firstString)){
                    String reverseStr = new StringBuilder(secondString).reverse().toString();
                    if(map.containsKey(reverseStr) && map.get(reverseStr) != i){
                        List<Integer> result = Arrays.asList( map.get(reverseStr),i);
                        resultList.add(result);
                    }
                }

                if(isPalindrome(secondString) && secondString.length() !=0 ){
                    String reverseStr = new StringBuilder(firstString).reverse().toString();
                    if(map.containsKey(reverseStr) && map.get(reverseStr) != i ){
                        List<Integer> result = Arrays.asList(i,map.get(reverseStr));
                        resultList.add(result);
                    }
                }
            }
        }
        return resultList;
    }

    private boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left <= right) {
            if (str.charAt(left++) !=  str.charAt(right--)) return false;
        }
        return true;
    }


}
