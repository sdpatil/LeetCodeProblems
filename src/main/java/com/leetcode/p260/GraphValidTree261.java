package com.leetcode.p260;

import java.util.Iterator;
import java.util.LinkedList;

//For a graph to be a valid tree it should have no cycle and all the componets must be connected
public class GraphValidTree261 {
    int vertexCount;
    LinkedList<Integer>[] vertexList;
    public boolean validTree(int n, int[][] edges) {
        this.vertexCount = n;
        this.vertexList = new LinkedList[n];;
        boolean[] visited = new boolean[n];
        for(int i = 0 ; i < n ;i++){
            vertexList[i] = new LinkedList<>();
        }
        for(int[] edge: edges){
            int first = edge[0];
            int second = edge[1];
            vertexList[first].add(second);
            vertexList[second].add(first);
        }
        if(hasCycle(0,visited,-1 ))
            return false;
        for(int i = 0 ; i < n ;i++)
            if(!visited[i])
                return false;
        return true;
    }
    //Check if there is a cycle using DFS
    public boolean hasCycle(int start, boolean[] visited, int parent){
        visited[start] = true;
        Iterator<Integer> vertexList = this.vertexList[start].iterator();
        while(vertexList.hasNext()){
            int nextEdge = vertexList.next();
           if( (visited[nextEdge] && parent != nextEdge) ||
                   (!visited[nextEdge] && hasCycle(nextEdge,visited,start)) )
               return true;
        }
        return false;
    }
}
