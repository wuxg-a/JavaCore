package com.wxg.design.pattern.singleton;

public class SingletonLanHan {
}


class SingletonNotSafe{
    private SingletonNotSafe() {

    }
    private static SingletonNotSafe instance;

    public SingletonNotSafe getInstance() {
        if(instance == null) {
            instance = new SingletonNotSafe();
        }
        return instance;
    }
}

/**
 * 同步方法，线程安全，但是效率低
 * */
class SingletonSafe{
    private SingletonSafe() {

    }
    private static SingletonSafe instance;

    public synchronized SingletonSafe getInstance() {
        if(instance == null) {
            instance = new SingletonSafe();
        }
        return instance;
    }
}

/**
 * 推荐使用
 * */
class SingletonDoubleCheck{
    private SingletonDoubleCheck(){

    }
    private static volatile SingletonDoubleCheck instance;
    public static SingletonDoubleCheck getInstance() {
        if(instance == null) {
            synchronized (SingletonDoubleCheck.class) {
                if(instance == null) {
                    instance = new SingletonDoubleCheck();
                }
            }
        }
        return instance;
    }
}
