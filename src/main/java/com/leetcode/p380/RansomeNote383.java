package com.leetcode.p380;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sunilpatil on 5/23/17.
 */
public class RansomeNote383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote == null || magazine == null)
            return false;
        if(ransomNote.length() ==0)
            return true;
        Map<Character, Integer> magazineCharMap = new HashMap<Character, Integer>();
        for (char c : magazine.toCharArray()) {
            if (magazineCharMap.containsKey(c)) {
                int count = magazineCharMap.get(c);
                magazineCharMap.put(c, count + 1);
            } else {
                magazineCharMap.put(c, 1);
            }
        }

        for (char r : ransomNote.toCharArray()) {
            if (magazineCharMap.containsKey(r)) {
                int count = magazineCharMap.get(r) - 1;
                if (count != 0) {
                    magazineCharMap.put(r, count);
                } else
                    magazineCharMap.remove(r);
            } else {
                return false;
            }
        }

        return true;
    }
}
