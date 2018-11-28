package com.study.designpattern._4proxy;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-07-27 16:19
 */
public class Proxy implements GiveGift {

    private Pursuit pursuit;

    public Proxy(Girl girl) {
        this.pursuit = new Pursuit(girl);
    }

    @Override
    public void giveMoney() {
        this.pursuit.giveMoney();
    }

    @Override
    public void giveFlower() {
        this.pursuit.giveFlower();
    }

    @Override
    public void giveChocolate() {
        this.pursuit.giveChocolate();
    }
}
