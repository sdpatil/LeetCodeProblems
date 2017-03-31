package com.leetcode.p150;

/**
 * Created by sunilpatil on 3/28/17.
 */
public class ReverseWordsInString151 {
    public String reverseWords(String s) {
        char[] c = s.toCharArray();
        reverse(c,0, c.length-1);
        int start = 0;
        for(int i = 0; i < c.length; i++){
            if(c[i] == ' '){
                reverse(c,start,i-1);
                start = i+1;
            }
        }
        reverse(c,start,c.length-1);

        return stringCompactor(new String(c));
    }

    private String stringCompactor(String input){
        String[] words = input.split(" ");
        StringBuffer output = new StringBuffer();
        for(int i = 0; i < words.length; i++) {
            if(words[i].trim().length() != 0) {
                output.append(words[i]);
                if (i != words.length - 1)
                    output.append(" ");
            }
        }
        return output.toString();
    }

    public void reverse(char[] c, int start, int end){
        while(start < end){
            char temp = c[start];
            c[start] = c[end];
            c[end] =temp;
            start++;
            end--;
        }
    }
}
