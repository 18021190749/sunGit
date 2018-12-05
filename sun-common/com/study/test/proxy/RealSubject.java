package com.study.test.proxy;

/**
 * @Description
 * @Author sunjie
 * @Create 2018-12-05 17:11
 */
public class RealSubject implements Subject{
    public RealSubject() {
        this.proxy = new Proxy();
    }

    private Proxy proxy;

    @Override
    public void dance() {
        proxy.dance();
    }

    @Override
    public void sing() {
        proxy.sing();
    }
}
