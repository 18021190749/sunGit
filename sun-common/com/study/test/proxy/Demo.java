package com.study.test.proxy;

/**
 * @Description
 * @Author sunjie
 * @Create 2018-12-05 17:14
 */
public class Demo {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        realSubject.dance();
        realSubject.sing();
    }
}
