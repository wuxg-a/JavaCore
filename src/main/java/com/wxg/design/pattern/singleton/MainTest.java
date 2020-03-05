package com.wxg.design.pattern.singleton;

public class MainTest {

    public static void main(String[] args) {
        String instance1 = SingletonEnum.INSTANCE.getInstance();
        String instance2 = SingletonEnum.INSTANCE.getInstance();

        System.out.println(instance1 == instance2);
    }
}
