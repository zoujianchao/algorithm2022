package com.zjc.algorithm.hundred;

import java.util.Arrays;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/5/14 23:50
 * @description : 4. 寻找两个正序数组的中位数
 */
public class LeetCode4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double num = 0.0;
        int size = nums1.length + nums2.length;
        int[] arr = new int[size];
        int index = 0;
        for (int i = 0; i < nums1.length; i++) {
            arr[index++] = nums1[i];
        }

        for (int i = 0; i < nums2.length; i++) {
            arr[index++] = nums2[i];
        }

        Arrays.sort(arr);

        if (size % 2 == 0) {
            num = (arr[size / 2] + arr[size / 2 - 1]) / 2.0;
        }else {
            num = arr[size / 2] / 1.0;
        }
        return num;
    }
}
