package com.study.designpattern._13adapter;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-18 16:32
 */
public class Translator extends Player{

    private ForeignCenter foreignCenter = new ForeignCenter();

    public Translator(String name) {
        foreignCenter.setName(name);
    }

    @Override
    void go() {
        foreignCenter.进攻();
    }

    @Override
    void back() {
        foreignCenter.防守();
    }
}
