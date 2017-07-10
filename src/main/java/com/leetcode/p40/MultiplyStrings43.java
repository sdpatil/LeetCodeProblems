package com.leetcode.p40;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by sunilpatil on 6/27/17.
 */
public class MultiplyStrings43 {
    public String multiply(String num1, String num2) {
        boolean firstNegative = false;
        if (num1.charAt(0) == '-') {
            firstNegative = true;
            num1 = num1.substring(1);
        }
        boolean secondNegative = false;
        if (num2.charAt(0) == '-') {
            secondNegative = true;
            num2 = num2.substring(1);
        }

        int[] first = convertStringToInt(num1);
        int[] second = convertStringToInt(num2);
        List<Integer> result = multiply(first, second);
        String resultStr = toString(result);
        ;

        if (firstNegative && !secondNegative) {
            return "-" + resultStr;
        } else if (!firstNegative && secondNegative) {
            return "-" + resultStr;
        } else

            return resultStr;
    }

    public int[] convertStringToInt(String str) {
        char[] chars = str.toCharArray();
        int[] result = new int[chars.length];
        for (int i = 0; i < chars.length; i++)
            result[i] = Character.getNumericValue(chars[i]);
        return result;
    }

    public String toString(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (int n : list)
            sb.append(n);
        return sb.toString();
    }


    public List<Integer> multiply(int[] num1, int[] num2) {
        List<Integer> result = new ArrayList<Integer>(Collections.nCopies(num1.length + num2.length, 0));

        for (int i = num1.length - 1; i >= 0; i--) {
            for (int j = num2.length - 1; j >= 0; j--) {
                result.set(i + j + 1, result.get(i + j + 1) + num1[i] * num2[j]);
                result.set(i + j, result.get(i + j) + (result.get(i + j + 1) / 10));
                result.set(i + j + 1, result.get(i + j + 1) % 10);
            }
        }

        int firstNonZeroIndex = 0;
        while (firstNonZeroIndex < result.size()-1 && result.get(firstNonZeroIndex) == 0)
            firstNonZeroIndex++;

        result = result.subList(firstNonZeroIndex, result.size());

        return result;
    }

}
