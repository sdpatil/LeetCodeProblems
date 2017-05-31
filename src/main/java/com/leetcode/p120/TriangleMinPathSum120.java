package com.leetcode.p120;

import java.util.Collections;
import java.util.List;

/**
 * Created by sunilpatil on 5/23/17.
 */
public class TriangleMinPathSum120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size() ==0)
            return 0;
        for (int i = 1; i < triangle.size(); i++) {
            List<Integer> previousRow = triangle.get(i - 1);
            List<Integer> currentRow = triangle.get(i);
            for (int j = 0; j <= i; j++) {
                int left = 0;
                int right = 0;
                if (j - 1 >= 0)
                    left = previousRow.get(j - 1);
                else
                    left = Integer.MAX_VALUE;
                if (j < previousRow.size())
                    right = previousRow.get(j);
                else
                    right = Integer.MAX_VALUE;
                int maxParent = Math.min(left, right);
                currentRow.set(j, maxParent + currentRow.get(j));
            }
            System.out.println("Total row " + currentRow);
        }

        System.out.println(triangle);
        return Collections.min(triangle.get(triangle.size() - 1));
    }
}
