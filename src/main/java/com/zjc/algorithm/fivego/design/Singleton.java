package com.zjc.algorithm.fivego.design;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/5/6 23:49
 * @description :
 */
public class Singleton {
    private static volatile Singleton singleton;

    public Singleton(){}

    public Singleton getSingleton(){
         if (singleton == null) {
             synchronized(Singleton.class) {
                 if (singleton == null) {
                     return new Singleton();
                 }
             }
         }
         return singleton;
    }
}
