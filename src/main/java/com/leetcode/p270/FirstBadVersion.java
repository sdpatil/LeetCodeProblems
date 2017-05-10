package com.leetcode.p270;

/**
 * Created by sunilpatil on 4/25/17.
 */
public class FirstBadVersion {
    int badVersion = 0;

    public FirstBadVersion(int badVersion) {
        this.badVersion = badVersion;
    }

    public int firstBadVersion(int n) {
        int start = 0;
        int end = n;
        while (start < end) {
            int mid = start +( ( end-start) / 2);
            if (!isBadVersion(mid)) {
                start = mid + 1;
            } else if (isBadVersion(mid)) {
                if (mid - 1 < 0)
                    return mid;
                else if (!isBadVersion(mid - 1))
                    return mid;
                else
                    end = mid;
            }
        }

        return -1;
    }

    boolean isBadVersion(int n) {
        if (n >= badVersion)
            return true;
        else
            return false;
    }

}
