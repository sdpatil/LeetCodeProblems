package com.leetcode.p90;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 3/25/17.
 */
public class RestoreIPAddress93 {
    public List<String> restoreIpAddresses(String s) {
        List<String> ipAddressList = new ArrayList<String>();
        backtrack(s, 0, new ArrayList<String>(), ipAddressList);
        return ipAddressList;
    }

    public void backtrack(String input, int offset, List<String> partList, List<String> results) {
        if (input.length() == offset && partList.size() == 4) {
            results.add(buildAddress(partList));
            return;
        }

        for (int j = offset + 1; j <= input.length(); j++) {
            String newPart = input.substring(offset, j);
            if (isValidIPAddress(newPart) && partList.size() <= 3) {
                partList.add(newPart);
                backtrack(input, j, partList, results);
                partList.remove(partList.size() - 1);
            }

        }
    }

    private String buildAddress(List<String> partList) {
        StringBuffer ipAddress = new StringBuffer();
        for (int i = 0; i < 4; i++) {
            ipAddress.append(partList.get(i));
            if (i != 3)
                ipAddress.append(".");
        }
        return ipAddress.toString();
    }


    public boolean isValidIPAddress(String ipAddress) {
        if (ipAddress.startsWith("0") && ipAddress.length() != 1)
            return false;
        if (ipAddress.length() <= 0 || ipAddress.length() > 3)
            return false;
        int ip = Integer.parseInt(ipAddress);
        if (ip < 0 || ip > 255)
            return false;

        return true;
    }
}
