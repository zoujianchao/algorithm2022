package com.zjc.algorithm.greedy;

import java.util.Arrays;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/8
 * @description : 1005. K 次取反后最大化的数组和  妙
 */
public class LeetCode1005 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        //首先进行排序（可能有负数也可能没有负数）
        Arrays.sort(nums);
        int minIndex = 0;
        while (k > 0) {
            nums[minIndex] = -nums[minIndex];
            k--;
            //只有后面元素存在且小于当前元素时，更新最小元素的索引
            //对于有负数的情况会先把负数求反，对于正数的话，始终对最小的改变
            if (minIndex + 1 < nums.length && nums[minIndex] > nums[minIndex + 1]){
                minIndex++;
            }
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        
        return sum;
    }
}
