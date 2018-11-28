package com.study.test.builder;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-24 14:18
 */
public class Director {
    public People buildPeople(Builder builder){
        builder.createHand();
        builder.createBody();
        return builder.buildPeople();
    }
}
