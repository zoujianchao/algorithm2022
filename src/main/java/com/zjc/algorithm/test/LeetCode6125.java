package com.zjc.algorithm.test;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/24 10:41
 * @description : 6125. 相等行列对
 */
public class LeetCode6125 {
    public int equalPairs(int[][] grid) {
        String[] rows = new String[grid.length];
        String[] columns = new String[grid.length];

        for (int i = 0; i < grid.length; i++) {
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for (int j = 0; j < grid[i].length; j++) {
                sb1.append(grid[i][j]);
                sb1.append(" ");
                sb2.append(grid[j][i]);
                sb2.append(" ");
            }
            rows[i] = sb1.toString();
            columns[i] = sb2.toString();
        }

        int res = 0;
        for (String row : rows) {
            for (String column : columns) {
                if (row.equals(column)) {
                    res++;
                }
            }
        }

        return res;
    }
}
