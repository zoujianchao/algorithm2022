package com.zjc.algorithm.junior;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/6 23:07
 * @description : 加一
 */
public class PlusOne07 {
    public int[] plusOne(int[] digits) {
        if (digits.length == 1 && digits[0] == 0) {
            return new int[]{1};
        }

        List<Integer> list = new ArrayList<>();
        boolean isAdd = true;
        boolean flag = true;
        for (int i = digits.length - 1; i >= 0; i--) {
            if ((digits[i] + 1) % 10 == 0 && isAdd) {
                list.add(0,0);
                if (i == 0) {
                    list.add(0,1);
                }
            }else {
                isAdd = false;
                if (flag) {
                    list.add(0, digits[i] + 1);
                    flag = false;
                }else {
                    list.add(0, digits[i]);
                }
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
