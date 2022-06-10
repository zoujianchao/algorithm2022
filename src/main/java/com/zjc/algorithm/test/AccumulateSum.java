package com.zjc.algorithm.test;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/10
 * @description : 连续子数组的最大和
 */
public class AccumulateSum {
    
    public static int accumulateMaxSum(int[] arr) {
        int maxValue = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum <= 0){
                sum = arr[i];
            }else {
                sum+=arr[i];
            }
            maxValue = Math.max(sum, maxValue);
        }
        return maxValue;
    }
    
    public static void main(String[] args) {
        int[] arr = new int[]{-2 , -1, 3, 1,4,-9,8,9};
        System.out.println(accumulateMaxSum(arr));
    }
}
