package com.zjc.algorithm.array;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/3/14
 * @description :
 */
public class QuickSort {
    public int[] sortArray(int[] nums){
        quickSort(nums, 0, nums.length);
        return nums;
    }
    
    public static void quickSort(int[] nums, int low, int high){
        //1.找到递归的入口
        if (low > high) {
            return;
        }
        //2.存
        int i = low;
        int j = high;
        //3.找个key比较
        int key = nums[low];
        //4.完成一趟排序
        while (i < j) {
            //4.1从右往左找，找到第一个比key小的数
            while (i < j && nums[j] > key) {
                j--;
            }
            //4.2从左往右找，找到第一个比key大的数
            while (i < j && nums[i] <= key) {
                i++;
            }
            //4.3交换位置
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        //4.4调整key的位置
        int temp = nums[i];
        nums[i] = nums[low];
        nums[low] = temp;
        //5.对key左边的数快排
        quickSort(nums, low, i - 1);
        //6.对key右边的数快排
        quickSort(nums, i + 1, high);
        
    }
}
