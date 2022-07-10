package com.zjc.algorithm.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/9 23:39
 * @description : 6118. 最小差值平方和
 * <p>
 * 给你两个下标从 0 开始的整数数组 nums1 和 nums2 ，长度为 n 。
 * 数组 nums1 和 nums2 的 差值平方和 定义为所有满足 0 <= i < n 的 (nums1[i] - nums2[i])2 之和。
 * 同时给你两个正整数 k1 和 k2 。你可以将 nums1 中的任意元素 +1 或者 -1 至多 k1 次。类似的，你可以将 nums2 中的任意元素 +1 或者 -1 至多 k2 次。
 * 请你返回修改数组 nums1 至多 k1 次且修改数组 nums2 至多 k2 次后的最小 差值平方和 。
 * 注意：你可以将数组中的元素变成 负 整数。
 * <p>
 * 输入：nums1 = [1,2,3,4], nums2 = [2,10,20,19], k1 = 0, k2 = 0
 * 输出：579
 * 解释：nums1 和 nums2 中的元素不能修改，因为 k1 = 0 和 k2 = 0 。
 * 差值平方和为：(1 - 2)2 + (2 - 10)2 + (3 - 20)2 + (4 - 19)2 = 579 。
 * <p>
 * 输入：nums1 = [1,4,10,12], nums2 = [5,8,6,9], k1 = 1, k2 = 1
 * 输出：43
 * 解释：一种得到最小差值平方和的方式为：
 * - 将 nums1[0] 增加一次。
 * - 将 nums2[2] 增加一次。
 * 最小差值平方和为：
 * (2 - 5)2 + (4 - 8)2 + (10 - 7)2 + (12 - 9)2 = 43 。
 * 注意，也有其他方式可以得到最小差值平方和，但没有得到比 43 更小答案的方案。
 */
public class LeetCode6118 {
    public static long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums1.length;
        int max = 0;
        int k = k1 + k2;
        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums1[i] - nums2[i]);
            map.put(num, map.getOrDefault(num, 0) + 1);
            max = Math.max(max, num);
        }

        while (k > 0) {
            if (max == 0) {
                return 0;
            }
            int count = map.get(max);
            if (k >= count) {
                map.remove(max);
                max--;
                map.put(max, map.getOrDefault(max, 0) + count);
                k -= count;
            } else {
                map.put(max, count - k);
                max--;
                map.put(max, map.getOrDefault(max, 0) + k);
                k = 0;
            }
        }
        long res = 0;
        for (Integer key : map.keySet()) {
            res += (long) key * key * map.get(key);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {37, 1, 28, 40, 100, 6, 15, 3, 100, 100, 198, 8, 99, 25, 100, 1, 20, 93, 23, 99, 1, 52, 100, 100, 100, 0, 11, 14, 0, 100, 99, 100, 31, 82, 41, 0, 10, 29, 54, 38, 40, 99, 96, 25, 28, 100, 37, 98, 71, 38, 85, 1, 197, 100, 1, 3, 100, 0, 100, 100, 0, 60, 1, 97, 8, 24, 100, 100, 99, 55, 6, 39, 54, 3, 100, 1, 64, 1, 0, 0, 100, 100, 2, 26, 3, 43, 99, 82, 68, 89, 85, 33, 194, 96, 100, 28, 2, 1, 100, 100};
        int[] nums2 = {37, 98, 0, 92, 0, 5, 88, 100, 6, 3, 99, 77, 0, 100, 199, 100, 24, 95, 34, 0, 100, 53, 200, 196, 0, 99, 30, 83, 97, 37, 0, 3, 49, 83, 57, 100, 54, 42, 70, 82, 27, 2, 28, 40, 24, 1, 37, 1, 84, 50, 86, 98, 100, 199, 100, 100, 3, 100, 6, 200, 97, 73, 92, 1, 36, 25, 0, 1, 0, 74, 78, 39, 67, 100, 199, 100, 64, 100, 100, 100, 200, 0, 99, 27, 16, 48, 3, 13, 88, 76, 86, 44, 97, 192, 0, 89, 98, 98, 199, 199};
        System.out.println(minSumSquareDiff(nums1, nums2, 2013, 1152));
    }
}
