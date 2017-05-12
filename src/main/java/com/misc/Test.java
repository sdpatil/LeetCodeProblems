package com.misc;

/**
 * Created by sunilpatil on 5/11/17.
 */
public class Test {

    public static void main(String[] argv){
       System.out.println("Result " + intToString(-415));
       System.out.println("Result " + stringToInt("445"));
    }
    public static String intToString(int x){
        boolean isNegative = false;
        if(x < 0)
            isNegative = true;
        x =Math.abs(x);
        StringBuffer result = new StringBuffer();
        while(x >0){
            int t = x %10;
            result.append(t);
            x = x/10;
        }
        if(isNegative)
            result.append("-");
        return result.reverse().toString();
    }

    private static int stringToInt(String s){
        char[] cs = s.toCharArray();
        int result = 0;
        for(char c:cs )
            result = (result*10 + Character.getNumericValue(c));
         return result;
    }
}
