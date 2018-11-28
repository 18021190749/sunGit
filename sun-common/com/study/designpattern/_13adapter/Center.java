package com.study.designpattern._13adapter;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-18 16:26
 */
public class Center extends Player {
    public Center(String name) {
        super.name = name;
    }

    @Override
    void go() {
        System.out.println("中锋进攻");
    }

    @Override
    void back() {
        System.out.println("中锋防守");
    }
}
