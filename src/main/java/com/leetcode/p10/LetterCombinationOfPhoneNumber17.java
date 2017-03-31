package com.leetcode.p10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by sunilpatil on 3/27/17.
 */
public class LetterCombinationOfPhoneNumber17 {
    HashMap<String, List<String>> digitToLetterMap = null;

    public void setup() {
        digitToLetterMap = new HashMap<String, List<String>>();
        digitToLetterMap.put("2", Arrays.asList("a", "b", "c"));
        digitToLetterMap.put("3", Arrays.asList("d", "e", "f"));
        digitToLetterMap.put("4", Arrays.asList("g", "h", "i"));
        digitToLetterMap.put("5", Arrays.asList("j", "k", "l"));
        digitToLetterMap.put("6", Arrays.asList("m", "n", "o"));
        digitToLetterMap.put("7", Arrays.asList("p", "q", "r", "s"));
        digitToLetterMap.put("8", Arrays.asList("t", "u", "v"));
        digitToLetterMap.put("9", Arrays.asList("w", "x", "y", "z"));


    }

    public List<String> letterCombinations(String digits) {
        setup();
        List<String> letterCombinationList = new ArrayList<String>();
        letterCombinations(digits, 0, "", letterCombinationList);
        return letterCombinationList;
    }

    public void letterCombinations(String input, int offset, String partialNumber, List<String> result) {
        if (input.length() == offset) {
            if (partialNumber.length() != 0)
                result.add(partialNumber);
            return;
        }
        List<String> combinationList = getLetters(input.charAt(offset) + "");
        for (String combination : combinationList) {
            String partialNumberNew = partialNumber + combination;
            letterCombinations(input, offset + 1, partialNumberNew, result);
        }
    }

    public List<String> getLetters(String number) {
        if (digitToLetterMap.containsKey(number))
            return digitToLetterMap.get(number);

        return Arrays.asList(number);
    }
}
