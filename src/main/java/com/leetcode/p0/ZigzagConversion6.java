package com.leetcode.p0;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 5/20/17.
 */
public class ZigzagConversion6 {
    public String convert(String s, int numRows) {
        if (s == null || s.length() <= 2 || numRows < 2)
            return s;

        List<StringBuilder> stringList = new ArrayList<StringBuilder>();
        for (int i = 0; i < numRows; i++)
            stringList.add(new StringBuilder());

        boolean isGoingDown = true;
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isGoingDown) {
                stringList.get(index).append(c);
                if (index == numRows - 1) {
                    isGoingDown = false;
                    index--;
                } else
                    index++;
            } else {
                stringList.get(index).append(c);
                if (index == 0) {
                    isGoingDown = true;
                    index++;
                } else
                    index--;
            }
        }

        StringBuilder returnString = new StringBuilder();
        for (StringBuilder stringBuilder : stringList) {
            returnString.append(stringBuilder);
        }

        return returnString.toString();
    }

    private String handleOddNumberOfRows(String s, int numRows) {
        char[] chars = s.toCharArray();
        List<List<Character>> conversion = new ArrayList<List<Character>>();
        for (int i = 0; i < numRows; i++)
            conversion.add(new ArrayList<Character>());

        int copyCount = 0;
        for (int i = 0; i < s.length(); i = i + numRows + 1) {
            for (int j = 0; j < numRows && copyCount < s.length(); j++) {
                conversion.get(j).add(s.charAt(copyCount++));
            }
            if (copyCount < s.length() && numRows % 2 != 0)
                conversion.get(numRows / 2).add(s.charAt(copyCount++));
        }
        return listToString(conversion);
    }

    private String handleEvenNumberOfRows(String s, int numRows) {
        char[] chars = s.toCharArray();
        List<List<Character>> conversion = new ArrayList<List<Character>>();
        for (int i = 0; i < numRows; i++)
            conversion.add(new ArrayList<Character>());

        for (int i = 0; i < s.length(); i++) {
            int rowNumber = i % numRows;
            conversion.get(rowNumber).add(s.charAt(i));
        }
        return listToString(conversion);
    }

    private String listToString(List<List<Character>> convertedList) {
        StringBuffer returnStr = new StringBuffer();
        for (List<Character> row : convertedList) {
            for (Character c : row)
                returnStr.append(c);
        }

        return returnStr.toString();
    }

}
