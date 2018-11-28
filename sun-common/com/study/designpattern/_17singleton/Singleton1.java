package com.study.designpattern._17singleton;

/**
 * ${DESCRIPTION}
 * 饿汉模式
 * @author sunjie
 * @create 2018-08-21 10:12
 */
public class Singleton1 {
    private static Singleton1 instance = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return instance;
    }
}
