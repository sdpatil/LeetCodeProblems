package com.leetcode.p10;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sunilpatil on 5/11/17.
 */
public class RomanToInteger {

    public int romanToInt(String s) {
        Map<Character, Integer> T = new HashMap<Character, Integer>();
        T.put('I',1);
        T.put('V',5);
        T.put('X',10);
        T.put('L',50);
        T.put('C',100);
        T.put('D',500);
        T.put('M',1000);
        int sum = T.get(s.charAt(s.length()-1));
        for(int i = s.length()-2; i >=0; i--){
            if(T.get(s.charAt(i)) < T.get(s.charAt(i+1))){
                sum = sum - T.get(s.charAt(i));
            }else
                sum = sum + T.get(s.charAt(i));
        }
        return sum;
    }
}
