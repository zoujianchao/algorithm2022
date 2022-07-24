package com.zjc.algorithm.test;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/23 23:26
 * @description :
 */
public class NumberContainers {
    Map<Integer, Integer> map;

    public NumberContainers() {
        map = new TreeMap<>();
    }

    public void change(int index, int number) {
        map.put(index, number);
    }

    public int find(int number) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (map.get(entry.getKey()) == number) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
