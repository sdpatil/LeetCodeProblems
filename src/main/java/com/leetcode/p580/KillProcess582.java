package com.leetcode.p580;

import java.util.*;

/**
 * Created by sunilpatil on 5/30/17.
 */
public class KillProcess582 {
    public List<Integer> killProcess2(List<Integer> pid, List<Integer> ppid, int kill) {
        HashSet<Integer> parentSet = new HashSet<Integer>();
        parentSet.addAll(ppid);
        HashSet<Integer> processedId = new HashSet<Integer>();

        List<Integer> returnList = new ArrayList<Integer>();
        Queue<Integer> killedProcessQueue = new LinkedList<Integer>();
        killedProcessQueue.add(kill);
        while (!killedProcessQueue.isEmpty()) {
            int processId = killedProcessQueue.poll();
            System.out.println("Processing " + processId);
            returnList.add(processId);
            if (parentSet.contains(processId)) {
                for (int i = 0; i < ppid.size(); i++) {
                    if (ppid.get(i) == processId) {
                        int childProcessId = pid.get(i);
                        if (parentSet.contains(childProcessId) && !processedId.add(childProcessId)) {
                            killedProcessQueue.add(childProcessId);
                            processedId.add(childProcessId);
                        } else
                            returnList.add(childProcessId);
                    }
                }
            }
        }
        return returnList;
    }

    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        List<Integer> returnList = new ArrayList<Integer>();
        HashMap<Integer, List<Integer>> processToChildrenListMap = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < pid.size(); i++) {
            int processId = pid.get(i);
            int parentProcessId = ppid.get(i);
            if (processToChildrenListMap.containsKey(parentProcessId)) {
                processToChildrenListMap.get(parentProcessId).add(processId);
            } else {
                ArrayList<Integer> childList = new ArrayList<Integer>();
                childList.add(processId);
                processToChildrenListMap.put(parentProcessId, childList);
            }
        }
        Queue<Integer> killedProcessQueue = new LinkedList<Integer>();
        killedProcessQueue.add(kill);
        while (!killedProcessQueue.isEmpty()) {
            int processId = killedProcessQueue.poll();
            //     System.out.println("Processing " + processId);
            returnList.add(processId);

            if (processToChildrenListMap.containsKey(processId)) {
                List<Integer> childList = processToChildrenListMap.get(processId);
                for (Integer childProcessId : childList)
                    killedProcessQueue.add(childProcessId);
            }
        }
        return returnList;
    }
}