package com.study.test.builder;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-24 14:01
 */
public abstract class Builder {
    public abstract void createHand();
    public abstract void createHead();
    public abstract void createBody();
    public abstract People buildPeople();
}
