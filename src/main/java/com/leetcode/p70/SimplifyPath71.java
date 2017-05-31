package com.leetcode.p70;

import java.util.*;

/**
 * Created by sunilpatil on 5/30/17.
 */
public class SimplifyPath71 {
    public String simplifyPath(String path) {
        if(path == null)
            return null;
        if(path.length() <= 1)
            return path;
        boolean isAbsolute = path.startsWith("/");
        Deque<String> stack = new LinkedList<String>();
        StringTokenizer st = new StringTokenizer(path, "/");
        while (st.hasMoreTokens()) {
            String nextToken = st.nextToken();
            if (nextToken.trim().length() == 0)
                continue;
            else if (nextToken.equals("..")) {
                if (!stack.isEmpty())
                    stack.removeLast();
            } else if (nextToken.equals(".")) {
                continue;
            } else {
                stack.addLast(nextToken);
            }

        }
        StringBuilder sb = new StringBuilder();
        if (isAbsolute)
            sb.append("/");
        while (!stack.isEmpty()) {
            sb.append(stack.removeFirst());
            if (!stack.isEmpty())
                sb.append("/");
        }

        return sb.toString();
    }
}
