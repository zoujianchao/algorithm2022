package com.zjc.algorithm.dp;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/14
 * @description : 63. 不同路径 II
 */
public class LeetCode63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        for (int i = 0; i < obstacleGrid.length; i++) {
            if (obstacleGrid[i][0] == 0) {
                dp[i][0] = 1;
            }else {
                break;
            }
        }
        
        for (int j = 0; j < obstacleGrid[0].length; j++) {
            if (obstacleGrid[0][j] == 0) {
                dp[0][j] = 1;
            } else {
                break;
            }
        }
        
        for (int i = 1; i < obstacleGrid.length; i++) {
            for (int j = 1; j < obstacleGrid[0].length; j++) {
                if (obstacleGrid[i][j] == 1) {
                    continue;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
                
               
            }
        }
        
        return dp[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }
}
