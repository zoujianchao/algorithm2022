package com.zjc.algorithm.design;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/4/21
 * @description : 懒汉式
 */
public class Singleton01 {
    private static volatile Singleton01 singleton;
    
    public Singleton01(){}
    
    public static Singleton01 getInstance() {
        if (singleton == null) {
            synchronized(Singleton01.class) {
                if (singleton == null) {
                    singleton = new Singleton01();
                }
            }
        }
        return singleton;
    }
}
