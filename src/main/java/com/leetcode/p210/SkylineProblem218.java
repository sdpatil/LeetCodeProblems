package com.leetcode.p210;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

/**
 * Created by sunilpatil on 6/8/17.
 */
public class SkylineProblem218 {
    static class BuildingPoints implements Comparable<BuildingPoints> {
        int x;
        int height;
        boolean isStart;

        public BuildingPoints(int x, boolean isStart, int height) {
            this.x = x;
            this.height = height;
            this.isStart = isStart;
        }

        public int compareTo(BuildingPoints o) {
            if (this.x != o.x)
                return this.x - o.x;
            else {
                return (this.isStart ? -this.height : this.height) -
                        (o.isStart ? -o.height : o.height);
            }
        }
    }

    public List<int[]> getSkyline(int[][] buildings) {
        BuildingPoints[] buildingPoints = new BuildingPoints[buildings.length * 2];
        int index = 0;
        for (int[] building : buildings) {
            buildingPoints[index++] = new BuildingPoints(building[0], true, building[2]);
            buildingPoints[index++] = new BuildingPoints(building[1], false, building[2]);
        }
        Arrays.sort(buildingPoints);

        TreeMap<Integer, Integer> queue = new TreeMap<Integer, Integer>();
        queue.put(0, 1);
        int prevMaxHeight = 0;
        List<int[]> result = new ArrayList<int[]>();
        for (BuildingPoints buildingPoint : buildingPoints) {
            if (buildingPoint.isStart) {
                queue.compute(buildingPoint.height, (key, value) -> {
                    if (value != null)
                        return value + 1;
                    return 1;
                });
            } else {
                queue.compute(buildingPoint.height, (key, value) -> {
                    if (value == 1)
                        return null;
                    return value - 1;
                });
            }
            int currentMaxHeight = queue.lastKey();
            if (prevMaxHeight != currentMaxHeight) {
                result.add(new int[]{buildingPoint.x, currentMaxHeight});
                prevMaxHeight = currentMaxHeight;
            }

        }
        return result;
    }
}
