package com.zjc.algorithm.second.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/7 23:20
 * @description : 209. 长度最小的子数组
 */
public class LeetCode209 {
    public int minSubArrayLen(int target, int[] nums) {
        List<Integer> res = new ArrayList<>();
        int len = 0;
        int sum = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            len++;
            while (sum >= target) {
                res.add(len);
                sum-=nums[index++];
                len--;
            }
        }
        if (res.size() == 0) {
            return 0;
        }
        return Collections.min(res);
    }

    public static void main(String[] args) {
        System.out.println('0' - 'A');
        System.out.println('A' - 'A');
        System.out.println('B' - 'A');
        System.out.println('D' - 'A');
        System.out.println('a' - 'A');
        System.out.println('0' - 'a');
        System.out.println('a' - 'a');
        System.out.println('b' - 'a');
        System.out.println('0' - '0');
        System.out.println('a' - '0');
        System.out.println('b' - '0');
    }
}
