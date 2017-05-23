package com.leetcode.p160;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by sunilpatil on 5/22/17.
 */
public class CompareVersionNumber165 {
    private static class Version implements Comparator {
        List<Integer> versionList = new ArrayList<Integer>();

        public Version(String version) {
            StringTokenizer st = new StringTokenizer(version, ".");
            while (st.hasMoreTokens()) {
                versionList.add(Integer.parseInt(st.nextToken()));
            }
        }

        public int compare(Object o1, Object o2) {
            Version v1 = (Version) o1;
            Version v2 = (Version) o2;

            int iterateLength = Math.max(v1.versionList.size(), v2.versionList.size());
            int i = 0;
            for (; i < iterateLength; i++) {
                int versionNo1 = 0;
                if (i < v1.versionList.size())
                    versionNo1 = v1.versionList.get(i);
                int versionNo2 = 0;
                if (i < v2.versionList.size())
                    versionNo2 = v2.versionList.get(i);
                if (versionNo1 != versionNo2)
                    return Integer.compare(versionNo1, versionNo2);
            }

                return 0;
        }
    }

    public int compareVersion(String version1, String version2) {
        Version v1 = new Version(version1);
        Version v2 = new Version(version2);
        return v1.compare(v1, v2);
    }
}
