package com.wxg.design.pattern.singleton;

/**
 * 1. SingletonInnerStatic装载时，内部类Singleton 不装载
 * 2. 当使用到Singleton.INSTANCE时，内部类Singleton才会装载
 * 3. 静态属性，只会在第一次加载类时进行初始化（一次），jvm保证线程安全
 * */
public class SingletonInnerStatic {
    private SingletonInnerStatic() {
    }

    private static class Singleton{
        private final static SingletonInnerStatic INSTANCE = new SingletonInnerStatic();
    }

    public SingletonInnerStatic getInstance(){
        return Singleton.INSTANCE;
    }
}
