package com.wxg.design.pattern.singleton;

//恶汉模式
public class SingletonErHan {



}


/**
 * 静态变量恶汉式
 * 懒加载是指在使用的时候，才去创建实例
 * 该方法无法实现懒加载，浪费内存资源， 类加载的方式有很多（forClass, 使用静态方法，new等）
 * */
class SingletonStatic1{

    private SingletonStatic1() {

    }

    private final static SingletonStatic1 instance = new SingletonStatic1();

    public static SingletonStatic1 getInstance() {
        return instance;
    }

}

class SingletonStatic2{

    private SingletonStatic2() {

    }

    private static SingletonStatic2 instance;
    static {
        instance = new SingletonStatic2();
    }

    public static SingletonStatic2 getInstance() {
        return instance;
    }

}



