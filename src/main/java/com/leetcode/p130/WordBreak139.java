package com.leetcode.p130;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * Created by sunilpatil on 5/14/17.
 */
public class WordBreak139 {

    public boolean wordBreak(String s, List<String> wordDict) {
        int[][] dpTable = new int[s.length()][s.length()];

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++)
                dpTable[i][j] = -1;
        }

        for(int l  = 1; l <= dpTable.length; l++){
            for(int i = 0 ; i < dpTable[0].length - l +1 ; i++){
                int j = i + l -1;
                String str = s.substring(i,j+1);
                System.out.println(str);
                if(wordDict.contains(str)){
                    dpTable[i][j] = i;
                    continue;
                }
                for(int k = i+1 ; k <= j; k++){
                    if(dpTable[i][k-1] != -1 && dpTable[k][j] != -1){
                        dpTable[i][j] = k;
                        break;
                    }
                }
            }
        }
        return dpTable[0][s.length()-1] !=-1;
    }



    private void printDPTable(int[][] dpTable){
        for(int[] dpRow: dpTable)
            System.out.println(Arrays.toString(dpRow));
    }


}
