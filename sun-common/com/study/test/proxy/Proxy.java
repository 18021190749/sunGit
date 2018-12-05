package com.study.test.proxy;

/**
 * @Description
 * @Author sunjie
 * @Create 2018-12-05 17:10
 */
public class Proxy implements Subject{
    @Override
    public void dance() {
        System.out.println("proxy dance");
    }

    @Override
    public void sing() {
        System.out.println("proxy song");
    }
}
