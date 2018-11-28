package com.study.designpattern._4proxy;

/**
 * ${DESCRIPTION}
 * 代理模式
 * @author sunjie
 * @create 2018-07-27 16:01
 */
public class Demo {
    public static void main(String[] args) {
        Girl girl = new Girl("MM");
        Proxy daili = new Proxy(girl);
        daili.giveChocolate();
        daili.giveFlower();
        daili.giveMoney();
    }
}
