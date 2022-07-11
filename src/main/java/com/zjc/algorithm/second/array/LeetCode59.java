package com.zjc.algorithm.second.array;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/11 22:38
 * @description : 59. 螺旋矩阵 II
 */
public class LeetCode59 {
    public int[][] generateMatrix(int n) {
        // 看看循环几圈 每个圈循环几次，例如n为奇数3，那么loop = 1 只是循环一圈，矩阵中间的值需要单独处理
        int loop = n / 2;
        // 定义每循环一个圈的起始位置
        int startX = 0, startY = 0;
        // 阵中间的位置，例如：n为3， 中间的位置就是(1，1)，n为5，中间位置为(2, 2)
        int mid = n / 2;
        // 用来给矩阵中每一个空格赋值
        int count = 1;
        // 需要控制每一条边遍历的长度，每次循环右边界收缩一位
        int offset = 1;
        int i, j;
        int[][] res = new int[n][n];
        while (loop > 0) {
            // 上
            for (j = startY; j < n - offset; j++) {
                res[startX][j] = count++;
            }
            // 右
            for (i = startX; i < n - offset; i++) {
                res[i][j] = count++;
            }
            // 下
            for (; j > startY; j--) {
                res[i][j] = count++;
            }
            // 左
            for (; i > startX; i--) {
                res[i][j] = count++;
            }

            startX++;
            startY++;
            offset++;
            loop--;
        }
        if (n % 2 == 1) {
            res[mid][mid] = count;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(3 / 2);
    }
}
