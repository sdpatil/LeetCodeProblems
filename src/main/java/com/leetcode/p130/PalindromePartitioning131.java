package com.leetcode.p130;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem: Given a string s, partition s such that every substring of the partition is a palindrome.
 Return all possible palindrome partitioning of sFor example, given s = "aab",
 Return
 [
 ["aa","b"],
 ["a","a","b"]
 ]
 Solution:
 */
public class PalindromePartitioning131 {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(s,result,new ArrayList<String>(),0);
        return result;
    }
    // Use basic backtracking, and at every character check if the string is palindrome, if yes take out the palindrome
    //part add it to templit and send rest of the string to next iteration to find out if there are more palindrom parts
    public void backtrack(String s, List<List<String>> result, List<String> tempList, int offset ){
        if(offset == s.length()){
            result.add(new ArrayList<>(tempList));
        }

        for(int i = offset; i < s.length() ;i++){
            if(isPalindrome(s,offset,i)){
                tempList.add(s.substring(offset,i+1));
                backtrack(s,result,tempList,i+1);
                tempList.remove(tempList.size()-1);
            }
        }
    }
    //Method to check if a given string is palindrome
    public boolean isPalindrome(String s, int low, int high){
        while(low < high)
            if(s.charAt(low++) != s.charAt(high--)) return false;
        return true;
    }
}
