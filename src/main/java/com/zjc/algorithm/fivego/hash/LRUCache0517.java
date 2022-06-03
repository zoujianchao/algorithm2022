package com.zjc.algorithm.fivego.hash;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/5/17 23:21
 * @description : LRU 算法
 */
public class LRUCache0517 {
    private int capacity;

    private LRULinkedHashMap<Integer, Integer> lruLinkedHashMap = new LRULinkedHashMap<>();

    private class LRULinkedHashMap<K,V> extends LinkedHashMap<K, V> {
        @Override
        protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
            return size() > capacity ? true: false;
        }
    }

    public LRUCache0517(int capacity){
        this.capacity = capacity;
    }

    public void put(int key, int value) {
        if (lruLinkedHashMap.containsKey(key)) {
            lruLinkedHashMap.remove(key);
        }
        lruLinkedHashMap.put(key, value);
    }

    public int get(int key) {
        Integer value = lruLinkedHashMap.get(key);
        if (value == null) {
            return -1;
        }
        lruLinkedHashMap.remove(key);
        lruLinkedHashMap.put(key, value);
        return value;
    }

}
