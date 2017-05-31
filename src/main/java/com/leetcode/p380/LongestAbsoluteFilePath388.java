package com.leetcode.p380;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Created by sunilpatil on 5/30/17.
 */
public class LongestAbsoluteFilePath388 {
    public int lengthLongestPath(String input) {
        String[] tokens = input.split("\n");
        Stack<String> dirStack = new Stack<String>();
        int currentLevel = 0;
        int longestPathLength = 0;
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            int level = countLevel(token);
            if (level < currentLevel) {
                while (dirStack.size() != level)
                    dirStack.pop();
            } else if (level == currentLevel && !dirStack.isEmpty()) {
                dirStack.pop();
            }
            currentLevel = level;
            dirStack.push(token.replaceAll("\t", ""));
            if (token.contains(".")) {
                int currentPathLength = calculateFilePathLength(dirStack);
                longestPathLength = Math.max(longestPathLength, currentPathLength);
            }
        }
        return longestPathLength;
    }


    public int calculateFilePathLength(Stack<String> stack) {
        Iterator<String> filePath = stack.iterator();
        StringBuilder sb = new StringBuilder();
        while (filePath.hasNext()) {
            String filePathPart = filePath.next();
            sb.append(filePathPart);
            if (!filePathPart.contains("."))
                sb.append("/");
        }
        System.out.println("File paths " + sb.toString() + " path length ->" + sb.toString().length());
        return sb.toString().length();
    }

    private int countLevel(String s) {
        String cur = s.replaceAll("\t", "");
        return s.length() - cur.length();
    }
}
