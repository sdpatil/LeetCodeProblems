package com.leetcode.p200;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by sunilpatil on 6/11/17.
 */
public class CourseSchedule207 {



    public boolean canFinish(int numCourses, int[][] prerequisites) {
        LinkedList<Integer>[] adj = new LinkedList[numCourses];
        if(numCourses == 0 || prerequisites == null )
            return false;

        //Initialize the course graph
        for(int i =0 ; i< numCourses ;i++){
            adj[i] = new LinkedList<>();
        }
        //Add edges for prereq
        for(int[] prereq:prerequisites){
            int f = prereq[0];
            int s = prereq[1];
            adj[f].add(s);
        }

        return hasCycle(numCourses,adj);
    }

    private  boolean hasCycle(int numCourses,LinkedList<Integer>[] edgeList){
        int[] inedge = new int[numCourses];

        for(int i = 0 ;i < numCourses ;i++){
            Iterator<Integer> it = edgeList[i].iterator();
            while (it.hasNext()){
                ++inedge[it.next()];
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < numCourses ;i++){
            if(inedge[i] == 0)
                queue.add(i);
        }

        int count = 0;
        while (!queue.isEmpty()){
            int currentElement = queue.poll();

            Iterator<Integer> it = edgeList[currentElement].iterator();
            while (it.hasNext()){
                int nextEdge = it.next();
                if(--inedge[nextEdge] == 0)
                    queue.add(nextEdge);
            }
            count++;
        }
        if(count != numCourses)
            return false;
        return true;
    }
}
