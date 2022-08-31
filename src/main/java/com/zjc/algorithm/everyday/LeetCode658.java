package com.zjc.algorithm.everyday;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/8/25 22:02
 * @description :
 */
public class LeetCode658 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList<>();
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int delCnt = n - k;
        while (delCnt > 0) {
            if (x - arr[left] <= arr[right] - x) {
                right--;
            }else {
                left++;
            }
            delCnt--;
        }
        for (int i = left; i < right; i++) {
            res.add(arr[i]);
        }
        return res;
    }
}
