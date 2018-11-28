package com.study.designpattern._4proxy;

/**
 * ${DESCRIPTION}
 * 追求者
 * @author sunjie
 * @create 2018-07-27 16:13
 */
public class Pursuit implements GiveGift{

    private Girl girl;

    public Pursuit(Girl girl) {
        this.girl = girl;
    }

    @Override
    public void giveMoney() {
        System.out.println(this.girl.getName()+"送你钱");
    }

    @Override
    public void giveFlower() {
        System.out.println(this.girl.getName()+"送你花");
    }

    @Override
    public void giveChocolate() {
        System.out.println(this.girl.getName()+"送你巧克力");
    }
}
