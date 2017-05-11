package com.leetcode.p60;

/**
 * Created by sunilpatil on 5/10/17.
 */
public class AddBinary67 {
    public String addBinary2(String a, String b) {
        int f = Integer.parseInt(a, 2);
        int s = Integer.parseInt(b, 2);
        return Integer.toBinaryString(f + s);
    }

    public String addBinary(String a, String b) {
        if (a.length() > b.length()) {
            int diff = a.length() - b.length();
            b = getPaddingString(diff) + b;
        } else if (a.length() < b.length()) {
            int diff = b.length() - a.length();
            a = getPaddingString(diff) + a;
        }
        char[] ac = a.toCharArray();
        char[] bc = b.toCharArray();
        StringBuffer resultC = new StringBuffer();
        int c = 0;
        for (int i = a.length() - 1; i >= 0; i--) {
            int aChar = Integer.parseInt(ac[i] + "");
            int bChar = Integer.parseInt(bc[i] + "");
            int sum = aChar ^ bChar ^ c;
            resultC.append(sum);
            c = (aChar & bChar) | (bChar & c) | (ac[i] & c);
        }
        if(c !=0)
        resultC.append(c);
        return resultC.reverse().toString();
    }

    private String getPaddingString(int diff) {
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < diff; i++) {
            str.append("0");
        }
        return str.toString();
    }
}
