package com.leetcode.p50;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by sunilpatil on 3/25/17.
 */
public class NQueen52 {
    public int totalNQueens(int n) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        backtracking(0, new ArrayList<Integer>(),result,n);

        HashSet<List<Integer>> boardSet = new HashSet<List<Integer>>();
        for(List<Integer> board :result)
            boardSet.add(board);
        return boardSet.size();
    }


    public void backtracking(int rowId, List<Integer> colPlacement, List<List<Integer>> result, int n) {
        if (n == rowId) {
            result.add(new ArrayList<Integer>(colPlacement));
            return;
        }
        for(int i = 0; i < n; i++){
            colPlacement.add(i);
            if(isValid(colPlacement)){
                backtracking(rowId+1, colPlacement, result,n);
            }
            colPlacement.remove(colPlacement.size()-1);
        }
    }

    boolean isValid(List<Integer> colPlacement) {
        int rowId = colPlacement.size() - 1;
        for (int i = 0; i < rowId; i++) {
            //They are in the same column
            if (colPlacement.get(rowId) == colPlacement.get(i))
                return false;
            //They are in diagonal
            int rowDiff = rowId - i;
            int colDiff = colPlacement.get(i) - colPlacement.get(rowId);
            if(Math.abs(rowDiff) == Math.abs(colDiff))
                return false;
        }
        return true;
    }
}
