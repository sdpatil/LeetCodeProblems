package com.leetcode.p0;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by sunilpatil on 5/22/17.
 */
public class LongestSubstringWithoutRepeatingChar3 {
    public int lengthOfLongestSubstring(String s) {
        if(s == null)
            return 0;
        HashMap<Character, Integer> characterIntegerHashtable = new HashMap<Character, Integer>();
        int maxLength = 0;
        int startIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            Integer duplicateIndexId = characterIntegerHashtable.put(s.charAt(i),i);
            if(duplicateIndexId != null) {
                if(duplicateIndexId >= startIndex){
                    maxLength = Math.max(i-startIndex, maxLength);
                    startIndex = duplicateIndexId+1;
                }
            }

        }
        maxLength = Math.max(maxLength, (s.length()-startIndex));
        return maxLength;
    }
}
