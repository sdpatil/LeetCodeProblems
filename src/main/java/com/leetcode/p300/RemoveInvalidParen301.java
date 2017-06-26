package com.leetcode.p300;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

/**
 * Created by sunilpatil on 6/25/17.
 */
public class RemoveInvalidParen301 {
    /*
    Problem is given a string containing paren remove invalid parenthesis
    Solution: Perform BFS by removing current character if it is ( or ). At each step keep checking if
     the resultant string is valid
     */
    public List<String> removeInvalidParentheses(String s) {
        List<String> res = new ArrayList<>();
        //Check if the input is valid
        if(s == null )
            return res;

        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(s);
        visited.add(s);
        boolean found = false;
        while (!queue.isEmpty()){
            String current = queue.poll();
            //If the string is valid add it to result
            if(isValid(current)){
                res.add(current);
                found = true;
            }
            // Once a valid combination is found dont generate more combinations, if we dont have this
            // it will keep generating smaller strings which are valid
            if(found)
                continue;
            // Loop to remove current character from string and add it to queue
            for(int i = 0 ; i < current.length(); i++){
                if(current.charAt(i) == '(' || current.charAt(i) == ')'){
                    String t = current.substring(0,i) + current.substring(i+1);
                    if(!visited.contains(t)){
                        queue.add(t);
                        visited.add(t);
                    }
                }
            }
        }
        return res;
    }

    /*
    Check if the string is valid
     */
    private boolean isValid(String s){
        int count = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '(')
                count++;
            if(s.charAt(i) == ')')
                count--;
            if(count <0)
                return false;
        }
        return count == 0;
    }
/*
        public List<String> removeInvalidParentheses(String s) {
        List<String> ans = new ArrayList<>();
        remove(s, ans, 0, 0, new char[]{'(', ')'});
        return ans;
    }

    public void remove(String s, List<String> ans, int last_i, int last_j,  char[] par) {
        for (int stack = 0, i = last_i; i < s.length(); ++i) {
            if (s.charAt(i) == par[0]) stack++;
            if (s.charAt(i) == par[1]) stack--;
            if (stack >= 0) continue;
            for (int j = last_j; j <= i; ++j)
                if (s.charAt(j) == par[1] && (j == last_j || s.charAt(j - 1) != par[1]))
                    remove(s.substring(0, j) + s.substring(j + 1, s.length()), ans, i, j, par);
            return;
        }
        String reversed = new StringBuilder(s).reverse().toString();
        if (par[0] == '(') // finished left to right
            remove(reversed, ans, 0, 0, new char[]{')', '('});
        else { // finished right to left
            if(reversed.length() !=0)
            ans.add(reversed);
        }
    }*/
}
