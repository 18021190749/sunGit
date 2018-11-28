package com.study.designpattern._13adapter;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-18 16:25
 */
public class Forward extends Player{

    public Forward(String name) {
        super.name=name;
    }

    @Override
    void go() {
        System.out.println(super.name+"前锋进攻");
    }

    @Override
    void back() {
        System.out.println(super.name+"前锋防守");
    }
}
