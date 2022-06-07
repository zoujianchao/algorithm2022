package com.zjc.algorithm.backtracking;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/7
 * @description : 37. 解数独
 */
public class LeetCode37 {
    public void solveSudoku(char[][] board) {
        backtracking(board);
    }
    
    private boolean backtracking(char[][] board) {
        //一个for循环遍历棋盘的行，一个for循环遍历棋盘的列
        //一行一列确定下来之后，递归遍历这个位置放9个数字的可能性！」
        for (int i = 0; i < board.length; i++) { // 遍历行
            for (int j = 0; j < board[0].length; j++) { // 遍历列
                if (board[i][j] != '.') { // 跳过原始数字
                    continue;
                }
                for (char k = '1'; k <= '9'; k++) { //这个位置放k是否合适
                    if (isValidSudoku(i, j, k, board)) {
                        board[i][j] = k;
                        if (backtracking(board)) {
                            return true;
                        }
                        board[i][j] = '.';
                    }
                }
                // 9个数都试完了，都不行，那么就返回false
                return false;
            }
        }
        return true;
    }
    
    private boolean isValidSudoku(int row, int col, char val, char[][] board) {
        // 同行是否重复
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == val) {
                return false;
            }
        }
        // 同列是否重复
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == val) {
                return false;
            }
        }
        //9宫格里是否重复
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol+3; j++) {
                if (board[i][j] == val) {
                    return false;
                }
            }
        }
        return true;
    }
    
}
