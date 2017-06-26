package com.leetcode.p210;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by sunilpatil on 6/12/17.
 */
public class CourseScheduleII210 {

    public int[] findOrder(int numCourses, int[][] preRequisites) {
        LinkedList<Integer>[] edges = new LinkedList[numCourses];
        for(int i = 0 ; i < numCourses ;i++){
            edges[i] = new LinkedList<>();
        }
        //Build a graph of course prereq
        for(int[] preReq:preRequisites){
            int f = preReq[0];
            int s = preReq[1];
            edges[s].add(f);
        }
        // Perform topological search on graph to figure out if there are cycles
        return topologicalOrder(numCourses,edges);
    }

    // This is very similar to normal topological sort
    public int[] topologicalOrder(int numCourses, LinkedList<Integer>[] vertexList){
        int[] inOrder = new int[numCourses];
        for(LinkedList<Integer> vertex: vertexList){
            Iterator<Integer> edges = vertex.iterator();
            while (edges.hasNext()){
                int nextEdge = edges.next();
                ++inOrder[nextEdge];
            }
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < numCourses; i++) {
            if(inOrder[i] ==0)
                queue.add(i);
        }
        int[] result = new int[numCourses];
        int courseCounter = 0;
        while (!queue.isEmpty()){
            int nextVertex = queue.poll();
            result[courseCounter] = nextVertex;
            Iterator<Integer> it = vertexList[nextVertex].iterator();
            while (it.hasNext()){
                int n= it.next();
                if (--inOrder[n]==0)
                    queue.add(n);
            }
            courseCounter++;
        }
        if(courseCounter != numCourses){
            return new int[]{};
        }
        return result;
    }
}
