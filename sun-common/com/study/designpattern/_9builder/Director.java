package com.study.designpattern._9builder;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-08-15 18:39
 */
public class Director {
    public Product buildProduct(Builder builder){
        builder.keyBoard();
        builder.screen();
        builder.mouse();
        return builder.buildProduct();
    }
}
