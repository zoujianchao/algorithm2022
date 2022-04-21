package com.zjc.algorithm.design;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/4/21
 * @description : 饿汉式
 */
public class Singleton02 {
    private final static Singleton02 singleton = new Singleton02();
    
    public Singleton02() {}
    
    public static Singleton02 getInstance() {
        return singleton;
    }
}
