package com.zjc.algorithm.fivego.array;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/5/6 23:27
 * @description :
 */
public class QuickSort912 {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    public static void quickSort(int[] nums, int low, int high) {
        if (low > high) {
            return;
        }

        int i = low;
        int j = high;
        int key = nums[low];

        while (i < j) {
            while (i < j && nums[j] > key) {
                j--;
            }
            while (i < j && nums[i] <= key) {
                i++;
            }

            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        int temp = nums[i];
        nums[i] = nums[low];
        nums[low] = temp;

        quickSort(nums, low, i - 1);
        quickSort(nums, i + 1, high);
    }
}
