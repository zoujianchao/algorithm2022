package com.zjc.algorithm.fivego.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/5/7 0:24
 * @description : 一个数组中列出一个数比前面数大，比后面数小的集合
 */
public class LzwCode {

    public static List<Integer> findCount(int [] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            boolean smallFlag = true;
            boolean bigFlag = true;
            int currNum = arr[i];

            for (int j = 0; j < i; j++) {
                if (currNum < arr[j]) {
                    smallFlag = false;
                    break;
                }
            }

            for (int k = i+1; k < arr.length; k++) {
                if (currNum > arr[k]) {
                    bigFlag = false;
                    break;
                }
            }
            if (smallFlag && bigFlag) {
                list.add(currNum);
            }
        }

        if (list.size() < 1) {
            list.add(-1);
        }

        return list;
    }

    public static void main(String[] args) {
//        int [] array = {21,11,45,56,9,66,77,89,78,68,100,120,111};
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        findCount(array).forEach(System.out::println);
    }
}
