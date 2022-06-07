package com.zjc.algorithm.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/7
 * @description : 51. N 皇后
 */
public class LeetCode51 {
    List<List<String>> res = new ArrayList<>();
    
    public List<List<String>> solveNQueens(int n) {
        char[][] chessboard = new char[n][n];
        for (char[] c : chessboard) {
            Arrays.fill(c , '.');
        }
        backtracking(n ,0 , chessboard);
        return res;
    }
    
    private void backtracking(int n, int row, char[][] chessboard) {
        if (row == n) {
            res.add(charToList(chessboard));
            return;
        }
    
        for (int col = 0; col < n; col++) {
           if (isValid(row, col, n, chessboard)) {
               chessboard[row][col] = 'Q';
               backtracking(n, row + 1, chessboard);
               chessboard[row][col] = '.';
           }
        }
    }
    
    private boolean isValid(int row, int col, int n, char[][] chessboard) {
        //检查列
        for (int i = 0; i < n; i++) {
            if (chessboard[i][col] == 'Q') {
                return false;
            }
        }
        //检查45度
        for (int i = row - 1, j = col - 1; i >=0 && j>=0; i--, j--) {
            if (chessboard[i][j] == 'Q') {
                return false;
            }
        }
        //检查135度
        for (int i = row - 1, j = col + 1; i >=0 && j < n; i--, j++) {
            if (chessboard[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
    
    private List<String> charToList(char[][] chessboard) {
        List<String> list = new ArrayList<>();
        for (char[] c : chessboard) {
            list.add(String.copyValueOf(c));
        }
        return list;
    }
    
}
