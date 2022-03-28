package com.zjc.algorithm.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/3/10
 * @description : 三数之和
 */
public class LeetCode15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return res;
            }
            int l = i + 1;
            int r = nums.length - 1;
            
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            while (r > l) {
                if (nums[i] + nums[l] + nums[r] == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    res.add(list);
                    l++;
                    r--;
                    while (r > l && nums[l] == nums[l - 1]) l++;
                    while (r > l && nums[r] == nums[r + 1]) r--;
                }else if (nums[i] + nums[l] + nums[r] > 0) {
                    r--;
                }else {
                    l++;
                }
            }
        }
        return res;
    }
}






