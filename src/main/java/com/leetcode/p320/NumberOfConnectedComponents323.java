package com.leetcode.p320;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by sunilpatil on 6/9/17.
 */
public class NumberOfConnectedComponents323 {
    int vertexCount;
    boolean[] visited;
    LinkedList<Integer>[] edgeList;

    public int countComponents(int n, int[][] edges) {
        if(n == 0 || edges == null )
            return 0;
        edgeList = new LinkedList[n];
        for(int i = 0 ; i < n; i++){
            edgeList[i] = new LinkedList<>();
        }

        for(int[] edge: edges){
            int start = edge[0];
            int end = edge[1];
            edgeList[start].add(end);
            edgeList[end].add(start);
        }

        int connectedComponent = 0;
        visited = new boolean[n];
        for(int i = 0 ; i < n ; i ++){
            if(!visited[i]) {
                connectedComponent++;
                bfs(i);
            }
        }
        return connectedComponent;
    }

    private void bfs(int start){
        Queue<Integer> queue = new LinkedList();
        queue.add(start);
        visited[start] = true;

        while(!queue.isEmpty()){
            int currentNode = queue.poll();

            Iterator<Integer> it = edgeList[currentNode].iterator();
            while (it.hasNext()){
                int nextNode = it.next();
                if(!visited[nextNode]){
                    visited[nextNode] = true;
                    queue.add(nextNode);
                }
            }

        }
    }

}
