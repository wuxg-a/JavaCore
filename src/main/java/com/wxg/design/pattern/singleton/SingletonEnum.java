package com.wxg.design.pattern.singleton;

/**
 * 枚举序列化是由jvm保证的，每一个枚举类型和定义的枚举变量在JVM中都是唯一的，
 * 在枚举类型的序列化和反序列化上，Java做了特殊的规定：在序列化时Java仅仅是将枚举对象的name属性输出到结果中，反序列化的时候则是通过java.lang.Enum的valueOf方法来根据名字查找枚举对象
 * */
public enum SingletonEnum {
    INSTANCE;

    private String instance;
    //只能是private, 只能有jvm构造，通过反射构造会报错
    SingletonEnum() {
        System.out.println("init enum");
        instance = "hello";
    }

    public String getInstance() {
        return instance;
    }

}
