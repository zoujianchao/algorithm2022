package com.zjc.algorithm.greedy;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/8
 * @description : 134. 加油站
 */
public class LeetCode134 {
    
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int carSum = 0;
        int totalSum= 0;
        int start = 0;
        for (int i = 0; i < gas.length; i++) {
            carSum += gas[i] - cost[i];
            totalSum += gas[i] - cost[i];
            if (carSum < 0) {
                start = i + 1;
                carSum = 0;
            }
        }
        if (totalSum < 0) {
            return -1;
        }
        return start;
    }
}
