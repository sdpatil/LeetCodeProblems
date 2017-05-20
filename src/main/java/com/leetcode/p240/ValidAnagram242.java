package com.leetcode.p240;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by sunilpatil on 5/16/17.
 */
public class ValidAnagram242 {
    public boolean isAnagram(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        return Arrays.equals(sChar,tChar);
    }
}
