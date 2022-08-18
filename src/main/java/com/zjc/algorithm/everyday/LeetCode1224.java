package com.zjc.algorithm.everyday;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/8/18 23:31
 * @description :
 */
public class LeetCode1224 {
    public static int maxEqualFreq(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        Map<Integer, Integer> freqMap = new HashMap<>();

        int ans = 0, maxFreq = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int count = countMap.getOrDefault(num, 0);
            if (count > 0) {
                freqMap.put(count, freqMap.get(count) - 1);
            }

            count++;
            countMap.put(num, count);
            freqMap.put(count, freqMap.getOrDefault(count, 0) + 1);

            maxFreq = Math.max(maxFreq, count);

            // 分三种情况：
            // 1. 所有数的频率都是1
            // 2. 去掉一个数后其他数的频率相等，如[2,2,1,1,3]去掉一个3
            // 3. 去掉一个数后包含当前数的所有数频率相等，如[2,2,1,1,3,3,3]去掉一个3
            if (maxFreq == 1
                    || maxFreq * freqMap.get(maxFreq) == i
                    || maxFreq + (maxFreq - 1) * freqMap.get(maxFreq - 1) == i + 1) {
                ans = Math.max(ans, i + 1);
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2, 87, 78, 66, 66, 15, 3, 5, 15};
        System.out.println(maxEqualFreq(nums));
    }
}
