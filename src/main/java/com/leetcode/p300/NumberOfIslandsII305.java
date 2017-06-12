package com.leetcode.p300;

import java.util.*;

/**
 * Created by sunilpatil on 6/8/17.
 */
public class NumberOfIslandsII305 {
    public List<Integer> numIslands2(int rows, int columns, int[][] positions) {
        List<Integer> result  =  new ArrayList<>();
        if( rows == 0 || columns == 0 || positions == null || positions.length == 0)
            return result;

        int numberOfIslands = 0;
        int[] roots = new int[rows*columns];
        Arrays.fill(roots,-1);

        for(int[] position: positions){
            int x = position[0];
            int y = position[1];

            int p = x * columns + y;
            roots[p] = p;
            int q ;
            if(x > 0 ){
                q = p - columns;
                if(roots[q] != -1)
                    buildIsland(roots,p, roots[q]);
            }

            if(x < rows -1){
                q = p + columns;
                if(roots[q] != -1)
                    buildIsland(roots,p, roots[q]);
            }

            if(y > 0){
                q = p -1;
                if(roots[q] != -1)
                    buildIsland(roots,p, roots[q]);
            }

            if( y < columns -1){
                q = p +1;
                if(roots[q] != -1)
                    buildIsland(roots,p, roots[q]);
            }
            result.add(countIslands(roots));
        }


        return result;
    }

    private void buildIsland(int[] roots, int p, int q){
        for(int i = 0 ; i < roots.length; i++){
            if(roots[i] == q)
                roots[i] =p;
        }
    }

    private int countIslands(int[] roots){
        Set<Integer> islandNumbers = new HashSet<>();
        for(int i: roots) {
            if(i != -1)
            islandNumbers.add(i);
        }
        return islandNumbers.size();
    }


    /*    public List<Integer> numIslands2(int m, int n, int[][] positions) {
        List<Integer> res = new ArrayList<>();
        if(positions == null || positions.length ==0)
            return res;
        if(m == 0 || n == 0)
            return res;

        QuickFind quickFind = new QuickFind(m,n);
        for(int[] position : positions){
            quickFind.union(position[0],position[1]);
            res.add(quickFind.count());
        }

        return res;
    }

    public static class QuickFind{
        int[] id;
        int N;

        private QuickFind(int m, int n){
            id = new int[m*n];
            this.N = id.length;
            for(int i = 0 ; i <N ;i++)
                id[i] = i;
        }

        void union(int a, int b){
            int p = id[a];
            for(int i = 0 ; i < N; i++){
                if(id[i] == p)
                    id[i] = id[b];
            }
        }

        private int count(){
            Set idSet = new HashSet();

            for(int i = 0 ;  i < id.length ;i++)
                idSet.add(id[i]);
            return id.length-idSet.size();
        }

    }*/
}
