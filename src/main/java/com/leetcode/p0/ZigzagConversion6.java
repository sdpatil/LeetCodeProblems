package com.leetcode.p0;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 5/20/17.
 */
public class ZigzagConversion6 {

    /**
     * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
     * (you may want to display this pattern in a fixed font for better legibility)

     P   A   H   N
     A P L S I I G
     Y   I   R
     And then read line by line: "PAHNAPLSIIGYIR"
     Write the code that will take a string and make this conversion given a number of rows:

     string convert(string text, int nRows);
     convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".

     Basic idea is maintain a String buffer for every row. Keep track of direction whether its going down or up
     and add character to String buffer int next row
     */
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
/*
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
    }*/

}
