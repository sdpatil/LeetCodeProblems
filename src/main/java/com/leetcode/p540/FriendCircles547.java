package com.leetcode.p540;

import java.util.Arrays;

/**
 * Created by sunilpatil on 6/8/17.
 */
public class FriendCircles547 {
    public int findCircleNum(int[][] M) {
        if(M == null || M.length == 0)
            return 0;
        int rows = M.length;
        int columns = M[0].length;
        QuickUnionUF quickUnionUF = new QuickUnionUF(rows);
        for (int i = 0; i < rows-1; i++) {
            for (int j = i; j < columns; j++) {
                if (M[i][j] == 1)
                    quickUnionUF.union(i, j);
            }
        }

        return quickUnionUF.getUniqueSets();
    }

    public static class QuickUnionUF {
        private int[] id;
        private int N;
        private int count;

        public QuickUnionUF(int N) {
            count =N;
            this.N = N;
            this.id = new int[N];
            for (int i = 0; i < N; i++)
                id[i] = i;
        }

        private int root(int i) {
            while (i != id[i]) {
                id[i] = id[id[i]];
                i = id[i];
            }
            return i;
        }

        public boolean connected(int p, int q) {
            int pRoot = root(p);
            int qRoot = root(q);
            return pRoot == qRoot;
        }

        public void union(int p, int q) {
            int pRoot = root(p);
            int qRoot = root(q);
            if (pRoot == qRoot)
                return;
            id[pRoot] = qRoot;
            count--;
        }

        public int numberOfSets() {
            int numberOfSets = 0;
            for (int i = 0; i < N; i++)
                if (id[i] != i)
                    numberOfSets++;
            return numberOfSets;
        }

        public int getUniqueSets() {
            return count;
        }
    }
}
