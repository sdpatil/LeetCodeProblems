package com.leetcode.p200;

/**
 * Created by sunilpatil on 6/8/17.
 */
public class NumberOfIslands200 {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0)
            return 0;
        int rows = grid.length;
        int column = grid[0].length;
        QuickUnionUF quickUnionUF = new QuickUnionUF(grid,grid.length * grid[0].length);
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ;  j < column ;j++){
                if( grid[i][j] == '1' ){
                    int unionFindId = i * column + j;
                    if(i-1 >0 && grid[i-1][j] =='1') {
                        int secondId = unionFindId - column;
                        quickUnionUF.union(secondId, unionFindId);
                    }
                    if(i+1 < rows && grid[i+1][j] =='1') {
                        int secondId = unionFindId +column;
                        quickUnionUF.union(secondId, unionFindId);
                    }
                    if(j-1 > 0 && grid[i][j-1] =='1') {
                        int secondId = unionFindId -1;
                        quickUnionUF.union(secondId, unionFindId);
                    }
                    if(j+1 < column && grid[i][j+1] =='1') {
                        int secondId = unionFindId+1;
                        quickUnionUF.union(secondId, unionFindId);
                    }
                }
            }
        }
        return quickUnionUF.count;
    }


    public static class QuickUnionUF{
        private int[] id;
        private int N;
        public int count;

        public QuickUnionUF(char[][] grid, int N){
            for(int i = 0 ; i < grid.length ;i++)
                for(int j = 0 ; j < grid[i].length ;j++)
                    if(grid[i][j] == '1')
                        count++;

            this.N =N;
            this.id = new int[N];
            for(int i = 0; i < N ; i ++)
                id[i] = i;
        }

        private int root(int i){
            while(i != id[i]){
                id[i] = id[id[i]];
                i = id[i];
            }
            return i;
        }

        public boolean connected(int p, int q){
            int pRoot = root(p);
            int qRoot = root(q);
            return pRoot == qRoot;
        }

        public void union(int p, int q){
            int pRoot = root(p);
            int qRoot = root(q);
            if(pRoot == qRoot)
                return;
            id[pRoot] = qRoot;
            count--;
        }

        public int numberOfSets(){
            int numberOfSets = 0 ;
            for(int i = 0 ; i < N ; i++)
                if(id[i] !=i)
                    numberOfSets++;
            return numberOfSets;
        }
    }
}